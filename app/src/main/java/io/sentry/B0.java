package io.sentry;

import java.io.File;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class B0 extends AbstractC5149o {
    public static final Charset i = Charset.forName("UTF-8");
    public final E e;
    public final I f;
    public final S g;
    public final ILogger h;

    public B0(E e, I i2, S s, ILogger iLogger, long j, int i3) {
        super(e, iLogger, j, i3);
        io.sentry.config.a.D(e, "Hub is required.");
        this.e = e;
        io.sentry.config.a.D(i2, "Envelope reader is required.");
        this.f = i2;
        io.sentry.config.a.D(s, "Serializer is required.");
        this.g = s;
        io.sentry.config.a.D(iLogger, "Logger is required.");
        this.h = iLogger;
    }

    public static /* synthetic */ void c(B0 b0, File file, io.sentry.hints.g gVar) {
        ILogger iLogger = b0.h;
        if (gVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            iLogger.k(EnumC5148n1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e) {
            iLogger.c(EnumC5148n1.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.AbstractC5149o
    public final boolean a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        return;
     */
    @Override // io.sentry.AbstractC5149o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.io.File r9, io.sentry.C5185y r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Class<io.sentry.hints.g> r2 = io.sentry.hints.g.class
            java.lang.String r3 = r9.getName()
            boolean r3 = r8.a(r3)
            io.sentry.ILogger r4 = r8.h
            if (r3 != 0) goto L20
            io.sentry.n1 r10 = io.sentry.EnumC5148n1.DEBUG
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            java.lang.String r9 = "File '%s' should be ignored."
            r4.k(r10, r9, r1)
            return
        L20:
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            io.sentry.I r5 = r8.f     // Catch: java.lang.Throwable -> L42
            io.sentry.internal.debugmeta.c r5 = r5.a(r3)     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L44
            io.sentry.n1 r5 = io.sentry.EnumC5148n1.ERROR     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = "Stream from path %s resulted in a null envelope."
            java.lang.String r7 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L42
            r1[r0] = r7     // Catch: java.lang.Throwable -> L42
            r4.k(r5, r6, r1)     // Catch: java.lang.Throwable -> L42
            goto L56
        L42:
            r0 = move-exception
            goto L77
        L44:
            r8.e(r5, r10)     // Catch: java.lang.Throwable -> L42
            io.sentry.n1 r5 = io.sentry.EnumC5148n1.DEBUG     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = "File '%s' is done."
            java.lang.String r7 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L42
            r1[r0] = r7     // Catch: java.lang.Throwable -> L42
            r4.k(r5, r6, r1)     // Catch: java.lang.Throwable -> L42
        L56:
            r3.close()     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            java.lang.Object r0 = io.sentry.config.a.r(r10)
            java.lang.Object r10 = io.sentry.config.a.r(r10)
            boolean r10 = r2.isInstance(r10)
            if (r10 == 0) goto L6f
            if (r0 == 0) goto L6f
        L69:
            io.sentry.hints.g r0 = (io.sentry.hints.g) r0
            c(r8, r9, r0)
            goto L98
        L6f:
            io.sentry.config.a.z(r2, r0, r4)
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
            io.sentry.n1 r1 = io.sentry.EnumC5148n1.ERROR     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "Error processing envelope."
            r4.d(r1, r3, r0)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = io.sentry.config.a.r(r10)
            java.lang.Object r10 = io.sentry.config.a.r(r10)
            boolean r10 = r2.isInstance(r10)
            if (r10 == 0) goto L6f
            if (r0 == 0) goto L6f
            goto L69
        L98:
            return
        L99:
            java.lang.Object r1 = io.sentry.config.a.r(r10)
            java.lang.Object r10 = io.sentry.config.a.r(r10)
            boolean r10 = r2.isInstance(r10)
            if (r10 == 0) goto Laf
            if (r1 == 0) goto Laf
            io.sentry.hints.g r1 = (io.sentry.hints.g) r1
            c(r8, r9, r1)
            goto Lb2
        Laf:
            io.sentry.config.a.z(r2, r1, r4)
        Lb2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.B0.b(java.io.File, io.sentry.y):void");
    }

    public final Y0 d(Y1 y1) {
        String str;
        ILogger iLogger = this.h;
        if (y1 != null && (str = y1.h) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (io.sentry.config.a.y(dValueOf, false)) {
                    return new Y0(Boolean.TRUE, dValueOf);
                }
                iLogger.k(EnumC5148n1.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                iLogger.k(EnumC5148n1.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new Y0(Boolean.TRUE, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:132|60|130|61|(3:122|63|64)(10:67|68|(5:80|83|(1:85)|88|(4:90|137|91|148))(8:72|73|120|74|75|76|143|116)|86|87|79|128|94|138|147)|124|92|93) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0231, code lost:
    
        r11.d(io.sentry.EnumC5148n1.ERROR, "Item failed to process.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(io.sentry.internal.debugmeta.c r20, io.sentry.C5185y r21) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.B0.e(io.sentry.internal.debugmeta.c, io.sentry.y):void");
    }

    public final boolean f(C5185y c5185y) {
        Object objR = io.sentry.config.a.r(c5185y);
        if (objR instanceof io.sentry.hints.f) {
            return ((io.sentry.hints.f) objR).d();
        }
        io.sentry.config.a.z(io.sentry.hints.f.class, objR, this.h);
        return true;
    }
}
