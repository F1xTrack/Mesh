package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import defpackage.AbstractC7209tN0;

/* renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4983xf implements InstallReferrerStateListener {
    public final /* synthetic */ Jf a;
    public final /* synthetic */ C5031zf b;

    public C4983xf(C5031zf c5031zf, Jf jf) {
        this.b = c5031zf;
        this.a = jf;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        if (i == 0) {
            try {
                ReferrerDetails installReferrer = this.b.a.getInstallReferrer();
                this.b.b.execute(new RunnableC4959wf(this, new Ef(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), Df.c)));
            } catch (Throwable th) {
                this.b.b.execute(new RunnableC5007yf(this.a, th));
            }
        } else {
            this.b.b.execute(new RunnableC5007yf(this.a, new IllegalStateException(AbstractC7209tN0.u(i, "Referrer check failed with error "))));
        }
        try {
            this.b.a.endConnection();
        } catch (Throwable unused) {
        }
    }
}
