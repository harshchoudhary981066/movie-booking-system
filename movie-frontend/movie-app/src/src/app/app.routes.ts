import { Routes } from '@angular/router';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { LoginComponent } from './Login/login.component';
import { BookingsComponent } from './bookings/bookings.component';
import { BookingslotComponent } from './bookingslot/bookingslot.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HomemainComponent } from './homemain/homemain.component';
import { HeaderComponent } from './header/header.component';

export const routes: Routes = [
    {
        path:'',component:AdminLoginComponent,
    },
    {
        path:'login',component:LoginComponent,
    },
    {
        path:'bookings',component:BookingsComponent,
    },
    {
        path:'bookingslot',component:BookingslotComponent,
    },

    {
        path:'homemain',component:HomemainComponent,
    },
    {
        path:'header',component:HeaderComponent,
    },
    {
        path:'dashboard',component:DashboardComponent,
    },

];
