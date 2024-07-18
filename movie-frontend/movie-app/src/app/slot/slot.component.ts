import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-slot',
  standalone: true,
  imports: [SlotComponent,RouterLink,CommonModule,FormsModule],
  templateUrl: './slot.component.html',
  styleUrl: './slot.component.css'
})
export class SlotComponent {
location: any;

}
