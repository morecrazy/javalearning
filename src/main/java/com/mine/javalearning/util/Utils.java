package com.mine.javalearning.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Utils {
	public static final byte[] convertObject2Byte(Object o) {
		if (o == null) {
			return null;
		}

		ByteArrayOutputStream result = new ByteArrayOutputStream();
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(result);
			out.writeObject(o);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				out = null;
			}
		}

		return result.toByteArray();
	}
	
	public static final Object convertByte2Object(byte[] b) {
		if (b == null || b.length == 0) {
			return null;
		}
		Object o = null;
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(bais);
			o = in.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				in = null;
			}
		}
		return o;
	}
}
