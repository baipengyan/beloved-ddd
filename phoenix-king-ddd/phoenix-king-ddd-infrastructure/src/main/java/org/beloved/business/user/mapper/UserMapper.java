package org.beloved.business.user.mapper;

import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.beloved.domain.user.User;

/**
 * 用户mapper
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 17
 */
public interface UserMapper extends BaseMapper<User> {

	void addUser(@Param("user") User user);

}
