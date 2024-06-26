package com.shoestoredb.entity3;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final


import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.statementAnalysisId generated by hbm2java
 */
@Embeddable
public class X.statementAnalysisId  implements java.io.Serializable {


     private String query;
     private String db;
     private String fullScan;
     private long execCount;
     private long execSecondaryCount;
     private long errCount;
     private long warnCount;
     private long totalLatency;
     private long maxLatency;
     private long avgLatency;
     private long lockLatency;
     private long cpuLatency;
     private long rowsSent;
     private BigInteger rowsSentAvg;
     private long rowsExamined;
     private BigInteger rowsExaminedAvg;
     private long rowsAffected;
     private BigInteger rowsAffectedAvg;
     private long tmpTables;
     private long tmpDiskTables;
     private long rowsSorted;
     private long sortMergePasses;
     private long maxControlledMemory;
     private long maxTotalMemory;
     private String digest;
     private Date firstSeen;
     private Date lastSeen;

    public X.statementAnalysisId() {
    }

	
    public X.statementAnalysisId(String fullScan, long execCount, long execSecondaryCount, long errCount, long warnCount, long totalLatency, long maxLatency, long avgLatency, long lockLatency, long cpuLatency, long rowsSent, BigInteger rowsSentAvg, long rowsExamined, BigInteger rowsExaminedAvg, long rowsAffected, BigInteger rowsAffectedAvg, long tmpTables, long tmpDiskTables, long rowsSorted, long sortMergePasses, long maxControlledMemory, long maxTotalMemory, Date firstSeen, Date lastSeen) {
        this.fullScan = fullScan;
        this.execCount = execCount;
        this.execSecondaryCount = execSecondaryCount;
        this.errCount = errCount;
        this.warnCount = warnCount;
        this.totalLatency = totalLatency;
        this.maxLatency = maxLatency;
        this.avgLatency = avgLatency;
        this.lockLatency = lockLatency;
        this.cpuLatency = cpuLatency;
        this.rowsSent = rowsSent;
        this.rowsSentAvg = rowsSentAvg;
        this.rowsExamined = rowsExamined;
        this.rowsExaminedAvg = rowsExaminedAvg;
        this.rowsAffected = rowsAffected;
        this.rowsAffectedAvg = rowsAffectedAvg;
        this.tmpTables = tmpTables;
        this.tmpDiskTables = tmpDiskTables;
        this.rowsSorted = rowsSorted;
        this.sortMergePasses = sortMergePasses;
        this.maxControlledMemory = maxControlledMemory;
        this.maxTotalMemory = maxTotalMemory;
        this.firstSeen = firstSeen;
        this.lastSeen = lastSeen;
    }
    public X.statementAnalysisId(String query, String db, String fullScan, long execCount, long execSecondaryCount, long errCount, long warnCount, long totalLatency, long maxLatency, long avgLatency, long lockLatency, long cpuLatency, long rowsSent, BigInteger rowsSentAvg, long rowsExamined, BigInteger rowsExaminedAvg, long rowsAffected, BigInteger rowsAffectedAvg, long tmpTables, long tmpDiskTables, long rowsSorted, long sortMergePasses, long maxControlledMemory, long maxTotalMemory, String digest, Date firstSeen, Date lastSeen) {
       this.query = query;
       this.db = db;
       this.fullScan = fullScan;
       this.execCount = execCount;
       this.execSecondaryCount = execSecondaryCount;
       this.errCount = errCount;
       this.warnCount = warnCount;
       this.totalLatency = totalLatency;
       this.maxLatency = maxLatency;
       this.avgLatency = avgLatency;
       this.lockLatency = lockLatency;
       this.cpuLatency = cpuLatency;
       this.rowsSent = rowsSent;
       this.rowsSentAvg = rowsSentAvg;
       this.rowsExamined = rowsExamined;
       this.rowsExaminedAvg = rowsExaminedAvg;
       this.rowsAffected = rowsAffected;
       this.rowsAffectedAvg = rowsAffectedAvg;
       this.tmpTables = tmpTables;
       this.tmpDiskTables = tmpDiskTables;
       this.rowsSorted = rowsSorted;
       this.sortMergePasses = sortMergePasses;
       this.maxControlledMemory = maxControlledMemory;
       this.maxTotalMemory = maxTotalMemory;
       this.digest = digest;
       this.firstSeen = firstSeen;
       this.lastSeen = lastSeen;
    }
   


    @Column(name="query")
    public String getQuery() {
        return this.query;
    }
    
    public void setQuery(String query) {
        this.query = query;
    }


    @Column(name="db", length=64)
    public String getDb() {
        return this.db;
    }
    
    public void setDb(String db) {
        this.db = db;
    }


