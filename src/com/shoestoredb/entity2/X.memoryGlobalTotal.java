package com.shoestoredb.entity2;
// Generated Apr 19, 2024, 5:25:59 PM by Hibernate Tools 5.6.15.Final


import java.math.BigInteger;

/**
 * X.memoryGlobalTotal generated by hbm2java
 */
public class X.memoryGlobalTotal  implements java.io.Serializable {


     private BigInteger totalAllocated;

    public X.memoryGlobalTotal() {
    }

    public X.memoryGlobalTotal(BigInteger totalAllocated) {
       this.totalAllocated = totalAllocated;
    }
   
    public BigInteger getTotalAllocated() {
        return this.totalAllocated;
    }
    
    public void setTotalAllocated(BigInteger totalAllocated) {
        this.totalAllocated = totalAllocated;
    }




}


