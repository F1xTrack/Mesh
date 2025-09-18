package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Ik {
    public final C4715ma a = new C4715ma();
    public final HashMap b = new HashMap();
    public C4583gl c = null;
    public final Gk d = new Gk(this);

    public static final Ik a() {
        return Hk.a;
    }

    public final Cl a(Context context, Z4 z4, C4435al c4435al) {
        Cl cl2 = (Cl) this.b.get(z4.a);
        boolean z = true;
        if (cl2 == null) {
            synchronized (this.b) {
                try {
                    cl2 = (Cl) this.b.get(z4.a);
                    if (cl2 == null) {
                        cl2 = new Cl(new Dl(context, z4.a, c4435al, this.d));
                        cl2.f();
                        this.b.put(z4.a, cl2);
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            cl2.a(c4435al);
        }
        return cl2;
    }

    public final void a(Z4 z4, Rk rk) {
        synchronized (this.b) {
            try {
                this.a.a(z4.a, rk);
                C4583gl c4583gl = this.c;
                if (c4583gl != null) {
                    rk.a(c4583gl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
