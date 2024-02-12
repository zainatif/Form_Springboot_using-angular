package com.example.form.Service;

import com.example.form.DTO.DataDTO;
import com.example.form.DTO.DataSaveDTO;
import com.example.form.DTO.DataUpdateDTO;
import com.example.form.Entity.Data;
import com.example.form.Repo.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataIMPLService implements DataService{

    @Autowired
    private DataRepo dataRepo;
    @Override
    public String addData(DataSaveDTO dataSaveDTO) {

        Data data = new Data(
                dataSaveDTO.getDataname(),dataSaveDTO.getDatacity(),dataSaveDTO.getMobile(),dataSaveDTO.getEmail());

    dataRepo.save(data);
    return data.getDataname();
    }

    @Override
    public List<DataDTO> getAllData() {
        List<Data> getData = dataRepo.findAll();
        List<DataDTO> dataDTOList=new ArrayList<>();
        for(Data a:getData)
        {
            DataDTO dataDTO = new DataDTO(
                    a.getDataid(),
                    a.getDataname(),
                    a.getDatacity(),
                    a.getMobile(),
                    a.getEmail()
            );
            dataDTOList.add(dataDTO);
        }
        return dataDTOList;
    }

    @Override
    public String updateData(DataUpdateDTO dataUpdateDTO) {
         if(dataRepo.existsById(dataUpdateDTO.getDataid()))
         {
             Data data=dataRepo.getById(dataUpdateDTO.getDataid());
             data.setDataname(dataUpdateDTO.getDataname());
             data.setDatacity(dataUpdateDTO.getDatacity());
             data.setMobile(dataUpdateDTO.getMobile());
             data.setEmail(dataUpdateDTO.getEmail());
             dataRepo.save(data);
         }
         else{
             System.out.println("invalid Data ID");
         }
         return null;
    }

    @Override
    public boolean deleteData(int id) {
        if(dataRepo.existsById(id))
        {
            dataRepo.deleteById(id);
        }
        else{
            System.out.println("invalid ID");
        }
        return true;
    }
}
