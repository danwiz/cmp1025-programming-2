package com.wisdom.cmp1025.unit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.wisdom.cmp1025.domain.StandardFeePolicy;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class StandardFeePolicyTest {
  private final StandardFeePolicy policy = new StandardFeePolicy();

  @Test
  void calculatesNormalCase() {
    assertThat(policy.calculate(new BigDecimal("100.00"))).isEqualByComparingTo("2.50");
  }

  @Test
  void acceptsBoundaryZero() {
    assertThat(policy.calculate(BigDecimal.ZERO)).isEqualByComparingTo("0.00");
  }

  @Test
  void rejectsNegativeAmount() {
    assertThatThrownBy(() -> policy.calculate(new BigDecimal("-0.01")))
        .isInstanceOf(IllegalArgumentException.class);
  }
}
