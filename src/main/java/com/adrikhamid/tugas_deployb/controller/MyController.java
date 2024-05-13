/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adrikhamid.tugas_deployb.controller;

import com.adrikhamid.tugas_deployb.Datamahasiswa;
import com.adrikhamid.tugas_deployb.service.DataMahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author A S U S
 */
@Controller
public class MyController {
    
    @Autowired
    private DataMahasiswaService dataMahasiswaService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        Datamahasiswa dataMahasiswa = new Datamahasiswa();
        model.addAttribute("dataMahasiswa", dataMahasiswa);
        model.addAttribute("listDataMahasiswa", dataMahasiswaService.getAllDataMahasiswa());
        return "index";
    }

    @PostMapping("/saveDataMahasiswa")
    public String saveDataMahasiswa(@ModelAttribute("dataMahasiswa") Datamahasiswa dataMahasiswa){
        dataMahasiswaService.saveDataMahasiswa(dataMahasiswa);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Integer id, Model model){
        Datamahasiswa dataMahasiswa = dataMahasiswaService.getDataMahasiswaById(id);
        model.addAttribute("dataMahasiswa", dataMahasiswa);
        model.addAttribute("listDataMahasiswa", dataMahasiswaService.getAllDataMahasiswa());
        return "update_datamahasiswa";
    }

    @GetMapping("/deleteDataMahasiswa/{id}")
    public String deleteDataMahasiswa(@PathVariable(value = "id") Integer id){
        this.dataMahasiswaService.deleteDataMahasiswa(id);
        return "redirect:/";
    }
}
