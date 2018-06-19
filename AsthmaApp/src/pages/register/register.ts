import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { ToastController } from "ionic-angular";
import { RegisterProvider } from '../../providers/register/register';
import { Storage } from '@ionic/storage';

/**
 * Generated class for the RegisterPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-register',
  templateUrl: 'register.html',
})
export class RegisterPage {
//Goes to server to retrieve token and location, returns that info, pushing info to server
//and will get a response back, the token will be in part of the response body,Collecting 
//email, password, firstName, city, state, confirm password
email: string;
firstName: string;
city: string;
state: string;
password: string;
passwordConfirm: string;

  constructor(
    public navCtrl: NavController, 
    public navParams: NavParams, 
    public toaster: ToastController,
    public registerProvider: RegisterProvider,
    public storage: Storage) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad RegisterPage');
  }

  sendRegister(){
    console.log(this);
    //only validating if passwords match for this lab
    if(this.password !== this.passwordConfirm){
        //Toast--is a pop up message like a notification
        const toast = this.toaster.create({
          message: "Your passwords did not match",
          showCloseButton: true,
          closeButtonText: "OK"
        });
        toast.present();
        return;
    }
    this.registerProvider.doRegister(this.email, this.firstName, this.password)
    .subscribe((result: any)=>{
      //console.log(result);
      const location = {
        city: this.city,
        state: this.state
      }
      this.storage.set('location', JSON.stringify(location)).then(()=>{this.navCtrl.pop()});
    });

  }

}
