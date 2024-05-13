/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adrikhamid.tugas_deployb;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 *
 * @author A S U S
 */
@Entity
@Table(name = "datamahasiswa")
@NamedQueries({
    @NamedQuery(name = "Datamahasiswa.findAll", query = "SELECT d FROM Datamahasiswa d"),
    @NamedQuery(name = "Datamahasiswa.findById", query = "SELECT d FROM Datamahasiswa d WHERE d.id = :id"),
    @NamedQuery(name = "Datamahasiswa.findByNim", query = "SELECT d FROM Datamahasiswa d WHERE d.nim = :nim"),
    @NamedQuery(name = "Datamahasiswa.findByName", query = "SELECT d FROM Datamahasiswa d WHERE d.name = :name"),
    @NamedQuery(name = "Datamahasiswa.findByProdi", query = "SELECT d FROM Datamahasiswa d WHERE d.prodi = :prodi")})
public class Datamahasiswa implements Serializable {

    @Id

    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nim")
    private String nim;
    @Column(name = "name")
    private String name;
    @Column(name = "prodi")
    private String prodi;

    public Datamahasiswa() {
    }

    public Datamahasiswa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datamahasiswa)) {
            return false;
        }
        Datamahasiswa other = (Datamahasiswa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adrikhamid.tugas_deployb.Datamahasiswa[ id=" + id + " ]";
    }
    
}
