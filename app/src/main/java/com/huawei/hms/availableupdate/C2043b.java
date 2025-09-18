package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.hms.availableupdate.b */
/* loaded from: classes.dex */
public class C2043b {

    /* renamed from: b */
    public static final C2043b f18844b = new C2043b();

    /* renamed from: c */
    private static final Object f18845c = new Object();

    /* renamed from: a */
    private final List<Activity> f18846a = new ArrayList(1);

    /* renamed from: a */
    public void m11534a(Activity activity) {
        synchronized (f18845c) {
            try {
                for (Activity activity2 : this.f18846a) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f18846a.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m11535b(Activity activity) {
        synchronized (f18845c) {
            this.f18846a.remove(activity);
        }
    }
}
