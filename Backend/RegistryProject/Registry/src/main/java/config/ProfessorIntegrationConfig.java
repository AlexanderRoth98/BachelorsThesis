package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.registry.professor.client.api.ProfessorControllerApi;
import com.registry.professor.client.invoker.ApiClient;

@Configuration
public class ProfessorIntegrationConfig {
	@Bean
	public ProfessorControllerApi professorApi() {
		return new ProfessorControllerApi(professorClient());
	}

	@Bean
	public ApiClient professorClient() {
		ApiClient apiClient = new ApiClient(professorRestTemplate());
		return apiClient;
	}

	@Bean
	public RestTemplate professorRestTemplate() {
		return new RestTemplate();
	}
}
