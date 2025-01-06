package com.thealgorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Random;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import com.thealgorithms.ciphers.AESEncryption;
import com.thealgorithms.ciphers.RSA;

public class ourTests {
        @Test
        void AESplusRSA() throws NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException{
        SecretKey secretKey = AESEncryption.getSecretEncryptionKey();
        byte [] encryptedData = AESEncryption.encryptText("Hello World!", secretKey);

        String AESkeyAsString = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        RSA rsa = new RSA(2048);
        String encryptedKey = rsa.encrypt(AESkeyAsString);
        //encrypterd AES key can be sent to reciver
        String decryptedKey = rsa.decrypt(encryptedKey);
        byte[] decodedKey = Base64.getDecoder().decode(decryptedKey);
        SecretKey decryptedSecretKey =  new SecretKeySpec(decodedKey, "AES");
        String decryptedData = AESEncryption.decryptText(encryptedData, decryptedSecretKey); //Needs SecretKey
        System.out.println("secret AES key: " + AESkeyAsString);
        System.out.println("decrypted key:  " + decryptedKey);
        assertEquals(AESkeyAsString, decryptedKey);
        assertEquals("Hello World!", decryptedData);
    }

    @Test
    void randomSortTesting(){
        Random random = new Random();
        int nrOfElements = random.nextInt(0,101);
        int arr [] = new int[nrOfElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE+1);
        }

    }


}
