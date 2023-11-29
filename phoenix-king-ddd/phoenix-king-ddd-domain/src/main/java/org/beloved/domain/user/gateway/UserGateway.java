package org.beloved.domain.user.gateway;

import org.beloved.domain.user.User;

import java.util.List;

/**
 * 用户网关
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 17
 */
public interface UserGateway {
	void addUser(User user);

	User getUserById(Integer id);

	List<User> selectAll();
}
