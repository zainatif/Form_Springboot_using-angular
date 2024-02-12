package com.example.form.Service;

import com.example.form.DTO.DataDTO;
import com.example.form.DTO.DataSaveDTO;
import com.example.form.DTO.DataUpdateDTO;

import java.util.List;

public interface DataService {
    String addData(DataSaveDTO dataSaveDTO);

    List<DataDTO> getAllData();

    String updateData(DataUpdateDTO dataUpdateDTO);

    boolean deleteData(int id);
}
