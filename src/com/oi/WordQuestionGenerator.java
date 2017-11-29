/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oi;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class WordQuestionGenerator {
    
    
public static List<WordModel> getFile() {
    List<WordModel> bankSoal = new ArrayList<>();
        
    try {
        Scanner scan;
        scan = new Scanner(new File("E:/SoalGameAcak.txt"));
        while(scan.hasNextLine()){
            String namaString = scan.nextLine();
            String[] data = namaString.split(",");
            String kataAwal = data[0].trim();
            String kataHint = data[1].trim();
            String kataHint2 = data[2].trim();
            
            WordModel wm = new WordModel(kataAwal,kataHint,kataHint2);
            bankSoal.add(wm);
        }
        
        for (WordModel wordModel : bankSoal) {
            System.out.println(wordModel.getBasicWord()+ " " + wordModel.getHint() + " "+ wordModel.getHint2()+ " " + wordModel.acakHuruf());
        }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(WordQuestionGenerator.class.getName()).log(Level.SEVERE, null, ex);
    }
    return bankSoal;
            
}


}
