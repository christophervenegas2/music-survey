import { Component, OnInit } from '@angular/core';
import { AboutText } from './texts/about.text';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.sass']
})
export class AboutComponent {

  aboutText = AboutText;

}
