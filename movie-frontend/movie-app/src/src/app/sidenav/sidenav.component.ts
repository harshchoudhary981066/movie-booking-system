import { Component } from '@angular/core';
import { navbarData } from './nav-data';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-sidenav',
  standalone: true,
  imports: [CommonModule,RouterLink,SidenavComponent],
  templateUrl: './sidenav.component.html',
  styleUrl: './sidenav.component.css'
})
export class SidenavComponent {
  collapsed=true;
  navData=navbarData;
}
