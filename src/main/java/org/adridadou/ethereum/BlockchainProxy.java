package org.adridadou.ethereum;

import org.ethereum.crypto.ECKey;
import org.ethereum.util.blockchain.SolidityContract;

import java.util.concurrent.CompletableFuture;

/**
 * Created by davidroon on 08.04.16.
 * This code is released under Apache 2 license
 */
public interface BlockchainProxy {
    SolidityContract map(final String src, String contractName, EthAddress address, ECKey sender);

    SolidityContract mapFromAbi(final String abi, EthAddress address, ECKey sender);

    CompletableFuture<EthAddress> publish(String code, String contractName, ECKey sender);

    long getCurrentBlockNumber();
}


