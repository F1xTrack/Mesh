package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import com.yandex.metrica.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2765g0 {
    private static volatile CountDownLatch a;
    private static volatile PreloadInfoContentProvider b;

    public static final void a(PreloadInfoContentProvider preloadInfoContentProvider) {
        a = new CountDownLatch(1);
        b = preloadInfoContentProvider;
    }

    public static final void a() {
        CountDownLatch countDownLatch = a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static final void a(Context context) throws InterruptedException {
        CountDownLatch countDownLatch = a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            a = null;
        }
    }
}
