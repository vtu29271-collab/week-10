import java.util.ArrayList;
import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark: ");
            marks.add(sc.nextInt());
        }

        System.out.println("\nStudent Marks: " + marks);

        int highest = marks.get(0);
        int sum = 0;

        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
            sum += mark;
        }

        double average = (double) sum / marks.size();

        System.out.println("Highest Mark: " + highest);
        System.out.println("Average Mark: " + average);

        sc.close();
    }
}