/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.adrikhamid.tugas_deployb.service;

import com.adrikhamid.tugas_deployb.Datamahasiswa;
import java.util.List;

/**
 *
 * @author A S U S
 */
public interface DataMahasiswaService {
    List<Datamahasiswa> getAllDataMahasiswa();
     void saveDataMahasiswa(Datamahasiswa datamahasiswa);
    Datamahasiswa getDataMahasiswaById(Integer id);
    void deleteDataMahasiswa(Integer id);
}
