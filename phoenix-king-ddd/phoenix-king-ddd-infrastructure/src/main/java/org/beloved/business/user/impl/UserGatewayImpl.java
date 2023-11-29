package org.beloved.business.user.impl;

import lombok.AllArgsConstructor;
import org.beloved.business.user.mapper.UserMapper;
import org.beloved.domain.user.User;
import org.beloved.domain.user.gateway.UserGateway;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户网关实现
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 17
 */
@Service
@AllArgsConstructor
public class UserGatewayImpl implements UserGateway {

	private final UserMapper userMapper;

	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	@Override
	public User getUserById(Integer id) {
		return userMapper.selectOneById(id);
	}

	@Override
	public List<User> selectAll() {
		return userMapper.selectAll();
	}
}
