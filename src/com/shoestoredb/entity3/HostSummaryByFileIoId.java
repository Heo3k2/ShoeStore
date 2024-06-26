package com.shoestoredb.entity3;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HostSummaryByFileIoId generated by hbm2java
 */
@Embeddable
public class HostSummaryByFileIoId implements java.io.Serializable {

	private String host;
	private BigInteger ios;
	private String ioLatency;

	public HostSummaryByFileIoId() {
	}

	public HostSummaryByFileIoId(String host, BigInteger ios, String ioLatency) {
		this.host = host;
		this.ios = ios;
		this.ioLatency = ioLatency;
	}

	@Column(name = "host")
	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Column(name = "ios", precision = 42, scale = 0)
	public BigInteger getIos() {
		return this.ios;
	}

	public void setIos(BigInteger ios) {
		this.ios = ios;
	}

	@Column(name = "io_latency", length = 11)
	public String getIoLatency() {
		return this.ioLatency;
	}

	public void setIoLatency(String ioLatency) {
		this.ioLatency = ioLatency;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HostSummaryByFileIoId))
			return false;
		HostSummaryByFileIoId castOther = (HostSummaryByFileIoId) other;

		return ((this.getHost() == castOther.getHost()) || (this.getHost() != null && castOther.getHost() != null
				&& this.getHost().equals(castOther.getHost())))
				&& ((this.getIos() == castOther.getIos()) || (this.getIos() != null && castOther.getIos() != null
						&& this.getIos().equals(castOther.getIos())))
				&& ((this.getIoLatency() == castOther.getIoLatency()) || (this.getIoLatency() != null
						&& castOther.getIoLatency() != null && this.getIoLatency().equals(castOther.getIoLatency())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHost() == null ? 0 : this.getHost().hashCode());
		result = 37 * result + (getIos() == null ? 0 : this.getIos().hashCode());
		result = 37 * result + (getIoLatency() == null ? 0 : this.getIoLatency().hashCode());
		return result;
	}

}
