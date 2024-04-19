package entity;

import java.time.LocalDate;
import java.util.Objects;

public class SanPham {
	private String maSP;
	private String tenSP;
	private LocalDate ngayHetHan;
	private Double donGia;
	private Double thue;
	private Enum_KichCo kickCo ;
	private LoaiSP loaiSP;
	public SanPham(String maSP, String tenSP, LocalDate ngayHetHan, Double donGia, Double thue, Enum_KichCo kickCo,
			LoaiSP loaiSP) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.ngayHetHan = ngayHetHan;
		this.donGia = donGia;
		this.thue = thue;
		this.kickCo = kickCo;
		this.loaiSP = loaiSP;
	}
	public SanPham(String maSP) {
		super();
		this.maSP = maSP;
	}
	/**
	 * @return the maSP
	 */
	public String getMaSP() {
		return maSP;
	}
	/**
	 * @param maSP the maSP to set
	 */
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	/**
	 * @return the tenSP
	 */
	public String getTenSP() {
		return tenSP;
	}
	/**
	 * @param tenSP the tenSP to set
	 */
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	/**
	 * @return the ngayHetHan
	 */
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	/**
	 * @param ngayHetHan the ngayHetHan to set
	 */
	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	/**
	 * @return the donGia
	 */
	public Double getDonGia() {
		return donGia;
	}
	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}
	/**
	 * @return the thue
	 */
	public Double getThue() {
		return thue;
	}
	/**
	 * @param thue the thue to set
	 */
	public void setThue(Double thue) {
		this.thue = thue;
	}
	/**
	 * @return the kickCo
	 */
	public Enum_KichCo getKickCo() {
		return kickCo;
	}
	/**
	 * @param kickCo the kickCo to set
	 */
	public void setKickCo(Enum_KichCo kickCo) {
		this.kickCo = kickCo;
	}
	/**
	 * @return the loaiSP
	 */
	public LoaiSP getLoaiSP() {
		return loaiSP;
	}
	/**
	 * @param loaiSP the loaiSP to set
	 */
	public void setLoaiSP(LoaiSP loaiSP) {
		this.loaiSP = loaiSP;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maSP);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		return Objects.equals(maSP, other.maSP);
	}
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", ngayHetHan=" + ngayHetHan + ", donGia=" + donGia
				+ ", thue=" + thue + ", kickCo=" + kickCo + ", loaiSP=" + loaiSP + "]";
	}
	
	
	
	
}
