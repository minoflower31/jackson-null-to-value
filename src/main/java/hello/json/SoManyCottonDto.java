package hello.json;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SoManyCottonDto {

  private Long seq;
  private String name;
  private Integer age;
  private Double deposit;
  private BigDecimal point;
  private LocalDateTime createdAt;

  @Builder
  public SoManyCottonDto(Long seq, String name, Integer age, Double deposit, BigDecimal point,
      LocalDateTime createdAt) {
    this.seq = seq;
    this.name = name;
    this.age = age;
    this.deposit = deposit;
    this.point = point;
    this.createdAt = createdAt;
  }
}
