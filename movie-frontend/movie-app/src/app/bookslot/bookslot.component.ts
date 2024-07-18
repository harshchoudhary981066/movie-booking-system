import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-bookslot',
  standalone: true,
  imports: [BookslotComponent,RouterLink,CommonModule,FormsModule],
  templateUrl: './bookslot.component.html',
  styleUrl: './bookslot.component.css'
})
export class BookslotComponent {

}
