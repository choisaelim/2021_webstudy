package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.MemoryMemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service
public class MemberService {
    // private final MemberRepository memberRepository = new
    // MemoryMemberRepository();
    // private final MemberRepository memberRepository;

    // // repository 코드가 회원 서비스 코드를 DI 가능하게 변경
    // // @Autowired
    // public MemberService(MemberRepository memberRepository) {
    // this.memberRepository = memberRepository;
    // }

    // /**
    // * 회원가입
    // */
    // public Long join(Member member) {
    // validateDuplicateMember(member); // 중복 회원 검증
    // memberRepository.save(member);
    // return member.getId();
    // }

    // private void validateDuplicateMember(Member member) {
    // memberRepository.findByName(member.getName()).ifPresent(m -> {
    // throw new IllegalStateException("이미 존재하는 회원입니다.");
    // });
    // }

    // /**
    // * 전체 회원 조회
    // */
    // public List<Member> findMembers() {
    // return memberRepository.findAll();
    // }

    // public Optional<Member> findOne(Long memberId) {
    // return memberRepository.findById(memberId);
    // }
}
