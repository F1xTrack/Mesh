package defpackage;

import android.util.Base64;
import android.util.Log;

/* renamed from: Xv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1878Xv1 {
    public final C8077xw1 a;

    public C1878Xv1(C8077xw1 c8077xw1) {
        this.a = c8077xw1;
    }

    public final C3892g32 a(C0466Fs1 c0466Fs1) {
        boolean z = false;
        C8077xw1 c8077xw1 = this.a;
        if (c8077xw1.c == null) {
            return AbstractC3782fU1.d(new C5640l90(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(c0466Fs1.a, 10);
            Long l = c0466Fs1.b;
            c8077xw1.a.a("requestIntegrityToken(%s)", c0466Fs1);
            S81 s81 = new S81();
            C0244Cw1 c0244Cw1 = c8077xw1.c;
            C7506uw1 c7506uw1 = new C7506uw1(c8077xw1, s81, bArrDecode, l, s81, c0466Fs1);
            synchronized (c0244Cw1.f) {
                c0244Cw1.e.add(s81);
                s81.a.b(new VH(c0244Cw1, s81, z, 26));
            }
            synchronized (c0244Cw1.f) {
                try {
                    if (c0244Cw1.k.getAndIncrement() > 0) {
                        C0085Av1 c0085Av1 = c0244Cw1.b;
                        Object[] objArr = new Object[0];
                        if (Log.isLoggable("PlayCore", 3)) {
                            C0085Av1.b(c0085Av1.a, "Already connected to the service.", objArr);
                        } else {
                            c0085Av1.getClass();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0244Cw1.a().post(new C3484dw1(c0244Cw1, s81, c7506uw1));
            return s81.a;
        } catch (IllegalArgumentException e) {
            return AbstractC3782fU1.d(new C5640l90(-13, e));
        }
    }
}
