import { Component, OnInit, EventEmitter, Output } from '@angular/core';

import { LoginService } from '../services/login.service';
import { StudentService } from '../services/student.service';
import { isNullOrUndefined } from 'util';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  email: string;
  password: string;


  constructor(private loginService: LoginService, private router: Router) { }

  ngOnInit(): void {
    localStorage.clear();
  }

  login() {

    this.loginService.grantAccess(this.email, this.password).subscribe((user) => {
      if (isNullOrUndefined(user)) {
        console.log("test");
      } else {

        if (user.role == 'admin') {
          
          localStorage.setItem('loggedUser',JSON.stringify(user));
          localStorage.setItem('role', user.role);
          this.router.navigate(['']);
        }

        if (user.role == 'student') {
          this.loginService.matchToStudent(user.email).subscribe((student) => {
            
            localStorage.setItem('loggedUser', JSON.stringify(student));
            localStorage.setItem('role', user.role);
            this.router.navigate(['']);

          });
        }

        if (user.role == 'professor') {
          this.loginService.matchToProfessor(user.email).subscribe((professor) => {
            localStorage.setItem('loggedUser', JSON.stringify(professor));
            localStorage.setItem('role', user.role);
            this.router.navigate(['']);


          });


        }




      }

    });


  }

  returnUser() {





  }

}
