
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
public class ClinicalAnalysis extends ClinicalRecords {

  
   public void displayValues(){
          
   }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ClinicalAnalysis patient = new ClinicalAnalysis();
        ConvertRecords patient1 = new ConvertRecords();
        AnalysingData patient2 = new AnalysingData();
        double[][] patientRecords = new double[10][2];
        
        for(int i=0;i<10;i++){
            patientRecords[i][0]= patient1.getHeamoglobinLevel();
            patientRecords[i][1]= patient1.getESRLevel();
        }
        
        //displaying the values 
       System.out.println("Here are the list of patients numbers, thier blood heamoglobin levels and ESR level");
        System.out.format("%s \t %s \t %s %n","Patient Id", "Heamoglobin range","ESR Range");
        for(int i=0 ;i<10;i++){
            System.out.format("%4d \t\t %.2f \t\t\t %.2f %n",i+1,patientRecords[i][1],patientRecords[i][1]);
        } 
        
         for(int i=0;i<10;i++){
            patientRecords[i][0]= patient1.convertHeamoglobinValue(patientRecords[i][0]);
            patientRecords[i][1]= patient1.convertESRValue(patientRecords[i][1]);
        }
       
        System.out.println(""); 
        System.out.format("%s \t %s \t %s %n","Patient Id", "Heamoglobin range","ESR Range");
        for(int i=0 ;i<10;i++){
            System.out.format("%4d \t\t %.2f \t\t\t %.2f %n",i+1,patientRecords[i][0],patientRecords[i][1]);
        }
        
        patient2.sorting(patientRecords);
       
    }
        
       
    }
    

