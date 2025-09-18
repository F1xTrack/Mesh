package com.huawei.hms.stats;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.huawei.hms.stats.a */
/* loaded from: classes.dex */
public class C2246a {

    /* renamed from: f */
    private static final C2246a f19493f = new C2246a();

    /* renamed from: a */
    private final Object f19494a = new Object();

    /* renamed from: b */
    private boolean f19495b = false;

    /* renamed from: c */
    private final List<Runnable> f19496c = new ArrayList();

    /* renamed from: d */
    private final Handler f19497d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private final Runnable f19498e = new a();

    /* renamed from: com.huawei.hms.stats.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.m12622i("AnalyticsCacheManager", "Timeout execCacheBi.");
            if (HiAnalyticsUtils.getInstance().getInitFlag()) {
                C2246a.this.m12564b();
            } else {
                C2246a.this.m12562a();
            }
        }
    }

    private C2246a() {
    }

    /* renamed from: c */
    public static C2246a m12561c() {
        return f19493f;
    }

    /* renamed from: a */
    public void m12563a(Runnable runnable) {
        synchronized (this.f19494a) {
            try {
                if (runnable == null) {
                    return;
                }
                if (this.f19495b) {
                    return;
                }
                if (this.f19496c.size() >= 60) {
                    return;
                }
                this.f19496c.add(runnable);
                this.f19497d.removeCallbacks(this.f19498e);
                this.f19497d.postDelayed(this.f19498e, 10000L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m12564b() {
        synchronized (this.f19494a) {
            HMSLog.m12622i("AnalyticsCacheManager", "execCacheBi: cache size: " + this.f19496c.size());
            this.f19495b = true;
            try {
                Iterator<Runnable> it = this.f19496c.iterator();
                while (it.hasNext()) {
                    it.next().run();
                    it.remove();
                }
            } catch (Throwable th) {
                HMSLog.m12620e("AnalyticsCacheManager", "<execCacheBi> failed. " + th.getMessage());
                m12562a();
            }
            this.f19495b = false;
        }
    }

    /* renamed from: a */
    public void m12562a() {
        synchronized (this.f19494a) {
            HMSLog.m12622i("AnalyticsCacheManager", "clear AnalyticsCache.");
            this.f19496c.clear();
        }
    }
}
