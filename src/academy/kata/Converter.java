package academy.kata;

class Converter {
	public static String toRoman(int num) {
		switch(num) {
		case 1: return "I";
		case 2: return "II";
		case 3: return "III";
		case 4: return "IV";
		case 5: return "V";
		case 6: return "VI";
		case 7: return "VII";
		case 8: return "VIII";
		case 9: return "IX";
		case 10: return "X";
		default: return "error";
		}
	}
	public static int toArabic(String romanNum) {
		switch(romanNum) {
		case "I": return 1;
		case "II": return 2;
		case "III": return 3;
		case "IV": return 4;
		case "V": return 5;
		case "VI": return 6;
		case "VII": return 7;
		case "VIII": return 8;
		case "IX": return 9;
		case "X": return 10;
		default: return 0;
		}
	}
}
