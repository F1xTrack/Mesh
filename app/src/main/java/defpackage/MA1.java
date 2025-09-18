package defpackage;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* loaded from: classes.dex */
public abstract class MA1 {
    public static ClassLoader a;
    public static Thread b;
    public static final String[] c = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] d = {44100, 48000, 32000};
    public static final int[] e = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] h = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] i = {JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static C5960mq0 a(R22 r22) {
        if (r22 instanceof C5921md0) {
            C5921md0 c5921md0 = (C5921md0) r22;
            String str = c5921md0.b;
            O90.f(str, "name");
            String str2 = c5921md0.c;
            O90.f(str2, "desc");
            return new C5960mq0(str.concat(str2));
        }
        if (!(r22 instanceof C5730ld0)) {
            throw new C7074sg();
        }
        C5730ld0 c5730ld0 = (C5730ld0) r22;
        String str3 = c5730ld0.b;
        O90.f(str3, "name");
        String str4 = c5730ld0.c;
        O90.f(str4, "desc");
        return new C5960mq0(str3 + '#' + str4);
    }

    public static int b(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = d[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? e[i5 - 1] : f[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? g[i5 - 1] : h[i5 - 1] : i[i5 - 1];
        if (i3 == 3) {
            return ((i9 * 144) / i7) + i8;
        }
        return (((i4 == 1 ? 72 : 144) * i9) / i7) + i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0093 A[Catch: all -> 0x008f, PHI: r1
  0x0093: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v14 java.lang.Thread) binds: [B:7:0x000a, B:47:0x008c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x008a, B:61:0x00a2, B:12:0x001f, B:52:0x0092, B:53:0x0093, B:64:0x00a6, B:65:0x00a7, B:54:0x0094, B:60:0x00a1, B:59:0x009e, B:13:0x0020, B:15:0x002d, B:25:0x0046, B:26:0x004d, B:28:0x0058, B:34:0x006d, B:35:0x0074, B:43:0x0085, B:44:0x0088, B:18:0x003c), top: B:80:0x0003, inners: #2, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader c() {
        /*
            java.lang.Class<MA1> r0 = defpackage.MA1.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = defpackage.MA1.a     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto La7
            java.lang.Thread r1 = defpackage.MA1.b     // Catch: java.lang.Throwable -> L8f
            r2 = 0
            if (r1 != 0) goto L93
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L8f
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> L8f
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L1d
            r1 = r2
            goto L8a
        L1d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L8f
            int r4 = r1.activeGroupCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r1.enumerate(r5)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r6 = 0
            r7 = r6
        L2b:
            if (r7 >= r4) goto L43
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            if (r9 == 0) goto L3c
            goto L44
        L3c:
            int r7 = r7 + 1
            goto L2b
        L3f:
            r1 = move-exception
            goto L91
        L41:
            r1 = move-exception
            goto L83
        L43:
            r8 = r2
        L44:
            if (r8 != 0) goto L4d
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
        L4d:
            int r1 = r8.activeCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r8.enumerate(r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
        L56:
            if (r6 >= r1) goto L6a
            r5 = r4[r6]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            if (r7 == 0) goto L67
            goto L6b
        L67:
            int r6 = r6 + 1
            goto L56
        L6a:
            r5 = r2
        L6b:
            if (r5 != 0) goto L88
            s9 r1 = new s9     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L81
            java.lang.String r4 = "GmsDynamite"
            r1.<init>(r8, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L81
            r1.setContextClassLoader(r2)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7c
            r1.start()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7c
            r5 = r1
            goto L88
        L7c:
            r4 = move-exception
            r5 = r1
            goto L85
        L7f:
            r4 = r1
            goto L85
        L81:
            r1 = move-exception
            goto L7f
        L83:
            r4 = r1
            r5 = r2
        L85:
            r4.getMessage()     // Catch: java.lang.Throwable -> L3f
        L88:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            r1 = r5
        L8a:
            defpackage.MA1.b = r1     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L93
            goto La2
        L8f:
            r1 = move-exception
            goto Lab
        L91:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> L8f
        L93:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.Thread r3 = defpackage.MA1.b     // Catch: java.lang.Throwable -> L9b java.lang.SecurityException -> L9d
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch: java.lang.Throwable -> L9b java.lang.SecurityException -> L9d
            goto La1
        L9b:
            r2 = move-exception
            goto La5
        L9d:
            r3 = move-exception
            r3.getMessage()     // Catch: java.lang.Throwable -> L9b
        La1:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9b
        La2:
            defpackage.MA1.a = r2     // Catch: java.lang.Throwable -> L8f
            goto La7
        La5:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9b
            throw r2     // Catch: java.lang.Throwable -> L8f
        La7:
            java.lang.ClassLoader r1 = defpackage.MA1.a     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r0)
            return r1
        Lab:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MA1.c():java.lang.ClassLoader");
    }
}
