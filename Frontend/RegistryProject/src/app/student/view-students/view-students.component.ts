
import { Component, OnInit, ViewChild, ChangeDetectorRef } from '@angular/core';
import { StudentService } from 'src/app/services/student.service';



const ELEMENT_DATA = [];

@Component({
  selector: 'app-view-students',
  templateUrl: './view-students.component.html',
  styleUrls: ['./view-students.component.css']
})
export class ViewStudentsComponent implements OnInit {
  refresh=true;


  displayedColumns: string[] = ['registrationNumber', 'firstName', 'lastName', 'gender', 'age', 'email', 'telNr', 'studyCourse', 'subgroup', 'semester', 'remove'];
  public dataSource: any;

  sortChange(event) {

    if (event.direction === 'asc') {
      this.dataSource = Object.assign([], this.dataSource.sort((a, b) => (a[event.active] > b[event.active]) ? 1 : ((b[event.active] > a[event.active]) ? -1 : 0)))

    }

    if (event.direction === 'desc') {
      this.dataSource = Object.assign([], this.dataSource.sort((a, b) => (a[event.active] < b[event.active]) ? 1 : ((b[event.active] < a[event.active]) ? -1 : 0)))
    }

  }

  constructor(private studentService: StudentService, private cd: ChangeDetectorRef) { }


  deleteStudent(registrationNumber) {

    this.studentService.deleteStudent(registrationNumber).subscribe(() => {

    });

    
  }


  ngOnInit() {

    this.studentService.readStudents().subscribe((student) => {

      ELEMENT_DATA.length = 0;
      for (let item of student) {

        ELEMENT_DATA.push({
          registrationNumber: item.registrationNumber,
          firstName: item.firstName,
          lastName: item.lastName,
          gender: item.gender,
          age: item.age,
          email: item.email,
          telNr: item.telNr,
          studyCourse: item.studyCourse,
          subgroup: item.subgroup,
          semester: item.semester
        });
      }
      this.dataSource = ELEMENT_DATA;
      this.cd.markForCheck();



    });


  }




}
