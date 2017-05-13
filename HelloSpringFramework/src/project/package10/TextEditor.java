package project.package10;

import javax.annotation.Resource;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	public TextEditor() {
		System.out.println("Inside TextEditor constructor.");
	}
	
	@Resource(name = "spellChecker")
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
}
