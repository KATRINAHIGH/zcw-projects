import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { HttpClientModule} from '@angular/common/http';

/*
  Generated class for the RegisterProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class RegisterProvider {
url: string;
  constructor(public http: HttpClient) {
    console.log('Hello RegisterProvider Provider');
    //this url generates response of true if registered and a 201 that acount was created
    this.url = "http://www.mocky.io/v2/5ac226003300006500872f56";
  }
//look inside observable and return true or false, if true then register, if false something broke
doRegister(email,firstName, password): Observable<any>{
  //returns the body/object that gets returned which contains the token
    //every observable gives you a way to handle failures, login just returns
    //entire observable. with registration we are going to invoke the then method
    //when observable is suscceful and return true from that
    return this.http.get(this.url);
}
}
