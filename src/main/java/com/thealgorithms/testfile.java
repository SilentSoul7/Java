package com.thealgorithms;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.thealgorithms.ciphers.AESEncryption;
import com.thealgorithms.ciphers.RSA;
import com.thealgorithms.sorts.*;

public class testfile {

    public static void main(String[] args) throws NoSuchAlgorithmException {

    }

    private void quickSort(){
        Integer[] array = {34, 7, 23, 32, 5, 62};
        SortAlgorithm a = new QuickSort();
        Integer[] sorted = a.sort(array);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    } 

}
