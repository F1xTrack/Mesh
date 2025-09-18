package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.m6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4711m6 implements Ca {
    public final InterfaceC4687l6 a;
    public final ICrashTransformer b;
    public final J9 c;

    public AbstractC4711m6(InterfaceC4687l6 interfaceC4687l6, ICrashTransformer iCrashTransformer, J9 j9) {
        this.a = interfaceC4687l6;
        this.b = iCrashTransformer;
        this.c = j9;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(Throwable th, T t) {
        if (this.a.a(th)) {
            ICrashTransformer iCrashTransformer = this.b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                Mm mmA = Pm.a(th, t, null, (String) this.c.a.a(), (Boolean) this.c.b.a());
                Tb tb = (Tb) ((Vg) this).d;
                tb.a.a().b(tb.b).a(mmA);
            }
        }
    }

    public final InterfaceC4687l6 b() {
        return this.a;
    }

    public final ICrashTransformer a() {
        return this.b;
    }
}
