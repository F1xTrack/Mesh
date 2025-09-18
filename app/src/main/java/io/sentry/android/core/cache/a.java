package io.sentry.android.core.cache;

import android.os.SystemClock;
import defpackage.H30;
import io.sentry.C5185y;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.android.core.C5106x;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.b;
import io.sentry.android.core.performance.e;
import io.sentry.android.core.performance.f;
import io.sentry.c2;
import io.sentry.cache.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class a extends c {
    public static final /* synthetic */ int i = 0;
    public final b h;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(SentryAndroidOptions sentryAndroidOptions) {
        b bVar = b.a;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        io.sentry.config.a.D(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.h = bVar;
    }

    @Override // io.sentry.cache.c, io.sentry.cache.d
    public final void j(io.sentry.internal.debugmeta.c cVar, C5185y c5185y) throws IOException {
        super.j(cVar, c5185y);
        D1 d1 = this.a;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) d1;
        f fVar = e.c().d;
        if (c2.class.isInstance(io.sentry.config.a.r(c5185y)) && fVar.c()) {
            this.h.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - fVar.c;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                ILogger logger = sentryAndroidOptions.getLogger();
                EnumC5148n1 enumC5148n1 = EnumC5148n1.DEBUG;
                logger.k(enumC5148n1, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = d1.getOutboxPath();
                if (outboxPath == null) {
                    d1.getLogger().k(enumC5148n1, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th) {
                        d1.getLogger().d(EnumC5148n1.ERROR, "Error writing the startup crash marker file to the disk", th);
                    }
                }
            }
        }
        H30 h30 = new H30(this, 25, sentryAndroidOptions);
        Object objR = io.sentry.config.a.r(c5185y);
        if (!C5106x.class.isInstance(io.sentry.config.a.r(c5185y)) || objR == null) {
            return;
        }
        a aVar = (a) h30.b;
        aVar.getClass();
        Long lValueOf = Long.valueOf(((C5106x) objR).d);
        ILogger logger2 = ((SentryAndroidOptions) h30.c).getLogger();
        EnumC5148n1 enumC5148n12 = EnumC5148n1.DEBUG;
        logger2.k(enumC5148n12, "Writing last reported ANR marker with timestamp %d", lValueOf);
        D1 d12 = aVar.a;
        String cacheDirPath = d12.getCacheDirPath();
        if (cacheDirPath == null) {
            d12.getLogger().k(enumC5148n12, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(lValueOf).getBytes(c.g));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            d12.getLogger().d(EnumC5148n1.ERROR, "Error writing the ANR marker to the disk", th2);
        }
    }
}
