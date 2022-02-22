import { Component, OnInit } from '@angular/core';
import * as CanvasJS from 'src/app/canvasjs/canvasjs.min';
import { StudentService } from 'src/app/services/student.service';
@Component({
  selector: 'app-statistics-students',
  templateUrl: './statistics-students.component.html',
  styleUrls: ['./statistics-students.component.css']
})
export class StatisticsStudentsComponent implements OnInit {

  constructor(private studentService: StudentService) { }

  ngOnInit() {

    this.studentService.getSemesterStatistics().subscribe((statistics) => {


      let chart = new CanvasJS.Chart("chartContainer", {
        theme: "light2",
        animationEnabled: true,
        exportEnabled: true,
        title: {
          text: "Students by Year"
        },
        data: [{
          type: "column",
          dataPoints: [
            { y: statistics.sem2 + statistics.sem1, label: "Year 1" },
            { y: statistics.sem3 + statistics.sem4, label: "Year 2" },
            { y: statistics.sem6 + statistics.sem5, label: "Year 3" }
          ]
        }]
      });

      chart.render();



    });


    this.studentService.getGenderStatistics().subscribe((statistics) => {
      let chart = new CanvasJS.Chart("chartContainer2", {
        theme: "light2",
        animationEnabled: true,
        exportEnabled: true,
        title: {
          text: "Gender Statistics"
        },
        data: [{
          type: "pie",
          showInLegend: true,
          toolTipContent: "<b>{name}</b>: {y} (#percent%)",
          indexLabel: "{name} - #percent%",
          dataPoints: [
            { y: statistics.maleCount, name: "Male" },       
            { y: statistics.femaleCount, name: "Female" }
          ]
        }]
      });

      chart.render();
    });


  }
}
