package p000;

import android.content.Context;

/* renamed from: hH1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C9606hH1 implements InterfaceC10378nJ1, InterfaceC0716LM {

    /* renamed from: a */
    public final /* synthetic */ int f28368a;

    public /* synthetic */ C9606hH1(int i) {
        this.f28368a = i;
    }

    @Override // p000.InterfaceC0716LM
    /* renamed from: a */
    public C7112x1 mo4958a(Context context, String str, InterfaceC0653KM interfaceC0653KM) {
        C7112x1 c7112x1 = new C7112x1();
        int iMo4617a = interfaceC0653KM.mo4617a(context, str, true);
        c7112x1.f45258b = iMo4617a;
        if (iMo4617a != 0) {
            c7112x1.f45259c = 1;
        } else {
            int iMo4618b = interfaceC0653KM.mo4618b(context, str);
            c7112x1.f45257a = iMo4618b;
            if (iMo4618b != 0) {
                c7112x1.f45259c = -1;
            }
        }
        return c7112x1;
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f28368a) {
            case 0:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11875i.m8754a();
                l.getClass();
                return l;
            default:
                C9642hZ1.f28461b.get();
                Boolean bool = (Boolean) C10410nZ1.f38373e.m8754a();
                bool.getClass();
                return bool;
        }
    }
}
