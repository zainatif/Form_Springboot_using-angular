package com.example.form.Controller;


import com.example.form.DTO.DataDTO;
import com.example.form.DTO.DataSaveDTO;
import com.example.form.DTO.DataUpdateDTO;
import com.example.form.Entity.Data;
import com.example.form.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/data")
public class DataController {
    @Autowired
    private DataService dataService;

    @PostMapping(path = "/save")
    public String saveData(@RequestBody DataSaveDTO dataSaveDTO){
        String id = dataService.addData(dataSaveDTO);
        return id;
    }

    @GetMapping(path="/getAllData")
    public List<DataDTO> getAllData(){
         List<DataDTO>allData=dataService.getAllData();
         return allData;
    }
    @PutMapping(path = "/update")
    public String updateData(@RequestBody DataUpdateDTO dataUpdateDTO){
        String id = dataService.updateData(dataUpdateDTO);
        return id;
    }

    @DeleteMapping(path = "/deletedata/{id}")
    public String deleteData(@PathVariable(value="id") int id){
        boolean deletedata=dataService.deleteData(id);
        return "deleted_data";
    }

}
