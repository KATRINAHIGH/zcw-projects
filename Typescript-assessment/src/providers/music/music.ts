import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { HttpClientModule} from '@angular/common/http';

/*
  Generated class for the MusicProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class MusicProvider {

stuff: string;
url: string;

  constructor(public http: HttpClient) {
    //console.log('Hello MusicProvider Provider');
    this.stuff = "for the children";
  }

  wuTangIs(){
    return this.stuff;
  }

  myFavoriteBand(){
    return this.http.get(this.url);
  }

  newBandILike<T>(item: any){
    return this.http.post<T>(this.url, item);
  }
}


// ### Level 1 (Basic Success)
// 1. Add jasmine and karma to the project so that you can run successful test
// 2. Create a service that has a public 
//function called **wuTangIs()**, that returns a string 
//with the value **"For the Children"**.
// 3. Successfully write a unit test for **wuTangIs()**

// In the same service have a public funtion 
// called **myFavoriteBand()**, that calls a http get 
// endpoint which will return a string. 
// 5. Successfully write a unit test for  **myFavoriteBand()**, 
// mocking out the http call.


// 6. In the same service have a public funtion 
// called **newBandILIke(value)** , that accepts a 
// String as a parameter, and calls a post endpoint.
// 7. Succesfully write a unit test for **newBandILIke(value)** 
// and mock out the http call.
 
  


