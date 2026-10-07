import java.util.Scanner;
import java.util.Stack;

class BrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> history = new Stack<>();

        System.out.print("Enter number of pages: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter page: ");
            history.push(sc.nextLine());
        }

        System.out.println("\nBrowser History: " + history);

        System.out.println("Press Back...");
        if (!history.isEmpty()) {
            System.out.println("Going back from: " + history.pop());
        }

        System.out.println("Remaining History: " + history);

        sc.close();
    }
}