import { Injectable } from '@angular/core';
import { HttpService } from '../http/http.service';

@Injectable()
export class CourseService {

  private url: string;

  constructor(private http: HttpService) {
    this.url = 'http://localhost:8084';
  }


  public getCourseInfromationFromExam(examId: string){
    return this.http.get(`${this.url}/courses/exam/${examId}`);

  }

  public getCoursesFromProfessor(professorId: string) {

    return this.http.get(`${this.url}/courses/professor/${professorId}`);
  }
}