package org.beloved.customer;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import jakarta.annotation.Resource;
import org.beloved.api.CustomerServiceI;
import org.beloved.customer.executor.CustomerAddCmdExe;
import org.beloved.customer.executor.query.CustomerListByNameQryExe;
import org.beloved.dto.CustomerAddCmd;
import org.beloved.dto.CustomerListByNameQry;
import org.beloved.dto.data.CustomerDTO;
import org.springframework.stereotype.Service;


@Service
@CatchAndLog
public class CustomerServiceImpl implements CustomerServiceI {

	@Resource
	private CustomerAddCmdExe customerAddCmdExe;

	@Resource
	private CustomerListByNameQryExe customerListByNameQryExe;

	public Response addCustomer(CustomerAddCmd customerAddCmd) {
		return customerAddCmdExe.execute(customerAddCmd);
	}

	@Override
	public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
		return customerListByNameQryExe.execute(customerListByNameQry);
	}

}