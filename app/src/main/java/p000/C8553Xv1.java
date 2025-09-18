package p000;

import android.util.Base64;
import android.util.Log;

/* renamed from: Xv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8553Xv1 {

    /* renamed from: a */
    public final C11734xw1 f14050a;

    public C8553Xv1(C11734xw1 c11734xw1) {
        this.f14050a = c11734xw1;
    }

    /* renamed from: a */
    public final C9450g32 m9183a(C7611Fs1 c7611Fs1) {
        boolean z = false;
        C11734xw1 c11734xw1 = this.f14050a;
        if (c11734xw1.f45911c == null) {
            return AbstractC9376fU1.m18243d(new C10101l90(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(c7611Fs1.f3457a, 10);
            Long l = c7611Fs1.f3458b;
            c11734xw1.f45909a.m409a("requestIntegrityToken(%s)", c7611Fs1);
            S81 s81 = new S81();
            C7463Cw1 c7463Cw1 = c11734xw1.f45911c;
            C11352uw1 c11352uw1 = new C11352uw1(c11734xw1, s81, bArrDecode, l, s81, c7611Fs1);
            synchronized (c7463Cw1.f1772f) {
                c7463Cw1.f1771e.add(s81);
                s81.f10598a.mo11135b(new C1339VH(c7463Cw1, s81, z, 26));
            }
            synchronized (c7463Cw1.f1772f) {
                try {
                    if (c7463Cw1.f1777k.getAndIncrement() > 0) {
                        C7357Av1 c7357Av1 = c7463Cw1.f1768b;
                        Object[] objArr = new Object[0];
                        if (Log.isLoggable("PlayCore", 3)) {
                            C7357Av1.m408b(c7357Av1.f470a, "Already connected to the service.", objArr);
                        } else {
                            c7357Av1.getClass();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c7463Cw1.m1477a().post(new C9176dw1(c7463Cw1, s81, c11352uw1));
            return s81.f10598a;
        } catch (IllegalArgumentException e) {
            return AbstractC9376fU1.m18243d(new C10101l90(-13, e));
        }
    }
}
