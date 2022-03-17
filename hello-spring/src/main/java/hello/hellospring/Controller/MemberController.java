package hello.hellospring.Controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    // 모든 인스턴스를 쓰지 않으므로 이렇게 선언
    private final MemberService memberService;

    // 스프링 컨테이너에 있는 멤버서비스를 가져와 연결시켜줌
    @Autowired
    public MemberController(MemberService memberService) { // 생성자
        this.memberService = memberService;
    }




}
