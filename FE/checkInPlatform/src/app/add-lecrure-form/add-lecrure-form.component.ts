import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-lecrure-form',
  templateUrl: './add-lecrure-form.component.html',
  styleUrls: ['./add-lecrure-form.component.css']
})
export class AddLecrureFormComponent implements OnInit {

  @Input() event :Event ;
  @Input() formIsShown: boolean;

  constructor() { }

  ngOnInit(): void {
  }

}