    @Column(name="full_scan", nullable=false, length=1)
    public String getFullScan() {
        return this.fullScan;
    }
    
    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }


    @Column(name="exec_count", nullable=false)
    public long getExecCount() {
        return this.execCount;
    }
    
    public void setExecCount(long execCount) {
        this.execCount = execCount;
    }


    @Column(name="exec_secondary_count", nullable=false)
    public long getExecSecondaryCount() {
        return this.execSecondaryCount;
    }
    
    public void setExecSecondaryCount(long execSecondaryCount) {
        this.execSecondaryCount = execSecondaryCount;
    }


    @Column(name="err_count", nullable=false)
    public long getErrCount() {
        return this.errCount;
    }
    
    public void setErrCount(long errCount) {
        this.errCount = errCount;
    }


    @Column(name="warn_count", nullable=false)
    public long getWarnCount() {
        return this.warnCount;
    }
    
    public void setWarnCount(long warnCount) {
        this.warnCount = warnCount;
    }


    @Column(name="total_latency", nullable=false)
    public long getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }


    @Column(name="max_latency", nullable=false)
    public long getMaxLatency() {
        return this.maxLatency;
    }
    
    public void setMaxLatency(long maxLatency) {
        this.maxLatency = maxLatency;
    }


    @Column(name="avg_latency", nullable=false)
    public long getAvgLatency() {
        return this.avgLatency;
    }
    
    public void setAvgLatency(long avgLatency) {
        this.avgLatency = avgLatency;
    }


    @Column(name="lock_latency", nullable=false)
    public long getLockLatency() {
        return this.lockLatency;
    }
    
    public void setLockLatency(long lockLatency) {
        this.lockLatency = lockLatency;
    }


    @Column(name="cpu_latency", nullable=false)
    public long getCpuLatency() {
        return this.cpuLatency;
    }
    
    public void setCpuLatency(long cpuLatency) {
        this.cpuLatency = cpuLatency;
    }


    @Column(name="rows_sent", nullable=false)
    public long getRowsSent() {
        return this.rowsSent;
    }
    
    public void setRowsSent(long rowsSent) {
        this.rowsSent = rowsSent;
    }


    @Column(name="rows_sent_avg", nullable=false, precision=21, scale=0)
    public BigInteger getRowsSentAvg() {
        return this.rowsSentAvg;
    }
    
    public void setRowsSentAvg(BigInteger rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
    }


    @Column(name="rows_examined", nullable=false)
    public long getRowsExamined() {
        return this.rowsExamined;
    }
    
    public void setRowsExamined(long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }


    @Column(name="rows_examined_avg", nullable=false, precision=21, scale=0)
    public BigInteger getRowsExaminedAvg() {
        return this.rowsExaminedAvg;
    }
    
    public void setRowsExaminedAvg(BigInteger rowsExaminedAvg) {
        this.rowsExaminedAvg = rowsExaminedAvg;
    }


    @Column(name="rows_affected", nullable=false)
    public long getRowsAffected() {
        return this.rowsAffected;
    }
    
    public void setRowsAffected(long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }


    @Column(name="rows_affected_avg", nullable=false, precision=21, scale=0)
    public BigInteger getRowsAffectedAvg() {
        return this.rowsAffectedAvg;
    }
    
    public void setRowsAffectedAvg(BigInteger rowsAffectedAvg) {
        this.rowsAffectedAvg = rowsAffectedAvg;
    }


    @Column(name="tmp_tables", nullable=false)
    public long getTmpTables() {
        return this.tmpTables;
    }
    
    public void setTmpTables(long tmpTables) {
        this.tmpTables = tmpTables;
    }


    @Column(name="tmp_disk_tables", nullable=false)
    public long getTmpDiskTables() {
        return this.tmpDiskTables;
    }
    
    public void setTmpDiskTables(long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }


    @Column(name="rows_sorted", nullable=false)
    public long getRowsSorted() {
        return this.rowsSorted;
    }
    
    public void setRowsSorted(long rowsSorted) {
        this.rowsSorted = rowsSorted;
    }


    @Column(name="sort_merge_passes", nullable=false)
    public long getSortMergePasses() {
        return this.sortMergePasses;
    }
    
    public void setSortMergePasses(long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }


    @Column(name="max_controlled_memory", nullable=false)
    public long getMaxControlledMemory() {
        return this.maxControlledMemory;
    }
    
    public void setMaxControlledMemory(long maxControlledMemory) {
        this.maxControlledMemory = maxControlledMemory;
    }


    @Column(name="max_total_memory", nullable=false)
    public long getMaxTotalMemory() {
        return this.maxTotalMemory;
    }
    
    public void setMaxTotalMemory(long maxTotalMemory) {
        this.maxTotalMemory = maxTotalMemory;
    }


    @Column(name="digest", length=64)
    public String getDigest() {
        return this.digest;
    }
    
    public void setDigest(String digest) {
        this.digest = digest;
    }


    @Column(name="first_seen", nullable=false, length=26)
    public Date getFirstSeen() {
        return this.firstSeen;
    }
    
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }


    @Column(name="last_seen", nullable=false, length=26)
    public Date getLastSeen() {
        return this.lastSeen;
    }
    
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.statementAnalysisId) ) return false;
		 X.statementAnalysisId castOther = ( X.statementAnalysisId ) other; 
         
		 return ( (this.getQuery()==castOther.getQuery()) || ( this.getQuery()!=null && castOther.getQuery()!=null && this.getQuery().equals(castOther.getQuery()) ) )
 && ( (this.getDb()==castOther.getDb()) || ( this.getDb()!=null && castOther.getDb()!=null && this.getDb().equals(castOther.getDb()) ) )
 && ( (this.getFullScan()==castOther.getFullScan()) || ( this.getFullScan()!=null && castOther.getFullScan()!=null && this.getFullScan().equals(castOther.getFullScan()) ) )
 && (this.getExecCount()==castOther.getExecCount())
 && (this.getExecSecondaryCount()==castOther.getExecSecondaryCount())
 && (this.getErrCount()==castOther.getErrCount())
 && (this.getWarnCount()==castOther.getWarnCount())
 && (this.getTotalLatency()==castOther.getTotalLatency())
 && (this.getMaxLatency()==castOther.getMaxLatency())
 && (this.getAvgLatency()==castOther.getAvgLatency())
 && (this.getLockLatency()==castOther.getLockLatency())
 && (this.getCpuLatency()==castOther.getCpuLatency())
 && (this.getRowsSent()==castOther.getRowsSent())
 && ( (this.getRowsSentAvg()==castOther.getRowsSentAvg()) || ( this.getRowsSentAvg()!=null && castOther.getRowsSentAvg()!=null && this.getRowsSentAvg().equals(castOther.getRowsSentAvg()) ) )
 && (this.getRowsExamined()==castOther.getRowsExamined())
 && ( (this.getRowsExaminedAvg()==castOther.getRowsExaminedAvg()) || ( this.getRowsExaminedAvg()!=null && castOther.getRowsExaminedAvg()!=null && this.getRowsExaminedAvg().equals(castOther.getRowsExaminedAvg()) ) )
 && (this.getRowsAffected()==castOther.getRowsAffected())
 && ( (this.getRowsAffectedAvg()==castOther.getRowsAffectedAvg()) || ( this.getRowsAffectedAvg()!=null && castOther.getRowsAffectedAvg()!=null && this.getRowsAffectedAvg().equals(castOther.getRowsAffectedAvg()) ) )
 && (this.getTmpTables()==castOther.getTmpTables())
 && (this.getTmpDiskTables()==castOther.getTmpDiskTables())
 && (this.getRowsSorted()==castOther.getRowsSorted())
 && (this.getSortMergePasses()==castOther.getSortMergePasses())
 && (this.getMaxControlledMemory()==castOther.getMaxControlledMemory())
 && (this.getMaxTotalMemory()==castOther.getMaxTotalMemory())
 && ( (this.getDigest()==castOther.getDigest()) || ( this.getDigest()!=null && castOther.getDigest()!=null && this.getDigest().equals(castOther.getDigest()) ) )
 && ( (this.getFirstSeen()==castOther.getFirstSeen()) || ( this.getFirstSeen()!=null && castOther.getFirstSeen()!=null && this.getFirstSeen().equals(castOther.getFirstSeen()) ) )
 && ( (this.getLastSeen()==castOther.getLastSeen()) || ( this.getLastSeen()!=null && castOther.getLastSeen()!=null && this.getLastSeen().equals(castOther.getLastSeen()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getQuery() == null ? 0 : this.getQuery().hashCode() );
         result = 37 * result + ( getDb() == null ? 0 : this.getDb().hashCode() );
         result = 37 * result + ( getFullScan() == null ? 0 : this.getFullScan().hashCode() );
         result = 37 * result + (int) this.getExecCount();
         result = 37 * result + (int) this.getExecSecondaryCount();
         result = 37 * result + (int) this.getErrCount();
         result = 37 * result + (int) this.getWarnCount();
         result = 37 * result + (int) this.getTotalLatency();
         result = 37 * result + (int) this.getMaxLatency();
         result = 37 * result + (int) this.getAvgLatency();
         result = 37 * result + (int) this.getLockLatency();
         result = 37 * result + (int) this.getCpuLatency();
         result = 37 * result + (int) this.getRowsSent();
         result = 37 * result + ( getRowsSentAvg() == null ? 0 : this.getRowsSentAvg().hashCode() );
         result = 37 * result + (int) this.getRowsExamined();
         result = 37 * result + ( getRowsExaminedAvg() == null ? 0 : this.getRowsExaminedAvg().hashCode() );
         result = 37 * result + (int) this.getRowsAffected();
         result = 37 * result + ( getRowsAffectedAvg() == null ? 0 : this.getRowsAffectedAvg().hashCode() );
         result = 37 * result + (int) this.getTmpTables();
         result = 37 * result + (int) this.getTmpDiskTables();
         result = 37 * result + (int) this.getRowsSorted();
         result = 37 * result + (int) this.getSortMergePasses();
         result = 37 * result + (int) this.getMaxControlledMemory();
         result = 37 * result + (int) this.getMaxTotalMemory();
         result = 37 * result + ( getDigest() == null ? 0 : this.getDigest().hashCode() );
         result = 37 * result + ( getFirstSeen() == null ? 0 : this.getFirstSeen().hashCode() );
         result = 37 * result + ( getLastSeen() == null ? 0 : this.getLastSeen().hashCode() );
         return result;
   }   


}


