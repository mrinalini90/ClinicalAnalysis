
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicalanalysis;
import java.util.*;
/**
 *
 * @author mrinalini
 */
public class ClinicalRecords {
  
 private double heamoglobin,esr;
 public ClinicalRecords(){
 }
 
 public double getHeamoglobinLevel(){
            Random r = new Random();  
            // creates a data for 10 patients heamoglobin levels
            heamoglobin= 7+(r.nextDouble()*(18 - 7));
            //rouding of the last to digits
            heamoglobin=Math.round(heamoglobin*100.0)/100.0;
                
        return heamoglobin;
 }
 
 public double getESRLevel(){
      Random r = new Random();  
            // creates a data for 10 patients heamoglobin levels
            esr= 7+(r.nextDouble()*(18 - 7));
            //rouding of the last to digits
            esr=Math.round(esr*100.0)/100.0;
                
        return esr;
 }
 
}
