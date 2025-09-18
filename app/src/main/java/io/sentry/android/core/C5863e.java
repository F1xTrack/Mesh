package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.EnumC6069n1;
import io.sentry.protocol.C6104t;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.android.core.e */
/* loaded from: classes2.dex */
public final class C5863e {

    /* renamed from: a */
    public final FrameMetricsAggregator f33670a;

    /* renamed from: b */
    public final SentryAndroidOptions f33671b;

    /* renamed from: c */
    public final ConcurrentHashMap f33672c;

    /* renamed from: d */
    public final WeakHashMap f33673d;

    /* renamed from: e */
    public final C5832D f33674e;

    public C5863e(SentryAndroidOptions sentryAndroidOptions) {
        C5832D c5832d = new C5832D();
        this.f33670a = null;
        this.f33672c = new ConcurrentHashMap();
        this.f33673d = new WeakHashMap();
        if (C5847T.m21545b("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger()) != null) {
            this.f33670a = new FrameMetricsAggregator();
        }
        this.f33671b = sentryAndroidOptions;
        this.f33674e = c5832d;
    }

    /* renamed from: a */
    public final synchronized void m21557a(Activity activity) {
        if (m21559c()) {
            m21560d(new RunnableC5858c(this, activity, 0), "FrameMetricsAggregator.add");
            C5861d c5861dM21558b = m21558b();
            if (c5861dM21558b != null) {
                this.f33673d.put(activity, c5861dM21558b);
            }
        }
    }

    /* renamed from: b */
    public final C5861d m21558b() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!m21559c() || (frameMetricsAggregator = this.f33670a) == null) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrMo2452k = frameMetricsAggregator.f16089a.mo2452k();
        int i3 = 0;
        if (sparseIntArrayArrMo2452k == null || sparseIntArrayArrMo2452k.length <= 0 || (sparseIntArray = sparseIntArrayArrMo2452k[0]) == null) {
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
        return new C5861d(i3, i, i2);
    }

    /* renamed from: c */
    public final boolean m21559c() {
        if (this.f33670a != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f33671b;
            if (sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void m21560d(Runnable runnable, String str) {
        try {
            if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                runnable.run();
            } else {
                C5832D c5832d = this.f33674e;
                ((Handler) c5832d.f33522a).post(new RunnableC5850W(this, runnable, str, 1));
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f33671b.getLogger().mo21407k(EnumC6069n1.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    /* renamed from: e */
    public final synchronized Map m21561e(C6104t c6104t) {
        if (!m21559c()) {
            return null;
        }
        Map map = (Map) this.f33672c.get(c6104t);
        this.f33672c.remove(c6104t);
        return map;
    }
}
