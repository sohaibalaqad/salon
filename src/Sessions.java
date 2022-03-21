/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Sessions {

    private String date;
    private double duration;
    private Customers customer;
    private Departments department;

    public Sessions() {
    }

    public Sessions(String date, double duration, Customers customer, Departments department) {
        this.date = date;
        this.duration = duration;
        this.customer = customer;
        this.department = department;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    // A method used to print the details
    @Override
    public String toString() {
        return ("name: " + getCustomer().getName()
                + " , age: " + getCustomer().age()
                + " , Section: " + getDepartment().getType()
                + " , date: " + getDate()
                + " , duration:" + getDuration()
                + " , price: $" + getDepartment().getPrice());
    }

}
