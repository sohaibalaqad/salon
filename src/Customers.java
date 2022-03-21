
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class Customers {

    private String name;
    private int yearOfBirth;

    public Customers() {
    }

    public Customers(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int age() {
        Date d = new Date();
        int year = d.getYear() + 1900;
        return year - getYearOfBirth();
    }

    // A method used to print the details
    @Override
    public String toString() {
        return ("Name: " + getName()
                + " , Age: " + age());

    }

}
