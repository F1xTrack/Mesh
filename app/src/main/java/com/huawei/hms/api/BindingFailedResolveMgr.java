package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class BindingFailedResolveMgr {

    /* renamed from: b */
    static final BindingFailedResolveMgr f18787b = new BindingFailedResolveMgr();

    /* renamed from: c */
    private static final Object f18788c = new Object();

    /* renamed from: a */
    List<Activity> f18789a = new ArrayList(1);

    /* renamed from: a */
    public void m11486a(Activity activity) {
        synchronized (f18788c) {
            try {
                for (Activity activity2 : this.f18789a) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f18789a.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m11487b(Activity activity) {
        synchronized (f18788c) {
            this.f18789a.remove(activity);
        }
    }
}
