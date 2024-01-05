package org.example.bank_managment.metrics;




import org.example.bank_managment.model.BankTransaction;

import java.util.List;

public interface MetricsCollector {

    public void collect(List<BankTransaction> transactions);
}
