package com.shoestoredb.entity3;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final


import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.ioByThreadByLatencyId generated by hbm2java
 */
@Embeddable
public class X.ioByThreadByLatencyId  implements java.io.Serializable {


     private String user;
     private BigInteger total;
     private BigInteger totalLatency;
     private Long minLatency;
     private BigDecimal avgLatency;
     private Long maxLatency;
     private long threadId;
     private Long processlistId;

    public X.ioByThreadByLatencyId() {
    }

	
    public X.ioByThreadByLatencyId(long threadId) {
        this.threadId = threadId;
    }
    public X.ioByThreadByLatencyId(String user, BigInteger total, BigInteger totalLatency, Long minLatency, BigDecimal avgLatency, Long maxLatency, long threadId, Long processlistId) {
       this.user = user;
       this.total = total;
       this.totalLatency = totalLatency;
       this.minLatency = minLatency;
       this.avgLatency = avgLatency;
       this.maxLatency = maxLatency;
       this.threadId = threadId;
       this.processlistId = processlistId;
    }
   


    @Column(name="user", length=288)
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
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


    @Column(name="min_latency")
    public Long getMinLatency() {
        return this.minLatency;
    }
    
    public void setMinLatency(Long minLatency) {
        this.minLatency = minLatency;
    }


    @Column(name="avg_latency", precision=24, scale=4)
    public BigDecimal getAvgLatency() {
        return this.avgLatency;
    }
    
    public void setAvgLatency(BigDecimal avgLatency) {
        this.avgLatency = avgLatency;
    }


    @Column(name="max_latency")
    public Long getMaxLatency() {
        return this.maxLatency;
    }
    
    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }


    @Column(name="thread_id", nullable=false)
    public long getThreadId() {
        return this.threadId;
    }
    
    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }


    @Column(name="processlist_id")
    public Long getProcesslistId() {
        return this.processlistId;
    }
    
    public void setProcesslistId(Long processlistId) {
        this.processlistId = processlistId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.ioByThreadByLatencyId) ) return false;
		 X.ioByThreadByLatencyId castOther = ( X.ioByThreadByLatencyId ) other; 
         
		 return ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getTotal()==castOther.getTotal()) || ( this.getTotal()!=null && castOther.getTotal()!=null && this.getTotal().equals(castOther.getTotal()) ) )
 && ( (this.getTotalLatency()==castOther.getTotalLatency()) || ( this.getTotalLatency()!=null && castOther.getTotalLatency()!=null && this.getTotalLatency().equals(castOther.getTotalLatency()) ) )
 && ( (this.getMinLatency()==castOther.getMinLatency()) || ( this.getMinLatency()!=null && castOther.getMinLatency()!=null && this.getMinLatency().equals(castOther.getMinLatency()) ) )
 && ( (this.getAvgLatency()==castOther.getAvgLatency()) || ( this.getAvgLatency()!=null && castOther.getAvgLatency()!=null && this.getAvgLatency().equals(castOther.getAvgLatency()) ) )
 && ( (this.getMaxLatency()==castOther.getMaxLatency()) || ( this.getMaxLatency()!=null && castOther.getMaxLatency()!=null && this.getMaxLatency().equals(castOther.getMaxLatency()) ) )
 && (this.getThreadId()==castOther.getThreadId())
 && ( (this.getProcesslistId()==castOther.getProcesslistId()) || ( this.getProcesslistId()!=null && castOther.getProcesslistId()!=null && this.getProcesslistId().equals(castOther.getProcesslistId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getTotal() == null ? 0 : this.getTotal().hashCode() );
         result = 37 * result + ( getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode() );
         result = 37 * result + ( getMinLatency() == null ? 0 : this.getMinLatency().hashCode() );
         result = 37 * result + ( getAvgLatency() == null ? 0 : this.getAvgLatency().hashCode() );
         result = 37 * result + ( getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode() );
         result = 37 * result + (int) this.getThreadId();
         result = 37 * result + ( getProcesslistId() == null ? 0 : this.getProcesslistId().hashCode() );
         return result;
   }   


}


