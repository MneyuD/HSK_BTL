package entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class HoaDon {
	private String maHD;
	private LocalDateTime ngayLapHD;
	private String maBan;
	private LocalDateTime gioRa;
	private Double chiPhiKhac;
	private Enum_PhuongThucTT pttt;
	public HoaDon(String maHD, LocalDateTime ngayLapHD, String maBan, LocalDateTime gioRa, Double chiPhiKhac,
			Enum_PhuongThucTT pttt) {
		super();
		this.maHD = maHD;
		this.ngayLapHD = ngayLapHD;
		this.maBan = maBan;
		this.gioRa = gioRa;
		this.chiPhiKhac = chiPhiKhac;
		this.pttt = pttt;
	}
	public HoaDon(String maHD) {
		super();
		this.maHD = maHD;
	}
	/**
	 * @return the maHD
	 */
	public String getMaHD() {
		return maHD;
	}
	/**
	 * @param maHD the maHD to set
	 */
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	/**
	 * @return the ngayLapHD
	 */
	public LocalDateTime getNgayLapHD() {
		return ngayLapHD;
	}
	/**
	 * @param ngayLapHD the ngayLapHD to set
	 */
	public void setNgayLapHD(LocalDateTime ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	/**
	 * @return the maBan
	 */
	public String getMaBan() {
		return maBan;
	}
	/**
	 * @param maBan the maBan to set
	 */
	public void setMaBan(String maBan) {
		this.maBan = maBan;
	}
	/**
	 * @return the gioRa
	 */
	public LocalDateTime getGioRa() {
		return gioRa;
	}
	/**
	 * @param gioRa the gioRa to set
	 */
	public void setGioRa(LocalDateTime gioRa) {
		this.gioRa = gioRa;
	}
	/**
	 * @return the chiPhiKhac
	 */
	public Double getChiPhiKhac() {
		return chiPhiKhac;
	}
	/**
	 * @param chiPhiKhac the chiPhiKhac to set
	 */
	public void setChiPhiKhac(Double chiPhiKhac) {
		this.chiPhiKhac = chiPhiKhac;
	}
	/**
	 * @return the pttt
	 */
	public Enum_PhuongThucTT getPttt() {
		return pttt;
	}
	/**
	 * @param pttt the pttt to set
	 */
	public void setPttt(Enum_PhuongThucTT pttt) {
		this.pttt = pttt;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maHD);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(maHD, other.maHD);
	}
	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", ngayLapHD=" + ngayLapHD + ", maBan=" + maBan + ", gioRa=" + gioRa
				+ ", chiPhiKhac=" + chiPhiKhac + ", pttt=" + pttt + "]";
	}
	
	

}
