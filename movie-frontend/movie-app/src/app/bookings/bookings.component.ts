import { Component } from '@angular/core';

@Component({
  selector: 'app-bookings',
  standalone: true,
  imports: [],
  templateUrl: './bookings.component.html',
  styleUrl: './bookings.component.css'
})
export class BookingsComponent   implements OnInit{
  show:boolean;
  email$=sessionStorage.getItem('email');
  bookings$:Bookings[]=[];
  constructor(public router:Router){}
  ngOnInit(){
    this.checkLogin(data);
    this.getbookingById();
  }
  getbookingById(){
    return this.bookingsService.getbookings(this.email$)
    .subscribe(data=>{this.bookings$=data,this.checkBookingFn();})
  }
  endBooking(bookingid){
    return this.bookingsService.endBooking(bookingid)
    .subscribe((data:{})=>{
      alert('Booking Confirmed');
      location.reload();
      this.router(0)
    }
    )
  }
}
