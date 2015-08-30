
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

    /**
     * @param args the command line arguments
     */
    //variable array called bloodCount with 2 rows and 10 values
    //0th row stores the blood count of heamoglobin level in female human blood
    //1st row stores the blood count of ESR level in female human blood
  
    
    
//   public void displayValues(){
//        System.out.println("Here are the list of patients numbers, thier blood heamoglobin levels and ESR level");
//        System.out.format("%s \t %s \t %s %n","Patient Id", "Heamoglobin range","ESR Range");
//        for(int i=0 ;i<10;i++){
//            System.out.format("%4d \t\t %.2f \t\t\t %.2f %n",i+1,bloodCount[0][i],bloodCount[1][i]);
//        }   
//   }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ClinicalRecords patient = new ClinicalRecords();
        double[][] patientRecords = new double[2][10];
        
        for(int i=0;i<10;i++){
            patientRecords[0][i]= patient.getHeamoglobinLevel();
            patientRecords[1][i]= patient.getESRLevel();
        }
        
        
       
    }
    
}
