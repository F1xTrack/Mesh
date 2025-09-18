package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2764g {
    public static final int[] a = new int[0];
    public static final String[] b = new String[0];
    public static final byte[][] c = new byte[0][];
    public static final byte[] d = new byte[0];

    public static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static final int a(C2614a c2614a, int i) throws IOException {
        int iB = c2614a.b();
        c2614a.f(i);
        int i2 = 1;
        while (c2614a.l() == i) {
            c2614a.f(i);
            i2++;
        }
        c2614a.e(iB);
        return i2;
    }
}
