import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

  @Output() form = new EventEmitter<Event>();

  public formClickedEvent:Event = new Event("formClickedEvent");

  constructor() { }

  ngOnInit(): void {
  }

  homeNavBar(): void {  
    console.log("Home Pressed");
  } 

  lecturesNavBar(): void{
    console.log("My Lectures Pressed")
    
  }

  profileNavBar(): void{
    console.log("Profile Pressed")
  }

  // emitEventForm(): void{
  //   this.form.emit(this.formClickedEvent);
  // }
  emitEventForm(): void{
    this.form.emit();
  }
}
