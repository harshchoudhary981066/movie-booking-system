package service;

import model.Seat;

public interface SeatService {
    void blockSeat(Seat seat);
    void bookSeat(Seat seat);
    void cancelSeat(Seat seat);
}

