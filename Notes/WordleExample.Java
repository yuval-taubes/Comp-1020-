public class WordleExample {
    public static void main(String[] args) {
        String theWordle = "\tWordle#1318:SHUNT\n".trim();
        int start = theWordle.replaceAll("Wordle", " ").indexOf("#");
        String[] parts = theWordle.split(":");
        String section = theWordle.substring(start + 11);
        int output = (section.toLowerCase()).compareTo(parts[1].toLowerCase());
        System.out.println(output);
    }
}