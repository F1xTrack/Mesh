package com.yandex.metrica.impl.p022ob;

import android.os.Handler;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;

/* renamed from: com.yandex.metrica.impl.ob.Dg */
/* loaded from: classes2.dex */
public class C2558Dg implements InterfaceC2583Eg {

    /* renamed from: a */
    private final boolean f21026a;

    /* renamed from: b */
    private final C3456n2 f21027b;

    /* renamed from: c */
    private final C2601F9 f21028c;

    /* renamed from: d */
    private final C3740y0 f21029d;

    /* renamed from: e */
    private final C3222e2 f21030e;

    /* renamed from: f */
    private final Handler f21031f;

    public C2558Dg(C3456n2 c3456n2, C2601F9 c2601f9, Handler handler) {
        this(c3456n2, c2601f9, handler, c2601f9.m14126v());
    }

    /* renamed from: a */
    public void m13999a() {
        if (this.f21026a) {
            return;
        }
        this.f21027b.m16448a(new ResultReceiverC2633Gg(this.f21031f, this));
    }

    private C2558Dg(C3456n2 c3456n2, C2601F9 c2601f9, Handler handler, boolean z) {
        this(c3456n2, c2601f9, handler, z, new C3740y0(z), new C3222e2());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2583Eg
    /* renamed from: a */
    public void mo14002a(C2608Fg c2608Fg) {
        String str = c2608Fg == null ? null : c2608Fg.f21216a;
        if (this.f21026a) {
            return;
        }
        synchronized (this) {
            this.f21029d.m17209a(this.f21030e.m15813a(str));
        }
    }

    public C2558Dg(C3456n2 c3456n2, C2601F9 c2601f9, Handler handler, boolean z, C3740y0 c3740y0, C3222e2 c3222e2) {
        this.f21027b = c3456n2;
        this.f21028c = c2601f9;
        this.f21026a = z;
        this.f21029d = c3740y0;
        this.f21030e = c3222e2;
        this.f21031f = handler;
    }

    /* renamed from: a */
    public synchronized void m14001a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            this.f21029d.m17208a(deferredDeeplinkParametersListener);
        } finally {
            this.f21028c.m14128x();
        }
    }

    /* renamed from: a */
    public synchronized void m14000a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            this.f21029d.m17207a(deferredDeeplinkListener);
        } finally {
            this.f21028c.m14128x();
        }
    }
}
