package com.wisdom.cmp1025.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public final class StandardFeePolicy implements FeePolicy {
  private static final BigDecimal RATE = new BigDecimal("0.025");

  @Override
  public BigDecimal calculate(BigDecimal amount) {
    Objects.requireNonNull(amount, "amount");
    if (amount.signum() < 0) {
      throw new IllegalArgumentException("amount must be non-negative");
    }
    return amount.multiply(RATE).setScale(2, RoundingMode.HALF_UP);
  }
}
