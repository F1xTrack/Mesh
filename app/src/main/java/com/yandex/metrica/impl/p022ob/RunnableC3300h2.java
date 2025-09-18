package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.h2 */
/* loaded from: classes2.dex */
class RunnableC3300h2 implements Runnable {

    /* renamed from: a */
    private final Context f23558a;

    /* renamed from: b */
    private final C3376k0 f23559b;

    /* renamed from: c */
    private final Bundle f23560c;

    /* renamed from: d */
    private final C2546D4 f23561d;

    public RunnableC3300h2(Context context, C3376k0 c3376k0, Bundle bundle, C2546D4 c2546d4) {
        this.f23558a = context;
        this.f23559b = c3376k0;
        this.f23560c = bundle;
        this.f23561d = c2546d4;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2944T3 c2944t3 = new C2944T3(this.f23560c);
        if (C2944T3.m15166a(c2944t3, this.f23558a)) {
            return;
        }
        C2521C4 c2521c4M13949a = C2521C4.m13949a(c2944t3);
        C3044X3 c3044x3 = new C3044X3(c2944t3);
        this.f23561d.m13980a(c2521c4M13949a, c3044x3).mo13840a(this.f23559b, c3044x3);
    }
}
