package p000;

import android.content.Context;

/* renamed from: tG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11140tG1 implements InterfaceC10378nJ1, InterfaceC0716LM {

    /* renamed from: a */
    public final /* synthetic */ int f42988a;

    public /* synthetic */ C11140tG1(int i) {
        this.f42988a = i;
    }

    @Override // p000.InterfaceC0716LM
    /* renamed from: a */
    public C7112x1 mo4958a(Context context, String str, InterfaceC0653KM interfaceC0653KM) {
        C7112x1 c7112x1 = new C7112x1();
        int iMo4618b = interfaceC0653KM.mo4618b(context, str);
        c7112x1.f45257a = iMo4618b;
        if (iMo4618b != 0) {
            c7112x1.f45259c = -1;
        } else {
            int iMo4617a = interfaceC0653KM.mo4617a(context, str, true);
            c7112x1.f45258b = iMo4617a;
            if (iMo4617a != 0) {
                c7112x1.f45259c = 1;
            }
        }
        return c7112x1;
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f42988a) {
            case 0:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11865d.m8754a()).longValue());
            case 1:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11848P.m8754a()).longValue());
            default:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11878j0.m8754a()).longValue());
        }
    }
}
