package edu.poly.spring.reponsitories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.poly.spring.models.HoaDonChiTiet;

@Repository
public interface HoaDonChiTietReponsitory extends JpaRepository<HoaDonChiTiet, Integer> {
	
	List<HoaDonChiTiet> findByHoadonNgaydat(Date ngaydat);
	List<HoaDonChiTiet> findByHoadonMaHD(Integer mahd);
}
