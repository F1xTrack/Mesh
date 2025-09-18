package io.appmetrica.analytics.impl;

import defpackage.AbstractC7680vr;

/* loaded from: classes2.dex */
public abstract class D9 {
    public static final C4977x9 a(int i, String str) {
        byte[] bytes;
        C4977x9 c4977x9 = new C4977x9();
        c4977x9.a = i;
        if (str == null || (bytes = str.getBytes(AbstractC7680vr.a)) == null) {
            bytes = c4977x9.b;
        }
        c4977x9.b = bytes;
        return c4977x9;
    }
}
