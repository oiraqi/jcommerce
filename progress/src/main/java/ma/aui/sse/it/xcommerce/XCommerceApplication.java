package ma.aui.sse.it.xcommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableCaching
@EnableJpaAuditing
public class XCommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(XCommerceApplication.class, args);
	}

}
