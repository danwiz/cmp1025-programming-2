package com.wisdom.cmp1025.architecture;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(
    packages = "com.wisdom.cmp1025",
    importOptions = ImportOption.DoNotIncludeTests.class)
class LayerDependencyTest {
  @ArchTest
  static final ArchRule layers =
      layeredArchitecture()
          .consideringOnlyDependenciesInLayers()
          .layer("Presentation")
          .definedBy("..presentation..")
          .layer("Application")
          .definedBy("..application..")
          .layer("Domain")
          .definedBy("..domain..")
          .layer("Infrastructure")
          .definedBy("..infrastructure..")
          .whereLayer("Presentation")
          .mayOnlyAccessLayers("Application", "Domain")
          .whereLayer("Application")
          .mayOnlyAccessLayers("Domain")
          .whereLayer("Domain")
          .mayNotAccessAnyLayer();
}
