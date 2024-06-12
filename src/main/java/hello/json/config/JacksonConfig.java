package hello.json.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class JacksonConfig {

  private final NullModifier nullModifier;

  @Bean
  public ObjectMapper CustomObjectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();
    SimpleModule simpleModule = new SimpleModule();
    simpleModule.setSerializerModifier(nullModifier);
    objectMapper.registerModule(simpleModule);

    return objectMapper;
  }

}
