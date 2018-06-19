import { Component, ViewChild } from '@angular/core';
import { NavController, Slides } from 'ionic-angular';
import { FlashCardsProvider } from '../../providers/flash-cards/flash-cards';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  @ViewChild(Slides) slides: Slides;

  currentCard = {
    front: "Hello0",
    back: "World!"
  };
  cardSupply: any;
  prov: any;
  currentIndex = 0;

  constructor(public navCtrl: NavController, supply: FlashCardsProvider) {
    this.prov = supply;
    this.cardSupply = supply.allCards();
  }

  oninit() {
    //this.cardSupply = this.prov.allCards();
  }
  slideChanged() {
    // ready for more functionality
  }

  nextSlide() {
    // ready for more functionality
  }

  prevSlide() {
    // ready for more functionality
  }

  reset() {
    this.navCtrl.setRoot(this.navCtrl.getActive().component);
  }
  next() {
    let idx = this.slides.getActiveIndex() + 1;
    this.slides.slideTo(idx, 500);
  }

  randomize() {
    this.cardSupply = this.prov.randomCards();

    this.navCtrl.setRoot(this.navCtrl.getActive().component);

  }
}
