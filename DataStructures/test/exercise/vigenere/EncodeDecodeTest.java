package exercise.vigenere;

import org.junit.Assert;
import org.junit.Test;

public class EncodeDecodeTest {

	EncodeDecode en = new EncodeDecode();
	
	/**
	 * for these test cases to work we need to change the CIPHER TEXT in Properties.java file
	 */
	@Test
	public void testEncrypt() {
		String encryptedString = en.encrypt("encrypt", "top secret");
		Assert.assertEquals("xbr jcrkig", encryptedString);
	}
	
	@Test
	public void testDecrypt() {
		String decryptedString = en.decrypt("encrypt", "xbr jcrkig");
		Assert.assertEquals("top secret", decryptedString);
	}

}
