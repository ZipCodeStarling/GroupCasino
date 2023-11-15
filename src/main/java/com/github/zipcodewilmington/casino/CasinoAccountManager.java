package com.github.zipcodewilmington.casino;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccountManager` stores, manages, and retrieves `ArcadeAccount` objects
 * it is advised that every instruction in this class is logged
 */
public class CasinoAccountManager {
    /**
     * @param accountName     name of account to be returned
     * @param accountPassword password of account to be returned
     * @return `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    private List<CasinoAccount> casinoAccountList;

    public CasinoAccountManager(){
        this.casinoAccountList = new ArrayList<>();
    }
    public CasinoAccount getAccount(String accountName, String accountPassword) {
        for (CasinoAccount account : casinoAccountList){
            if (account.getName().equals(accountName) && account.getPassword().equals(accountPassword)) {
                return account;
            }
        } return null;
    }

    /**
     * logs & creates a new `ArcadeAccount`
     *
     * @param accountName     name of account to be created
     * @param accountPassword password of account to be created
     * @return new instance of `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public CasinoAccount createAccount(String accountName, String accountPassword) {
        CasinoAccount newAccount = new CasinoAccount(accountName, accountPassword);
        return newAccount;
    }

    /**
     * logs & registers a new `ArcadeAccount` to `this.getArcadeAccountList()`
     *
     * @param casinoAccount the arcadeAccount to be added to `this.getArcadeAccountList()`
     */
    public void registerAccount(CasinoAccount casinoAccount) {
        this.casinoAccountList.add(casinoAccount);
    }
}