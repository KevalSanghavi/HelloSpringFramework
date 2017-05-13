package project.package3;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	public TextEditor() {
		System.out.println("Inside TextEditor constructor." );
	}
	
	public SpellChecker getSpellChecker() {
		System.out.println("Inside getSpellChecker." );
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker." );
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
}
