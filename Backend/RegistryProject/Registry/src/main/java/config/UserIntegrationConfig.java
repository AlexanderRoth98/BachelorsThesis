package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.registry.user.client.api.UserControllerApi;
import com.registry.user.client.invoker.ApiClient;


@Configuration
public class UserIntegrationConfig {
	@Bean
	public UserControllerApi userApi() {
		
		return new UserControllerApi(userClient());
	}
	

	@Bean
	public ApiClient userClient() {
		ApiClient apiClient = new ApiClient(userRestTemplate());
		
		return apiClient;
	}

	@Bean
	public RestTemplate userRestTemplate() {
		return new RestTemplate();
	}
}
