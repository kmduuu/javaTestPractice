import java.util.*;

class GreedyActivitySelection {

    public static void main(String[] args) {
        List<Meeting> meetings = new ArrayList<>();
        meetings.add(new Meeting(1, 1, 3));
        meetings.add(new Meeting(2, 2, 5));
        meetings.add(new Meeting(3, 3, 7));
        meetings.add(new Meeting(4, 4, 9));
        meetings.add(new Meeting(5, 6, 8));
        meetings.add(new Meeting(6, 7, 10));
        meetings.add(new Meeting(7, 9, 12));

        // 종료 시간 기준으로 회의를 정렬합니다.
        Collections.sort(meetings, Comparator.comparingInt(o -> o.end));
        System.out.println("종료 시간을 기준으로 회의를 정렬했습니다.");

        // 최대 회의 수를 찾습니다.
        int maxMeetings = findMaxMeetings(meetings);
        System.out.println("최대 회의 수: " + maxMeetings);
    }

    private static int findMaxMeetings(List<Meeting> meetings) {
        int count = 1; // 첫 번째 회의는 선택됩니다.
        int lastEndTime = meetings.get(0).end;
        System.out.println("첫 번째 회의를 선택했습니다. (회의 ID: " + meetings.get(0).id + ", 종료 시간: " + meetings.get(0).end + ")");

        // 두 번째 회의부터 탐색하면서 최대 회의 수를 찾습니다.
        for (int i = 1; i < meetings.size(); i++) {
            if (meetings.get(i).start >= lastEndTime) {
                // 이전 회의의 종료 시간 이후에 시작하는 회의라면 선택합니다.
                count++;
                lastEndTime = meetings.get(i).end;
                System.out.println("회의를 선택했습니다. (회의 ID: " + meetings.get(i).id + ", 종료 시간: " + meetings.get(i).end + ")");
            }
        }
        return count;
    }

    static class Meeting {
        int id;
        int start;
        int end;

        public Meeting(int id, int start, int end) {
            this.id = id;
            this.start = start;
            this.end = end;
        }
    }
}
