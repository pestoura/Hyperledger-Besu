/*
 * Copyright ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.besu.config;

import java.util.Map;
import java.util.OptionalLong;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.collect.ImmutableMap;

/** The Keccak256 config options. */
public class Keccak256ConfigOptions {

  /** The constant DEFAULT. */
  public static final Keccak256ConfigOptions DEFAULT =
      new Keccak256ConfigOptions(JsonUtil.createEmptyObjectNode());

  private final ObjectNode keccak256ConfigRoot;

  /**
   * Instantiates a new Keccak256 config options.
   *
   * @param keccak256ConfigRoot the keccak 256 config root
   */
  Keccak256ConfigOptions(final ObjectNode keccak256ConfigRoot) {
    this.keccak256ConfigRoot = keccak256ConfigRoot;
  }

  /**
   * Gets fixed difficulty.
   *
   * @return the fixed difficulty
   */
  public OptionalLong getFixedDifficulty() {
    return JsonUtil.getLong(keccak256ConfigRoot, "fixeddifficulty");
  }

  /**
   * As map.
   *
   * @return the map
   */
  Map<String, Object> asMap() {
    final ImmutableMap.Builder<String, Object> builder = ImmutableMap.builder();
    getFixedDifficulty().ifPresent(l -> builder.put("fixeddifficulty", l));
    return builder.build();
  }
}
