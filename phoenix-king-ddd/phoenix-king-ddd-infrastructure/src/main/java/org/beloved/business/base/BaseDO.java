package org.beloved.business.base;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 实体基类
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 17
 */
@Data
public class BaseDO {
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
}
