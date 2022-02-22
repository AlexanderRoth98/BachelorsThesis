import { Component, OnInit, ViewChild, ChangeDetectorRef } from '@angular/core';
import { ProfessorService } from 'src/app/services/professor.service';


const ELEMENT_DATA = [];

@Component({
  selector: 'app-view-professors',
  templateUrl: './view-professors.component.html',
  styleUrls: ['./view-professors.component.css']
})
export class ViewProfessorsComponent implements OnInit {

  displayedColumns: string[] = ['firstName', 'lastName', 'gender', 'age', 'email', 'telNr', 'title', 'remove'];
  public dataSource: any;



  constructor(private professorService: ProfessorService, private cd: ChangeDetectorRef) { }


  deleteProfessor(professorId) {
    this.professorService.deleteProfessor(professorId).subscribe(() => {

    });
  }


  sortChange(event) {

    if (event.direction === 'asc') {
      this.dataSource = Object.assign([], this.dataSource.sort((a, b) => (a[event.active] > b[event.active]) ? 1 : ((b[event.active] > a[event.active]) ? -1 : 0)))

    }

    if (event.direction === 'desc') {
      this.dataSource = Object.assign([], this.dataSource.sort((a, b) => (a[event.active] < b[event.active]) ? 1 : ((b[event.active] < a[event.active]) ? -1 : 0)))
    }

  }

  ngOnInit() {

    this.professorService.readProfessors().subscribe((professor) => {

      ELEMENT_DATA.length = 0;
      for (let item of professor) {

        ELEMENT_DATA.push({
          professorId: item.professorId,
          firstName: item.firstName,
          lastName: item.lastName,
          gender: item.gender,
          age: item.age,
          email: item.email,
          telNr: item.telNr,
          title: item.title,


        });
      }

      this.dataSource = ELEMENT_DATA;
      this.cd.markForCheck();

    });


  }

}
