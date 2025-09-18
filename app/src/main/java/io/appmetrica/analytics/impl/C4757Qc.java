package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Qc */
/* loaded from: classes2.dex */
public final class C4757Qc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4780Rc f30660a;

    /* renamed from: b */
    public final /* synthetic */ String f30661b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f30662c;

    public C4757Qc(C4780Rc c4780Rc, String str, byte[] bArr) {
        this.f30660a = c4780Rc;
        this.f30661b = str;
        this.f30662c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4780Rc.m19761a(this.f30660a).setSessionExtra(this.f30661b, this.f30662c);
    }
}
