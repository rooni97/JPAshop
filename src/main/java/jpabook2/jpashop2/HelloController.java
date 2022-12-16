package jpabook2.jpashop2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("data", "ChangYun");
        return "hello";
    }

//    @GetMapping("/hello")
//    @ResponseBody
//    public Result hello() {
//        List<TestEntity> testEntities = new ArrayList<>();
//        testEntities.add(new TestEntity(1L, "이창윤", "이거만하고잡시다"));
//        testEntities.add(new TestEntity(2L, "김창윤", "이거만하고잡시다"));
//        testEntities.add(new TestEntity(3L, "최창윤", "이거만하고잡시다"));
//        testEntities.add(new TestEntity(4L, "lee", "이거만하고잡시다"));
//        testEntities.add(new TestEntity(5L, "CY", "이거만하고잡시다"));
//        return new Result<>(testEntities);
//    }
//
//    @AllArgsConstructor
//    @Getter
//    static class Result<T> {
//        private T data;
//    }
//
//
//    @AllArgsConstructor
//    @Data
//    static class TestEntity {
//        private Long id;
//        private String username;
//        private String content;
//    }

}
