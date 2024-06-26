package com.shoestoredb.entity3;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * StatementsWithFullTableScans generated by hbm2java
 */
@Entity
@Table(name = "statements_with_full_table_scans", catalog = "sys")
public class StatementsWithFullTableScans implements java.io.Serializable {

	private StatementsWithFullTableScansId id;

	public StatementsWithFullTableScans() {
	}

	public StatementsWithFullTableScans(StatementsWithFullTableScansId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "query", column = @Column(name = "query")),
			@AttributeOverride(name = "db", column = @Column(name = "db", length = 64)),
			@AttributeOverride(name = "execCount", column = @Column(name = "exec_count", nullable = false)),
			@AttributeOverride(name = "totalLatency", column = @Column(name = "total_latency", length = 11)),
			@AttributeOverride(name = "noIndexUsedCount", column = @Column(name = "no_index_used_count", nullable = false)),
			@AttributeOverride(name = "noGoodIndexUsedCount", column = @Column(name = "no_good_index_used_count", nullable = false)),
			@AttributeOverride(name = "noIndexUsedPct", column = @Column(name = "no_index_used_pct", nullable = false, precision = 24, scale = 0)),
			@AttributeOverride(name = "rowsSent", column = @Column(name = "rows_sent", nullable = false)),
			@AttributeOverride(name = "rowsExamined", column = @Column(name = "rows_examined", nullable = false)),
			@AttributeOverride(name = "rowsSentAvg", column = @Column(name = "rows_sent_avg", precision = 21, scale = 0)),
			@AttributeOverride(name = "rowsExaminedAvg", column = @Column(name = "rows_examined_avg", precision = 21, scale = 0)),
			@AttributeOverride(name = "firstSeen", column = @Column(name = "first_seen", nullable = false, length = 26)),
			@AttributeOverride(name = "lastSeen", column = @Column(name = "last_seen", nullable = false, length = 26)),
			@AttributeOverride(name = "digest", column = @Column(name = "digest", length = 64)) })
	public StatementsWithFullTableScansId getId() {
		return this.id;
	}

	public void setId(StatementsWithFullTableScansId id) {
		this.id = id;
	}

}
