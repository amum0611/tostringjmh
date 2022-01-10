package com.poc.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.poc.model.Customer;

public class CustomerService {

    public String stringConcatenation(Customer customer) {
        return customer.stringConcatenation();
    }

    public String stringBuilder(Customer customer) {
        return customer.stringBuilder();
    }

    public String apacheToStringBuilder(Customer customer) {
        return customer.apacheToStringBuilder();
    }

    public String jackson(Customer customer) throws JsonProcessingException {
        return customer.jackson();
    }
}
