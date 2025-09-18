package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.hints.InterfaceC6031f;
import io.sentry.hints.InterfaceC6032g;
import java.io.File;
import java.nio.charset.Charset;

/* renamed from: io.sentry.B0 */
/* loaded from: classes2.dex */
public final class C5752B0 extends AbstractC6070o {

    /* renamed from: i */
    public static final Charset f33218i = Charset.forName("UTF-8");

    /* renamed from: e */
    public final C5760E f33219e;

    /* renamed from: f */
    public final InterfaceC5772I f33220f;

    /* renamed from: g */
    public final InterfaceC5801S f33221g;

    /* renamed from: h */
    public final ILogger f33222h;

    public C5752B0(C5760E c5760e, InterfaceC5772I interfaceC5772I, InterfaceC5801S interfaceC5801S, ILogger iLogger, long j, int i) {
        super(c5760e, iLogger, j, i);
        AbstractC6003a.m21735D(c5760e, "Hub is required.");
        this.f33219e = c5760e;
        AbstractC6003a.m21735D(interfaceC5772I, "Envelope reader is required.");
        this.f33220f = interfaceC5772I;
        AbstractC6003a.m21735D(interfaceC5801S, "Serializer is required.");
        this.f33221g = interfaceC5801S;
        AbstractC6003a.m21735D(iLogger, "Logger is required.");
        this.f33222h = iLogger;
    }

    /* renamed from: c */
    public static /* synthetic */ void m21358c(C5752B0 c5752b0, File file, InterfaceC6032g interfaceC6032g) {
        ILogger iLogger = c5752b0.f33222h;
        if (interfaceC6032g.mo21529a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            iLogger.mo21407k(EnumC6069n1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e) {
            iLogger.mo21405c(EnumC6069n1.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.AbstractC6070o
    /* renamed from: a */
    public final boolean mo21359a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        return;
     */
    @Override // io.sentry.AbstractC6070o
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo21360b(java.io.File r9, io.sentry.C6193y r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Class<io.sentry.hints.g> r2 = io.sentry.hints.InterfaceC6032g.class
            java.lang.String r3 = r9.getName()
            boolean r3 = r8.mo21359a(r3)
            io.sentry.ILogger r4 = r8.f33222h
            if (r3 != 0) goto L20
            io.sentry.n1 r10 = io.sentry.EnumC6069n1.DEBUG
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            java.lang.String r9 = "File '%s' should be ignored."
            r4.mo21407k(r10, r9, r1)
            return
        L20:
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            io.sentry.I r5 = r8.f33220f     // Catch: java.lang.Throwable -> L42
            io.sentry.internal.debugmeta.c r5 = r5.mo21401a(r3)     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L44
            io.sentry.n1 r5 = io.sentry.EnumC6069n1.ERROR     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = "Stream from path %s resulted in a null envelope."
            java.lang.String r7 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L42
            r1[r0] = r7     // Catch: java.lang.Throwable -> L42
            r4.mo21407k(r5, r6, r1)     // Catch: java.lang.Throwable -> L42
            goto L56
        L42:
            r0 = move-exception
            goto L77
        L44:
            r8.m21362e(r5, r10)     // Catch: java.lang.Throwable -> L42
            io.sentry.n1 r5 = io.sentry.EnumC6069n1.DEBUG     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = "File '%s' is done."
            java.lang.String r7 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L42
            r1[r0] = r7     // Catch: java.lang.Throwable -> L42
            r4.mo21407k(r5, r6, r1)     // Catch: java.lang.Throwable -> L42
        L56:
            r3.close()     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            java.lang.Object r0 = io.sentry.config.AbstractC6003a.m21758r(r10)
            java.lang.Object r10 = io.sentry.config.AbstractC6003a.m21758r(r10)
            boolean r10 = r2.isInstance(r10)
            if (r10 == 0) goto L6f
            if (r0 == 0) goto L6f
        L69:
            io.sentry.hints.g r0 = (io.sentry.hints.InterfaceC6032g) r0
            m21358c(r8, r9, r0)
            goto L98
        L6f:
            io.sentry.config.AbstractC6003a.m21765z(r2, r0, r4)
            goto L98
        L73:
            r0 = move-exception
            goto L99
        L75:
            r0 = move-exception
            goto L80
        L77:
            r3.close()     // Catch: java.lang.Throwable -> L7b
            goto L7f
        L7b:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
        L7f:
            throw r0     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
        L80:
            io.sentry.n1 r1 = io.sentry.EnumC6069n1.ERROR     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "Error processing envelope."
            r4.mo21406d(r1, r3, r0)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = io.sentry.config.AbstractC6003a.m21758r(r10)
            java.lang.Object r10 = io.sentry.config.AbstractC6003a.m21758r(r10)
            boolean r10 = r2.isInstance(r10)
            if (r10 == 0) goto L6f
            if (r0 == 0) goto L6f
            goto L69
        L98:
            return
        L99:
            java.lang.Object r1 = io.sentry.config.AbstractC6003a.m21758r(r10)
            java.lang.Object r10 = io.sentry.config.AbstractC6003a.m21758r(r10)
            boolean r10 = r2.isInstance(r10)
            if (r10 == 0) goto Laf
            if (r1 == 0) goto Laf
            io.sentry.hints.g r1 = (io.sentry.hints.InterfaceC6032g) r1
            m21358c(r8, r9, r1)
            goto Lb2
        Laf:
            io.sentry.config.AbstractC6003a.m21765z(r2, r1, r4)
        Lb2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C5752B0.mo21360b(java.io.File, io.sentry.y):void");
    }

    /* renamed from: d */
    public final C5820Y0 m21361d(C5821Y1 c5821y1) {
        String str;
        ILogger iLogger = this.f33222h;
        if (c5821y1 != null && (str = c5821y1.f33452h) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (AbstractC6003a.m21764y(dValueOf, false)) {
                    return new C5820Y0(Boolean.TRUE, dValueOf);
                }
                iLogger.mo21407k(EnumC6069n1.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                iLogger.mo21407k(EnumC6069n1.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new C5820Y0(Boolean.TRUE, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:132|60|130|61|(3:122|63|64)(10:67|68|(5:80|83|(1:85)|88|(4:90|137|91|148))(8:72|73|120|74|75|76|143|116)|86|87|79|128|94|138|147)|124|92|93) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0231, code lost:
    
        r11.mo21406d(io.sentry.EnumC6069n1.ERROR, "Item failed to process.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ba  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m21362e(io.sentry.internal.debugmeta.C6042c r20, io.sentry.C6193y r21) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C5752B0.m21362e(io.sentry.internal.debugmeta.c, io.sentry.y):void");
    }

    /* renamed from: f */
    public final boolean m21363f(C6193y c6193y) {
        Object objM21758r = AbstractC6003a.m21758r(c6193y);
        if (objM21758r instanceof InterfaceC6031f) {
            return ((InterfaceC6031f) objM21758r).mo21532d();
        }
        AbstractC6003a.m21765z(InterfaceC6031f.class, objM21758r, this.f33222h);
        return true;
    }
}
