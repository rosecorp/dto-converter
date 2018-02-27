package converter.data;

import java.util.Objects;

public class User {
    private final String nick;
    private final Email email;

    public User(String nick, Email email) {
        this.nick = nick;
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public Email getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nick, user.nick) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nick, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "nick='" + nick + '\'' +
                ", email=" + email +
                '}';
    }
}
