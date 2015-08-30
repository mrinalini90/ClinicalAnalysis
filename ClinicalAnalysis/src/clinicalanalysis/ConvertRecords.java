/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicalanalysis;

/**
 *
 * @author mrinalini
 */
public class ConvertRecords extends ClinicalRecords {
 
private double heamoglobinValue,esrValue;
public ConvertRecords(){
} 

public double convertHeamoglobinValue(double heamoglobinValue){
this.heamoglobinValue= heamoglobinValue;
if((heamoglobinValue>12)&&(heamoglobinValue<16)){
               return 1;
            }else{
               return 0;
            }
}

public double convertESRValue(double esrValue){
this.esrValue= esrValue;
if((esrValue>0)&&(esrValue<20)){
               return 1;
            }else{
               return 0;
            }
}
}
