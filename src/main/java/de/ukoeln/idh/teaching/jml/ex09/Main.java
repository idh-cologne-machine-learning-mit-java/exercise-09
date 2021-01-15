package de.ukoeln.idh.teaching.jml.ex09;

import org.apache.uima.cas.CASException;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import org.apache.uima.jcas.tcas.Annotation;
import de.ukoeln.idh.teaching.jml.ex09.types.Sentence;
import de.ukoeln.idh.teaching.jml.ex09.types.Token;

public class Main {

	static JCas jcas;

	public static void main(String[] args) throws ResourceInitializationException, CASException {
		//I cannot test whether any of this works, as it throws an exception 
		//telling me that I've not declared the types
		//yet, they're generated 

		//possibly bc I am not using Eclipse?
		//couldn't find a solution in the docs either
		//._.

		//validated the XML typedescription
		//no errors found
		
		jcas = JCasFactory.createText("The dog barks.");
		Sentence sent = new Sentence(jcas);
		sent.setBegin(0);
		sent.setEnd(jcas.getDocumentText().length()-1);
		System.out.println(sent.getCoveredText());

		Token tok = new Token(jcas);
		tok.setBegin(0);
		tok.setEnd(0);

		Token toke = new Token(jcas);
		toke.setBegin(1);
		toke.setEnd(1);

		Token token = new Token(jcas);
		token.setBegin(2);
		token.setEnd(2);

		

	}

}
