import { Component } from '@angular/core';
import { HomeText } from './texts/home.text';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.sass']
})
export class HomeComponent {

  homeTexts = HomeText;

}
