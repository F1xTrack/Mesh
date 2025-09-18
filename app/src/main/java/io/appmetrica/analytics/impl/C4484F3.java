package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.Context;
import io.appmetrica.analytics.internal.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.F3 */
/* loaded from: classes2.dex */
public final class C4484F3 implements InterfaceC5615z6 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5615z6
    /* renamed from: a */
    public final void mo19398a(Context context) throws InterruptedException {
        CountDownLatch countDownLatch = AbstractC4510G5.f30161a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = AbstractC4510G5.f30162b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            AbstractC4510G5.f30161a = null;
        }
    }
}
