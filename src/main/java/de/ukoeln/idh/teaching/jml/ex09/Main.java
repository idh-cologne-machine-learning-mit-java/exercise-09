package de.ukoeln.idh.teaching.jml.ex09;

import org.apache.uima.cas.CASException;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;

import de.ukoeln.idh.teaching.jml.ex09.types.Sentence;
import de.ukoeln.idh.teaching.jml.ex09.types.Token;

public class Main {

	static JCas jcas;

	public static void main(String[] args) throws ResourceInitializationException, CASException {
		jcas = JCasFactory.createText("The dog barks.");

		Sentence sentence = new Sentence(jcas);
		set(sentence, 0, jcas.getDocumentText().length());
		
		////////////
		
		Token firstToken = new Token(jcas);		// The
		set(firstToken, sentence.getBegin(), 3);
		
		Token secondToken = new Token(jcas);	// dog
		set(secondToken, firstToken.getEnd()+1, 7);
		
		Token thirdToken = new Token(jcas);		// barks
		set(thirdToken, secondToken.getEnd()+1, 13);
		
		Token fourthToken = new Token(jcas);	// .
		set(fourthToken, thirdToken.getEnd(), sentence.getEnd());
	}
	
	private static void set(Annotation a, int begin, int end) {
		a.setBegin(begin);
		a.setEnd(end);
	}

}
