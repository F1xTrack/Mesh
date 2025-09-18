package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.dm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2712dm {
    private final W0 a;
    private final C2662bm b;

    /* renamed from: com.yandex.metrica.impl.ob.dm$a */
    public static class a {
    }

    public C2712dm(C2662bm c2662bm, W0 w0) {
        this.b = c2662bm;
        this.a = w0;
    }

    public void a(String str, Throwable th) {
        if (this.b.f) {
            this.a.reportError(str, th);
        }
    }
}
