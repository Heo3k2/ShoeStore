package com.shoestoredb.entity3;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final


import com.shoestoredb.entity3.X.hostSummaryByStagesId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.hostSummaryByStages generated by hbm2java
 */
@Entity
@Table(name="x$host_summary_by_stages"
    ,catalog="sys"
)
public class X.hostSummaryByStages  implements java.io.Serializable {


     private X.hostSummaryByStagesId id;

    public X.hostSummaryByStages() {
    }

    public X.hostSummaryByStages(X.hostSummaryByStagesId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="host", column=@Column(name="host") ), 
        @AttributeOverride(name="eventName", column=@Column(name="event_name", nullable=false, length=128) ), 
        @AttributeOverride(name="total", column=@Column(name="total", nullable=false) ), 
        @AttributeOverride(name="totalLatency", column=@Column(name="total_latency", nullable=false) ), 
        @AttributeOverride(name="avgLatency", column=@Column(name="avg_latency", nullable=false) ) } )
    public X.hostSummaryByStagesId getId() {
        return this.id;
    }
    
    public void setId(X.hostSummaryByStagesId id) {
        this.id = id;
    }




}


