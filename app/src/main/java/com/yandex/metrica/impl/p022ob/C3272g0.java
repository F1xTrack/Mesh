package com.yandex.metrica.impl.p022ob;

import android.content.ComponentName;
import android.content.Context;
import com.yandex.metrica.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.g0 */
/* loaded from: classes2.dex */
public final class C3272g0 {

    /* renamed from: a */
    private static volatile CountDownLatch f23460a;

    /* renamed from: b */
    private static volatile PreloadInfoContentProvider f23461b;

    /* renamed from: a */
    public static final void m15955a(PreloadInfoContentProvider preloadInfoContentProvider) {
        f23460a = new CountDownLatch(1);
        f23461b = preloadInfoContentProvider;
    }

    /* renamed from: a */
    public static final void m15953a() {
        CountDownLatch countDownLatch = f23460a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* renamed from: a */
    public static final void m15954a(Context context) throws InterruptedException {
        CountDownLatch countDownLatch = f23460a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = f23461b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            f23460a = null;
        }
    }
}
