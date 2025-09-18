package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.m6 */
/* loaded from: classes2.dex */
public abstract class AbstractC5290m6 implements InterfaceC4417Ca {

    /* renamed from: a */
    public final InterfaceC5265l6 f32170a;

    /* renamed from: b */
    public final ICrashTransformer f32171b;

    /* renamed from: c */
    public final C4586J9 f32172c;

    public AbstractC5290m6(InterfaceC5265l6 interfaceC5265l6, ICrashTransformer iCrashTransformer, C4586J9 c4586j9) {
        this.f32170a = interfaceC5265l6;
        this.f32171b = iCrashTransformer;
        this.f32172c = c4586j9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4417Ca
    /* renamed from: a */
    public final void mo19267a(Throwable th, C4815T c4815t) {
        if (this.f32170a.mo9776a(th)) {
            ICrashTransformer iCrashTransformer = this.f32171b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                C4671Mm c4671MmM19732a = AbstractC4743Pm.m19732a(th, c4815t, null, (String) this.f32172c.f30357a.m19817a(), (Boolean) this.f32172c.f30358b.m19817a());
                C4827Tb c4827Tb = (C4827Tb) ((C4880Vg) this).f30865d;
                c4827Tb.f30751a.mo19238a().mo19243b(c4827Tb.f30778b).mo19683a(c4671MmM19732a);
            }
        }
    }

    /* renamed from: b */
    public final InterfaceC5265l6 m20699b() {
        return this.f32170a;
    }

    /* renamed from: a */
    public final ICrashTransformer m20698a() {
        return this.f32171b;
    }
}
