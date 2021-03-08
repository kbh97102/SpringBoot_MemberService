package arakene.simpleapp;

import arakene.simpleapp.repository.MemberRepository;
import arakene.simpleapp.repository.MemoryMemberRepository;
import arakene.simpleapp.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
