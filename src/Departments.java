/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Departments {

    private String type;
    private double price;

    public Departments(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public Departments(String type, double price, int choise) {
        this.type = type;
        this.price = price;
        choise(choise);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void choise(int choise) {
        if (choise == 1) {
            this.type = "Hair care";
            this.price = 100.0;
        } else if (choise == 2) {
            this.type = "Skin care";
            this.price = 70.0;
        } else if (choise == 3) {
            this.type = "makeup";
            this.price = 150.0;
        } else if (choise == 3) {
            this.type = "Nail care";
            this.price = 50.0;
        } else {
            System.out.println("Choose from 1 to 4 only.");
        }
    }

    // A method used to print the details
    @Override
    public String toString() {
        return ("Section: " + this.type
                + " , Price: $" + this.price);
    }

}
