package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.registry.exam.client.api.ExamControllerApi;
import com.registry.exam.client.invoker.ApiClient;



@Configuration
public class ExamIntegrationConfig {
	@Bean
	public ExamControllerApi examApi() {
		return new ExamControllerApi(examClient());
	}

	@Bean
	public ApiClient examClient() {
		ApiClient apiClient = new ApiClient(examRestTemplate());
		return apiClient;
	}

	@Bean
	public RestTemplate examRestTemplate() {
		return new RestTemplate();
	}
}
