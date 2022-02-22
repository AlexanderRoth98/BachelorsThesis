import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ViewExamsComponent } from '../view-exams/view-exams.component';
import { Router } from '@angular/router';
import { ExamService } from 'src/app/services/exam.service';
import { StudentService } from 'src/app/services/student.service';
import { CourseService } from 'src/app/services/course.service';


export interface DialogData {
  examId: string;
  subject: string;
  date: string;
  nrEnrolled: string;
  totalPlaces: string;
}

@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.css']
})
export class DialogComponent implements OnInit {
  user = JSON.parse(localStorage.getItem('loggedUser'));

  constructor(private courseService: CourseService, private router: Router, private studentService: StudentService, private examService: ExamService, public dialogRef: MatDialogRef<ViewExamsComponent>,
    @Inject(MAT_DIALOG_DATA) public data: DialogData) { }

  disabledStatus = 'false';
  enrolled = false;

  ngOnInit() {
    this.disabledStatus = 'false';
    this.enrolled = false;

    if (this.data.nrEnrolled == this.data.totalPlaces) {
      this.disabledStatus = 'true';
    }

    this.examService.getEnrolledExams(this.user.registrationNumber).subscribe((exams) => {

      for (let exam of exams) {


        this.courseService.getCourseInfromationFromExam(exam.examId).subscribe((course) => {
          if (this.data.subject == course.subject) {
            this.disabledStatus = 'true';
            this.enrolled = true;
          }



        });


      }





    });


  }

  onNoClick(): void {
    this.dialogRef.close();
  }

  onYesClick() {
    console.log(this.user.registrationNumber, this.data.examId);
    this.studentService.addStudentToExam(this.user.registrationNumber, this.data.examId).subscribe(() => { });
    this.dialogRef.close();
    window.location.reload();

  }
}
