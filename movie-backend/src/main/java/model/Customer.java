package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private String cust_id;
    private String cust_name;
    private String cust_password;
    private LocalDate dob;
    private List<Ticket> myTickets;
    private String contact;

    public Customer(String cust_id, String cust_name, String cust_password, LocalDate dob, List<Ticket> myTickets, String contact) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.cust_password = cust_password;
        this.dob = dob;
        this.myTickets = myTickets;
        this.contact = contact;
    }

    public Customer() {
        super();
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_password() {
        return cust_password;
    }

    public void setCust_password(String cust_password) {
        this.cust_password = cust_password;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public List<Ticket> getMyTickets() {
        return myTickets;
    }

    public void setMyTickets(List<Ticket> myTickets) {
        this.myTickets = myTickets;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
