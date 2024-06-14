package com.shoestoredb.entity2;
// Generated Apr 19, 2024, 5:25:59 PM by Hibernate Tools 5.6.15.Final


import java.math.BigDecimal;
import java.util.Date;

/**
 * X.statementsWithErrorsOrWarningsId generated by hbm2java
 */
public class X.statementsWithErrorsOrWarningsId  implements java.io.Serializable {


     private String query;
     private String db;
     private long execCount;
     private long errors;
     private BigDecimal errorPct;
     private long warnings;
     private BigDecimal warningPct;
     private Date firstSeen;
     private Date lastSeen;
     private String digest;

    public X.statementsWithErrorsOrWarningsId() {
    }

	
    public X.statementsWithErrorsOrWarningsId(long execCount, long errors, BigDecimal errorPct, long warnings, BigDecimal warningPct, Date firstSeen, Date lastSeen) {
        this.execCount = execCount;
        this.errors = errors;
        this.errorPct = errorPct;
        this.warnings = warnings;
        this.warningPct = warningPct;
        this.firstSeen = firstSeen;
        this.lastSeen = lastSeen;
    }
    public X.statementsWithErrorsOrWarningsId(String query, String db, long execCount, long errors, BigDecimal errorPct, long warnings, BigDecimal warningPct, Date firstSeen, Date lastSeen, String digest) {
       this.query = query;
       this.db = db;
       this.execCount = execCount;
       this.errors = errors;
       this.errorPct = errorPct;
       this.warnings = warnings;
       this.warningPct = warningPct;
       this.firstSeen = firstSeen;
       this.lastSeen = lastSeen;
       this.digest = digest;
    }
   
    public String getQuery() {
        return this.query;
    }
    
    public void setQuery(String query) {
        this.query = query;
    }
    public String getDb() {
        return this.db;
    }
    
    public void setDb(String db) {
        this.db = db;
    }
    public long getExecCount() {
        return this.execCount;
    }
    
    public void setExecCount(long execCount) {
        this.execCount = execCount;
    }
    public long getErrors() {
        return this.errors;
    }
    
    public void setErrors(long errors) {
        this.errors = errors;
    }
    public BigDecimal getErrorPct() {
        return this.errorPct;
    }
    
    public void setErrorPct(BigDecimal errorPct) {
        this.errorPct = errorPct;
    }
    public long getWarnings() {
        return this.warnings;
    }
    
    public void setWarnings(long warnings) {
        this.warnings = warnings;
    }
    public BigDecimal getWarningPct() {
        return this.warningPct;
    }
    
    public void setWarningPct(BigDecimal warningPct) {
        this.warningPct = warningPct;
    }
    public Date getFirstSeen() {
        return this.firstSeen;
    }
    
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }
    public Date getLastSeen() {
        return this.lastSeen;
    }
    
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }
    public String getDigest() {
        return this.digest;
    }
    
    public void setDigest(String digest) {
        this.digest = digest;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.statementsWithErrorsOrWarningsId) ) return false;
		 X.statementsWithErrorsOrWarningsId castOther = ( X.statementsWithErrorsOrWarningsId ) other; 
         
		 return ( (this.getQuery()==castOther.getQuery()) || ( this.getQuery()!=null && castOther.getQuery()!=null && this.getQuery().equals(castOther.getQuery()) ) )
 && ( (this.getDb()==castOther.getDb()) || ( this.getDb()!=null && castOther.getDb()!=null && this.getDb().equals(castOther.getDb()) ) )
 && (this.getExecCount()==castOther.getExecCount())
 && (this.getErrors()==castOther.getErrors())
 && ( (this.getErrorPct()==castOther.getErrorPct()) || ( this.getErrorPct()!=null && castOther.getErrorPct()!=null && this.getErrorPct().equals(castOther.getErrorPct()) ) )
 && (this.getWarnings()==castOther.getWarnings())
 && ( (this.getWarningPct()==castOther.getWarningPct()) || ( this.getWarningPct()!=null && castOther.getWarningPct()!=null && this.getWarningPct().equals(castOther.getWarningPct()) ) )
 && ( (this.getFirstSeen()==castOther.getFirstSeen()) || ( this.getFirstSeen()!=null && castOther.getFirstSeen()!=null && this.getFirstSeen().equals(castOther.getFirstSeen()) ) )
 && ( (this.getLastSeen()==castOther.getLastSeen()) || ( this.getLastSeen()!=null && castOther.getLastSeen()!=null && this.getLastSeen().equals(castOther.getLastSeen()) ) )
 && ( (this.getDigest()==castOther.getDigest()) || ( this.getDigest()!=null && castOther.getDigest()!=null && this.getDigest().equals(castOther.getDigest()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getQuery() == null ? 0 : this.getQuery().hashCode() );
         result = 37 * result + ( getDb() == null ? 0 : this.getDb().hashCode() );
         result = 37 * result + (int) this.getExecCount();
         result = 37 * result + (int) this.getErrors();
         result = 37 * result + ( getErrorPct() == null ? 0 : this.getErrorPct().hashCode() );
         result = 37 * result + (int) this.getWarnings();
         result = 37 * result + ( getWarningPct() == null ? 0 : this.getWarningPct().hashCode() );
         result = 37 * result + ( getFirstSeen() == null ? 0 : this.getFirstSeen().hashCode() );
         result = 37 * result + ( getLastSeen() == null ? 0 : this.getLastSeen().hashCode() );
         result = 37 * result + ( getDigest() == null ? 0 : this.getDigest().hashCode() );
         return result;
   }   


}


