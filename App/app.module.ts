import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BatchesComponent } from './batches/batches.component';
//import { SubjectsComponent } from './subjects/subjects.component';
import { NavigatorComponent } from './navigator/navigator.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { PersonalinfoComponent } from './personalinfo/personalinfo.component';
import { BugComponent } from './bug/bug.component';

import {FormsModule} from '@angular/forms';

// Import ReactiveFormsModule for reactive forms
import {ReactiveFormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    BatchesComponent,
    //SubjectsComponent,
    NavigatorComponent,
    HeaderComponent,
    FooterComponent,
    PersonalinfoComponent,
    BugComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,          // Add names of modules
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
