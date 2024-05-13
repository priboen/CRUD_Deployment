package com.adrikhamid.tugas_deployb.service;

import com.adrikhamid.tugas_deployb.Datamahasiswa;
import com.adrikhamid.tugas_deployb.repository.DataMahasiswaRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DataMahasiswaImpl implements DataMahasiswaService{
    
    @Autowired
    private DataMahasiswaRepository dataMahasiswaRepository;

    @Override
    public List<Datamahasiswa> getAllDataMahasiswa() {
        return dataMahasiswaRepository.findAll();
    }

    @Override
    public void saveDataMahasiswa(Datamahasiswa datamahasiswa) {
        this.dataMahasiswaRepository.save(datamahasiswa);
    }

    @Override
    public Datamahasiswa getDataMahasiswaById(Integer id) {
        Optional<Datamahasiswa> optional = dataMahasiswaRepository.findById(id);
        Datamahasiswa datamahasiswa = null;
        if(optional.isPresent()){
            datamahasiswa = optional.get();
        }else{
            throw new RuntimeException("Data Mahasiswa not found for id :: " + id);
        }
        return datamahasiswa;
    }

    @Override
    public void deleteDataMahasiswa(Integer id) {
        this.dataMahasiswaRepository.deleteById(id);
    }
}
