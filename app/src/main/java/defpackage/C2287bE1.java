package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.Build;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* renamed from: bE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2287bE1 {
    public static final Method b;
    public static final Method c;
    public final JobScheduler a;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
            }
        } else {
            declaredMethod = null;
        }
        b = declaredMethod;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused2) {
            }
        }
        c = declaredMethod2;
    }

    public C2287bE1(JobScheduler jobScheduler) {
        this.a = jobScheduler;
    }
}
