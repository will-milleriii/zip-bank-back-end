package runner.services;

import runner.entities.TransactionHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import runner.repositories.TransactionRepo;

import java.util.Optional;
@Service
public class TransactionServices {
    @Autowired
    private TransactionRepo transactionRepo;
    //CRUD methods
    public Optional<TransactionHistory> createTransaction()
    {
        //Re-direct to POST in TransactionHistory controller
        return null;
    }

    public Optional<TransactionHistory> readTransaction()
    {
        //Re-direct to GET in TransactionHistory controller
        return null;
    }
    public Boolean removeTransaction()
    {
        //Re-direct to DELETE in TransactionHistory controller
        return true;
    }

    public Optional<TransactionHistory> updateTransaction()
    {
        //Re-direct to PUT in TransactionHistory controller
        return null;
    }

}