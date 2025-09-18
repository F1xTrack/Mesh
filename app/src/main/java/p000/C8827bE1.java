package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.Build;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* renamed from: bE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8827bE1 {

    /* renamed from: b */
    public static final Method f16878b;

    /* renamed from: c */
    public static final Method f16879c;

    /* renamed from: a */
    public final JobScheduler f16880a;

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
        f16878b = declaredMethod;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused2) {
            }
        }
        f16879c = declaredMethod2;
    }

    public C8827bE1(JobScheduler jobScheduler) {
        this.f16880a = jobScheduler;
    }
}
