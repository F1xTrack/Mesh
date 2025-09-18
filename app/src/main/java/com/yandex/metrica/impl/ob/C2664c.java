package com.yandex.metrica.impl.ob;

import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2664c {
    public static final Object a = new Object();

    public static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Java VM does not support a standard character set.", e);
        }
    }
}
