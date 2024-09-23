// Concrete mediator class for public chat room
class PublicChatRoom implements ChatMediator {
    @Override
    public void showMessage(User user, String message) {
        System.out.println("Public Chat: " + user.getName() + ": " + message);
    }
}
