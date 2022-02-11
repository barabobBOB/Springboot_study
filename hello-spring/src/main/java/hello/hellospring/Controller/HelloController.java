package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") //get 메서드
    public String hello(Model model){
        model.addAttribute("data", "Hello!!");//키는 데이터, 값은 헬로
        return "hello"; // Thy머시기 템플릿엔진 hello로 실행 시켜라
    }
}
