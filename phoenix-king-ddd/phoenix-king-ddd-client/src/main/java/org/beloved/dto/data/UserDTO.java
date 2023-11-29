package org.beloved.dto.data;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户DTO
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 17
 */
@Data
public class UserDTO {
	private Integer id;
	private String username;
	private String password;
	private Integer age;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
}
