package test;


import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
        String[][] users = {
                {"root","1234567"},
                {"admin","123456"}
        };

        String[][] roles = Arrays.copyOf(users,users.length+1);

        System.arraycopy(users, 0, roles, 0, users.length);
    }
}
