package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC2792h2 implements Runnable {
    private final Context a;
    private final C2864k0 b;
    private final Bundle c;
    private final D4 d;

    public RunnableC2792h2(Context context, C2864k0 c2864k0, Bundle bundle, D4 d4) {
        this.a = context;
        this.b = c2864k0;
        this.c = bundle;
        this.d = d4;
    }

    @Override // java.lang.Runnable
    public void run() {
        T3 t3 = new T3(this.c);
        if (T3.a(t3, this.a)) {
            return;
        }
        C4 c4A = C4.a(t3);
        X3 x3 = new X3(t3);
        this.d.a(c4A, x3).a(this.b, x3);
    }
}
