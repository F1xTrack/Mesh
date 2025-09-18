package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import java.util.concurrent.atomic.AtomicReference;
import p000.C0081BH;
import p000.C0827N8;
import p000.C0952P7;
import p000.InterfaceC0889O7;

/* renamed from: com.my.tracker.obfuscated.h */
/* loaded from: classes2.dex */
public final class C2320h {

    /* renamed from: a */
    private final AtomicReference f19961a = new AtomicReference();

    /* renamed from: b */
    protected boolean f19962b = false;

    /* renamed from: com.my.tracker.obfuscated.h$a */
    public static final class a {

        /* renamed from: a */
        public static final boolean f19963a;

        static {
            boolean z = false;
            try {
                if (AppSet.class.equals(AppSet.class) && InterfaceC0889O7.class.equals(InterfaceC0889O7.class)) {
                    if (C0952P7.class.equals(C0952P7.class)) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                AbstractC2391y2.m13569a("AppSetIdProvider: error occurred while working with App Set library classes", th);
            }
            f19963a = z;
        }
    }

    /* renamed from: b */
    private void m13139b(Context context) {
        C2358q1 c2358q1M13407a = C2358q1.m13407a(context);
        String strM13421d = c2358q1M13407a.m13421d();
        long jM13424e = c2358q1M13407a.m13424e();
        if (!TextUtils.isEmpty(strM13421d)) {
            this.f19961a.set(new C2316g(strM13421d, jM13424e));
        }
        if (!a.f19963a) {
            AbstractC2391y2.m13568a("AppSetIdProvider: app set library is not available");
            return;
        }
        try {
            new C0827N8(context, 1).m5562n().mo11138e(AbstractC2340m.f20024c, new C0081BH(this, jM13424e, c2358q1M13407a, strM13421d));
        } catch (Throwable th) {
            AbstractC2391y2.m13569a("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        m13136a();
    }

    /* renamed from: a */
    public void m13137a(long j, C2358q1 c2358q1, String str, C0952P7 c0952p7) {
        int i = c0952p7.f8866b;
        long j2 = i;
        if (j2 != j) {
            c2358q1.m13409a(i);
        }
        String str2 = c0952p7.f8865a;
        if (!str2.equals(str)) {
            c2358q1.m13427f(str2);
            AbstractC2391y2.m13568a("AppSetIdProvider: new id value has been received: ".concat(str2));
        }
        if (TextUtils.isEmpty(str2) || i == -1) {
            this.f19961a.set(null);
        } else {
            this.f19961a.set(new C2316g(str2, j2));
        }
        synchronized (this.f19961a) {
            this.f19961a.notify();
        }
    }

    /* renamed from: a */
    private void m13136a() {
        try {
            C2316g c2316g = (C2316g) this.f19961a.get();
            if (c2316g != null) {
                AbstractC2391y2.m13568a("AppSetIdProvider: app set id has been collected, value: " + c2316g.f19938a);
            } else {
                synchronized (this.f19961a) {
                    this.f19961a.wait(300L);
                }
                AbstractC2391y2.m13568a("AppSetIdProvider: timeout for collecting id has exceeded");
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13569a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }

    /* renamed from: a */
    public C2316g m13140a(Context context) {
        if (!this.f19962b) {
            m13139b(context);
            this.f19962b = true;
        }
        return (C2316g) this.f19961a.get();
    }
}
