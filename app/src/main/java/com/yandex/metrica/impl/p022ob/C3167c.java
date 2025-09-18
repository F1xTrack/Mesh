package com.yandex.metrica.impl.p022ob;

import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.c */
/* loaded from: classes2.dex */
public final class C3167c {

    /* renamed from: a */
    public static final Object f23164a = new Object();

    /* renamed from: a */
    public static byte[] m15698a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Java VM does not support a standard character set.", e);
        }
    }
}
