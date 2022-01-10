package com.poc.util;

import com.poc.model.Customer;

public class CustomerUtil {

    private CustomerUtil() {

    }

    public static Customer createCustomer(String customerId) {
        Customer customer = new Customer();
        customer.setId(customerId);
        customer.setName("Pizza Hut");
        customer.setAddressLine1("5510 S. I-35");
        customer.setAddressLine2("100 E Stassney Ln Suite C");
        customer.setAddressLine3("N/A");
        customer.setCity("Austin");
        customer.setCountry("US");
        customer.setCustomerName("Pizza Hut - Austin");
        customer.setTimeZone("America/Chicago");
        customer.setState("TX");
        customer.setZipCode("78745");
        return customer;
    }
}
