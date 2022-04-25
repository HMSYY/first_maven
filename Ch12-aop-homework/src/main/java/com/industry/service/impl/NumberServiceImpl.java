package com.industry.service.impl;

import com.industry.service.NumberService;

public class NumberServiceImpl implements NumberService {
    @Override
    public Integer addInteger(Integer n1, Integer n2, Integer n3) {
        return n1 + n2 + n3;
    }
}
