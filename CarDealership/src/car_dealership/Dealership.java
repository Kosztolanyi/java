package car_dealership;

import java.util.Arrays;

public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.name = "Tom";
        cust1.address = "anything Street";
        cust1.cashOnHand = 12000;

        cust1.purchaseCar(vehicle, emp, false);


        handelCustomer (cust, finance, vehicle){
            if (finance == true) {
                runCreditHistory(cust, doubleAmount);
            } else if (vehicle.getPrice() <= cust1.cashOnHand){
                processTransaction(cust, vehicle);
            } else {
                System.out.println("bring more money");
            }
        }
    }

    static void handelCustomer (Customer cust, boolean finance, Vehicle vehicle) {

    }

    static void runCreditHistory(Customer cust, double doubleAmount) {

    }
    static void processTransaction(Customer cust, Vehicle vehicle) {

    }
}
