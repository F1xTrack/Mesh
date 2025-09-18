package com.huawei.hms.availableupdate;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

/* renamed from: com.huawei.hms.availableupdate.c */
/* loaded from: classes.dex */
public class C2044c {

    /* renamed from: b */
    public static final C2044c f18847b = new C2044c();

    /* renamed from: a */
    private WeakReference<Activity> f18848a;

    /* renamed from: a */
    public boolean m11537a(Activity activity) {
        HMSLog.m12622i("UpdateAdapterMgr", "onActivityCreate");
        Activity activityM11536a = m11536a();
        if (activityM11536a == null || activityM11536a.isFinishing()) {
            this.f18848a = new WeakReference<>(activity);
            return true;
        }
        activity.finish();
        HMSLog.m12622i("UpdateAdapterMgr", "finish one");
        return false;
    }

    /* renamed from: b */
    public void m11538b(Activity activity) {
        HMSLog.m12622i("UpdateAdapterMgr", "onActivityDestroy");
        Activity activityM11536a = m11536a();
        if (activity == null || !activity.equals(activityM11536a)) {
            return;
        }
        HMSLog.m12622i("UpdateAdapterMgr", "reset");
        this.f18848a = null;
    }

    /* renamed from: a */
    private Activity m11536a() {
        WeakReference<Activity> weakReference = this.f18848a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
