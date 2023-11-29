package org.beloved.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.beloved.dto.CustomerAddCmd;
import org.beloved.dto.CustomerListByNameQry;
import org.beloved.dto.data.CustomerDTO;

public interface CustomerServiceI {

	Response addCustomer(CustomerAddCmd customerAddCmd);

	MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
