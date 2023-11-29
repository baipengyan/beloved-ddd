package org.beloved;

import org.dromara.dynamictp.core.spring.EnableDynamicTp;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Starter
 *
 * @author baipengyan
 */
@EnableDynamicTp
@MapperScan("org.beloved.business.**.mapper")
@SpringBootApplication(scanBasePackages = {"org.beloved", "com.alibaba.cola"})
public class DDDApplication {

	public static void main(String[] args) {
		SpringApplication.run(DDDApplication.class, args);
	}
}
