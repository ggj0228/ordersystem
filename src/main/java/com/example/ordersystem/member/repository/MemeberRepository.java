package com.example.ordersystem.member.repository;

import com.example.ordersystem.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemeberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
}
