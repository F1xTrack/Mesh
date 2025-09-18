package io.appmetrica.analytics.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4962wi {
    public static byte[] a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        return messageDigest.digest();
    }
}
