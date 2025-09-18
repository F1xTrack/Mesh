package com.yandex.metrica.impl.ob;

import android.os.Handler;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;

/* loaded from: classes2.dex */
public class Dg implements Eg {
    private final boolean a;
    private final C2941n2 b;
    private final F9 c;
    private final C3218y0 d;
    private final C2717e2 e;
    private final Handler f;

    public Dg(C2941n2 c2941n2, F9 f9, Handler handler) {
        this(c2941n2, f9, handler, f9.v());
    }

    public void a() {
        if (this.a) {
            return;
        }
        this.b.a(new Gg(this.f, this));
    }

    private Dg(C2941n2 c2941n2, F9 f9, Handler handler, boolean z) {
        this(c2941n2, f9, handler, z, new C3218y0(z), new C2717e2());
    }

    @Override // com.yandex.metrica.impl.ob.Eg
    public void a(Fg fg) {
        String str = fg == null ? null : fg.a;
        if (this.a) {
            return;
        }
        synchronized (this) {
            this.d.a(this.e.a(str));
        }
    }

    public Dg(C2941n2 c2941n2, F9 f9, Handler handler, boolean z, C3218y0 c3218y0, C2717e2 c2717e2) {
        this.b = c2941n2;
        this.c = f9;
        this.a = z;
        this.d = c3218y0;
        this.e = c2717e2;
        this.f = handler;
    }

    public synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            this.d.a(deferredDeeplinkParametersListener);
        } finally {
            this.c.x();
        }
    }

    public synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            this.d.a(deferredDeeplinkListener);
        } finally {
            this.c.x();
        }
    }
}
