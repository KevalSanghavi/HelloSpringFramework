package project.package5;

public class TextEditor {
	
	private SpellChecker spellChecker;
	private String name;
	
	public TextEditor() {
		System.out.println("Inside TextEditor simple constructor.");
	}
	
	public TextEditor(SpellChecker spellChecker, String name) {
		System.out.println("Inside TextEditor parameterized constructor.");
		this.spellChecker = spellChecker;
		this.name = name;
	}
	
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
}
