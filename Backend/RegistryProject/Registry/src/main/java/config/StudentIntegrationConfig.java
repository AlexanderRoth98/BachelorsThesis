package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.registry.student.client.api.StudentControllerApi;
import com.registry.student.client.invoker.ApiClient;

@Configuration
public class StudentIntegrationConfig {
	@Bean
	public StudentControllerApi studentApi() {
		return new StudentControllerApi(studentApiClient());
	}

	@Bean
	public ApiClient studentApiClient() {
		ApiClient apiClient = new ApiClient(studentRestTemplate());
		return apiClient;
	}

	@Bean
	public RestTemplate studentRestTemplate() {
		return new RestTemplate();
	}
}
