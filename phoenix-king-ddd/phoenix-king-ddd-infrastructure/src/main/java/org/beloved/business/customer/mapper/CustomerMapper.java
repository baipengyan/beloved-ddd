package org.beloved.business.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.beloved.business.customer.CustomerDO;

@Mapper
public interface CustomerMapper {

	CustomerDO getById(String customerId);
}
