package org.beloved.domain.user;

import com.alibaba.cola.domain.Entity;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户领域模型
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 17
 */
@Data
@Entity
public class User {
	private Integer id;
	private String username;
	private String password;
	private Integer age;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
}
