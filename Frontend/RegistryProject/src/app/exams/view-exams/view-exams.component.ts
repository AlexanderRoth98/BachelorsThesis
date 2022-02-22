import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import dayGridPlugin from '@fullcalendar/daygrid';
import { ExamService } from 'src/app/services/exam.service';
import { CourseService } from 'src/app/services/course.service';
import { DialogComponent } from '../dialog/dialog.component';
import { ProfDialogComponent } from '../prof-dialog/prof-dialog.component';








@Component({
  selector: 'app-view-exams',
  templateUrl: './view-exams.component.html',
  styleUrls: ['./view-exams.component.css']
})
export class ViewExamsComponent implements OnInit {

  constructor(public dialog: MatDialog, private examService: ExamService, private courseService: CourseService, private cd: ChangeDetectorRef) { }


  calendarPlugins = [dayGridPlugin];

  adminList = [];
  professorList = [];

  studentSem6List = [];
  studentSem4List = [];
  studentSem2List = [];

  adminCalendarEvents = [{ title: 'admin', start: '2020-06-12T10:30:00' }
  ];
  professorCalendarEvents = [{ title: 'professor', start: '2020-06-12T10:30:00' }];
  studentCalendarEvents6 = [{ title: 'student', start: '2020-06-12T10:30:00' }];
  studentCalendarEvents4 = [{ title: 'student', start: '2020-06-12T10:30:00' }];
  studentCalendarEvents2 = [{ title: 'student', start: '2020-06-12T10:30:00' }];

  user = JSON.parse(localStorage.getItem('loggedUser'));
  role = localStorage.getItem('role');

  sem = this.user.semester;

  onShow6() {
    this.sem = 6;

  }
  onShow4() {
    this.sem = 4;
  }
  onShow2() {
    this.sem = 2;

  }


  handleDateClick(event) {
    this.examService.getExamById(event.event._def.groupId).subscribe((exam) => {


      this.courseService.getCourseInfromationFromExam(event.event._def.groupId).subscribe((course) => {

        const dialogRef = this.dialog.open(DialogComponent, {
          width: '250px',
          data: {
            examId: exam.examId,
            subject: course.subject,
            date: exam.date,
            nrEnrolled: exam.numberOfEnrolledStudents,
            totalPlaces: exam.totalPlaces,
          }
        });

        dialogRef.afterClosed().subscribe(result => {
          console.log('The dialog was closed');

        });


      });



    });



  }

  handleProfClick(event) {
    const dialogRef = this.dialog.open(ProfDialogComponent, {
      width: '350px',
      height: '500px',
      data: {
        examId: event.event._def.groupId,

      }
    });
  }






  ngOnInit(): void {

    this.examService.readExams().subscribe((exams) => {
      for (let item of exams) {
        this.courseService.getCourseInfromationFromExam(item.examId).subscribe((course) => {
          this.adminList.push(
            {
              groupId: item.examId,
              title: course.shortSubject + ' ' + item.classroom + '\n Duration: ' + item.duration + 'h \n Places: ' + item.numberOfEnrolledStudents + '/' + item.totalPlaces,

              start: item.date,
            }
          );
          this.adminCalendarEvents = Object.assign([], this.adminList);
          this.cd.markForCheck();
        });
      }
    });


    this.examService.readExams().subscribe((exams) => {
      for (let item of exams) {

        if (item.professorId == this.user.professorId) {

          this.courseService.getCourseInfromationFromExam(item.examId).subscribe((course) => {
            this.professorList.push(
              {
                groupId: item.examId,
                title: course.shortSubject + '\n Duration: ' + item.duration + 'h \n Classroom: ' + item.classroom + '\n Places: ' + item.numberOfEnrolledStudents + '/' + item.totalPlaces,

                start: item.date,
              }
            );
            this.professorCalendarEvents = Object.assign([], this.professorList);
            this.cd.markForCheck();
          });

        }




      }
    });

    this.examService.readExams().subscribe((exams) => {
      for (let item of exams) {



        this.courseService.getCourseInfromationFromExam(item.examId).subscribe((course) => {

          if (course.semester == 6) {
            this.studentSem6List.push(
              {
                groupId: item.examId,
                title: course.shortSubject + '\n Duration: ' + item.duration + 'h \n Classroom: ' + item.classroom + '\n Places: ' + item.numberOfEnrolledStudents + '/' + item.totalPlaces,

                start: item.date,
              }
            );
          }


          if (course.semester == 4) {
            this.studentSem4List.push(
              {
                groupId: item.examId,
                title: course.shortSubject + '\n Duration: ' + item.duration + 'h \n Classroom: ' + item.classroom + '\n Places: ' + item.numberOfEnrolledStudents + '/' + item.totalPlaces,

                start: item.date,
              }
            );
          }

          if (course.semester == 2) {
            this.studentSem2List.push(
              {
                groupId: item.examId,
                title: course.shortSubject + '\n Duration: ' + item.duration + 'h \n Classroom: ' + item.classroom + '\n Places: ' + item.numberOfEnrolledStudents + '/' + item.totalPlaces,

                start: item.date,
              }
            );
          }


          this.studentCalendarEvents2 = Object.assign([], this.studentSem2List);
          this.studentCalendarEvents4 = Object.assign([], this.studentSem4List);
          this.studentCalendarEvents6 = Object.assign([], this.studentSem6List);
          this.cd.markForCheck();
        });






      }
    });





  }

}
