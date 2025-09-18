package defpackage;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: eG */
/* loaded from: classes.dex */
public class C3547eG implements InterfaceC1836Xh1, InterfaceC7018sN0, KM {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ C3547eG(int i) {
        this.a = i;
    }

    public static C3829fk0 c(C3638ek0 c3638ek0, C1204Pf c1204Pf) {
        int i;
        IOException iOException = (IOException) c1204Pf.c;
        if (!(iOException instanceof C7343u40) || ((i = ((C7343u40) iOException).d) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (c3638ek0.a(1)) {
            return new C3829fk0(1, 300000L);
        }
        if (c3638ek0.a(2)) {
            return new C3829fk0(2, 60000L);
        }
        return null;
    }

    @Override // defpackage.KM
    public int a(Context context, String str, boolean z) {
        return 0;
    }

    @Override // defpackage.KM
    public int b(Context context, String str) {
        return this.b;
    }

    public int d(int i) {
        int i2 = this.b;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    public long e(C1204Pf c1204Pf) {
        Throwable cause = (IOException) c1204Pf.c;
        if (!(cause instanceof C5643lA0) && !(cause instanceof FileNotFoundException) && !(cause instanceof C6580q40) && !(cause instanceof C6324ok0)) {
            int i = C2091aD.b;
            while (cause != null) {
                if (!(cause instanceof C2091aD) || ((C2091aD) cause).a != 2008) {
                    cause = cause.getCause();
                }
            }
            return Math.min((c1204Pf.b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC7018sN0
    public Object getValue(Object obj, InterfaceC5927mf0 interfaceC5927mf0) {
        N9 n9 = (N9) obj;
        O90.f(n9, "thisRef");
        O90.f(interfaceC5927mf0, "property");
        return n9.a.get(this.b);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.b)}, 1));
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x00d1  */
    @Override // defpackage.InterfaceC1836Xh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object z(defpackage.AbstractC8396zc0 r21, float r22) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3547eG.z(zc0, float):java.lang.Object");
    }

    public /* synthetic */ C3547eG(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
