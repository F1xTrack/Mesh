package io.sentry.android.core.cache;

import android.os.SystemClock;
import io.sentry.C5759D1;
import io.sentry.C5988c2;
import io.sentry.C6193y;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.android.core.C5915x;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C5882b;
import io.sentry.android.core.performance.C5905e;
import io.sentry.android.core.performance.C5906f;
import io.sentry.cache.C5991c;
import io.sentry.config.AbstractC6003a;
import io.sentry.internal.debugmeta.C6042c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p000.H30;

/* renamed from: io.sentry.android.core.cache.a */
/* loaded from: classes2.dex */
public final class C5860a extends C5991c {

    /* renamed from: i */
    public static final /* synthetic */ int f33658i = 0;

    /* renamed from: h */
    public final C5882b f33659h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5860a(SentryAndroidOptions sentryAndroidOptions) {
        C5882b c5882b = C5882b.f33750a;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        AbstractC6003a.m21735D(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.f33659h = c5882b;
    }

    @Override // io.sentry.cache.C5991c, io.sentry.cache.InterfaceC5992d
    /* renamed from: j */
    public final void mo21556j(C6042c c6042c, C6193y c6193y) throws IOException {
        super.mo21556j(c6042c, c6193y);
        C5759D1 c5759d1 = this.f34098a;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c5759d1;
        C5906f c5906f = C5905e.m21604c().f33822d;
        if (C5988c2.class.isInstance(AbstractC6003a.m21758r(c6193y)) && c5906f.m21611c()) {
            this.f33659h.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - c5906f.f33834c;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                ILogger logger = sentryAndroidOptions.getLogger();
                EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
                logger.mo21407k(enumC6069n1, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = c5759d1.getOutboxPath();
                if (outboxPath == null) {
                    c5759d1.getLogger().mo21407k(enumC6069n1, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th) {
                        c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Error writing the startup crash marker file to the disk", th);
                    }
                }
            }
        }
        H30 h30 = new H30(this, 25, sentryAndroidOptions);
        Object objM21758r = AbstractC6003a.m21758r(c6193y);
        if (!C5915x.class.isInstance(AbstractC6003a.m21758r(c6193y)) || objM21758r == null) {
            return;
        }
        C5860a c5860a = (C5860a) h30.f4030b;
        c5860a.getClass();
        Long lValueOf = Long.valueOf(((C5915x) objM21758r).f33862d);
        ILogger logger2 = ((SentryAndroidOptions) h30.f4031c).getLogger();
        EnumC6069n1 enumC6069n12 = EnumC6069n1.DEBUG;
        logger2.mo21407k(enumC6069n12, "Writing last reported ANR marker with timestamp %d", lValueOf);
        C5759D1 c5759d12 = c5860a.f34098a;
        String cacheDirPath = c5759d12.getCacheDirPath();
        if (cacheDirPath == null) {
            c5759d12.getLogger().mo21407k(enumC6069n12, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(lValueOf).getBytes(C5991c.f34097g));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            c5759d12.getLogger().mo21406d(EnumC6069n1.ERROR, "Error writing the ANR marker to the disk", th2);
        }
    }
}
