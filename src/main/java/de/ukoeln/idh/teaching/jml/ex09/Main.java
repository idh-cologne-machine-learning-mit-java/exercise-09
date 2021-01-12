package de.ukoeln.idh.teaching.jml.ex09;

import org.apache.uima.cas.CASException;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import de.ukoeln.idh.teaching.jml.ex09.types.Token;
import de.ukoeln.idh.teaching.jml.ex09.types.Sentence;

public class Main {

	static JCas jcas;

	public static void main(String[] args) throws ResourceInitializationException, CASException {
		jcas = JCasFactory.createText("The dog barks.");
		
		Sentence s = new Sentence(jcas);
		s.setBegin(0);
		s.setEnd(jcas.getDocumentText().length() - 1);
		
		Token t1 = new Token(jcas);
		t1.setBegin(0);
		t1.setEnd(2);
		
    Token t2 = new Token(jcas);
    t2.setBegin(4);
    t2.setEnd(6);
    
    Token t3 = new Token(jcas);
    t3.setBegin(8);
    t3.setEnd(12);
	}

}
