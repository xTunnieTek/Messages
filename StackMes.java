import java.util.Scanner;
import java.util.Stack;

public class StackMes {
    // Sử dụng stack để lưu messeages cho người dùng nhập không quá 255 ký tự
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        while (true) {
            System.out.print("Enter Messages: ");
            String message = sc.nextLine();
            if (message.equals("exit")) {
                break;
            }
            if (message.length() > 255) {
                System.out.println("Long Message");
                continue;
            }
            stack.push(message);
        }
        System.out.println("Send: ");
        // In ra các tin nhắn đã được gửi
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
