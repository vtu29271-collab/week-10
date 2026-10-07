import java.util.Scanner;

class MusicPlaylist {

    static class Node {
        String song;
        Node next;

        Node(String song) {
            this.song = song;
            this.next = null;
        }
    }

    static Node head = null;

    static void addSong(String song) {
        Node newNode = new Node(song);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    static void removeSong(String song) {
        if (head == null)
            return;

        if (head.song.equals(song)) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.song.equals(song)) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.song + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter song: ");
            addSong(sc.nextLine());
        }

        System.out.println("\nPlaylist:");
        display();

        System.out.print("Enter song to remove: ");
        String song = sc.nextLine();

        removeSong(song);

        System.out.println("\nPlaylist after removal:");
        display();

        sc.close();
    }
}