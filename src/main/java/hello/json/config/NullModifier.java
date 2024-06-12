package hello.json.config;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class NullModifier extends BeanSerializerModifier {

  private final NullStringSerializer nullStringSerializer;
  private final NullNumberSerializer nullNumberSerializer;

  @Override
  public List<BeanPropertyWriter> changeProperties(SerializationConfig config,
      BeanDescription beanDesc, List<BeanPropertyWriter> beanProperties) {
    for (BeanPropertyWriter writer : beanProperties) {
      Class<?> rawClass = writer.getType().getRawClass();

      if (String.class.isAssignableFrom(rawClass)) {
        writer.assignNullSerializer(nullStringSerializer);
      } else if (Number.class.isAssignableFrom(rawClass)) {
        writer.assignNullSerializer(nullNumberSerializer);
      }
    }

    return beanProperties;
  }
}
