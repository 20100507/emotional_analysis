package org.bianqi.utils;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.codec.binary.Base64;
/**
 * <p>Title: EncryptUtils</p>
 * <p>Description: 核心解密工具</p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月2日下午12:00:32
 * @version 1.0.0
 */
public class EncryptUtils {
	
	public static String aesEncrypt(String value, String key) throws Exception {
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getBytes("UTF-8"), "AES"),
				new IvParameterSpec("0102030405060708".getBytes("UTF-8")));
		return Base64.encodeBase64String(cipher.doFinal(value.getBytes()));
	}

	public static String rsaEncrypt(String value) throws UnsupportedEncodingException {
		value = new StringBuilder(value).reverse().toString();
		BigInteger valueInt = hexToBigInteger(stringToHex(value));
		BigInteger pubkey = hexToBigInteger("010001");
		BigInteger modulus = hexToBigInteger(
				"00e0b509f6259df8642dbc35662901477df22677ec152b5ff68ace615bb7b725152b3ab17a876aea8a5aa76d2e417629ec4ee341f56135fccf695280104e0312ecbda92557c93870114af6c9d05c4f7f0c3685b7a46bee255932575cce10b424d813cfe4875d3e82047b97ddef52741d546b8e289dc6935b3ece0462db0a22b8e7");
		return valueInt.modPow(pubkey, modulus).toString(16);
	}

	public static BigInteger hexToBigInteger(String hex) {
		return new BigInteger(hex, 16);
	}

	public static String stringToHex(String text) throws UnsupportedEncodingException {
		return DatatypeConverter.printHexBinary(text.getBytes("UTF-8"));
	}

	public static String stampToDate(long stamp) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(stamp));
	}
}
