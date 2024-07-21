import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-homemain',
  standalone: true,
  imports: [CommonModule,RouterLink,FormsModule,HomemainComponent],
  templateUrl: './homemain.component.html',
  styleUrl: './homemain.component.css'
})
export class HomemainComponent {
  constructor(private router:Router ){}
  ngOnInit():void{

  }
  checkSession(){
    if(sessionStorage.length==0){
      this.router.navigate(['/login'])
    }
    else{
      this.router.navigate(['/dashboard'])
    }
  }
}
