package defpackage;

/* renamed from: Oo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1154Oo0 {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        defpackage.AbstractC5866mL.p();
        r4 = defpackage.AbstractC5866mL.f();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r5 >= r6.size()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
    
        if (defpackage.AbstractC5866mL.h(r6.get(r5)).covers(r4) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        if (r7 != 1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
        /*
            java.util.List r3 = defpackage.AbstractC5866mL.n(r3)
            r0 = 0
            if (r3 == 0) goto Lc5
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            goto Lc5
        Lf:
            defpackage.AbstractC5866mL.p()
            int r6 = (int) r6
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = defpackage.AbstractC5866mL.g(r4, r5, r6)
            r5 = r0
        L18:
            int r6 = r3.size()
            r7 = 2
            r1 = 1
            if (r5 >= r6) goto L33
            java.lang.Object r6 = r3.get(r5)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r6 = defpackage.AbstractC5866mL.h(r6)
            boolean r6 = defpackage.AbstractC5866mL.s(r6, r4)
            if (r6 == 0) goto L30
            r3 = r7
            goto L34
        L30:
            int r5 = r5 + 1
            goto L18
        L33:
            r3 = r1
        L34:
            if (r3 != r1) goto Lc4
            java.lang.Boolean r4 = defpackage.AbstractC4295iA1.h
            if (r4 != 0) goto Lc4
            int r4 = defpackage.AbstractC0277Dh1.a
            r5 = 35
            if (r4 < r5) goto L43
        L40:
            r1 = r0
            goto Lbb
        L43:
            pX r4 = new pX     // Catch: defpackage.C1778Wo0 -> Lbb
            r4.<init>()     // Catch: defpackage.C1778Wo0 -> Lbb
            java.lang.String r5 = "video/avc"
            java.lang.String r5 = defpackage.AbstractC1865Xr0.n(r5)     // Catch: defpackage.C1778Wo0 -> Lbb
            r4.l = r5     // Catch: defpackage.C1778Wo0 -> Lbb
            qX r5 = new qX     // Catch: defpackage.C1778Wo0 -> Lbb
            r5.<init>(r4)     // Catch: defpackage.C1778Wo0 -> Lbb
            java.lang.String r4 = r5.m     // Catch: defpackage.C1778Wo0 -> Lbb
            if (r4 == 0) goto Lbb
            il r4 = defpackage.C4403il.c     // Catch: defpackage.C1778Wo0 -> Lbb
            fQ0 r4 = defpackage.AbstractC2012Zo0.h(r4, r5, r0, r0)     // Catch: defpackage.C1778Wo0 -> Lbb
            r5 = r0
        L60:
            int r6 = r4.d     // Catch: defpackage.C1778Wo0 -> Lbb
            if (r5 >= r6) goto Lbb
            java.lang.Object r6 = r4.get(r5)     // Catch: defpackage.C1778Wo0 -> Lbb
            No0 r6 = (defpackage.C1076No0) r6     // Catch: defpackage.C1778Wo0 -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.d     // Catch: defpackage.C1778Wo0 -> Lbb
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r4.get(r5)     // Catch: defpackage.C1778Wo0 -> Lbb
            No0 r6 = (defpackage.C1076No0) r6     // Catch: defpackage.C1778Wo0 -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.d     // Catch: defpackage.C1778Wo0 -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: defpackage.C1778Wo0 -> Lbb
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r4.get(r5)     // Catch: defpackage.C1778Wo0 -> Lbb
            No0 r6 = (defpackage.C1076No0) r6     // Catch: defpackage.C1778Wo0 -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.d     // Catch: defpackage.C1778Wo0 -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: defpackage.C1778Wo0 -> Lbb
            java.util.List r6 = defpackage.AbstractC5866mL.n(r6)     // Catch: defpackage.C1778Wo0 -> Lbb
            if (r6 == 0) goto Lb8
            boolean r2 = r6.isEmpty()     // Catch: defpackage.C1778Wo0 -> Lbb
            if (r2 != 0) goto Lb8
            defpackage.AbstractC5866mL.p()     // Catch: defpackage.C1778Wo0 -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = defpackage.AbstractC5866mL.f()     // Catch: defpackage.C1778Wo0 -> Lbb
            r5 = r0
        L9c:
            int r2 = r6.size()     // Catch: defpackage.C1778Wo0 -> Lbb
            if (r5 >= r2) goto Lb4
            java.lang.Object r2 = r6.get(r5)     // Catch: defpackage.C1778Wo0 -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r2 = defpackage.AbstractC5866mL.h(r2)     // Catch: defpackage.C1778Wo0 -> Lbb
            boolean r2 = defpackage.AbstractC5866mL.s(r2, r4)     // Catch: defpackage.C1778Wo0 -> Lbb
            if (r2 == 0) goto Lb1
            goto Lb5
        Lb1:
            int r5 = r5 + 1
            goto L9c
        Lb4:
            r7 = r1
        Lb5:
            if (r7 != r1) goto L40
            goto Lbb
        Lb8:
            int r5 = r5 + 1
            goto L60
        Lbb:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            defpackage.AbstractC4295iA1.h = r4
            if (r1 == 0) goto Lc4
            return r0
        Lc4:
            return r3
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1154Oo0.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }
}
