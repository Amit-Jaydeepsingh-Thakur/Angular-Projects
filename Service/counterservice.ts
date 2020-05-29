import { Injectable,Input } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CounterService {

  @Input() public Firstname : string ="";
  @Input() public Lastname : string ="";
  @Input() public email : string ="";
  @Input() public impact : string ="";
  @Input() public comment : string ="";
  @Input() public date : string="";
  constructor() { }
}
