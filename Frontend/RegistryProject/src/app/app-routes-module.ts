import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router'
import { LoginComponent } from './login/login.component';

import { RootComponent } from './root/root.component';
import { StudentComponent } from './student/addstudent/student.component';
import { AddProfessorComponent } from './professor/add-professor/add-professor.component';
import { ViewStudentsComponent } from './student/view-students/view-students.component';

import { ViewProfessorsComponent } from './professor/view-professors/view-professors.component';
import { ViewExamsComponent } from './exams/view-exams/view-exams.component';
import { AddExamsComponent } from './exams/add-exams/add-exams.component';
import { StatisticsStudentsComponent } from './student/statistics-students/statistics-students.component';
import { StatisticsProfessorsComponent } from './professor/statistics-professors/statistics-professors.component';
import { MyExamsComponent } from './exams/my-exams/my-exams.component';



const routes: Routes = [


    {

        path: 'login',
        component: LoginComponent,
        data: { title: 'Login' }
    },
    {

        path: '',
        component: RootComponent,
        data: { title: 'Start Page' },
        children: [{


            path: 'student/POST',
            component: StudentComponent,
            data: { title: 'Add students' }
        },

        {
            path: 'professor/POST',
            component: AddProfessorComponent,
            data: { title: 'Add professors' }
        },

        {
            path: 'students',
            component: ViewStudentsComponent,
            data: { title: 'View Students' }
        },

        {
            path: 'professors',
            component: ViewProfessorsComponent,
            data: { title: 'View Professors' }
        },

        {
            path: 'exams',
            component: ViewExamsComponent,
            data: { title: 'View Exams' }
        },

        {
            path: 'exams/add',
            component: AddExamsComponent,
            data: { title: 'Add Exams' }
        },

        {
            path: 'students/statistics',
            component: StatisticsStudentsComponent,
            data: { title: 'Student Statistics' }
        },


        {
            path: 'professors/statistics',
            component: StatisticsProfessorsComponent,
            data: { title: 'Professor Statistics' }
        },

        {
            path: 'my-exams',
            component: MyExamsComponent,
            data: { title: 'My Exams' }
        },

        ]

    },




];






@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule],
    providers: []
})
export class AppRoutesModule {

}