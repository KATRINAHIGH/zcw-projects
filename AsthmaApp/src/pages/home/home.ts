import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { Storage } from '@ionic/storage';
import { LoginPage } from '../login/login';
//make sure to add storage to app.module.ts and in imports
@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  //homepage pushes to the login page
  constructor(public navCtrl: NavController, private storage: Storage) {
    //need to tell it what to do after get retrieves the token, called obeservables/promises look into more
    this.storage.get('token').then((val) => {
      if(val == null){
        //checking to see if token exits if doesn't push to login page
        this.navCtrl.push(LoginPage);
      }
    });
  }
}
