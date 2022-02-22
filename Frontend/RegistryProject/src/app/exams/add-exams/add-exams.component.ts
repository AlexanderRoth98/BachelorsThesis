import { Component, OnInit } from '@angular/core';
import { ExamService } from 'src/app/services/exam.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CourseService } from 'src/app/services/course.service';
import { Router } from '@angular/router';


interface Exam {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-add-exams',
  templateUrl: './add-exams.component.html',
  styleUrls: ['./add-exams.component.css']
})




export class AddExamsComponent implements OnInit {
  user = JSON.parse(localStorage.getItem('loggedUser'));
  role = localStorage.getItem('role');
  isLinear = true;
  firstFormGroup: FormGroup;
  secondFormGroup: FormGroup;
  breakpoint: number;
  start;
  time;
  examId; date: string; duration; classroom; totalPlaces; numberOfEnrolledStudents = 0; courseId: string; sutdentList = []; professorId;


  exams: Exam[] = [];


  constructor(private courseService: CourseService, private _formBuilder: FormBuilder, private examService: ExamService, private router: Router) { }


  ngOnInit() {


    this.courseService.getCoursesFromProfessor(this.user.professorId).subscribe((courses) => {

      for (let item of courses) {
        this.exams.push(

          {
            value: item.courseId, viewValue: item.shortSubject
          },
        );
      }

    });

    this.firstFormGroup = this._formBuilder.group({
      firstCtrl: ['', Validators.required]
    });

    this.breakpoint = (window.innerWidth <= 400) ? 1 : 3;

  }

  onResize(event) {
    this.breakpoint = (event.target.innerWidth <= 400) ? 1 : 3;
  }

  routeChange(route: string) {
    this.router.navigate([route]);
  }

  createExam() {
    this.date = this.start + 'T' + this.time;
    this.professorId = this.user.professorId
    this.examService.createExam(this.examId, this.date, this.duration, this.classroom, this.totalPlaces, this.numberOfEnrolledStudents, this.courseId, this.sutdentList, this.professorId).subscribe(() => { });
    this.routeChange('/exams');
    window.location.reload();
  }
}
