// Concrete mediator class for private chat room
class PrivateChatRoom implements ChatMediator {
    @Override
    public void showMessage(User user, String message) {
        System.out.println("Private Chat: " + user.getName() + ": " + message);
    }
}
