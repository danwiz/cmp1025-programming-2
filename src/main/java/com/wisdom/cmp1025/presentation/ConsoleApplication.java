package com.wisdom.cmp1025.presentation;

import com.wisdom.cmp1025.application.CalculateFeeUseCase;
import com.wisdom.cmp1025.domain.StandardFeePolicy;
import java.math.BigDecimal;

public final class ConsoleApplication {
  private ConsoleApplication() {}

  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Usage: java ... ConsoleApplication <amount>");
      System.exit(2);
    }
    try {
      var fee = new CalculateFeeUseCase(new StandardFeePolicy()).execute(new BigDecimal(args[0]));
      System.out.println(fee.toPlainString());
    } catch (RuntimeException ex) {
      System.err.println("Invalid amount: " + ex.getMessage());
      System.exit(1);
    }
  }
}
