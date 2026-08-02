public class SplitwiseApp {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("===Splitwise Console===");
        System.out.println("Track shared expenses with friends");
        System.out.println();
        String payerName = "Riya";
        double totalAmount = 500;
        int numFriends = 3;
        double perPersonShare = totalAmount / numFriends;
        System.out.println(payerName);
        System.out.println(totalAmount);
        System.out.println(numFriends);
        System.out.println(perPersonShare);
    }
}