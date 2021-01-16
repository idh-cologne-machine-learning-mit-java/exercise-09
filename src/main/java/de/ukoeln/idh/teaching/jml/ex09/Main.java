package de.ukoeln.idh.teaching.jml.ex09;

import org.apache.uima.cas.CASException;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import de.ukoeln.idh.teaching.jml.ex09.types.Sentence;
import de.ukoeln.idh.teaching.jml.ex09.types.Token;

public class Main {

	static JCas jcas;

	public static void main(String[] args) throws ResourceInitializationException, CASException {
		jcas = JCasFactory.createText("The dog barks.");
		
		Sentence satz = new Sentence(jcas);
		satz.setBegin(0);
		satz.setEnd(jcas.getDocumentText().length() - 1);
		//int index = satz.getBegin();
		
		Token token1 = new Token(jcas);
		token1.setBegin(0);
		//System.out.println(index);
		token1.setEnd(2);
		//System.out.println(index);
		
		//index++;
		Token token2 = new Token(jcas);
		token2.setBegin(4);
		token2.setEnd(4);
		
		Token token3 = new Token(jcas);
		token3.setBegin(8);
		token3.setEnd(12);
		

	}

}
