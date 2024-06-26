package com.shoestoredb.entity3;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.memoryGlobalByCurrentBytesId generated by hbm2java
 */
@Embeddable
public class X.memoryGlobalByCurrentBytesId  implements java.io.Serializable {


     private String eventName;
     private long currentCount;
     private long currentAlloc;
     private BigDecimal currentAvgAlloc;
     private long highCount;
     private long highAlloc;
     private BigDecimal highAvgAlloc;

    public X.memoryGlobalByCurrentBytesId() {
    }

    public X.memoryGlobalByCurrentBytesId(String eventName, long currentCount, long currentAlloc, BigDecimal currentAvgAlloc, long highCount, long highAlloc, BigDecimal highAvgAlloc) {
       this.eventName = eventName;
       this.currentCount = currentCount;
       this.currentAlloc = currentAlloc;
       this.currentAvgAlloc = currentAvgAlloc;
       this.highCount = highCount;
       this.highAlloc = highAlloc;
       this.highAvgAlloc = highAvgAlloc;
    }
   


    @Column(name="event_name", nullable=false, length=128)
    public String getEventName() {
        return this.eventName;
    }
    
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    @Column(name="current_count", nullable=false)
    public long getCurrentCount() {
        return this.currentCount;
    }
    
    public void setCurrentCount(long currentCount) {
        this.currentCount = currentCount;
    }


    @Column(name="current_alloc", nullable=false)
    public long getCurrentAlloc() {
        return this.currentAlloc;
    }
    
    public void setCurrentAlloc(long currentAlloc) {
        this.currentAlloc = currentAlloc;
    }


    @Column(name="current_avg_alloc", nullable=false, precision=23, scale=4)
    public BigDecimal getCurrentAvgAlloc() {
        return this.currentAvgAlloc;
    }
    
    public void setCurrentAvgAlloc(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }


    @Column(name="high_count", nullable=false)
    public long getHighCount() {
        return this.highCount;
    }
    
    public void setHighCount(long highCount) {
        this.highCount = highCount;
    }


    @Column(name="high_alloc", nullable=false)
    public long getHighAlloc() {
        return this.highAlloc;
    }
    
    public void setHighAlloc(long highAlloc) {
        this.highAlloc = highAlloc;
    }


    @Column(name="high_avg_alloc", nullable=false, precision=23, scale=4)
    public BigDecimal getHighAvgAlloc() {
        return this.highAvgAlloc;
    }
    
    public void setHighAvgAlloc(BigDecimal highAvgAlloc) {
        this.highAvgAlloc = highAvgAlloc;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.memoryGlobalByCurrentBytesId) ) return false;
		 X.memoryGlobalByCurrentBytesId castOther = ( X.memoryGlobalByCurrentBytesId ) other; 
         
		 return ( (this.getEventName()==castOther.getEventName()) || ( this.getEventName()!=null && castOther.getEventName()!=null && this.getEventName().equals(castOther.getEventName()) ) )
 && (this.getCurrentCount()==castOther.getCurrentCount())
 && (this.getCurrentAlloc()==castOther.getCurrentAlloc())
 && ( (this.getCurrentAvgAlloc()==castOther.getCurrentAvgAlloc()) || ( this.getCurrentAvgAlloc()!=null && castOther.getCurrentAvgAlloc()!=null && this.getCurrentAvgAlloc().equals(castOther.getCurrentAvgAlloc()) ) )
 && (this.getHighCount()==castOther.getHighCount())
 && (this.getHighAlloc()==castOther.getHighAlloc())
 && ( (this.getHighAvgAlloc()==castOther.getHighAvgAlloc()) || ( this.getHighAvgAlloc()!=null && castOther.getHighAvgAlloc()!=null && this.getHighAvgAlloc().equals(castOther.getHighAvgAlloc()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEventName() == null ? 0 : this.getEventName().hashCode() );
         result = 37 * result + (int) this.getCurrentCount();
         result = 37 * result + (int) this.getCurrentAlloc();
         result = 37 * result + ( getCurrentAvgAlloc() == null ? 0 : this.getCurrentAvgAlloc().hashCode() );
         result = 37 * result + (int) this.getHighCount();
         result = 37 * result + (int) this.getHighAlloc();
         result = 37 * result + ( getHighAvgAlloc() == null ? 0 : this.getHighAvgAlloc().hashCode() );
         return result;
   }   


}


