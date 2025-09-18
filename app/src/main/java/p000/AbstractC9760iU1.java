package p000;

import java.util.concurrent.CancellationException;

/* renamed from: iU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9760iU1 {
    /* renamed from: a */
    public static final Object m19049a(C9450g32 c9450g32, Q80 q80) {
        if (!c9450g32.mo11143j()) {
            C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(q80));
            c0619Jp.m4439s();
            c9450g32.m18386m(ExecutorC1215TJ.f11317c, new A61(1, c0619Jp));
            Object objM4438r = c0619Jp.m4438r();
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            return objM4438r;
        }
        Exception excMo11141h = c9450g32.mo11141h();
        if (excMo11141h != null) {
            throw excMo11141h;
        }
        if (!c9450g32.f27546d) {
            return c9450g32.mo11142i();
        }
        throw new CancellationException("Task " + c9450g32 + " was cancelled normally.");
    }

    /* renamed from: b */
    public static int m19050b(boolean z, int i, int i2, String str) {
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
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m19051c(int r14, java.lang.String r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC9760iU1.m19051c(int, java.lang.String):long");
    }
}
