package com.saifiahmada.spring.repositroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saifiahmada.spring.domain.Pegawai;

@Repository
public interface PegawaiRepository extends JpaRepository<Pegawai, Long> {

}
