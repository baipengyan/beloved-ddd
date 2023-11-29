package org.beloved.handler;

import com.alibaba.fastjson2.JSON;
import com.mybatisflex.annotation.UpdateListener;
import lombok.extern.slf4j.Slf4j;
import org.beloved.business.base.BaseDO;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

/**
 * 实体基类BaseDO更新监听器
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 1.8
 */
@Slf4j
@Configuration
public class BaseDOUpdateListener implements UpdateListener {
	/**
	 * 更新操作的前置操作。
	 *
	 * @param entity 实体类
	 */
	@Override
	public void onUpdate(Object entity) {
		try {
			BaseDO baseDO = (BaseDO) entity;
			baseDO.setUpdateTime(LocalDateTime.now());
		} catch (Exception e) {
			log.error("实体基类BaseDO更新监听器：更新操作异常。实体信息为：{}", JSON.toJSONString(entity));
		}
	}
}
