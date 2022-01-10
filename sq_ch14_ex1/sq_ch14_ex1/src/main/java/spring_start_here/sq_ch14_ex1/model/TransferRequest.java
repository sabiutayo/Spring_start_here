package spring_start_here.sq_ch13_ex1.model;

import java.math.BigDecimal;

public class TransferRequest {
    private long senderAccountId;
    private long receiverAccountId;
    private BigDecimal amount;

    public long getSenderAccountId() {
        return senderAccountId;
    }

    public TransferRequest setSenderAccountId(long senderAccountId) {
        this.senderAccountId = senderAccountId;
        return this;
    }

    public long getReceiverAccountId() {
        return receiverAccountId;
    }

    public TransferRequest setReceiverAccountId(long receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public TransferRequest setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }
}
