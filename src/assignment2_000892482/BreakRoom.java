package assignment2_000892482;

import java.util.Scanner;
/**
  @author Nevil Patel
 */


public class BreakRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VendingMachine vendingMachine1 = new VendingMachine();
        vendingMachine1.setProductName("Chocolates");
        vendingMachine1.setProductPrice(2.0);
        vendingMachine1.setTotal(15);

        VendingMachine vendingMachine2 = new VendingMachine();
        vendingMachine2.setProductName("Chips");
        vendingMachine2.setProductPrice(5.0);
        vendingMachine2.setTotal(23);

        System.out.println("Welcome to the Break Room!");
        System.out.println("Choose Vending Machine (1 or 2):");
        System.out.println("1. " + vendingMachine1);
        System.out.println("2. " + vendingMachine2);

        int selectANo;
        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Enter money");
            System.out.println("2. Get change back");
            System.out.println("3. Vend an item");
            System.out.println("4. Leave the break room");
            System.out.print("Your Choice? ");
            selectANo = scanner.nextInt();

            switch (selectANo) {
                case 1:
                    System.out.print("Enter the vending machine number: ");
                    int machineNumber = scanner.nextInt();
                    System.out.print("Enter the amount of money to insert: ");
                    double money = scanner.nextDouble();

                    if (machineNumber == 1) {
                        vendingMachine1.insertCoin(money);
                    } else if (machineNumber == 2) {
                        vendingMachine2.insertCoin(money);
                    } else {
                        System.out.println("Invalid vending machine number!");
                    }
                    break;

                case 2:
                    System.out.print("Enter the vending machine number (1 or 2): ");
                    machineNumber = scanner.nextInt();

                    if (machineNumber == 1) {
                        vendingMachine1.returnMoney();
                    } else if (machineNumber == 2) {
                        vendingMachine2.returnMoney();
                    } else {
                        System.out.println("You Entered Invalid Vending Machine Number!");
                    }
                    break;

                case 3:
                    System.out.print("Enter the vending machine number (1 or 2): ");
                    machineNumber = scanner.nextInt();

                    if (machineNumber == 1) {
                        vendingMachine1.vendProduct();
                    } else if (machineNumber == 2) {
                        vendingMachine2.vendProduct();
                    } else {
                        System.out.println("You Entered Invalid Vending Machine Number!");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("You enter Invalid key.");
                    break;
            }
        } while (selectANo != 4);

        scanner.close();
    }
}
