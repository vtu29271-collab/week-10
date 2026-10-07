import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[2];
        int count = 0;

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks: ");
            int mark = sc.nextInt();

            if (count == marks.length) {
                int[] newMarks = new int[marks.length * 2];

                for (int j = 0; j < marks.length; j++) {
                    newMarks[j] = marks[j];
                }

                marks = newMarks;
            }

            marks[count] = mark;
            count++;
        }

        System.out.println("\nStudent Marks:");
        for (int i = 0; i < count; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        sc.close();
    }
}