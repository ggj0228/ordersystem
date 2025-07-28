package com.example.ordersystem.member.service;

import com.example.ordersystem.member.domain.Member;
import com.example.ordersystem.member.dto.MemberCreateDto;
import com.example.ordersystem.member.repository.MemeberRepository;
import jakarta.persistence.EntityExistsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {
    private final MemeberRepository memeberRepository;


    public void signUp(MemberCreateDto dto) {
       if(this.memeberRepository.findByEmail(dto.getEmail()).isPresent()){
           throw new EntityExistsException("이메일 존재");
       }

        this.memeberRepository.save(dto.toEntity());
    }
}
