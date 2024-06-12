package hello.json.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NullStringSerializer extends JsonSerializer<Object> {

  @Override
  public void serialize(Object o, JsonGenerator jsonGenerator,
      SerializerProvider serializerProvider) throws IOException {
      jsonGenerator.writeString("");
  }
}
