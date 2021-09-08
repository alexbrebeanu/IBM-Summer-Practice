import { AfterViewInit, Component, Input, OnChanges, OnInit, QueryList, ViewChildren } from '@angular/core';
import { connectableObservableDescriptor } from 'rxjs/internal/observable/ConnectableObservable';

@Component({
  selector: 'app-callendar',
  templateUrl: './callendar.component.html',
  styleUrls: ['./callendar.component.css']
})
export class CallendarComponent implements AfterViewInit, OnChanges{
  @ViewChildren("cell")
  cells: QueryList<any>;
  @Input() formIsShown: boolean;

  constructor() { }


  ngAfterViewInit(): void {
    console.log(this.cells)
    this.cells.forEach(cell=>{
      cell.nativeElement.addEventListener("click", ()=>{
        cell.nativeElement.innerHTML = "Course here"
        //this.printDateAndTime(cell.nativeElement.parentElement.rowIndex, cell.nativeElement.cellIndex)
      })
      console.log(cell.nativeElement.closest("tr").rowIndex)
      console.log(cell.nativeElement.cellIndex)
    })
  }

  ngOnChanges():void{
    this.cells.forEach(cell=>{
      cell.nativeElement.addEventListener("click", ()=>{
        cell.nativeElement.innerHTML = "Course here"
        //this.printDateAndTime(cell.nativeElement.parentElement.rowIndex, cell.nativeElement.cellIndex)
      })
      // console.log(cell.nativeElement.closest("tr").rowIndex)
      // console.log(cell.nativeElement.cellIndex)
    })
  }
    
  //Because of the cell that shows the hour, some ajustments need to be made 
  //This method corrects the cells indexes
  //Might need to add a return type and make the method return just the correct values for further 
  //That would mean also changing the name of the method
  printCorrectValues(row:number, column:number): void{
    if(((row-1)%4)==0){
      alert("Clicked " + row + " " + (column))
    }
    else{
      alert("Clicked " + row + " " + (column+1))
    }
  }

  printDateAndTime(row:number, column:number): void{
    if(((row-1)%4)!=0){
      column ++
    }

    var day:string;
    var hour:number;
    var minutes:number;

    switch(column){
      case 1: 
        day = "Monday"
        break;
      case 2:
        day = "Tuesday"
        break;
      case 3:
        day = "Wednesday"
        break;
      case 4:
        day = "Thursday"
        break;
      case 5:
        day = "Friday"
        break;
      case 6:
        day = "Saturday"
        break;
      default:
        day = "Sunday"
        break; 
    }

    hour = (Math.floor((row-1)/4))+8
    minutes = ((row-1)%4)*15
    
    alert("You clicked on day " + column +" (" + day + "), start of timeslot at: " + hour + ":" + minutes)
    
  }

  clic():void{
    alert("Fmm ca nu merge")
  }
}

