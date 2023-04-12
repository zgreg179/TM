package com.search.tm.dto;


import lombok.Builder;
import lombok.Value;

import java.util.List;

import com.search.tm.model.Country;

@Value
@Builder
public class SearchRequestDTO {
    String name;
    List<Integer> classes;
    Country country;
    String applicationNumber;
    String registrationNumber;
    String holderName;
    String applicantName;
}
