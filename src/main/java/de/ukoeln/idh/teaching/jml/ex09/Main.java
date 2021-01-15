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
		
		Sentence sentence = new Sentence(jcas);
		sentence.setBegin(0);
		sentence.setEnd(jcas.getDocumentText().length() - 1);
		
		Token token1 = new Token(jcas);
		token1.setBegin(0);
		token1.setEnd(2);
		
		Token token2 = new Token(jcas);
		token2.setBegin(4);
		token2.setEnd(6);
		
		Token token3 = new Token(jcas);
		token3.setBegin(8);
		token3.setEnd(12);
		
		
		Token token4 = new Token(jcas);
		token4.setBegin(13);
		token4.setEnd(13);

	}

}
