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

	}

}