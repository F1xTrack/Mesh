package defpackage;

import android.content.Context;

/* renamed from: Ti */
/* loaded from: classes2.dex */
public abstract class AbstractC1525Ti {
    public static final C5556kj a = new C5556kj();
    public static volatile C1562Tu0 b;
    public static volatile C1016Mu0 c;

    public static final boolean a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        O90.f(bArr, "a");
        O90.f(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbP = AbstractC8235ym.p("size=", j, " offset=");
            sbP.append(j2);
            sbP.append(" byteCount=");
            sbP.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbP.toString());
        }
    }

    public static boolean c() {
        return C1603Ui.d;
    }

    public static C1016Mu0 d(Context context) {
        Context applicationContext = context.getApplicationContext();
        C1016Mu0 c1016Mu0 = c;
        if (c1016Mu0 == null) {
            synchronized (C1016Mu0.class) {
                try {
                    c1016Mu0 = c;
                    if (c1016Mu0 == null) {
                        c1016Mu0 = new C1016Mu0(0, new C1286Qg0(applicationContext));
                        c = c1016Mu0;
                    }
                } finally {
                }
            }
        }
        return c1016Mu0;
    }

    public static final String e(byte b2) {
        char[] cArr = S8.a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }
}
