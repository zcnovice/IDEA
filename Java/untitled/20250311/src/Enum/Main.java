package Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        String name = in.next();
        if(UserEnum.ADMIN.getRoot().equals(name))
        {
            System.out.println("是管理员");
        }
    }
}
