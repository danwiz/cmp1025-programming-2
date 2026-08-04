package com.wisdom.cmp1025.domain;

import java.math.BigDecimal;

public interface FeePolicy {
  BigDecimal calculate(BigDecimal amount);
}
