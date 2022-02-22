import { Component, OnInit, Inject } from '@angular/core';
import { ViewExamsComponent } from '../view-exams/view-exams.component';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import { ExamService } from 'src/app/services/exam.service';



export interface DialogProfData {
  examId: string;
 

}

@Component({
  selector: 'app-prof-dialog',
  templateUrl: './prof-dialog.component.html',
  styleUrls: ['./prof-dialog.component.css']
})
export class ProfDialogComponent implements OnInit {

  studentList;
  isEmpty: boolean = false;

  constructor(public dialogRef: MatDialogRef<ViewExamsComponent>,
    @Inject(MAT_DIALOG_DATA) public data: DialogProfData, private examService: ExamService) { }

  ngOnInit() {
    this.examService.getStudentsFromExam(this.data.examId).subscribe((students) => {

      this.studentList = students;

      if(this.studentList.length==0){
        this.isEmpty = true; 
      }
    });

  }

  onCancle(): void {
    this.dialogRef.close();
  }

}
