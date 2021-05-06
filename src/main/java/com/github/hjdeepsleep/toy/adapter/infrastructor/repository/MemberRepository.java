package com.github.hjdeepsleep.toy.adapter.infrastructor.repository;

import com.github.hjdeepsleep.toy.domain.mamber.Member;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface MemberRepository
    extends JpaRepository<Member, Long>, MemberRepositoryCustom, QuerydslPredicateExecutor<Member> {

    List<Member> findByUsername(String username);

}
