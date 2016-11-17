package com.jetbrains.lang.dart;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

/**
 * A queryable class about the capabilities of the Dart plugin.
 */
public class DartPluginCapabilities {
  private static Set<String> capabilities = new HashSet<>();

  static {
    // TODO: set up capabilities here
  }

  public static boolean isSupported(@NotNull String featureKey) {
    return capabilities.contains(featureKey);
  }
}
