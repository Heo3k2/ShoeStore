package com.shoestoredb.entity3;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final


import com.shoestoredb.entity3.X.memoryGlobalByCurrentBytesId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.memoryGlobalByCurrentBytes generated by hbm2java
 */
@Entity
@Table(name="x$memory_global_by_current_bytes"
    ,catalog="sys"
)
public class X.memoryGlobalByCurrentBytes  implements java.io.Serializable {


     private X.memoryGlobalByCurrentBytesId id;

    public X.memoryGlobalByCurrentBytes() {
    }

    public X.memoryGlobalByCurrentBytes(X.memoryGlobalByCurrentBytesId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="eventName", column=@Column(name="event_name", nullable=false, length=128) ), 
        @AttributeOverride(name="currentCount", column=@Column(name="current_count", nullable=false) ), 
        @AttributeOverride(name="currentAlloc", column=@Column(name="current_alloc", nullable=false) ), 
        @AttributeOverride(name="currentAvgAlloc", column=@Column(name="current_avg_alloc", nullable=false, precision=23, scale=4) ), 
        @AttributeOverride(name="highCount", column=@Column(name="high_count", nullable=false) ), 
        @AttributeOverride(name="highAlloc", column=@Column(name="high_alloc", nullable=false) ), 
        @AttributeOverride(name="highAvgAlloc", column=@Column(name="high_avg_alloc", nullable=false, precision=23, scale=4) ) } )
    public X.memoryGlobalByCurrentBytesId getId() {
        return this.id;
    }
    
    public void setId(X.memoryGlobalByCurrentBytesId id) {
        this.id = id;
    }




}


