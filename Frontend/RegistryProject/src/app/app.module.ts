import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { MatGridListModule } from '@angular/material/grid-list';
import { AppComponent } from './app.component';
import { StudentService } from './services/student.service';
import { MatSelectModule } from '@angular/material/select';
import { HttpServiceModule } from './http/http.module';
import { CommonModule } from '@angular/common';
import { ProfessorService } from './services/professor.service';
import { HttpClientModule } from '@angular/common/http';
import { MatFormFieldModule } from '@angular/material/form-field';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './login/login.component';
import { MatStepperModule } from '@angular/material/stepper';
import { ReactiveFormsModule } from '@angular/forms';
import {
  MatButtonModule, MatCardModule, MatDialogModule, MatInputModule, MatTableModule,
  MatToolbarModule, MatMenuModule, MatIconModule, MatProgressSpinnerModule
} from '@angular/material';
import { MainNavComponent } from './main-nav/main-nav.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { AppRoutesModule } from './app-routes-module';
import { RootComponent } from './root/root.component';
import { StudentComponent } from './student/addstudent/student.component';
import { UserService } from './services/user.service';
import { AddProfessorComponent } from './professor/add-professor/add-professor.component';
import { MatSortModule } from '@angular/material/sort';
import { ViewStudentsComponent } from './student/view-students/view-students.component';

import { ViewProfessorsComponent } from './professor/view-professors/view-professors.component';
import { ViewExamsComponent } from './exams/view-exams/view-exams.component';
import { LoginService } from './services/login.service';
import { MatMomentDateModule, MomentDateAdapter } from "@angular/material-moment-adapter";

import { FullCalendarModule } from '@fullcalendar/angular';
import { AddExamsComponent } from './exams/add-exams/add-exams.component';
import { ExamService } from './services/exam.service';
import { CourseService } from './services/course.service';
import { StatisticsStudentsComponent } from './student/statistics-students/statistics-students.component';
import { StatisticsProfessorsComponent } from './professor/statistics-professors/statistics-professors.component';
import { DialogComponent } from './exams/dialog/dialog.component';
import { MyExamsComponent } from './exams/my-exams/my-exams.component';


import { MatDatepickerModule } from '@angular/material/datepicker';
import { ProfDialogComponent } from './exams/prof-dialog/prof-dialog.component';



@NgModule({
  declarations: [
    AppComponent,

    LoginComponent,

    MainNavComponent,

    RootComponent,

    StudentComponent,

    AddProfessorComponent,


    ViewStudentsComponent,






    ViewProfessorsComponent,






    ViewExamsComponent,






    AddExamsComponent,






    StatisticsStudentsComponent,






    StatisticsProfessorsComponent,






    DialogComponent,






    MyExamsComponent,






    ProfDialogComponent,




























  ],
  imports: [
    BrowserModule,
    HttpServiceModule,
    CommonModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    AppRoutesModule,
    ReactiveFormsModule,
    MatGridListModule,
    MatSortModule,
    MatButtonModule,
    MatCardModule,
    MatDialogModule,
    MatInputModule,
    MatTableModule,
    MatToolbarModule,
    MatMenuModule,
    MatIconModule,
    MatProgressSpinnerModule,
    LayoutModule,
    MatSidenavModule,
    MatListModule,
    MatFormFieldModule,
    MatSelectModule,
    MatStepperModule,
    MatDatepickerModule,
    MatMomentDateModule,
    FullCalendarModule
  ],
  providers: [StudentService,
    ProfessorService,
    UserService,
    LoginService,
    ExamService,
    CourseService,
  ],
  bootstrap: [AppComponent],
  exports: [DialogComponent, ProfDialogComponent],
  entryComponents: [DialogComponent, ProfDialogComponent],
})
export class AppModule { }
