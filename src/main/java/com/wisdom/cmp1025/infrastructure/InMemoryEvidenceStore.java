package com.wisdom.cmp1025.infrastructure;

import java.util.ArrayList;
import java.util.List;

public final class InMemoryEvidenceStore {
  private final List<String> records = new ArrayList<>();

  public void append(String record) {
    records.add(record);
  }

  public List<String> records() {
    return List.copyOf(records);
  }
}
