package defpackage;

import android.content.Context;

/* renamed from: bH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2296bH1 implements InterfaceC6053nJ1, InterfaceC0940Lv, LM {
    public final /* synthetic */ int a;

    public /* synthetic */ C2296bH1(int i) {
        this.a = i;
    }

    @Override // defpackage.LM
    public C7902x1 a(Context context, String str, KM km) {
        int iA;
        C7902x1 c7902x1 = new C7902x1();
        int iB = km.b(context, str);
        c7902x1.a = iB;
        int i = 1;
        int i2 = 0;
        if (iB != 0) {
            iA = km.a(context, str, false);
            c7902x1.b = iA;
        } else {
            iA = km.a(context, str, true);
            c7902x1.b = iA;
        }
        int i3 = c7902x1.a;
        if (i3 == 0) {
            if (iA == 0) {
                i = 0;
            }
            c7902x1.c = i;
            return c7902x1;
        }
        i2 = i3;
        if (i2 >= iA) {
            i = -1;
        }
        c7902x1.c = i;
        return c7902x1;
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        return new C7304tt(0);
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 0:
                PW1.b.get();
                return (String) UW1.S.a();
            default:
                C4179hZ1.b.get();
                Boolean bool = (Boolean) C6101nZ1.g.a();
                bool.getClass();
                return bool;
        }
    }
}
