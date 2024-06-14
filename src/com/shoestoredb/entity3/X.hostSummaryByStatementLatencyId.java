package com.shoestoredb.entity3;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final


import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.hostSummaryByStatementLatencyId generated by hbm2java
 */
@Embeddable
public class X.hostSummaryByStatementLatencyId  implements java.io.Serializable {


     private String host;
     private BigInteger total;
     private BigInteger totalLatency;
     private Long maxLatency;
     private BigInteger lockLatency;
     private BigInteger cpuLatency;
     private BigInteger rowsSent;
     private BigInteger rowsExamined;
     private BigInteger rowsAffected;
     private BigInteger fullScans;

    public X.hostSummaryByStatementLatencyId() {
    }

    public X.hostSummaryByStatementLatencyId(String host, BigInteger total, BigInteger totalLatency, Long maxLatency, BigInteger lockLatency, BigInteger cpuLatency, BigInteger rowsSent, BigInteger rowsExamined, BigInteger rowsAffected, BigInteger fullScans) {
       this.host = host;
       this.total = total;
       this.totalLatency = totalLatency;
       this.maxLatency = maxLatency;
       this.lockLatency = lockLatency;
       this.cpuLatency = cpuLatency;
       this.rowsSent = rowsSent;
       this.rowsExamined = rowsExamined;
       this.rowsAffected = rowsAffected;
       this.fullScans = fullScans;
    }
   


    @Column(name="host")
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }


    @Column(name="total", precision=42, scale=0)
    public BigInteger getTotal() {
        return this.total;
    }
    
    public void setTotal(BigInteger total) {
        this.total = total;
    }


    @Column(name="total_latency", precision=42, scale=0)
    public BigInteger getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(BigInteger totalLatency) {
        this.totalLatency = totalLatency;
    }


    @Column(name="max_latency")
    public Long getMaxLatency() {
        return this.maxLatency;
    }
    
    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }


    @Column(name="lock_latency", precision=42, scale=0)
    public BigInteger getLockLatency() {
        return this.lockLatency;
    }
    
    public void setLockLatency(BigInteger lockLatency) {
        this.lockLatency = lockLatency;
    }


    @Column(name="cpu_latency", precision=42, scale=0)
    public BigInteger getCpuLatency() {
        return this.cpuLatency;
    }
    
    public void setCpuLatency(BigInteger cpuLatency) {
        this.cpuLatency = cpuLatency;
    }


    @Column(name="rows_sent", precision=42, scale=0)
    public BigInteger getRowsSent() {
        return this.rowsSent;
    }
    
    public void setRowsSent(BigInteger rowsSent) {
        this.rowsSent = rowsSent;
    }


    @Column(name="rows_examined", precision=42, scale=0)
    public BigInteger getRowsExamined() {
        return this.rowsExamined;
    }
    
    public void setRowsExamined(BigInteger rowsExamined) {
        this.rowsExamined = rowsExamined;
    }


    @Column(name="rows_affected", precision=42, scale=0)
    public BigInteger getRowsAffected() {
        return this.rowsAffected;
    }
    
    public void setRowsAffected(BigInteger rowsAffected) {
        this.rowsAffected = rowsAffected;
    }


    @Column(name="full_scans", precision=43, scale=0)
    public BigInteger getFullScans() {
        return this.fullScans;
    }
    
    public void setFullScans(BigInteger fullScans) {
        this.fullScans = fullScans;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.hostSummaryByStatementLatencyId) ) return false;
		 X.hostSummaryByStatementLatencyId castOther = ( X.hostSummaryByStatementLatencyId ) other; 
         
		 return ( (this.getHost()==castOther.getHost()) || ( this.getHost()!=null && castOther.getHost()!=null && this.getHost().equals(castOther.getHost()) ) )
 && ( (this.getTotal()==castOther.getTotal()) || ( this.getTotal()!=null && castOther.getTotal()!=null && this.getTotal().equals(castOther.getTotal()) ) )
 && ( (this.getTotalLatency()==castOther.getTotalLatency()) || ( this.getTotalLatency()!=null && castOther.getTotalLatency()!=null && this.getTotalLatency().equals(castOther.getTotalLatency()) ) )
 && ( (this.getMaxLatency()==castOther.getMaxLatency()) || ( this.getMaxLatency()!=null && castOther.getMaxLatency()!=null && this.getMaxLatency().equals(castOther.getMaxLatency()) ) )
 && ( (this.getLockLatency()==castOther.getLockLatency()) || ( this.getLockLatency()!=null && castOther.getLockLatency()!=null && this.getLockLatency().equals(castOther.getLockLatency()) ) )
 && ( (this.getCpuLatency()==castOther.getCpuLatency()) || ( this.getCpuLatency()!=null && castOther.getCpuLatency()!=null && this.getCpuLatency().equals(castOther.getCpuLatency()) ) )
 && ( (this.getRowsSent()==castOther.getRowsSent()) || ( this.getRowsSent()!=null && castOther.getRowsSent()!=null && this.getRowsSent().equals(castOther.getRowsSent()) ) )
 && ( (this.getRowsExamined()==castOther.getRowsExamined()) || ( this.getRowsExamined()!=null && castOther.getRowsExamined()!=null && this.getRowsExamined().equals(castOther.getRowsExamined()) ) )
 && ( (this.getRowsAffected()==castOther.getRowsAffected()) || ( this.getRowsAffected()!=null && castOther.getRowsAffected()!=null && this.getRowsAffected().equals(castOther.getRowsAffected()) ) )
 && ( (this.getFullScans()==castOther.getFullScans()) || ( this.getFullScans()!=null && castOther.getFullScans()!=null && this.getFullScans().equals(castOther.getFullScans()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getHost() == null ? 0 : this.getHost().hashCode() );
         result = 37 * result + ( getTotal() == null ? 0 : this.getTotal().hashCode() );
         result = 37 * result + ( getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode() );
         result = 37 * result + ( getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode() );
         result = 37 * result + ( getLockLatency() == null ? 0 : this.getLockLatency().hashCode() );
         result = 37 * result + ( getCpuLatency() == null ? 0 : this.getCpuLatency().hashCode() );
         result = 37 * result + ( getRowsSent() == null ? 0 : this.getRowsSent().hashCode() );
         result = 37 * result + ( getRowsExamined() == null ? 0 : this.getRowsExamined().hashCode() );
         result = 37 * result + ( getRowsAffected() == null ? 0 : this.getRowsAffected().hashCode() );
         result = 37 * result + ( getFullScans() == null ? 0 : this.getFullScans().hashCode() );
         return result;
   }   


}


