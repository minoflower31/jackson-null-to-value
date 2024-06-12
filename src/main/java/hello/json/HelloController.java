package hello.json;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public SoManyCottonDto hello() {
    SoManyCottonDto dto = SoManyCottonDto.builder()
        .name("s")
//        .age(10)
        .build();

    return dto;
  }
}
