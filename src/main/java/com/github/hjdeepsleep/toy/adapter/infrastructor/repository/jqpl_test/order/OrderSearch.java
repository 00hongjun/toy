package com.github.hjdeepsleep.toy.adapter.infrastructor.repository.jqpl_test.order;

import com.github.hjdeepsleep.toy.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderSearch {

    private String memberName;
    private OrderStatus orderStatus;

}
