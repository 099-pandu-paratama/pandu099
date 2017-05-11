
package com.toy.anagrams.lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;

public class Run {
     public static void main(String[] args) {

       HashMap<String, e_KTP> a = new HashMap<String, e_KTP>();
		a.put("andrew",new e_KTP("Rt: 03","kel: kellyRoar","andrew",114));
                a.put("carrol",new e_KTP("Rt: 03","kel: kellyRoar","carrol",127));
                a.put("jessie",new e_KTP("Rt: 03","kel: kellyRoar","jessie",111));
                a.put("mclaud",new e_KTP("Rt: 03","kel: kellyRoar","mclaud",154));
                
                a.put("abu bakar",new e_KTP("Rt: 05","kel: Al-Amin","sidik",119));
                a.put("abdullah",new e_KTP("Rt: 05","kel: Al-Amin","umar",115));
                a.put("aisyah",new e_KTP("Rt: 05","kel: Al-Amin","aisyah",122));
                a.put("muhammad",new e_KTP("Rt: 05","kel: Al-Amin","foorqon",112));
                
                a.put("andi",new e_KTP("Rt: 10","kel: salak","andi",125));
                a.put("david",new e_KTP("Rt: 10","kel: salak","david",103));
                a.put("bagas",new e_KTP("Rt: 10","kel: salak","bagas",110));
                a.put("kiki",new e_KTP("Rt: 10","kel: salak","kiki",129));
                
                a.put("rettno",new e_KTP("Rt: 12","kel: G.kidul","rettno",164));
                a.put("tejo",new e_KTP("Rt: 12","kel: G.kidul","tejo",147));
                a.put("paijo",new e_KTP("Rt: 12","kel: G.kidul","paijo",121));
                a.put("astuti",new e_KTP("Rt: 12","kel: G.kidul","astuti",126));
                
                {System.err.println("nama  : pandu yudha pratama");
                 System.err.println("nim :201610370311099");}
                
                {System.err.println("\n List Of Residents e-KTP \n");}
                
                {System.err.println("before sort");
                for(e_KTP x : a.values()){
			System.out.println(x.getRt()+ "\t" + " "+x.getKel()+"\t nama : "+x.getNama()+"\t  noKtp : "+x.getKtp());}} 

                
        ArrayList<e_KTP> QQ = new ArrayList<e_KTP>(a.values());
        Collections.sort(QQ, new Comparator<e_KTP>() {
        public int compare(e_KTP kecil, e_KTP besar) {
        return kecil.getKtp() - besar.getKtp();
        }});
     {System.err.println("After sort");}
    for (e_KTP x : QQ) {
    System.out.println(x.getRt()+ "\t" + " "+x.getKel()+"\t nama : "+x.getNama()+"\t  noKtp : "+x.getKtp());
    }}}
