package p000;

import java.io.EOFException;

/* renamed from: e */
/* loaded from: classes2.dex */
public abstract class AbstractC3962e {

    /* renamed from: a */
    public static final byte[] f26471a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC7038vr.f44561a);
        O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
        f26471a = bytes;
    }

    /* renamed from: a */
    public static final String m17809a(C6507nj c6507nj, long j) throws EOFException {
        O90.m5968f(c6507nj, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (c6507nj.m23202x(j2) == 13) {
                String strM23182d0 = c6507nj.m23182d0(j2, AbstractC7038vr.f44561a);
                c6507nj.m23185i0(2L);
                return strM23182d0;
            }
        }
        String strM23182d02 = c6507nj.m23182d0(j, AbstractC7038vr.f44561a);
        c6507nj.m23185i0(1L);
        return strM23182d02;
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m17810b(p000.C6507nj r17, p000.C7778Iy0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC3962e.m17810b(nj, Iy0, boolean):int");
    }
}
