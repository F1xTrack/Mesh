package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.e */
/* loaded from: classes2.dex */
public abstract class AbstractC3219e {

    /* renamed from: a */
    protected volatile int f23283a = -1;

    /* renamed from: a */
    public int mo14341a() {
        return 0;
    }

    /* renamed from: a */
    public abstract AbstractC3219e mo14342a(C3115a c3115a) throws IOException;

    public String toString() {
        return C3245f.m15864a(this);
    }

    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
    }

    /* renamed from: a */
    public static final byte[] m15809a(AbstractC3219e abstractC3219e) {
        int iMo14341a = abstractC3219e.mo14341a();
        abstractC3219e.f23283a = iMo14341a;
        byte[] bArr = new byte[iMo14341a];
        try {
            C3141b c3141bM15637a = C3141b.m15637a(bArr, 0, iMo14341a);
            abstractC3219e.mo14343a(c3141bM15637a);
            c3141bM15637a.m15643a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    public static final <T extends AbstractC3219e> T m15808a(T t, byte[] bArr) throws C3193d {
        try {
            C3115a c3115aM15573a = C3115a.m15573a(bArr, 0, bArr.length);
            t.mo14342a(c3115aM15573a);
            c3115aM15573a.m15576a(0);
            return t;
        } catch (C3193d e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }
}
