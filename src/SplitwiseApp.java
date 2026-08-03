import java.util.ArrayList;
import java.util.Scanner;
public class SplitwiseApp {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("===Splitwise Console===");
        System.out.println("Track shared expenses with friends");
        System.out.println();
        Scanner input = new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<>();
        boolean running = true;
        while (running) {
            System.out.println("===Menu===");
            System.out.println("1.Record expense");
            System.out.println("2.Add friend");
            System.out.println("3.list friends");
            System.out.println("0.Quit");
            System.out.println("Choice:");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Who paid? ");
                    String payerName = input.nextLine();
                    System.out.print("Total amount (₹)? ");
                    double totalAmount = input.nextDouble();
                    input.nextLine();
                    int numFriends = friends.size();
                    if (friends.isEmpty()) {
                        System.out.println("No friends yet. Add friends first (option 2).");
                        break;
                    }
                    double perPersonShare = totalAmount / numFriends;
                    String expenseLine = "%s paid ₹%.2f".formatted(payerName, totalAmount);
                    String shareLine = "Each person pays: %.2f".formatted(perPersonShare);
                    System.out.println(expenseLine);
                    System.out.println(shareLine);
                }
                case 2 -> addFriend(input,friends);
                case 3 -> {
                    if (friends.isEmpty())
                        System.out.println("No frtends yet");
                    else {
                        for (String name : friends) {
                            System.out.println("- " + name);
                        }
                    }
                }
                case 0 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again");
            }
        }
    }
    public static void addFriend(Scanner input, ArrayList<String> friends) {
        System.out.print("Friend name: ");
        String friendName = input.nextLine();
        friends.add(friendName);
        System.out.println("Added " + friendName + ".");
    }
}
