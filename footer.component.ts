import { Component, OnInit } from '@angular/core';
import {CounterService} from '../counter.service'

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {

  
  constructor(public obj: CounterService)
  {

  }

  ngOnInit(): void {
  }

}
