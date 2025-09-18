package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C0;
import io.sentry.C5131i;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* renamed from: io.sentry.android.core.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5092i implements io.sentry.O {
    public final ILogger g;
    public final D h;
    public long a = 0;
    public long b = 0;
    public long c = 1;
    public long d = 1;
    public double e = 1.0E9d / 1;
    public final File f = new File("/proc/self/stat");
    public boolean i = false;
    public final Pattern j = Pattern.compile("[\n\t\r ]");

    public C5092i(ILogger iLogger, D d) {
        io.sentry.config.a.D(iLogger, "Logger is required.");
        this.g = iLogger;
        this.h = d;
    }

    @Override // io.sentry.O
    public final void a(C0 c0) throws NumberFormatException {
        this.h.getClass();
        if (this.i) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.a;
            this.a = jElapsedRealtimeNanos;
            long jB = b();
            long j2 = jB - this.b;
            this.b = jB;
            c0.b = new C5131i(System.currentTimeMillis(), ((j2 / j) / this.d) * 100.0d);
        }
    }

    public final long b() throws NumberFormatException {
        String strC;
        ILogger iLogger = this.g;
        try {
            strC = io.sentry.config.a.C(this.f);
        } catch (IOException e) {
            this.i = false;
            iLogger.d(EnumC5148n1.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e);
            strC = null;
        }
        if (strC != null) {
            String[] strArrSplit = this.j.split(strC.trim());
            try {
                long j = Long.parseLong(strArrSplit[13]);
                long j2 = Long.parseLong(strArrSplit[14]);
                return (long) ((j + j2 + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.e);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
                iLogger.d(EnumC5148n1.ERROR, "Error parsing /proc/self/stat file.", e2);
            }
        }
        return 0L;
    }

    @Override // io.sentry.O
    public final void c() {
        this.h.getClass();
        this.i = true;
        this.c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.e = 1.0E9d / this.c;
        this.b = b();
    }
}
