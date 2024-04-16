package assignment2_000892482;

/**
  @author Nevil Patel
 */

/**
 * Vending Machine class is created and different variables is created with
 * appropriate data types.
 */
public class VendingMachine {
    private String productName;
    private double productPrice;
    private int total;
    private double UnUsedAmount;
    private double totalBalance;

    /**
     * Using set method for the product name.
     * 
     * @param productName for the name of the product in the vending machine.
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Using get method for the product name.
     * 
     * @return for the name of the product in the vending machine.
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Using set method for the product price.
     * 
     * @param productPrice for the price of the product in the vending machine.
     */
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * Using get method for the product price.
     * 
     * @return for the price of the product in the vending machine.
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * Using set method for the total quantity of product.
     * 
     * @param total for the total quantity of the product in the vending machine.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Using get method for the total quantity of product.
     * 
     * @return for the total quantity of the product in the vending machine.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Using set method for the Unused Amount.
     * 
     * @param UnUsedAmount for the Unused Amount in the vending machine.
     */
    public void setUnUsedAmount(double UnUsedAmount) {
        this.UnUsedAmount = UnUsedAmount;
    }

    /**
     * Using get method for the Unused Amount.
     * 
     * @return for the Unused Amount in the vending machine.
     */
    public double getUnUsedAmount() {
        return UnUsedAmount;
    }

    /**
     * Using set method for the Unused Amount.
     * 
     * @param totalBalance for the total balance in the vending machine.
     */
    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    /**
     * Using get method for the Total Balance.
     * 
     * @return for the total balance in the vending machine.
     */
    public double getTotalBalance() {
        return totalBalance;
    }

    /**
     * The coin variable in the insertCoin method contains two data types.
     * (i) If the coin is valid, the value of the coin is added to the remaining
     * Amount.
     * (ii) If the coin is invalid, the value of coins displays an error message.
     * 
     * @param coin has the coin's value that will be entered.
     */
    public void insertCoin(double coin) {
        if (isValidCoin(coin)) {
            UnUsedAmount += coin;
        } else {
            System.out.println(
                    "You entered an invalid number! We only accept loonies, toonies, quarters, nickels, and dimes.");
        }
    }

    /**
     * Returns the unused Money to the user and sets the unused credit to zero.
     */
    public void returnMoney() {
        System.out.println("Returning Money: $" + UnUsedAmount);
        UnUsedAmount = 0.0;
    }

    /**
     * If the conditions are met, then it deducts the product price from the unused
     * Amount,
     * It adds the product price to the total balance, and it will decrement the
     * total quantity of the product.
     * If there are no products left in Vending Machine, it displays a message to
     * refill necessary products.
     * If the user doesn't have enough Amount, it displays a message asking to load
     * money.
     */
    public void vendProduct() {
        if (UnUsedAmount >= productPrice && total > 0) {
            System.out.println("Vending " + productName);
            UnUsedAmount -= productPrice;
            totalBalance += productPrice;
            total--;
        } else {
            if (total == 0) {
                System.out.println("Sorry, No product left, we will refill soon!!");
            } else {
                System.out.println("You don't have enough Amount, please load money.");
            }
        }
    }

    /**
     * @return a string containing information about the vending machine's total
     *         quantity, product name, product price, unused money, and total
     *         balance.
     */
    public String toString() {
        return "VendingMachine: " + total + " " + productName + " left, $" + productPrice + " each, $" + UnUsedAmount
                + " Amount, balance $" + totalBalance;
    }

    /**
     * Checks if the coin value is valid.
     * Valid coins are 1.0, 2.0, 0.25, 0.10, and 0.05.
     * 
     * @param coin is the value of the coin to be checked.
     * @return true if the coin is valid, false otherwise.
     */
    private boolean isValidCoin(double coin) {
        return coin == 1.0 || coin == 2.0 || coin == 0.25 || coin == 0.10 || coin == 0.05;
    }
}