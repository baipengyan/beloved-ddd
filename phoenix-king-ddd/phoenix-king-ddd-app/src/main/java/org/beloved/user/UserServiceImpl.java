package org.beloved.user;


import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.Response;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.beloved.api.UserServiceI;
import org.beloved.dto.UserAddCmd;
import org.beloved.user.executor.UserAddCmdExe;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 服务层实现。
 *
 * @author mybatis-flex-helper automatic generation
 * @since 1.0
 */
@Service
@CatchAndLog
@AllArgsConstructor
public class UserServiceImpl implements UserServiceI {
	private final UserAddCmdExe userAddCmdExe;
	@Resource
	private ThreadPoolExecutor dtpExecutor1;


	public Response addUser(UserAddCmd userAddCmd) {
		return userAddCmdExe.execute(userAddCmd);
	}

}