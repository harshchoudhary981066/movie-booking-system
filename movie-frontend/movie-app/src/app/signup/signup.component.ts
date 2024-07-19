import { Component ,OnInit} from '@angular/core';
import { AbstractControl, FormControl, FormGroup, Validators } from '@angular/forms';
import { UserServicesComponent } from '../user-services/user-services.component';
import {Router} from '@angular/router';
@Component({
  selector: 'app-signup',
  standalone: true,
  imports: [],
  templateUrl: './signup.component.html',
  styleUrl: './signup.component.css'
})
export class SignupComponent {
  form=new FormGroup({
    email:new FormControl('',[Validators.required,Validators.email]),
    fullname:new FormControl('',Validators.required),
    mobileNum:new FormControl('',Validators.required),
    password:new FormControl('',Validators.required),
    ConfimPassword:new FormControl('',[Validators.required,this.confirmPasswordCheck])
  })
  constructor(private userService:UserServicesComponent,private router:Router){}
  ngOnInit():void{
    this.checkLogin();
  }
  onSubmit(){
    var loginJson=JSON.stringify(this.form.value);
    var x;
    this.userService.signup(loginJson)
    .subscribe((data=>{
      if(data==false){
        alert("SignUp Successfull");
        this.router.navigate(['/login']);
        return true;
      }
      else{
        alert(data);
        return;
      }
    }))
  }
  checkLogin(){
    if (sessionStorage.length!=0)this.router.navigate(['/']);
  }

confirmPasswordCheck( control: AbstractControl ){
  if(control && control.value!=null || control.value!=undefined){
    const cnfPasword=control.value;
    const passControl=control.root.get('password')

    if(passControl){
      const passValue=passControl.value;
      if(passValue!==cnfPasword){
        return {
          isError:true
        }
      }
    }
  }
  return null
}
}
// function confirmPasswordCheck({ control, AbstractControl }: { control: any; AbstractControl: typeof AbstractControl; }): void {
//   throw new Error('Function not implemented.');
// }

