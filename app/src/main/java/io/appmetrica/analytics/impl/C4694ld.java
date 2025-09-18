package io.appmetrica.analytics.impl;

import defpackage.C1518Tf1;
import defpackage.FZ;
import defpackage.InterfaceC6099nZ;

/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4694ld extends FZ implements InterfaceC6099nZ {
    public C4694ld(C4718md c4718md) {
        super(1, c4718md, C4718md.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        C4718md c4718md = (C4718md) this.receiver;
        c4718md.a.markCrashCompleted((String) obj);
        c4718md.a.deleteCompletedCrashes();
        return C1518Tf1.a;
    }
}
