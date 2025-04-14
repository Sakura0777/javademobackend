package com.example.demo.bean;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SearchResponse {
    private Integer counts;
    private List<Address> list;
}
