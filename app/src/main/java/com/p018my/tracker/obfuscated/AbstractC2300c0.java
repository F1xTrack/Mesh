package com.p018my.tracker.obfuscated;

import java.security.MessageDigest;

/* renamed from: com.my.tracker.obfuscated.c0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2300c0 {
    /* renamed from: a */
    public static String m12805a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02X", Byte.valueOf(b)));
            }
            return sb.toString().toLowerCase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
