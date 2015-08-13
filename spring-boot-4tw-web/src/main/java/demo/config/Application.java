package demo.config;

import javax.cache.configuration.MutableConfiguration;
import javax.cache.expiry.CreatedExpiryPolicy;
import javax.cache.expiry.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
@EnableCaching
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public EmbeddedServletContainerCustomizer servletContainerCustomizer() {
		return container -> container.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/400.html"));
	}

	@Bean
	public JCacheManagerCustomizer cacheManagerCustomizer() {
		return cm -> {
			cm.createCache("diffs", new MutableConfiguration<>()
					.setExpiryPolicyFactory(CreatedExpiryPolicy
							.factoryOf(Duration.ONE_HOUR))
					.setStoreByValue(false)
					.setStatisticsEnabled(true));
		};
	}

}