public class Parser {
    public void parseArguments(String[] args) {
        try {
            String flag = args[0];
            if (flag.equals("-e")) {
                Encoder.encoder();
            } else if (flag.equals("-d")) {
                Decoder.decoder();
            } else {
                System.out.println("Invalid flag");
            }
        } finally {
            System.out.println("--Rerun the command to convert more data--");
        }
    }
}
