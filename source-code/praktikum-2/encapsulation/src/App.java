import classes.User;

public class App {
    public static void main(String[] args) throws Exception {
        User fzl22 = new User("fzl-22", "password123");

        String userName = fzl22.getUserName();
        fzl22.setPassword("123password");

        System.out.println("Username: " + userName);

        fzl22.loginUser("fzl22", "terserah");
    }
}
