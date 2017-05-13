package project.package11;

public class TextEditor {
	
	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor parameterized constructor.");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
}
