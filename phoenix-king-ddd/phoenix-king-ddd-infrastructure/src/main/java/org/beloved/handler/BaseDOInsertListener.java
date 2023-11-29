package org.beloved.handler;

import com.alibaba.fastjson2.JSON;
import com.mybatisflex.annotation.InsertListener;
import lombok.extern.slf4j.Slf4j;
import org.beloved.business.base.BaseDO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 实体基类BaseDO插入监听器
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 1.8
 */
@Slf4j
@Component
public class BaseDOInsertListener implements InsertListener {
	/**
	 * 新增操作的前置操作。
	 *
	 * @param entity 实体类
	 */
	@Override
	public void onInsert(Object entity) {
		try {
			BaseDO baseDO = (BaseDO) entity;
			baseDO.setCreateTime(LocalDateTime.now());
		} catch (Exception e) {
			log.error("实体基类BaseDO插入监听器：新增操作异常。实体信息为：{}", JSON.toJSONString(entity));
		}
	}
}
