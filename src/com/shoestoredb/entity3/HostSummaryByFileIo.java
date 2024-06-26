package com.shoestoredb.entity3;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * HostSummaryByFileIo generated by hbm2java
 */
@Entity
@Table(name = "host_summary_by_file_io", catalog = "sys")
public class HostSummaryByFileIo implements java.io.Serializable {

	private HostSummaryByFileIoId id;

	public HostSummaryByFileIo() {
	}

	public HostSummaryByFileIo(HostSummaryByFileIoId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "host", column = @Column(name = "host")),
			@AttributeOverride(name = "ios", column = @Column(name = "ios", precision = 42, scale = 0)),
			@AttributeOverride(name = "ioLatency", column = @Column(name = "io_latency", length = 11)) })
	public HostSummaryByFileIoId getId() {
		return this.id;
	}

	public void setId(HostSummaryByFileIoId id) {
		this.id = id;
	}

}
