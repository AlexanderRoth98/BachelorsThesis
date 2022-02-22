import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

import { UserService } from 'src/app/services/user.service';
import { ProfessorService } from 'src/app/services/professor.service';


@Component({
  selector: 'app-add-professor',
  templateUrl: './add-professor.component.html',
  styleUrls: ['./add-professor.component.css']
})
export class AddProfessorComponent implements OnInit {

  isLinear = true;
  firstFormGroup: FormGroup;
  secondFormGroup: FormGroup;
  breakpoint: number;


  professorId; firstName; lastName; gender; age; email; telNr; title;


  constructor(private _formBuilder: FormBuilder, private professorService: ProfessorService, private userService: UserService) { }

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

  createProfessor() {



    this.professorService.createProfessor(this.professorId, this.firstName, this.lastName, this.gender, this.age, this.email, this.telNr, this.title).subscribe(() => { });

    this.userService.createUser(this.email, 'prof', 'professor').subscribe(() => { });


  }
}
