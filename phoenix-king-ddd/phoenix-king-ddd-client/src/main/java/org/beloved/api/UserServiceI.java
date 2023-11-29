package org.beloved.api;

import com.alibaba.cola.dto.Response;
import org.beloved.dto.UserAddCmd;

/**
 * 用户服务接口
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 17
 */
public interface UserServiceI {
	Response addUser(UserAddCmd userAddCmd);
}
