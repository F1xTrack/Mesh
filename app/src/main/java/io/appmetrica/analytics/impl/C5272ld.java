package io.appmetrica.analytics.impl;

import p000.AbstractC0351FZ;
import p000.C8313Tf1;
import p000.InterfaceC6497nZ;

/* renamed from: io.appmetrica.analytics.impl.ld */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5272ld extends AbstractC0351FZ implements InterfaceC6497nZ {
    public C5272ld(C5297md c5297md) {
        super(1, c5297md, C5297md.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        C5297md c5297md = (C5297md) this.receiver;
        c5297md.f32200a.markCrashCompleted((String) obj);
        c5297md.f32200a.deleteCompletedCrashes();
        return C8313Tf1.f11463a;
    }
}
