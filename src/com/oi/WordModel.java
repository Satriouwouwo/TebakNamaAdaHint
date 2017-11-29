/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oi;

import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;



public class WordModel {

    static String[] split(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String basicWord;
    private String soal;
    private String hint;
    private String jawaban;
    String getBasicWord;
    private String hint2;

    /**
     * @return the basicWord
     */
    
    
    
    
    
    public WordModel() {
    }

    public WordModel(String basicWord,String hint,String hint2) {
        this.basicWord = basicWord;
        this.hint2 = hint2;  
        this.hint = hint;
        
    }
    
    
    public String createSoal(){
        basicWord = basicWord.toUpperCase();
        String[] arrayOfWord = basicWord.split("");
        Arrays.sort(arrayOfWord);
        StringBuilder sb = new StringBuilder();
        int i =0;
        for (String string : arrayOfWord) {
            sb.append(arrayOfWord[i]);
        }   
        String soal = sb.toString();
        return soal;
       }
    
    
    public String acakHuruf(){
         basicWord = basicWord.toUpperCase();
         String[] arrayOfWord = basicWord.split("");
         List<String> hurufHuruf = Arrays.asList(arrayOfWord);
         Collections.shuffle(hurufHuruf);         
         StringBuilder sb = new StringBuilder();
         for (String huruf : hurufHuruf) {
            sb.append(huruf.trim());
        }
         return sb.toString();
    }
    
    
    public boolean cekJawaban(){
        boolean hasil = false;
        if(jawaban.equalsIgnoreCase(basicWord)){
            hasil = true;
        }
        return hasil;
    }
    
    
  
    
    
    
    
    
    public String getBasicWord() {
        return basicWord;
    }

    /**
     * @param basicWord the basicWord to set
     */
    public void setBasicWord(String basicWord) {
            this.basicWord = basicWord;
    }
    
    
    
    
    /**
     * @return the soal
     */
    public String getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.soal = soal;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    /**
     * @return the hint2
     */
    public String getHint2() {
        return hint2;
    }

    /**
     * @param hint2 the hint2 to set
     */
    public void setHint2(String hint2) {
        this.hint2 = hint2;
    }
    
}
