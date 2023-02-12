package com.kcterala.mongodemo.collection;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Address {
    private String address1;
    private String address2;
    private String city;
}
