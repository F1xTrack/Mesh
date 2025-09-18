package io.appmetrica.analytics.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: io.appmetrica.analytics.impl.wi */
/* loaded from: classes2.dex */
public abstract class AbstractC5552wi {
    /* renamed from: a */
    public static byte[] m21182a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        return messageDigest.digest();
    }
}
