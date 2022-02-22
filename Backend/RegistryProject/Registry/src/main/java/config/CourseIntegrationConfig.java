package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.registry.course.client.api.CourseControllerApi;
import com.registry.course.client.invoker.ApiClient;

@Configuration
public class CourseIntegrationConfig {
	@Bean
	public CourseControllerApi courseApi() {
		
		return new CourseControllerApi(courseClient());
	}
	

	@Bean
	public ApiClient courseClient() {
		ApiClient apiClient = new ApiClient(courseRestTemplate());
		
		return apiClient;
	}

	@Bean
	public RestTemplate courseRestTemplate() {
		return new RestTemplate();
	}
}
