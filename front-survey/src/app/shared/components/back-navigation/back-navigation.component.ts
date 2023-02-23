import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-back-navigation',
  templateUrl: './back-navigation.component.html',
  styleUrls: ['./back-navigation.component.sass']
})
export class BackNavigationComponent {

  constructor(private router: Router) {

  }

  goBack() {
    this.router.navigate(['/home']);
  }

}
