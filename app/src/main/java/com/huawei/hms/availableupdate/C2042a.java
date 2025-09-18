package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.huawei.hms.availableupdate.a */
/* loaded from: classes.dex */
public class C2042a {

    /* renamed from: c */
    public static final C2042a f18840c = new C2042a();

    /* renamed from: d */
    private static final Object f18841d = new Object();

    /* renamed from: a */
    private final AtomicBoolean f18842a = new AtomicBoolean(false);

    /* renamed from: b */
    private final List<Activity> f18843b = new ArrayList(1);

    /* renamed from: a */
    public void m11531a(Activity activity) {
        synchronized (f18841d) {
            try {
                for (Activity activity2 : this.f18843b) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f18843b.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m11533b(Activity activity) {
        synchronized (f18841d) {
            this.f18843b.remove(activity);
        }
    }

    /* renamed from: a */
    public void m11532a(boolean z) {
        this.f18842a.set(z);
    }

    /* renamed from: a */
    public AtomicBoolean m11530a() {
        return this.f18842a;
    }
}
