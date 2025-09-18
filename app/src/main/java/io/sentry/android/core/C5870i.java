package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C5755C0;
import io.sentry.C6037i;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5790O;
import io.sentry.config.AbstractC6003a;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* renamed from: io.sentry.android.core.i */
/* loaded from: classes2.dex */
public final class C5870i implements InterfaceC5790O {

    /* renamed from: g */
    public final ILogger f33708g;

    /* renamed from: h */
    public final C5832D f33709h;

    /* renamed from: a */
    public long f33702a = 0;

    /* renamed from: b */
    public long f33703b = 0;

    /* renamed from: c */
    public long f33704c = 1;

    /* renamed from: d */
    public long f33705d = 1;

    /* renamed from: e */
    public double f33706e = 1.0E9d / 1;

    /* renamed from: f */
    public final File f33707f = new File("/proc/self/stat");

    /* renamed from: i */
    public boolean f33710i = false;

    /* renamed from: j */
    public final Pattern f33711j = Pattern.compile("[\n\t\r ]");

    public C5870i(ILogger iLogger, C5832D c5832d) {
        AbstractC6003a.m21735D(iLogger, "Logger is required.");
        this.f33708g = iLogger;
        this.f33709h = c5832d;
    }

    @Override // io.sentry.InterfaceC5790O
    /* renamed from: a */
    public final void mo21450a(C5755C0 c5755c0) throws NumberFormatException {
        this.f33709h.getClass();
        if (this.f33710i) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.f33702a;
            this.f33702a = jElapsedRealtimeNanos;
            long jM21569b = m21569b();
            long j2 = jM21569b - this.f33703b;
            this.f33703b = jM21569b;
            c5755c0.f33225b = new C6037i(System.currentTimeMillis(), ((j2 / j) / this.f33705d) * 100.0d);
        }
    }

    /* renamed from: b */
    public final long m21569b() throws NumberFormatException {
        String strM21734C;
        ILogger iLogger = this.f33708g;
        try {
            strM21734C = AbstractC6003a.m21734C(this.f33707f);
        } catch (IOException e) {
            this.f33710i = false;
            iLogger.mo21406d(EnumC6069n1.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e);
            strM21734C = null;
        }
        if (strM21734C != null) {
            String[] strArrSplit = this.f33711j.split(strM21734C.trim());
            try {
                long j = Long.parseLong(strArrSplit[13]);
                long j2 = Long.parseLong(strArrSplit[14]);
                return (long) ((j + j2 + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f33706e);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
                iLogger.mo21406d(EnumC6069n1.ERROR, "Error parsing /proc/self/stat file.", e2);
            }
        }
        return 0L;
    }

    @Override // io.sentry.InterfaceC5790O
    /* renamed from: c */
    public final void mo21451c() {
        this.f33709h.getClass();
        this.f33710i = true;
        this.f33704c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f33705d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f33706e = 1.0E9d / this.f33704c;
        this.f33703b = m21569b();
    }
}
