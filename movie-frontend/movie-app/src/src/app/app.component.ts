import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { LoginComponent } from './Login/login.component';
import { HeaderComponent } from './header/header.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { SignupComponent } from './signupp/signupp.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HomemainComponent } from "./homemain/homemain.component";
import { BookingslotComponent } from "./bookingslot/bookingslot.component";
import { BookingsComponent } from "./bookings/bookings.component";
import { SidenavComponent } from './sidenav/sidenav.component';



interface SidenavComponent{
  screenWidth:number;
  collapsed:boolean;
}
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, LoginComponent, HeaderComponent, AdminLoginComponent, SignupComponent, DashboardComponent, HomemainComponent, BookingslotComponent, BookingsComponent, SidenavComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Movie-Login-System';
  isSideNavCollapsed=false;
  screeenWidth=0;
  onToggleSideNov(data:SidenavComponent):void{
    this.screeenWidth=data.screenWidth;
    this.isSideNavCollapsed=data.collapsed;

  }
}
