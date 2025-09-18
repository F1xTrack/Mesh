package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Gh {
    public final HashMap a = new HashMap();
    public final C4753o0 b;

    public Gh(C4753o0 c4753o0) {
        this.b = c4753o0;
    }

    public static Gh a() {
        return Fh.a;
    }

    public final C5009yh a(Context context, String str) {
        C5009yh c5009yh = (C5009yh) this.a.get(str);
        if (c5009yh == null) {
            synchronized (this.a) {
                try {
                    c5009yh = (C5009yh) this.a.get(str);
                    if (c5009yh == null) {
                        IHandlerExecutor iHandlerExecutorA = C4805q4.h().c.a();
                        this.b.getClass();
                        if (C4729n0.e == null) {
                            ((C4953w9) iHandlerExecutorA).b.post(new Eh(this, context));
                        }
                        c5009yh = new C5009yh(context.getApplicationContext(), str, new C4753o0());
                        this.a.put(str, c5009yh);
                        c5009yh.c(str);
                    }
                } finally {
                }
            }
        }
        return c5009yh;
    }
}
