package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import p000.AbstractC11153tN0;

/* renamed from: io.appmetrica.analytics.impl.xf */
/* loaded from: classes2.dex */
public final class C5574xf implements InstallReferrerStateListener {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC4592Jf f32822a;

    /* renamed from: b */
    public final /* synthetic */ C5624zf f32823b;

    public C5574xf(C5624zf c5624zf, InterfaceC4592Jf interfaceC4592Jf) {
        this.f32823b = c5624zf;
        this.f32822a = interfaceC4592Jf;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        if (i == 0) {
            try {
                ReferrerDetails installReferrer = this.f32823b.f32921a.getInstallReferrer();
                this.f32823b.f32922b.execute(new RunnableC5549wf(this, new C4472Ef(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC4447Df.f30020c)));
            } catch (Throwable th) {
                this.f32823b.f32922b.execute(new RunnableC5599yf(this.f32822a, th));
            }
        } else {
            this.f32823b.f32922b.execute(new RunnableC5599yf(this.f32822a, new IllegalStateException(AbstractC11153tN0.m24909u(i, "Referrer check failed with error "))));
        }
        try {
            this.f32823b.f32921a.endConnection();
        } catch (Throwable unused) {
        }
    }
}
