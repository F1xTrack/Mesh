package io.appmetrica.analytics.impl;

import defpackage.AbstractC7096sn0;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.sg */
/* loaded from: classes2.dex */
public final class RunnableC4864sg implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C4815qe c4815qeW = C4667ka.C.w();
        if (timePassedChecker.didTimePassMillis(c4815qeW.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
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
            Map mapH = AbstractC7096sn0.h(pair, pair2, pair3, new Pair("version", sb.toString()));
            C4557fj c4557fj = Fi.a;
            c4557fj.getClass();
            c4557fj.a(new C4508dj("kotlin_version", mapH));
            c4815qeW.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
