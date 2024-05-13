/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.adrikhamid.tugas_deployb.repository;

import com.adrikhamid.tugas_deployb.Datamahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author A S U S
 */
@Repository
public interface DataMahasiswaRepository extends JpaRepository<Datamahasiswa, Integer> {
    
}
