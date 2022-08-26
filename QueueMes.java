import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueMes {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Messages: ");
            String message = sc.nextLine();
            if (message.equals("exit")) {
                break;
            }
            if (message.length() > 255) {
                System.out.println("So Long Message");
                continue;
            }
            queue.add(message);
        }
        System.out.println("Send: ");
        // In ra các tin nhắn đã được gửi
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
