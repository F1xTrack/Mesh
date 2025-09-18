package defpackage;

import android.content.Context;

/* renamed from: tG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7189tG1 implements InterfaceC6053nJ1, LM {
    public final /* synthetic */ int a;

    public /* synthetic */ C7189tG1(int i) {
        this.a = i;
    }

    @Override // defpackage.LM
    public C7902x1 a(Context context, String str, KM km) {
        C7902x1 c7902x1 = new C7902x1();
        int iB = km.b(context, str);
        c7902x1.a = iB;
        if (iB != 0) {
            c7902x1.c = -1;
        } else {
            int iA = km.a(context, str, true);
            c7902x1.b = iA;
            if (iA != 0) {
                c7902x1.c = 1;
            }
        }
        return c7902x1;
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 0:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.d.a()).longValue());
            case 1:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.P.a()).longValue());
            default:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.j0.a()).longValue());
        }
    }
}
