/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toy.anagrams.lib;

/**
 *
 * @author Panduan
 */
public class Generric<A> {
	private A[] oooo = (A[])new Object[20]; 
	private int index;
	public void add(A x){
		oooo[index]= x;
		index++;
	}
	public A get(int i){
		return oooo[i];
	}
}

    

