import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CommonModule, FormStyle } from '@angular/common';
import { FormGroup, FormsModule ,FormBuilder, Validators} from '@angular/forms';
import { RouterLink } from '@angular/router';
import { HeaderComponent } from "../header/header.component";


@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule, LoginComponent, RouterLink, HeaderComponent],
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  error: any;
  username: String | undefined;
  password: string | undefined
form: any;

  constructor(private http: HttpClient) { }

  onSubmit() {
    this.http.post('/api/login', { username: this.username, password: this.password })
      .subscribe((response: any) => {
        // Handle successful login
        console.log(response);
        // Redirect to dashboard or movie listing page
      }, (error: any) => {
        this.error = error.error.message;
      });
  }
}






















// import { Component} from '@angular/core';
// import { HttpClient } from '@angular/common/http';
// import { Validators } from '@angular/forms';
// @Component({
//   selector:"app-login",
//   tempelateUrl:'./login.component.html',
//   styleUrls:['./login.component.css']
// })
//   // selector: 'app-login',
//   // templateUrl: './login.component.html',
//   // styleUrls: ['./login.component.css']

// export class LoginComponent({  
//  username:string;
//  password:string;
//  error:string;


//   // form = new FormGroup({
//   //   email : new FormControl('', [Validators.required, Validators.email]),
//   //   password : new FormControl('', Validators.required)

//   constructor(private http:HttpClient) {}

//   ngOnInit(): void {
//     this.checkLogin();
//   }
     
//   onSubmit() {
//     this.http.post('/api/login',{username:this.username,password:this.password})
//     // var loginJson = JSON.stringify(this.form.value);
//     // this.usersService.loginCheck(loginJson)
//     .subscribe((response:any)=> {
//       // Handle Successful Login
//       console.log(response);
//     },(error:any)=>{
//       this.error=error.error.message;
//     });
//   }
// }
// })
//       // if(data == true){
//       //   alert("Login successful");
//       //   var jsonData = JSON.parse(loginJson);
//       //   this.storeLogin(jsonData['email']);
//       //   this.router.navigate(['/dashboard']);
//       // }
//       // else{
//       //   alert("Invalid Login"); 
//       // }
 


//   storeLogin(email){
//     sessionStorage.setItem("email", email); 
//   }
//   checkLogin(){
//     if (sessionStorage.length != 0){
//       this.router.navigate(['/']);
//     }
//   }
// }






// import { Component } from '@angular/core';

// @Component({
//   selector: 'app-login',
//   standalone: true,
//   imports: [],
//   templateUrl: './login.component.html',
//   styleUrl: './login.component.css'
// })
// export class LoginComponent {

// }
