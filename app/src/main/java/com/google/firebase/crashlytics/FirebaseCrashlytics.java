package com.google.firebase.crashlytics;

import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0516IB;
import p000.AbstractC9376fU1;
import p000.C0786MU;
import p000.C6409mA;
import p000.C6663qA;
import p000.C9450g32;
import p000.ExecutorC1584ZA;
import p000.RunnableC3973eA;
import p000.RunnableC6535oA;
import p000.RunnableC8339Ts1;
import p000.S81;

/* loaded from: classes.dex */
public class FirebaseCrashlytics {

    /* renamed from: a */
    public final C6663qA f18453a;

    public FirebaseCrashlytics(C6663qA c6663qA) {
        this.f18453a = c6663qA;
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) C0786MU.m5375d().m5380b(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public Task checkForUnsentReports() {
        C6409mA c6409mA = this.f18453a.f40645h;
        return !((AtomicBoolean) c6409mA.f37544r).compareAndSet(false, true) ? AbstractC9376fU1.m18244e(Boolean.FALSE) : ((S81) c6409mA.f37541o).f10598a;
    }

    public void deleteUnsentReports() {
        C6409mA c6409mA = this.f18453a.f40645h;
        ((S81) c6409mA.f37542p).m7186d(Boolean.FALSE);
        C9450g32 c9450g32 = ((S81) c6409mA.f37543q).f10598a;
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f18453a.f40644g;
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f18453a.f40639b.m1590b();
    }

    public void log(String str) {
        C6663qA c6663qA = this.f18453a;
        ((ExecutorC1584ZA) c6663qA.f40653p.f41678b).m9502a(new RunnableC6535oA(c6663qA, System.currentTimeMillis() - c6663qA.f40641d, str, 0));
    }

    public void recordException(Throwable th) {
        if (th == null) {
            return;
        }
        C6663qA c6663qA = this.f18453a;
        ((ExecutorC1584ZA) c6663qA.f40653p.f41678b).m9502a(new RunnableC8339Ts1(c6663qA, th, Collections.emptyMap(), 15));
    }

    public void sendUnsentReports() {
        C6409mA c6409mA = this.f18453a.f40645h;
        ((S81) c6409mA.f37542p).m7186d(Boolean.TRUE);
        C9450g32 c9450g32 = ((S81) c6409mA.f37543q).f10598a;
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.f18453a.m23938b(Boolean.valueOf(z));
    }

    public void setCustomKey(String str, boolean z) {
        this.f18453a.m23939c(str, Boolean.toString(z));
    }

    public void setCustomKeys(AbstractC0516IB abstractC0516IB) {
        throw null;
    }

    public void setUserId(String str) {
        C6663qA c6663qA = this.f18453a;
        ((ExecutorC1584ZA) c6663qA.f40653p.f41678b).m9502a(new RunnableC3973eA(c6663qA, 2, str));
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f18453a.m23938b(bool);
    }

    public void setCustomKey(String str, double d) {
        this.f18453a.m23939c(str, Double.toString(d));
    }

    public void setCustomKey(String str, float f) {
        this.f18453a.m23939c(str, Float.toString(f));
    }

    public void recordException(Throwable th, AbstractC0516IB abstractC0516IB) {
        if (th != null) {
            throw null;
        }
    }

    public void setCustomKey(String str, int i) {
        this.f18453a.m23939c(str, Integer.toString(i));
    }

    public void setCustomKey(String str, long j) {
        this.f18453a.m23939c(str, Long.toString(j));
    }

    public void setCustomKey(String str, String str2) {
        this.f18453a.m23939c(str, str2);
    }
}
