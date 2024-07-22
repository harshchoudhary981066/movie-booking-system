import { Component, EventEmitter, Output } from '@angular/core';
import { navbarData } from './nav-data';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

interface SidenavComponent{
  collapsed:boolean;
  screenWidth:number;
}

@Component({
  selector: 'app-sidenav',
  standalone: true,
  imports: [CommonModule,RouterLink,SideNavComponent],
  templateUrl: './sidenav.component.html',
  styleUrl: './sidenav.component.css'
})
export class SideNavComponent {
  @Output() onToggleSideNav:EventEmitter<SideNavComponent>=new EventEmitter();
  collapsed=false;
  screenWidth=0;
  navData=navbarData;
  toggleCollapse(  collapsed:boolean,screenWidth:number):void{
    this.collapsed=!this.collapsed;
    this.onToggleSideNav.emit({collapsed:this.collapsed,screenWidth:this.screenWidth});
  }
  closeSidenav():void{
    this.collapsed=false;
    this.onToggleSideNav.emit({collapsed:this.collapsed,screenWidth:this.screenWidth});

  }

}