package de.ukoeln.idh.teaching.jml.ex09;

import org.apache.uima.cas.CASException;
import org.apache.uima.cas.Feature;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import de.ukoeln.idh.teaching.jml.ex09.types.Sentence;
import de.ukoeln.idh.teaching.jml.ex09.types.Token;

public class Main {

	static JCas jcas;

	public static void main(String[] args) throws ResourceInitializationException, CASException {
		jcas = JCasFactory.createText("The dog barks.");
		
		Sentence s1 = new Sentence(jcas, 0, 13);
		System.out.println(s1.toShortString());
		
		Token t1 = new Token(jcas, 0, 2);
//		t1.setIntValue(feat, i);
		System.out.println(t1);
		
		Token t2 = new Token(jcas, 4, 6);		
		System.out.println(t2);
		
		Token t3 = new Token(jcas, 8, 12);
		System.out.println(t3);

	}

}
