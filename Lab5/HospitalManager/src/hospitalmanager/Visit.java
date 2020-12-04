/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanager;

import java.util.Date;

public class Visit{
    
    Date date;
    String summary;
    Doctor doctor;
    Patient patient;

    public Visit( Date d, String s, Doctor doc, Patient p ){
        date = d;
        summary = s;
        doctor = doc;
        patient = p;
    }

    public Date getDate(){
        return date;	
    }
    
    public String getSummary(){ 
        return summary;
    }
    
    public Doctor getDoctor(){ 
        return doctor;
    }
    
    public Patient getPatient(){ 
        return patient;	
    }

    public String toString(){ 
        return("Hey I am a visit");	
    }
}
