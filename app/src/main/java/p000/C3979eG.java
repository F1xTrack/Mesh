package p000;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: eG */
/* loaded from: classes.dex */
public class C3979eG implements InterfaceC8525Xh1, InterfaceC11025sN0, InterfaceC0653KM {

    /* renamed from: a */
    public final /* synthetic */ int f26622a;

    /* renamed from: b */
    public int f26623b;

    public /* synthetic */ C3979eG(int i) {
        this.f26622a = i;
    }

    /* renamed from: c */
    public static C9407fk0 m17890c(C9279ek0 c9279ek0, C0986Pf c0986Pf) {
        int i;
        IOException iOException = (IOException) c0986Pf.f9217c;
        if (!(iOException instanceof C11243u40) || ((i = ((C11243u40) iOException).f43483d) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (c9279ek0.m18026a(1)) {
            return new C9407fk0(1, 300000L);
        }
        if (c9279ek0.m18026a(2)) {
            return new C9407fk0(2, 60000L);
        }
        return null;
    }

    @Override // p000.InterfaceC0653KM
    /* renamed from: a */
    public int mo4617a(Context context, String str, boolean z) {
        return 0;
    }

    @Override // p000.InterfaceC0653KM
    /* renamed from: b */
    public int mo4618b(Context context, String str) {
        return this.f26623b;
    }

    /* renamed from: d */
    public int mo17891d(int i) {
        int i2 = this.f26623b;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    /* renamed from: e */
    public long mo17892e(C0986Pf c0986Pf) {
        Throwable cause = (IOException) c0986Pf.f9217c;
        if (!(cause instanceof C10103lA0) && !(cause instanceof FileNotFoundException) && !(cause instanceof C10731q40) && !(cause instanceof C10559ok0)) {
            int i = C1650aD.f15394b;
            while (cause != null) {
                if (!(cause instanceof C1650aD) || ((C1650aD) cause).f15395a != 2008) {
                    cause = cause.getCause();
                }
            }
            return Math.min((c0986Pf.f9216b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    @Override // p000.InterfaceC11025sN0
    public Object getValue(Object obj, InterfaceC10293mf0 interfaceC10293mf0) {
        AbstractC0828N9 abstractC0828N9 = (AbstractC0828N9) obj;
        O90.m5968f(abstractC0828N9, "thisRef");
        O90.m5968f(interfaceC10293mf0, "property");
        return abstractC0828N9.f7533a.get(this.f26623b);
    }

    public String toString() {
        switch (this.f26622a) {
            case 2:
                return String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f26623b)}, 1));
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x00d1  */
    @Override // p000.InterfaceC8525Xh1
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo407z(p000.AbstractC11947zc0 r21, float r22) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3979eG.mo407z(zc0, float):java.lang.Object");
    }

    public /* synthetic */ C3979eG(int i, int i2) {
        this.f26622a = i2;
        this.f26623b = i;
    }
}
