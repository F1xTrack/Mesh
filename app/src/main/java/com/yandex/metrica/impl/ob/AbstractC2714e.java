package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2714e {
    protected volatile int a = -1;

    public int a() {
        return 0;
    }

    public abstract AbstractC2714e a(C2614a c2614a) throws IOException;

    public String toString() {
        return C2739f.a(this);
    }

    public void a(C2639b c2639b) throws IOException {
    }

    public static final byte[] a(AbstractC2714e abstractC2714e) {
        int iA = abstractC2714e.a();
        abstractC2714e.a = iA;
        byte[] bArr = new byte[iA];
        try {
            C2639b c2639bA = C2639b.a(bArr, 0, iA);
            abstractC2714e.a(c2639bA);
            c2639bA.a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final <T extends AbstractC2714e> T a(T t, byte[] bArr) throws C2689d {
        try {
            C2614a c2614aA = C2614a.a(bArr, 0, bArr.length);
            t.a(c2614aA);
            c2614aA.a(0);
            return t;
        } catch (C2689d e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }
}
