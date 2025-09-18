package p000;

import android.content.Context;

/* renamed from: bH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8833bH1 implements InterfaceC10378nJ1, InterfaceC0750Lv, InterfaceC0716LM {

    /* renamed from: a */
    public final /* synthetic */ int f16928a;

    public /* synthetic */ C8833bH1(int i) {
        this.f16928a = i;
    }

    @Override // p000.InterfaceC0716LM
    /* renamed from: a */
    public C7112x1 mo4958a(Context context, String str, InterfaceC0653KM interfaceC0653KM) {
        int iMo4617a;
        C7112x1 c7112x1 = new C7112x1();
        int iMo4618b = interfaceC0653KM.mo4618b(context, str);
        c7112x1.f45257a = iMo4618b;
        int i = 1;
        int i2 = 0;
        if (iMo4618b != 0) {
            iMo4617a = interfaceC0653KM.mo4617a(context, str, false);
            c7112x1.f45258b = iMo4617a;
        } else {
            iMo4617a = interfaceC0653KM.mo4617a(context, str, true);
            c7112x1.f45258b = iMo4617a;
        }
        int i3 = c7112x1.f45257a;
        if (i3 == 0) {
            if (iMo4617a == 0) {
                i = 0;
            }
            c7112x1.f45259c = i;
            return c7112x1;
        }
        i2 = i3;
        if (i2 >= iMo4617a) {
            i = -1;
        }
        c7112x1.f45259c = i;
        return c7112x1;
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        return new C6914tt(0);
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f16928a) {
            case 0:
                PW1.f9104b.get();
                return (String) UW1.f11851S.m8754a();
            default:
                C9642hZ1.f28461b.get();
                Boolean bool = (Boolean) C10410nZ1.f38375g.m8754a();
                bool.getClass();
                return bool;
        }
    }
}
