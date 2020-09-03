package com.example.testyc.util;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * @author zcw
 * @date 2020-05-25
 * @apiNote 手动事务
 */
@Component
public class TransactionUtil {

    private DataSourceTransactionManager transactionManager;

    //开启事务
    public TransactionStatus begin(){
        TransactionStatus transactionStatus = transactionManager.getTransaction(new DefaultTransactionDefinition());
        return transactionStatus;
    }

    //提交事务
    public void commit(TransactionStatus transactionStatus){
        transactionManager.commit(transactionStatus);
    }

    //回滚事务
    public void rollback(TransactionStatus transactionStatus){
        transactionManager.rollback(transactionStatus);
    }


}
