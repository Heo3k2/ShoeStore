package com.shoestoredb.entity3;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UserSummaryByFileIo generated by hbm2java
 */
@Entity
@Table(name = "user_summary_by_file_io", catalog = "sys")
public class UserSummaryByFileIo implements java.io.Serializable {

	private UserSummaryByFileIoId id;

	public UserSummaryByFileIo() {
	}

	public UserSummaryByFileIo(UserSummaryByFileIoId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "user", column = @Column(name = "user", length = 32)),
			@AttributeOverride(name = "ios", column = @Column(name = "ios", precision = 42, scale = 0)),
			@AttributeOverride(name = "ioLatency", column = @Column(name = "io_latency", length = 11)) })
	public UserSummaryByFileIoId getId() {
		return this.id;
	}

	public void setId(UserSummaryByFileIoId id) {
		this.id = id;
	}

}
