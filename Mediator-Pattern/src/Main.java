public class Main {
    public static void main(String[] args) {
        // Create mediators
        ChatMediator publicChat = new PublicChatRoom();
        ChatMediator privateChat = new PrivateChatRoom();

        // Create users with different mediators
        User user1 = new User("Alice", publicChat);
        User user2 = new User("Bob", publicChat);
        User user3 = new User("Charlie", privateChat);
        User user4 = new User("David", privateChat);

        // Send messages through the mediators
        user1.sendMessage("Hi Bob!");
        user2.sendMessage("Hello Alice!");
        user3.sendMessage("Hi David!");
        user4.sendMessage("Hello Charlie!");
    }
}