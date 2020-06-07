package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncodding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "Ç";
		System.out.println(s.codePointAt(0));			// unicode
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + " " + charset.displayName());
		String sNovo = new String (bytes, "windows-1252");
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length + " UTF-16");
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + " US_ASCII");		
	}
}
