package com.my.config;

import com.my.discount.DiscountPolicy;
import com.my.discount.FixDiscountPolicy;
import com.my.discount.RateDiscountPolicy;
import com.my.member.MemberService;
import com.my.member.MemberServiceImpl;
import com.my.member.MemoryMemberRepository;
import com.my.order.OrderService;
import com.my.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private static MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), getDiscountPolicy());
    }

    private static DiscountPolicy getDiscountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
