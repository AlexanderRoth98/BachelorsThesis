import { Component, OnInit } from '@angular/core';
import { ExamService } from 'src/app/services/exam.service';
import { CourseService } from 'src/app/services/course.service';



interface TransferObject {
  examId: string;
  subject: string;
  date: string;
  duration: string;
  classroom: string,
  ects: string,
}


@Component({
  selector: 'app-my-exams',
  templateUrl: './my-exams.component.html',
  styleUrls: ['./my-exams.component.css']
})
export class MyExamsComponent implements OnInit {
  user = JSON.parse(localStorage.getItem('loggedUser'));
  transferObject: TransferObject[] = [];

  constructor(private examService: ExamService, private courseService: CourseService) { }

  onRemove(examId) {
    this.examService.removeStudentFromExam(this.user.registrationNumber, examId).subscribe(() => {

    });

    window.location.reload();
  }


  ngOnInit() {
    this.examService.getEnrolledExams(this.user.registrationNumber).subscribe((exams) => {

      for (let exam of exams) {
        this.courseService.getCourseInfromationFromExam(exam.examId).subscribe((course) => {

          this.transferObject.push(

            {
              examId: exam.examId,
              subject: course.subject,
              date: exam.date,
              duration: exam.duration,
              classroom: exam.classroom,
              ects: course.ects
            },
          );

        });

      }

    });


  }

}
