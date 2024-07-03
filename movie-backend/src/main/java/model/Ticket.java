package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Ticket{

    @Id
    @GeneratedValue
    private int ticketId;

    private int noOfSeat;
    private String seatName;
    private boolean ticketStatus;
    private String screenName;

    public Ticket(int ticketId, int noOfSeat, String seatName, boolean ticketStatus, String screenName) {
        this.ticketId = ticketId;
        this.noOfSeat = noOfSeat;
        this.seatName = seatName;
        this.ticketStatus = ticketStatus;
        this.screenName = screenName;
    }

    public Ticket() {
        super();
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public boolean isTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(boolean ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
}
