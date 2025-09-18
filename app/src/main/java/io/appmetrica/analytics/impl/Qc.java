package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes2.dex */
public final class Qc extends SafeRunnable {
    public final /* synthetic */ Rc a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte[] c;

    public Qc(Rc rc, String str, byte[] bArr) {
        this.a = rc;
        this.b = str;
        this.c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Rc.a(this.a).setSessionExtra(this.b, this.c);
    }
}
