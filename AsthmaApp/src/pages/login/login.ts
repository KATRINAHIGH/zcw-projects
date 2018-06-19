import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { RegisterPage } from '../register/register'
import { LoginProvider } from '../../providers/login/login'
import { Storage } from '@ionic/storage';
/**
 * Generated class for the LoginPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-login',
  templateUrl: 'login.html',
})
export class LoginPage {
  //will push to register page
email: string;
password: string;

  constructor(public navCtrl: NavController, 
    public navParams: NavParams, 
    public loginProvider: LoginProvider,
    private storage:Storage) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad LoginPage');
  }

  //push to registration page
  gotoRegistration(){ 
    this.navCtrl.push(RegisterPage);
  }

  //when we click login its going to send email and password to the server to login, the 
  //server is going to look up the user account and return a token
  postLogin(){
    this.loginProvider.doLogin(this.email, this.password).subscribe((result: any)=>{
      //console.log(result);
      this.storage.set('token', result.token).then(()=>{this.navCtrl.pop()});
    });
  }

}




