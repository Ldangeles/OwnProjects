package com.ldangeles;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FrontEnd_Sim {

    final private Scanner in;
    final private UserService userService;

    public FrontEnd_Sim() throws SQLException {
        this.in = new Scanner(System.in);
        this.userService = new UserService();
    }

    public void run() {
        boolean isExiting = false;
        int option = 0;

        while (!isExiting){
            boolean isAnOption = false;

            while (!isAnOption) {
                this.printMainMenu();

                try {
                    option = this.in.nextInt();

                    if (option > 3) {
                        throw new IllegalArgumentException();
                    }
                    isAnOption = true;
                } catch (InputMismatchException exception){
                    System.out.println("Please use a NUMBER to select one of the options below\n");
                    in.next();
                } catch (IllegalArgumentException exception){
                    System.out.println("Please select one of the options\n");
                }

            }

            if (option == 3)
                isExiting = true;

            switch (option) {
                case 1 -> this.login();
                case 2 -> this.signup();
                case 3 -> this.runExit();
            }
        }

    }

    private void runUser() {

        boolean isExiting = false;
        int option = 0;

        while (!isExiting) {
            boolean isAnOption = false;

            while (!isAnOption) {
                this.printUserMenu();
                try {
                    option = this.in.nextInt();

                    if (option > 4) {
                        throw new IllegalArgumentException();
                    }
                    isAnOption = true;
                } catch (InputMismatchException exception) {
                    System.out.println("Please use a NUMBER to select one of the options below\n");
                    in.next();
                } catch (IllegalArgumentException exception) {
                    System.out.println("Please select one of the options\n");
                }

            }

            if (option == 2)
                isExiting = true;

            switch (option) {
                case 1 -> this.postVideo();
                case 2 -> this.run();
            }
        }
    }

    private void runExit() {
        this.printExitMenu();
        System.exit(0);
    }

    private void login() {
        boolean isCorrect = false;

        while (!isCorrect) {
            System.out.print("""
                    ------------
                     USER LOGIN
                    ------------""");
            System.out.print("\nEnter username: ");
            String username = this.in.next();
            System.out.print("\nEnter password: ");
            String password = this.in.next();

            try {
                this.userService.LogIn(username, password);
            } catch (SQLException exception) {
                System.err.println("Database error");
                continue;
            } catch (IllegalArgumentException exception) {
                System.out.println("Username and email doesn't exist");
                continue;
            } catch (IllegalAccessException exception){
                System.out.println("Wrong password");
                continue;
            }
            isCorrect = true;
        }
        printUserMenu();
        runUser();
    }

    private void postVideo(){
        boolean isAvailable = false;

        while (!isAvailable) {
            System.out.print("\nEnter title: ");
            String title = this.in.next();
            System.out.print("\nEnter description: ");
            String description = this.in.next();

            boolean isUnder5min = false;
            int duration = 0;

            while(!isUnder5min){
                try {
                    System.out.print("\nEnter duration in seconds: ");
                    duration = this.in.nextInt();
                    if (duration > 300) {
                        throw new IllegalArgumentException();
                    } else {
                        isUnder5min = true;
                    }
                } catch (IllegalArgumentException exception){
                    System.out.println("Video duration must be under 5 min (300 s)");
                } catch (InputMismatchException exception){
                    System.out.println("Please use a number to assign the video duration");
                    in.next();
                }
            }


            try {
                this.userService.postVideo(title,description,duration);
            } catch (IllegalArgumentException exception) {
                System.out.println("Title already in use");
            } catch (SQLException exception){
                System.out.println("Database error");
                continue;
            }

            isAvailable = true;
        }
        System.out.print("""
                ---------------------------
                 VIDEO POSTED SUCCESSFULLY
                ---------------------------""");
    }

    public void signup() {
        boolean isAvailable = false;

        while (!isAvailable) {
            System.out.print("""
                -------------
                 USER SIGNUP
                -------------""");

            System.out.print("\nEnter username: ");
            String username = this.in.next();
            System.out.print("\nEnter email: ");
            String email = this.in.next();
            System.out.print("\nEnter password: ");
            String password = this.in.next();

            try {
                this.userService.SignUp(username, email, password);
            } catch (IllegalArgumentException exception){
                System.out.println("Email or Username already in use");
                continue;
            } catch (SQLException exception){
                System.out.println("SQL exception");
            }
            isAvailable = true;

        }
        System.out.print("""
                ---------------------------
                 USER CREATED SUCCESSFULLY
                ---------------------------""");

    }

    private void printMainMenu() {
        System.out.println("""
                ------------
                MAIN MENU
                ------------""");
        System.out.print("""
                Select Option:
                1: Login
                2: Sign up
                3: EXIT
                >\s""");
    }

    private void printUserMenu() {
        System.out.println("""
                ------------
                USER MENU
                ------------""");
        System.out.print("""
                1: Post Video
                2: Video List
                3: Delete User
                4: EXIT MAIN MENU
                >\s""");
    }

    private void printAdminMenu() {
        System.out.println("""
                ------------
                ADMIN MENU
                ------------""");
        System.out.print("""
                1: User List
                2: Video List
                3: EXIT MAIN MENU
                >\s""");
    }

    private void printExitMenu() {
        System.out.println("\nSee you later!");
        this.in.close();
    }

}

