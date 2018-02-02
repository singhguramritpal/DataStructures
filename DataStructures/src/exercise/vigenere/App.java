package exercise.vigenere;

public class App {

	public static void main(String args[]) {

		 if (args.length != 3) {
		 	System.out.println("Exact 3 parameters required - [action] [key] [target]");
		 	System.exit(1);
		 }

		 Properties.action = args[0];
		 Properties.key = args[1];
		 Properties.target = args[2];

		EncodeDecode cipher = new EncodeDecode();
		ReadDirectory rd = new ReadDirectory();

		if ("encrypt".equalsIgnoreCase(Properties.action)) {
			System.out.println("encrypt [" + Properties.key + "], [" + Properties.target + "]");
			String encryptedString = cipher.encrypt(Properties.key, Properties.target);
			System.out.println(encryptedString);
		} else if ("decrypt".equalsIgnoreCase(Properties.action)) {
			System.out.println("decrypt [" + Properties.key + "], [" + Properties.target + "]");
			String decryptedString = cipher.decrypt(Properties.key, Properties.target);
			System.out.println(decryptedString);
		} else if ("encryptDir".equalsIgnoreCase(Properties.action)) {
			System.out.println("encryptDir [" + Properties.key + "], [" + Properties.target + "]");
			rd.createEncryptionDirectory(Properties.key, Properties.target);
		} else if ("decryptDir".equalsIgnoreCase(Properties.action)) {
			System.out.println("decryptDir [" + Properties.key + "], [" + Properties.target + "]");
			rd.createDecryptionDirectory(Properties.key, Properties.target);
		} else {
			System.out.println("action [" + Properties.action + "] not implemented");
		}

	}
}