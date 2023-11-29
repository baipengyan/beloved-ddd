package org.beloved.business.customer.impl;

import lombok.AllArgsConstructor;
import org.beloved.business.customer.CustomerDO;
import org.beloved.business.customer.mapper.CustomerMapper;
import org.beloved.domain.customer.Customer;
import org.beloved.domain.customer.gateway.CustomerGateway;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomerGatewayImpl implements CustomerGateway {
	private final CustomerMapper customerMapper;

	public Customer getByById(String customerId) {
		CustomerDO customerDO = customerMapper.getById(customerId);
		//Convert to Customer
		return null;
	}
}
