package io.sentry;

import java.io.File;

/* renamed from: io.sentry.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5170t extends AbstractC5149o {
    public final E e;
    public final S f;
    public final ILogger g;

    public C5170t(E e, S s, ILogger iLogger, long j, int i) {
        super(e, iLogger, j, i);
        io.sentry.config.a.D(e, "Hub is required.");
        this.e = e;
        io.sentry.config.a.D(s, "Serializer is required.");
        this.f = s;
        io.sentry.config.a.D(iLogger, "Logger is required.");
        this.g = iLogger;
    }

    public static void c(C5170t c5170t, File file, io.sentry.hints.g gVar) {
        c5170t.getClass();
        boolean zA = gVar.a();
        ILogger iLogger = c5170t.g;
        if (zA) {
            iLogger.k(EnumC5148n1.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                iLogger.k(EnumC5148n1.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th) {
            iLogger.c(EnumC5148n1.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        iLogger.k(EnumC5148n1.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.AbstractC5149o
    public final boolean a(String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0116, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0138, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015d, code lost:
    
        return;
     */
    @Override // io.sentry.AbstractC5149o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.io.File r10, io.sentry.C5185y r11) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C5170t.b(java.io.File, io.sentry.y):void");
    }
}
