package com.wisdom.cmp1025.application;

import com.wisdom.cmp1025.domain.FeePolicy;
import java.math.BigDecimal;
import java.util.Objects;

public final class CalculateFeeUseCase {
  private final FeePolicy feePolicy;

  public CalculateFeeUseCase(FeePolicy feePolicy) {
    this.feePolicy = Objects.requireNonNull(feePolicy);
  }

  public BigDecimal execute(BigDecimal amount) {
    return feePolicy.calculate(amount);
  }
}
