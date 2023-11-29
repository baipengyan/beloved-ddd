package org.beloved.user.executor;

import com.alibaba.cola.dto.Response;
import com.alibaba.fastjson2.JSON;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.beloved.domain.user.User;
import org.beloved.domain.user.gateway.UserGateway;
import org.beloved.dto.UserAddCmd;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户添加命令执行类
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 17
 */
@Component
@Slf4j
public class UserAddCmdExe {

	@Resource
	private UserGateway userGateway;

	public Response execute(UserAddCmd cmd) {

		User user = new User();
		user.setUsername("test");
		user.setPassword("123456");
		user.setAge(18);
		userGateway.addUser(user);

		List<User> users = userGateway.selectAll();
		log.info("users: {}", JSON.toJSONString(users));
		return Response.buildSuccess();
	}
}
