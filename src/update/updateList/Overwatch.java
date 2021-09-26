package update.updateList;

import update.observer.Observable;
import update.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Overwatch implements Observable {
    private String version;
    private List<String> versions = new ArrayList<>();
    private List<Observer> users = new ArrayList<>();

    public Overwatch() {
    }

    @Override
    public void addUser(Observer user) {
        this.users.add(user);
    }

    @Override
    public void removeUser(Observer user) {
        this.users.remove(user);
    }

    @Override
    public void toNotify() {
        for (Observer user : users) {
            user.update();
        }
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
        versions.add(version);
        toNotify();
    }

    public List<Observer> getUsers() {
        return users;
    }

    public void setUsers(List<Observer> users) {
        this.users = users;
        toNotify();
    }
}
