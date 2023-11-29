package org.beloved.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import lombok.AllArgsConstructor;
import org.beloved.api.CustomerServiceI;
import org.beloved.dto.CustomerAddCmd;
import org.beloved.dto.CustomerListByNameQry;
import org.beloved.dto.data.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CustomerController {
	private final CustomerServiceI customerService;

	@GetMapping(value = "/helloworld")
	public String helloWorld() {
		return "Hello, welcome to COLA world!";
	}

	@GetMapping(value = "/customer")
	public MultiResponse<CustomerDTO> listCustomerByName(@RequestParam(required = false) String name) {
		CustomerListByNameQry customerListByNameQry = new CustomerListByNameQry();
		customerListByNameQry.setName(name);
		return customerService.listByName(customerListByNameQry);
	}

	@PostMapping(value = "/customer")
	public Response addCustomer(@RequestBody CustomerAddCmd customerAddCmd) {
		return customerService.addCustomer(customerAddCmd);
	}
}
