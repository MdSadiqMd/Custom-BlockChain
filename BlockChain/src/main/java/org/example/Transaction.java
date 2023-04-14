package org.example;
import java.util.*;
public class Transaction {
    private String SourceName;
    private String DestinationName;
    private Long Amount;

    public Transaction(String sourceName,String destinationName,Long amount) {
        SourceName = sourceName;
        DestinationName=destinationName;
        Amount=amount;
    }

    public String getDestinationName() {
        return DestinationName;
    }

    public void setDestinationName(String destinationName) {
        DestinationName = destinationName;
    }

    public String getSourceName() {
        return SourceName;
    }

    public void setSourceName(String sourceName) {
        SourceName = sourceName;
    }

    public Long getAmount() {
        return Amount;
    }

    public void setAmount(Long amount) {
        Amount = amount;
    }

    public Transaction() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (SourceName != null ? !SourceName.equals(that.SourceName) : that.SourceName != null) return false;
        if (DestinationName != null ? !DestinationName.equals(that.DestinationName) : that.DestinationName != null)
            return false;
        return Amount != null ? Amount.equals(that.Amount) : that.Amount == null;
    }

    @Override
    public int hashCode() {
        int result = SourceName != null ? SourceName.hashCode() : 0;
        result = 31 * result + (DestinationName != null ? DestinationName.hashCode() : 0);
        result = 31 * result + (Amount != null ? Amount.hashCode() : 0);
        return result;
    }
}
