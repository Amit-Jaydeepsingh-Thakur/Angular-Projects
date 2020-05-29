import { Component, OnInit } from '@angular/core';
import {CounterService} from '../counter.service'

@Component({
  selector: 'app-bug',
  templateUrl: './bug.component.html',
  styleUrls: ['./bug.component.css']
})
export class BugComponent implements OnInit {

  constructor(public _counterservice: CounterService) { }

  ngOnInit(): void {
  }

}
