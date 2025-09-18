package defpackage;

import android.content.Context;

/* renamed from: hH1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C4125hH1 implements InterfaceC6053nJ1, LM {
    public final /* synthetic */ int a;

    public /* synthetic */ C4125hH1(int i) {
        this.a = i;
    }

    @Override // defpackage.LM
    public C7902x1 a(Context context, String str, KM km) {
        C7902x1 c7902x1 = new C7902x1();
        int iA = km.a(context, str, true);
        c7902x1.b = iA;
        if (iA != 0) {
            c7902x1.c = 1;
        } else {
            int iB = km.b(context, str);
            c7902x1.a = iB;
            if (iB != 0) {
                c7902x1.c = -1;
            }
        }
        return c7902x1;
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 0:
                PW1.b.get();
                Long l = (Long) UW1.i.a();
                l.getClass();
                return l;
            default:
                C4179hZ1.b.get();
                Boolean bool = (Boolean) C6101nZ1.e.a();
                bool.getClass();
                return bool;
        }
    }
}
