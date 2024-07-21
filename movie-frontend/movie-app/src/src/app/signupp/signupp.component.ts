import { Component ,OnInit} from '@angular/core';
import { AbstractControl, FormControl, FormGroup, FormsModule, Validators } from '@angular/forms';
// import { UserServicesComponent } from '../user-services/user-services.component';
import {Router, RouterLink} from '@angular/router';
import { UserServicessService } from '../user-servicess.service';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-signup',
  standalone: true,
  imports: [SignupComponent,CommonModule,RouterLink,FormsModule],
  templateUrl:'./signupp.component.html',
  styleUrl: './signupp.component.css'
})
export class SignupComponent {
  form=new FormGroup({
    email:new FormControl('',[Validators.required,Validators.email]),
    fullname:new FormControl('',Validators.required),
    mobileNum:new FormControl('',Validators.required),
    password:new FormControl('',Validators.required),
    // ConfimPassword:new FormControl('',[Validators.required,this.confirmPasswordCheck])
  })
  constructor(private userService:UserServicessService,private router:Router){}
  ngOnInit():void{
    // this.checkLogin();
  }
  onSubmit(){
//     var loginJson=JSON.stringify(this.form.value);
//     var x;
//     this.userService.SignupComponent(loginJson)
//     .subscribe(((data: boolean)=>{
//       if(data==false){
//         alert("SignUp Successfull");
//         this.router.navigate(['/login']);
//         return true;
//       }
//       else{
//         alert(data);
//         return;
//       }
//     }))
//   }
//   checkLogin(){
//     if (sessionStorage.length!=0)this.router.navigate(['/']);
//   }

// confirmPasswordCheck( control: AbstractControl ){
//   if(control && control.value!=null || control.value!=undefined){
//     const cnfPasword=control.value;
//     const passControl=control.root.get('password')

//     if(passControl){
//       const passValue=passControl.value;
//       if(passValue!==cnfPasword){
//         return {
//           isError:true
//         }
//       }
//     }
//   }
//   return null
  }
}