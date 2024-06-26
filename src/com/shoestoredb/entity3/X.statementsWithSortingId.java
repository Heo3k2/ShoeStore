package com.shoestoredb.entity3;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final


import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.statementsWithSortingId generated by hbm2java
 */
@Embeddable
public class X.statementsWithSortingId  implements java.io.Serializable {


     private String query;
     private String db;
     private long execCount;
     private long totalLatency;
     private long sortMergePasses;
     private BigInteger avgSortMerges;
     private long sortsUsingScans;
     private long sortUsingRange;
     private long rowsSorted;
     private BigInteger avgRowsSorted;
     private Date firstSeen;
     private Date lastSeen;
     private String digest;

    public X.statementsWithSortingId() {
    }

	
    public X.statementsWithSortingId(long execCount, long totalLatency, long sortMergePasses, BigInteger avgSortMerges, long sortsUsingScans, long sortUsingRange, long rowsSorted, BigInteger avgRowsSorted, Date firstSeen, Date lastSeen) {
        this.execCount = execCount;
        this.totalLatency = totalLatency;
        this.sortMergePasses = sortMergePasses;
        this.avgSortMerges = avgSortMerges;
        this.sortsUsingScans = sortsUsingScans;
        this.sortUsingRange = sortUsingRange;
        this.rowsSorted = rowsSorted;
        this.avgRowsSorted = avgRowsSorted;
        this.firstSeen = firstSeen;
        this.lastSeen = lastSeen;
    }
    public X.statementsWithSortingId(String query, String db, long execCount, long totalLatency, long sortMergePasses, BigInteger avgSortMerges, long sortsUsingScans, long sortUsingRange, long rowsSorted, BigInteger avgRowsSorted, Date firstSeen, Date lastSeen, String digest) {
       this.query = query;
       this.db = db;
       this.execCount = execCount;
       this.totalLatency = totalLatency;
       this.sortMergePasses = sortMergePasses;
       this.avgSortMerges = avgSortMerges;
       this.sortsUsingScans = sortsUsingScans;
       this.sortUsingRange = sortUsingRange;
       this.rowsSorted = rowsSorted;
       this.avgRowsSorted = avgRowsSorted;
       this.firstSeen = firstSeen;
       this.lastSeen = lastSeen;
       this.digest = digest;
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


    @Column(name="exec_count", nullable=false)
    public long getExecCount() {
        return this.execCount;
    }
    
    public void setExecCount(long execCount) {
        this.execCount = execCount;
    }


    @Column(name="total_latency", nullable=false)
    public long getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }


    @Column(name="sort_merge_passes", nullable=false)
    public long getSortMergePasses() {
        return this.sortMergePasses;
    }
    
    public void setSortMergePasses(long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }


    @Column(name="avg_sort_merges", nullable=false, precision=21, scale=0)
    public BigInteger getAvgSortMerges() {
        return this.avgSortMerges;
    }
    
    public void setAvgSortMerges(BigInteger avgSortMerges) {
        this.avgSortMerges = avgSortMerges;
    }


    @Column(name="sorts_using_scans", nullable=false)
    public long getSortsUsingScans() {
        return this.sortsUsingScans;
    }
    
    public void setSortsUsingScans(long sortsUsingScans) {
        this.sortsUsingScans = sortsUsingScans;
    }


    @Column(name="sort_using_range", nullable=false)
    public long getSortUsingRange() {
        return this.sortUsingRange;
    }
    
    public void setSortUsingRange(long sortUsingRange) {
        this.sortUsingRange = sortUsingRange;
    }


    @Column(name="rows_sorted", nullable=false)
    public long getRowsSorted() {
        return this.rowsSorted;
    }
    
    public void setRowsSorted(long rowsSorted) {
        this.rowsSorted = rowsSorted;
    }


    @Column(name="avg_rows_sorted", nullable=false, precision=21, scale=0)
    public BigInteger getAvgRowsSorted() {
        return this.avgRowsSorted;
    }
    
    public void setAvgRowsSorted(BigInteger avgRowsSorted) {
        this.avgRowsSorted = avgRowsSorted;
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


    @Column(name="digest", length=64)
    public String getDigest() {
        return this.digest;
    }
    
    public void setDigest(String digest) {
        this.digest = digest;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.statementsWithSortingId) ) return false;
		 X.statementsWithSortingId castOther = ( X.statementsWithSortingId ) other; 
         
		 return ( (this.getQuery()==castOther.getQuery()) || ( this.getQuery()!=null && castOther.getQuery()!=null && this.getQuery().equals(castOther.getQuery()) ) )
 && ( (this.getDb()==castOther.getDb()) || ( this.getDb()!=null && castOther.getDb()!=null && this.getDb().equals(castOther.getDb()) ) )
 && (this.getExecCount()==castOther.getExecCount())
 && (this.getTotalLatency()==castOther.getTotalLatency())
 && (this.getSortMergePasses()==castOther.getSortMergePasses())
 && ( (this.getAvgSortMerges()==castOther.getAvgSortMerges()) || ( this.getAvgSortMerges()!=null && castOther.getAvgSortMerges()!=null && this.getAvgSortMerges().equals(castOther.getAvgSortMerges()) ) )
 && (this.getSortsUsingScans()==castOther.getSortsUsingScans())
 && (this.getSortUsingRange()==castOther.getSortUsingRange())
 && (this.getRowsSorted()==castOther.getRowsSorted())
 && ( (this.getAvgRowsSorted()==castOther.getAvgRowsSorted()) || ( this.getAvgRowsSorted()!=null && castOther.getAvgRowsSorted()!=null && this.getAvgRowsSorted().equals(castOther.getAvgRowsSorted()) ) )
 && ( (this.getFirstSeen()==castOther.getFirstSeen()) || ( this.getFirstSeen()!=null && castOther.getFirstSeen()!=null && this.getFirstSeen().equals(castOther.getFirstSeen()) ) )
 && ( (this.getLastSeen()==castOther.getLastSeen()) || ( this.getLastSeen()!=null && castOther.getLastSeen()!=null && this.getLastSeen().equals(castOther.getLastSeen()) ) )
 && ( (this.getDigest()==castOther.getDigest()) || ( this.getDigest()!=null && castOther.getDigest()!=null && this.getDigest().equals(castOther.getDigest()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getQuery() == null ? 0 : this.getQuery().hashCode() );
         result = 37 * result + ( getDb() == null ? 0 : this.getDb().hashCode() );
         result = 37 * result + (int) this.getExecCount();
         result = 37 * result + (int) this.getTotalLatency();
         result = 37 * result + (int) this.getSortMergePasses();
         result = 37 * result + ( getAvgSortMerges() == null ? 0 : this.getAvgSortMerges().hashCode() );
         result = 37 * result + (int) this.getSortsUsingScans();
         result = 37 * result + (int) this.getSortUsingRange();
         result = 37 * result + (int) this.getRowsSorted();
         result = 37 * result + ( getAvgRowsSorted() == null ? 0 : this.getAvgRowsSorted().hashCode() );
         result = 37 * result + ( getFirstSeen() == null ? 0 : this.getFirstSeen().hashCode() );
         result = 37 * result + ( getLastSeen() == null ? 0 : this.getLastSeen().hashCode() );
         result = 37 * result + ( getDigest() == null ? 0 : this.getDigest().hashCode() );
         return result;
   }   


}


