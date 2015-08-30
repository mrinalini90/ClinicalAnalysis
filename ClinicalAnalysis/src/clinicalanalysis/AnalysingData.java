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
public class AnalysingData {

public AnalysingData(){
}

public void sorting(double[][] record){
    for(int a=0;a<record.length;a++){
              if((record[a][0]==1)&&(record[a][1]==0)){
                  System.out.println((a+1)+ "   The patient tends to have abnormal ESR rate");       
              }
              else if((record[a][0]==0)&&(record[a][1]==1)){
                  System.out.println((a+1)+ "   The patient suspected to have abnormal Heamoglobin rate");       
              }
              else if((record[a][0]==1)&&(record[a][1]==1)){
                  System.out.println((a+1)+ "   The patient tends to have normal ESR and heamoglobin levels in the blood ");       
              }else{
                  System.out.println((a+1)+ "   The patient is suspected to have abnormal ESR and heamoglobin levels in the blood ");       
              }
      }
}

}
