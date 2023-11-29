package org.beloved.domain.customer.gateway;

import org.beloved.domain.customer.Customer;

public interface CustomerGateway {
	Customer getByById(String customerId);
}
