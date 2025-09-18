package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.EnumC5148n1;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.android.core.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5088e {
    public final FrameMetricsAggregator a;
    public final SentryAndroidOptions b;
    public final ConcurrentHashMap c;
    public final WeakHashMap d;
    public final D e;

    public C5088e(SentryAndroidOptions sentryAndroidOptions) {
        D d = new D();
        this.a = null;
        this.c = new ConcurrentHashMap();
        this.d = new WeakHashMap();
        if (T.b("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger()) != null) {
            this.a = new FrameMetricsAggregator();
        }
        this.b = sentryAndroidOptions;
        this.e = d;
    }

    public final synchronized void a(Activity activity) {
        if (c()) {
            d(new RunnableC5086c(this, activity, 0), "FrameMetricsAggregator.add");
            C5087d c5087dB = b();
            if (c5087dB != null) {
                this.d.put(activity, c5087dB);
            }
        }
    }

    public final C5087d b() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!c() || (frameMetricsAggregator = this.a) == null) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrK = frameMetricsAggregator.a.k();
        int i3 = 0;
        if (sparseIntArrayArrK == null || sparseIntArrayArrK.length <= 0 || (sparseIntArray = sparseIntArrayArrK[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i2 += iValueAt;
                } else if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new C5087d(i3, i, i2);
    }

    public final boolean c() {
        if (this.a != null) {
            SentryAndroidOptions sentryAndroidOptions = this.b;
            if (sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2()) {
                return true;
            }
        }
        return false;
    }

    public final void d(Runnable runnable, String str) {
        try {
            if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                runnable.run();
            } else {
                D d = this.e;
                ((Handler) d.a).post(new W(this, runnable, str, 1));
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.b.getLogger().k(EnumC5148n1.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    public final synchronized Map e(io.sentry.protocol.t tVar) {
        if (!c()) {
            return null;
        }
        Map map = (Map) this.c.get(tVar);
        this.c.remove(tVar);
        return map;
    }
}
