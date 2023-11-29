package org.beloved.domain.customer.gateway;

import org.beloved.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
	Credit getCredit(String customerId);
}
