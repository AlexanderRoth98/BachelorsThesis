import { NgModule } from '@angular/core';
import { HttpService } from './http.service';
import { HttpInterceptor } from './http-interceptor';
import { RequestOptions } from './request-options';
import { HttpClient, HttpClientModule, HttpHandler, HttpXhrBackend } from '@angular/common/http';

export function httpServiceFactory(backend: HttpXhrBackend,
                                   interceptor: HttpInterceptor,
                                   options: RequestOptions,
                                   httpHandler: HttpHandler) {
        return new HttpService(backend, options, interceptor, httpHandler);
}

@NgModule({
    imports     : [
        HttpClientModule
    ],
    declarations: [],
    providers   : [
        RequestOptions,
        HttpInterceptor,
        HttpService,
        {
            provide   : HttpClient,
            useFactory: httpServiceFactory,
            deps      : [HttpXhrBackend, HttpInterceptor, RequestOptions, HttpHandler]
        }
    ]
})
export class HttpServiceModule {
}
