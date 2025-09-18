package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class D9 extends H9 {
    private static final C3232ye c = new C3232ye("LAST_SATELLITE_CLIDS_DIAGNOSTICS_SENT_TIME", null);
    private static final C3232ye d = new C3232ye("LAST_PRELOAD_INFO_DIAGNOSTICS_SENT_TIME", null);

    public D9(InterfaceC3251z8 interfaceC3251z8) {
        super(interfaceC3251z8);
    }

    public long b(long j) {
        return a(c.a(), j);
    }

    public long c(long j) {
        return a(d.a(), j);
    }

    public D9 d(long j) {
        return (D9) b(c.a(), j);
    }

    public D9 e(long j) {
        return (D9) b(d.a(), j);
    }
}
