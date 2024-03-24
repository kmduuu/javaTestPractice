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

        // ���� �ð� �������� ȸ�Ǹ� �����մϴ�.
        Collections.sort(meetings, Comparator.comparingInt(o -> o.end));
        System.out.println("���� �ð��� �������� ȸ�Ǹ� �����߽��ϴ�.");

        // �ִ� ȸ�� ���� ã���ϴ�.
        int maxMeetings = findMaxMeetings(meetings);
        System.out.println("�ִ� ȸ�� ��: " + maxMeetings);
    }

    private static int findMaxMeetings(List<Meeting> meetings) {
        int count = 1; // ù ��° ȸ�Ǵ� ���õ˴ϴ�.
        int lastEndTime = meetings.get(0).end;
        System.out.println("ù ��° ȸ�Ǹ� �����߽��ϴ�. (ȸ�� ID: " + meetings.get(0).id + ", ���� �ð�: " + meetings.get(0).end + ")");

        // �� ��° ȸ�Ǻ��� Ž���ϸ鼭 �ִ� ȸ�� ���� ã���ϴ�.
        for (int i = 1; i < meetings.size(); i++) {
            if (meetings.get(i).start >= lastEndTime) {
                // ���� ȸ���� ���� �ð� ���Ŀ� �����ϴ� ȸ�Ƕ�� �����մϴ�.
                count++;
                lastEndTime = meetings.get(i).end;
                System.out.println("ȸ�Ǹ� �����߽��ϴ�. (ȸ�� ID: " + meetings.get(i).id + ", ���� �ð�: " + meetings.get(i).end + ")");
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
