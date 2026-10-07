import java.util.HashMap;
import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> marks = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            System.out.print("Enter marks: ");
            int mark = sc.nextInt();

            marks.put(roll, mark);
        }

        System.out.print("\nEnter roll number to search: ");
        int roll = sc.nextInt();

        if (marks.containsKey(roll)) {
            System.out.println("Marks: " + marks.get(roll));
        } else {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}