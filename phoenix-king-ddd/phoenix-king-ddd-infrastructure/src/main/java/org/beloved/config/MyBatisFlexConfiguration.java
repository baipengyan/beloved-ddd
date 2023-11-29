package org.beloved.config;

import com.mybatisflex.annotation.InsertListener;
import com.mybatisflex.annotation.UpdateListener;
import com.mybatisflex.core.FlexGlobalConfig;
import com.mybatisflex.spring.boot.MyBatisFlexCustomizer;
import org.beloved.business.base.BaseDO;
import org.beloved.handler.BaseDOInsertListener;
import org.beloved.handler.BaseDOUpdateListener;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 自定义 MyBatis-Flex 配置
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 17
 */
public class MyBatisFlexConfiguration implements MyBatisFlexCustomizer {
	/**
	 * 自定义实体类新增操作的监听器
	 *
	 * @param globalConfig 全局配置
	 */
	private static void insertListener(FlexGlobalConfig globalConfig) {
		Map<Class<?>, InsertListener> entityInsertListeners = new ConcurrentHashMap<>();
		entityInsertListeners.put(BaseDO.class, new BaseDOInsertListener());
		globalConfig.setEntityInsertListeners(entityInsertListeners);
	}

	/**
	 * 自定义实体类更新操作的监听器
	 *
	 * @param globalConfig 全局配置
	 */
	private static void updateListener(FlexGlobalConfig globalConfig) {
		Map<Class<?>, UpdateListener> entityUpdateListeners = new ConcurrentHashMap<>();
		entityUpdateListeners.put(BaseDO.class, new BaseDOUpdateListener());
		globalConfig.setEntityUpdateListeners(entityUpdateListeners);
	}

	/**
	 * 自定义 MyBatis-Flex 配置。
	 *
	 * @param globalConfig 全局配置
	 */
	@Override
	public void customize(FlexGlobalConfig globalConfig) {
		insertListener(globalConfig);
		updateListener(globalConfig);
	}
}
