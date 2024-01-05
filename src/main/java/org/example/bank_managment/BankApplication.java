package org.example.bank_managment;


import org.example.bank_managment.metrics.MetricsCollector;
import org.example.bank_managment.metrics.TransactionByGenderMetrics;
import org.example.bank_managment.model.BankTransaction;
import org.example.bank_managment.reader.TransactionFileReader;

import java.util.List;

public class BankApplication {
    public static void main(String[] args) {
        TransactionFileReader fileReader =  new TransactionFileReader();
        String filePath = "C:/Java Projects/archive (5)/bank_transactions1.csv";
        List<BankTransaction> bankTransactions = fileReader.read(filePath);
        MetricsCollector metric = new TransactionByGenderMetrics();
        metric.collect(bankTransactions);
    }
}