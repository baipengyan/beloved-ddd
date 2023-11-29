package org.beloved.web;

import com.alibaba.cola.dto.Response;
import lombok.AllArgsConstructor;
import org.beloved.api.UserServiceI;
import org.beloved.dto.UserAddCmd;
import org.springframework.web.bind.annotation.*;

/**
 * 控制层。
 *
 * @author mybatis-flex-helper automatic generation
 * @since 1.0
 */
@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
	private final UserServiceI userService;

	@PostMapping(value = "/user1")
	public Response addCustomer(@RequestBody(required = false) UserAddCmd userAddCmd) {
		return userService.addUser(userAddCmd);
	}

	@GetMapping(value = "/hello")
	public String addCustomer2() {
		return "hello world";
	}
}