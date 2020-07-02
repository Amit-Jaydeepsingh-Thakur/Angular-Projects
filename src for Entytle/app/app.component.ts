import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup,Validators, FormControl, MinLengthValidator} from '@angular/forms'


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  cnt:number=0;
  err_msg:string="";
  list_names:string[]=["","","","","","","","","",""];

  constructor(public bobj:FormBuilder)
  {

  }

  supportForm=this.bobj.group(
    {
      name:['']
    }
  );
  public list(nam:any){
    if(this.cnt>=10){
      this.err_msg="There cannot be more than 10 items";
      return;
    }
    if(this.list_names.includes(nam.value))
      { 
        this.err_msg="There cannot be duplicate items";
        return;
    }
    this.list_names[this.cnt]=nam.value;
    this.err_msg="";
    this.cnt++;
  }

  public delete(item:string){
    const index=this.list_names.indexOf(item);
    if(index!=-1){
      this.list_names.splice(index,1);
      this.cnt--;
    }
    
  }
}

