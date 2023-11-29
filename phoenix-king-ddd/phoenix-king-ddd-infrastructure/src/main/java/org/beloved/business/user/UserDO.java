package org.beloved.business.user;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.beloved.business.base.BaseDO;

import java.time.LocalDateTime;

/**
 * 用户实体
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 17
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(value = "user")
public class UserDO extends BaseDO {
	@Id(keyType = KeyType.Auto)
	private Integer id;

	@Column(value = "username")
	private String username;

	@Column(value = "password")
	private String password;

	@Column(value = "age")
	private Integer age;

	@Column(value = "create_time")
	private LocalDateTime createTime;

	@Column(value = "update_time")
	private LocalDateTime updateTime;
}
