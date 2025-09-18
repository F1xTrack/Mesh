package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.hints.InterfaceC6032g;
import java.io.File;

/* renamed from: io.sentry.t */
/* loaded from: classes2.dex */
public final class C6146t extends AbstractC6070o {

    /* renamed from: e */
    public final C5760E f34614e;

    /* renamed from: f */
    public final InterfaceC5801S f34615f;

    /* renamed from: g */
    public final ILogger f34616g;

    public C6146t(C5760E c5760e, InterfaceC5801S interfaceC5801S, ILogger iLogger, long j, int i) {
        super(c5760e, iLogger, j, i);
        AbstractC6003a.m21735D(c5760e, "Hub is required.");
        this.f34614e = c5760e;
        AbstractC6003a.m21735D(interfaceC5801S, "Serializer is required.");
        this.f34615f = interfaceC5801S;
        AbstractC6003a.m21735D(iLogger, "Logger is required.");
        this.f34616g = iLogger;
    }

    /* renamed from: c */
    public static void m21859c(C6146t c6146t, File file, InterfaceC6032g interfaceC6032g) {
        c6146t.getClass();
        boolean zMo21529a = interfaceC6032g.mo21529a();
        ILogger iLogger = c6146t.f34616g;
        if (zMo21529a) {
            iLogger.mo21407k(EnumC6069n1.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                iLogger.mo21407k(EnumC6069n1.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th) {
            iLogger.mo21405c(EnumC6069n1.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        iLogger.mo21407k(EnumC6069n1.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.AbstractC6070o
    /* renamed from: a */
    public final boolean mo21359a(String str) {
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
    @Override // io.sentry.AbstractC6070o
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo21360b(java.io.File r10, io.sentry.C6193y r11) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C6146t.mo21360b(java.io.File, io.sentry.y):void");
    }
}
