package defpackage;

import java.io.EOFException;

/* renamed from: e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3494e {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC7680vr.a);
        O90.e(bytes, "this as java.lang.String).getBytes(charset)");
        a = bytes;
    }

    public static final String a(C6129nj c6129nj, long j) throws EOFException {
        O90.f(c6129nj, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (c6129nj.x(j2) == 13) {
                String strD0 = c6129nj.d0(j2, AbstractC7680vr.a);
                c6129nj.i0(2L);
                return strD0;
            }
        }
        String strD02 = c6129nj.d0(j, AbstractC7680vr.a);
        c6129nj.i0(1L);
        return strD02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r19 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(defpackage.C6129nj r17, defpackage.C0717Iy0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3494e.b(nj, Iy0, boolean):int");
    }
}
