package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: iU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4355iU1 {
    public static final Object a(C3892g32 c3892g32, Q80 q80) {
        if (!c3892g32.j()) {
            C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(q80));
            c0767Jp.s();
            c3892g32.m(TJ.c, new A61(1, c0767Jp));
            Object objR = c0767Jp.r();
            EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
            return objR;
        }
        Exception excH = c3892g32.h();
        if (excH != null) {
            throw excH;
        }
        if (!c3892g32.d) {
            return c3892g32.i();
        }
        throw new CancellationException("Task " + c3892g32 + " was cancelled normally.");
    }

    public static int b(boolean z, int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long c(int r14, java.lang.String r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4355iU1.c(int, java.lang.String):long");
    }
}
