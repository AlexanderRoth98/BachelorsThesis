import { Injectable } from '@angular/core';
import { HttpService } from '../http/http.service';
import { Observable } from 'rxjs/internal/Observable';

@Injectable()
export class ExamService {

    private url: string;

    constructor(private http: HttpService) {
        this.url = 'http://localhost:8084';
    }

    public readExams(): Observable<any> {
        return this.http.get(`${this.url}/exams`);
    }

    public getExamById(examId: string) {
        return this.http.get(`${this.url}/exams/${examId}`);
    }

    public getEnrolledExams(registrationNumber: string) {
        return this.http.get(`${this.url}/exams/students/${registrationNumber}`);
    }

    public createExam(examId, date, duration, classroom, totalPlaces, numberOfEnrolledStudents, courseId, sutdentList, professorId, ) {
        const exam = {
            examId: examId,
            date: date,
            duration: duration,
            classroom: classroom,
            totalPlaces: totalPlaces,
            numberOfEnrolledStudents: numberOfEnrolledStudents,
            courseId: courseId,
            sutdentList: sutdentList,
            professorId: professorId,

        };
        return this.http.post(`${this.url}/exams`, exam)
    }

    public removeStudentFromExam(registrationNumber, examId) {
        return this.http.delete(`${this.url}/students/${registrationNumber}/${examId}`);
    }

    public getStudentsFromExam(examId)
    {
        return this.http.get(`${this.url}/students/exams/${examId}`);
    }

}
