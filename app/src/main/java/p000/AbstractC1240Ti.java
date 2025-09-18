package p000;

import android.content.Context;

/* renamed from: Ti */
/* loaded from: classes2.dex */
public abstract class AbstractC1240Ti {

    /* renamed from: a */
    public static final C6318kj f11470a = new C6318kj();

    /* renamed from: b */
    public static volatile C8342Tu0 f11471b;

    /* renamed from: c */
    public static volatile C7978Mu0 f11472c;

    /* renamed from: a */
    public static final boolean m7728a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        O90.m5968f(bArr, "a");
        O90.m5968f(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m7729b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM26239p = AbstractC7222ym.m26239p("size=", j, " offset=");
            sbM26239p.append(j2);
            sbM26239p.append(" byteCount=");
            sbM26239p.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbM26239p.toString());
        }
    }

    /* renamed from: c */
    public static boolean m7730c() {
        return C1303Ui.f11981d;
    }

    /* renamed from: d */
    public static C7978Mu0 m7731d(Context context) {
        Context applicationContext = context.getApplicationContext();
        C7978Mu0 c7978Mu0 = f11472c;
        if (c7978Mu0 == null) {
            synchronized (C7978Mu0.class) {
                try {
                    c7978Mu0 = f11472c;
                    if (c7978Mu0 == null) {
                        c7978Mu0 = new C7978Mu0(0, new C8158Qg0(applicationContext));
                        f11472c = c7978Mu0;
                    }
                } finally {
                }
            }
        }
        return c7978Mu0;
    }

    /* renamed from: e */
    public static final String m7732e(byte b) {
        char[] cArr = AbstractC1141S8.f10591a;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }
}
