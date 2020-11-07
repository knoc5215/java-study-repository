package com.study.designPattern.singleton;

public class PrinterClient {
    public static final int USER_NUMBER = 10;

    public static void main(String[] args) {
        User[] users = new User[USER_NUMBER];
        for (int i = 0; i < USER_NUMBER; i++) {
            users[i] = new User(String.valueOf(i + 1));
            users[i].print();
        }

    }

    public static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public void print() {
            Printer printer = Printer.getInstance();
            printer.print(this.name + " print using " + printer.toString());
        }
    }
}
