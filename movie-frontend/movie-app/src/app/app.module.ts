import {NgModule}from '@angular/core';
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { BookingsComponent } from "./bookings/bookings.component";
import { BookslotComponent } from "./bookslot/bookslot.component";
import { DashboardComponent } from "./dashboard/dashboard.component";
import { LoginComponent } from "./login/login.component";
import { SlotComponent } from "./slot/slot.component";
import { HttpClient } from "@angular/common/http";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { NoopAnimationDriver } from "@angular/animations/browser";

@NgModule({
    declarations:[
        // AppComponent,
        // BookslotComponent,
        // LoginComponent,
        // SlotComponent,
        // BookingsComponent,
        // DashboardComponent
    ],
    imports:[
        BrowserModule,
        FormsModule,
        ReactiveFormsModule
    ],
        // AppRoutingModule,
        // HttpClientModule,

        // NoopAnimationsModule,


    // providers:[BookingsComponent],
    // bootstrap:[AppComponent]
})
export class AppModule{}