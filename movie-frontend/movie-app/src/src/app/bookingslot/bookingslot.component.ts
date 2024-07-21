import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-bookingslot',
  standalone: true,
  imports: [CommonModule,FormsModule,BookingslotComponent],
  templateUrl: './bookingslot.component.html',
  styleUrl: './bookingslot.component.css'
})
export class BookingslotComponent {
bookingCtrl: any;
  // angularbookingCtrl: any;
// .module('movieBookingApp', [])
  // .controller('LoginController', function() {
  //     var vm = this;
  //     vm.login = function() {
  //         // Here you would typically perform authentication with a backend service
  //         // For simplicity, let's just log the username to console
  //         console.log('Logged in as:', vm.username);
  //         // Redirect to booking page after successful login
  //         window.location = 'booking.html'; // Redirect to booking page
  //     };
  // })
  // .controller('BookingController', function() {
  //     var vm = this;
  //     vm.username = ''; // This will be set after login
  //     vm.selectedMovie = null;
  //     vm.selectedSlot = null;
  //     vm.movies = [
  //         { id: 1, name: 'Movie A' },
  //         { id: 2, name: 'Movie B' },
  //         { id: 3, name: 'Movie C' }
  //     ];
  //     vm.timeSlots = [
  //         { id: 1, time: '10:00 AM' },
  //         { id: 2, time: '2:00 PM' },
  //         { id: 3, time: '6:00 PM' }
  //     ];
  //     vm.bookSlot = function() {
  //         // Here you would typically send booking details to a backend service
  //         // For simplicity, let's just log the selected movie and slot to console
  //         console.log('Movie:', vm.selectedMovie.name);
  //         console.log('Time Slot:', vm.selectedSlot.time);
  //         alert('Slot booked successfully!'); // Show an alert for demonstration
  //     };
  // });

}
