import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-data',
  templateUrl: './data.component.html',
  styleUrl: './data.component.css'
})
export class DataComponent {

  showTable: boolean=false;

  toggleTable(){
    this.showTable=!this.showTable;
  }

  DataArray : any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;

  name:string="";
  city: string="";
  mobile:Number=0;
  email:string="";

  currentDataID=" ";
    
  constructor(private http: HttpClient) 
  {

    this.getAllData();
  }

  getAllData()
  {
    
    this.http.get("http://localhost:8085/api/v1/data/getAllData")
  
    .subscribe((resultData: any)=>
    {
        this.isResultLoaded = true;
        console.log(resultData);
        this.DataArray = resultData;
    });
  }
 
  register()
  {
  
    let bodyData = {
      "dataname" : this.name,
      "datacity" : this.city,
      "mobile" : this.mobile,
      "email" : this.email
    };
 
    this.http.post("http://localhost:8085/api/v1/data/save",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Data entered Successfully");
        this.getAllData();
        this.name = '';
      this.city = '';
        this.mobile  = 0;
        this.email = '';
    });
  }
  setUpdate(data: any)
  {
   this.name = data.dataname;
   this.city = data.datacity;
   this.mobile = data.mobile;
   this.email = data.email;
   this.currentDataID = data.dataid;
  }
 
  UpdateRecords()
  {
    let bodyData = {
      "dataid" : this.currentDataID,
      "dataname" : this.name,
      "datacity" : this.city,
      
      "mobile" : this.mobile,
      "email" : this.email
    };
    
    this.http.put("http://localhost:8085/api/v1/data/update",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Data Updated")
        this.getAllData();
        this.name = '';
        this.city = '';
        this.mobile  = 0;
        this.email= '';
    });
  }
 
  save()
  {
    if(this.currentDataID == '')
    {
        this.register();
    }
      else
      {
       this.UpdateRecords();
      }      
 
  }
 
  setDelete(data: any)
  {
    
    
    this.http.delete("http://localhost:8085/api/v1/data/deletedata"+ "/"+ data.dataid,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Data Deleted")
        this.getAllData();
        this.name = '';
      this.city = '';
        this.mobile  = 0;
        this.email = '';
  
    });
 
  }
 }