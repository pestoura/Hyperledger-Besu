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
package org.hyperledger.besu.consensus.clique.jsonrpc.methods;

import org.hyperledger.besu.consensus.common.jsonrpc.AbstractVoteProposerMethod;
import org.hyperledger.besu.consensus.common.validator.ValidatorProvider;
import org.hyperledger.besu.ethereum.api.jsonrpc.RpcMethod;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.methods.JsonRpcMethod;

/** The Clique proposals. */
public class CliqueProposals extends AbstractVoteProposerMethod implements JsonRpcMethod {

  /**
   * Instantiates a new Clique proposals.
   *
   * @param validatorProvider the validator provider
   */
  public CliqueProposals(final ValidatorProvider validatorProvider) {
    super(validatorProvider);
  }

  @Override
  public String getName() {
    return RpcMethod.CLIQUE_GET_PROPOSALS.getMethodName();
  }
}
