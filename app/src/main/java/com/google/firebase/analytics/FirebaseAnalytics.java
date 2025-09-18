package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.AbstractC9376fU1;
import p000.C0786MU;
import p000.C11268uG1;
import p000.C1415WU;
import p000.C9450g32;
import p000.CG1;
import p000.CallableC8089Ox1;
import p000.EC1;
import p000.HA1;
import p000.InterfaceC1478XU;
import p000.InterfaceC8859bU1;
import p000.PG1;
import p000.TG1;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: c */
    public static volatile FirebaseAnalytics f18442c;

    /* renamed from: a */
    public final CG1 f18443a;

    /* renamed from: b */
    public HA1 f18444b;

    public FirebaseAnalytics(CG1 cg1) {
        Preconditions.checkNotNull(cg1);
        this.f18443a = cg1;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f18442c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f18442c == null) {
                        f18442c = new FirebaseAnalytics(CG1.m1131d(context, null));
                    }
                } finally {
                }
            }
        }
        return f18442c;
    }

    @Keep
    public static InterfaceC8859bU1 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        CG1 cg1M1131d = CG1.m1131d(context, bundle);
        if (cg1M1131d == null) {
            return null;
        }
        return new EC1(cg1M1131d);
    }

    /* renamed from: a */
    public final C9450g32 m11296a() {
        try {
            return AbstractC9376fU1.m18242c(m11297b(), new CallableC8089Ox1(this, 0));
        } catch (RuntimeException e) {
            CG1 cg1 = this.f18443a;
            cg1.getClass();
            cg1.m1136f(new PG1(cg1, "Failed to schedule task for getAppInstanceId", (Exception) null));
            return AbstractC9376fU1.m18243d(e);
        }
    }

    /* renamed from: b */
    public final ExecutorService m11297b() {
        HA1 ha1;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f18444b == null) {
                    this.f18444b = new HA1(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                ha1 = this.f18444b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ha1;
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            Object obj = C1415WU.f13201m;
            C0786MU c0786muM5375d = C0786MU.m5375d();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            return (String) AbstractC9376fU1.m18241b(((C1415WU) c0786muM5375d.m5380b(InterfaceC1478XU.class)).m8789d(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        CG1 cg1 = this.f18443a;
        cg1.getClass();
        cg1.m1136f(new TG1(cg1, C11268uG1.m25147i0(activity), str, str2));
    }
}
