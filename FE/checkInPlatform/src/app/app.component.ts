import { Component, Input } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent{
  title = 'checkInPlatform';

  public formEvent:Event;
  public formIsShown:boolean = false;

  // showNewLectureForm(event :Event):void{
  //   this.formEvent = event;
  // }

  showNewLectureForm():void{
    this.formIsShown = !this.formIsShown;      
  }
}
