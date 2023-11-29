package org.beloved.dto;

import lombok.Data;
import org.beloved.dto.data.UserDTO;

/**
 * 用户添加命令
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 17
 */
@Data
public class UserAddCmd {
	private UserDTO userDTO;
}
