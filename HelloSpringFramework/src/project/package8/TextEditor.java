package project.package8;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	public TextEditor() {
		System.out.println("Inside TextEditor simple constructor.");
	}
	
	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor parameterized constructor.");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
}
