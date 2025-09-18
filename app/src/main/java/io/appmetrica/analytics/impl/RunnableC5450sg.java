package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Pair;
import p000.AbstractC11077sn0;

/* renamed from: io.appmetrica.analytics.impl.sg */
/* loaded from: classes2.dex */
public final class RunnableC5450sg implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C5398qe c5398qeM20638w = C5244ka.f32038C.m20638w();
        if (timePassedChecker.didTimePassMillis(c5398qeM20638w.m20973f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            Pair pair = new Pair("major", Integer.valueOf(kotlinVersion.getMajor()));
            Pair pair2 = new Pair("minor", Integer.valueOf(kotlinVersion.getMinor()));
            Pair pair3 = new Pair("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append('.');
            sb.append(kotlinVersion.getMinor());
            sb.append('.');
            sb.append(kotlinVersion.getPatch());
            Map mapM24780h = AbstractC11077sn0.m24780h(pair, pair2, pair3, new Pair("version", sb.toString()));
            C5128fj c5128fj = AbstractC4499Fi.f30148a;
            c5128fj.getClass();
            c5128fj.m20394a(new C5078dj("kotlin_version", mapM24780h));
            c5398qeM20638w.m20967c(systemTimeProvider.currentTimeMillis()).m20875b();
        }
    }
}
