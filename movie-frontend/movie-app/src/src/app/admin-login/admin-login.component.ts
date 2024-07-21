import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, FormsModule, Validators } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { AdminService } from '../admin-service.service';

@Component({
  selector: 'app-admin-login',
  standalone: true,
  imports: [CommonModule,FormsModule,AdminLoginComponent,RouterLink],
  templateUrl: './admin-login.component.html',
  styleUrl: './admin-login.component.css'
})
export class AdminLoginComponent implements OnInit{
  form=new FormGroup({
    adminid:new FormControl('',Validators.required),
    password:new FormControl('',Validators.required)
  })
  constructor(private route:Router,private adminService:AdminService){}
  ngOnInit(): void {  }
    // throw new Error('Method not implemented.');
    onSubmit(){
      var loginJson=JSON.stringify(this.form.value);
      this.adminService.loginCheck(loginJson)
      .subscribe((data=>{
        if(data==true){
          alert("Login Successfull");
          var jsonData=JSON.parse(loginJson);
          this.storeLogin(jsonData['Email']);
          this.route.navigate(['/admin-dashboard']);
        }
        else {
          alert("Invalid Login");
        }
      }

      ))
    }
    storeLogin(email: string){
      sessionStorage.setItem('admin',email);
    }

}
