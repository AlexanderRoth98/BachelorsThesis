import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { StudentService } from 'src/app/services/student.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  isLinear = true;
  firstFormGroup: FormGroup;
  secondFormGroup: FormGroup;
  breakpoint: number;
 

  registrationNumber; firstName; lastName; gender; age;
  email; telNr; studyCourse; subgroup; semester;


  constructor(private _formBuilder: FormBuilder, private studentService: StudentService, private userService: UserService) { }

  ngOnInit() {
    this.firstFormGroup = this._formBuilder.group({
      firstCtrl: ['', Validators.required]
    });
    this.secondFormGroup = this._formBuilder.group({
      secondCtrl: ['', Validators.required]
    });


    this.breakpoint = (window.innerWidth <= 400) ? 1 : 3;
  }

  onResize(event) {
    this.breakpoint = (event.target.innerWidth <= 400) ? 1 : 3;
  }

  createStudent() {
    this.studentService.createStudent(this.registrationNumber, this.firstName, this.lastName, this.gender, this.age, this.email, this.telNr, this.studyCourse, this.subgroup,
      this.semester).subscribe(() => { });

    this.userService.createUser(this.email, 'stud', 'student').subscribe(() => { });


  }
}


