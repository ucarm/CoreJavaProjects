package polyForm;

public class Field {
	private String label= "undefined";
	private Object value = "";
	private Object defaultValue= "undefined";
	
	int labelDisplayLength = 20;
	int valueDisplayLength = 30;
	
	static String nOf(String str, int nTimes) {
		StringBuilder sb= new StringBuilder();
		for(char i : str.toCharArray())
			sb.append('*');
		return sb.toString();
	}
	
	Field(String label){
		this.label= label;	
	}
	
	void setValue(Object value) {
		this.value=value;
	}
	
	void setDefaultValue(Object setDefaultValue) {
		this.defaultValue=defaultValue;
		
	}
	
	String getLabel() {
		return label;
	}
	
	String getType(){
		return "Field";
	}
	
	String getDefaultValue() {
		return defaultValue.toString();
	}
	
	String getValue() {
		String strValue= value.toString();
		if(strValue.isEmpty()) {
			return getDefaultValue();
		}
		return strValue;
	}
	String getFieldDefination() {
		return "Field [label=" + label + ", value=" + value + ", defaultValue=" + defaultValue + ", labelDisplayLength="
				+ labelDisplayLength + ", valueDisplayLength=" + valueDisplayLength + "]";
	
	}

	
	
	@Override
	public String toString() {
		return "Field [label=" + label + ", value=" + value + ", defaultValue=" + defaultValue + ", labelDisplayLength="
				+ labelDisplayLength + ", valueDisplayLength=" + valueDisplayLength + "]";
	
		}
	
	String displayLabel() {
		return getLabel()+ nOf("", labelDisplayLength - getLabel().length())+":";
	}
	
}
