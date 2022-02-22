import { Component, OnInit } from '@angular/core';
import { ProfessorService } from 'src/app/services/professor.service';
import * as CanvasJS from 'src/app/canvasjs/canvasjs.min';

@Component({
  selector: 'app-statistics-professors',
  templateUrl: './statistics-professors.component.html',
  styleUrls: ['./statistics-professors.component.css']
})
export class StatisticsProfessorsComponent implements OnInit {

  constructor(private professorService: ProfessorService) { }

  ngOnInit() {
    this.professorService.getAgeStatistics().subscribe((statistics) => {


      let chart = new CanvasJS.Chart("chartContainer", {
        theme: "light2",
        animationEnabled: true,
        exportEnabled: true,
        title: {
          text: "Professors by Age"
        },
        data: [{
          type: "column",
          dataPoints: [
            { y: statistics.segment1, label: "<30" },
            { y: statistics.segment2, label: "30-39" },
            { y: statistics.segment3, label: "40-49" },
            { y: statistics.segment4, label: "50-59" },
            { y: statistics.segment5, label: "60-69" },
            { y: statistics.segment6, label: "70+" },
           
          ]
        }]
      });

      chart.render();



    });


    this.professorService.getGenderStatistics().subscribe((statistics) => {
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
