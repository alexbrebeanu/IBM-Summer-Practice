import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { CallendarComponent } from './callendar/callendar.component';
import { AddLecrureFormComponent } from './add-lecrure-form/add-lecrure-form.component';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    CallendarComponent,
    AddLecrureFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
