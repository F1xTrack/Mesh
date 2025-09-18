package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.dm */
/* loaded from: classes2.dex */
public class C3216dm {

    /* renamed from: a */
    private final InterfaceC3016W0 f23279a;

    /* renamed from: b */
    private final C3164bm f23280b;

    /* renamed from: com.yandex.metrica.impl.ob.dm$a */
    public static class a {
    }

    public C3216dm(C3164bm c3164bm, InterfaceC3016W0 interfaceC3016W0) {
        this.f23280b = c3164bm;
        this.f23279a = interfaceC3016W0;
    }

    /* renamed from: a */
    public void m15805a(String str, Throwable th) {
        if (this.f23280b.f23153f) {
            this.f23279a.reportError(str, th);
        }
    }
}
