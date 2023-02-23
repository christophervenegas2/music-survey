import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { BackNavigationComponent } from './components/back-navigation/back-navigation.component';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';

@NgModule({
  declarations: [
    BackNavigationComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    MatButtonModule,
    MatIconModule
  ],
  providers: [
  ],
  exports: [
    BackNavigationComponent
  ]
})
export class SharedModule { }
