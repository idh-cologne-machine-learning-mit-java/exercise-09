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
		
		Sentence sentence = new Sentence(jcas, 0, 14);
		sentence.setID(0);
		sentence.addToIndexes();
		
		Token token;
		
		token = new Token(jcas, 0, 3);
		token.setID(0);
		token.addToIndexes();
		
		token = new Token(jcas, 4, 7);
		token.setID(1);
		token.addToIndexes();
		
		token = new Token(jcas, 8, 13);
		token.setID(2);
		token.addToIndexes();
		
		token = new Token(jcas, 13, 14);
		token.setID(2);
		token.addToIndexes();
	}

}
