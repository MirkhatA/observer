package update.observer;

public interface Observable {
    void addUser(Observer user);
    void removeUser(Observer user);
    void toNotify();
}
