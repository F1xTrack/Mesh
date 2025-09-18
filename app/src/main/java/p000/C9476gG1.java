package p000;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* renamed from: gG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9476gG1 implements InterfaceC0750Lv, InterfaceC10378nJ1, InterfaceC8348Tx0 {

    /* renamed from: a */
    public final /* synthetic */ int f27658a;

    public /* synthetic */ C9476gG1(int i) {
        this.f27658a = i;
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        C1124Rs c1124Rs = new C1124Rs();
        DL0 dl0 = new DL0(1);
        ReferenceQueue referenceQueue = c1124Rs.f10463a;
        Set set = c1124Rs.f10464b;
        set.add(new C10752qE1(c1124Rs, referenceQueue, set, dl0));
        Thread thread = new Thread(new RunnableC1420WZ(referenceQueue, 22, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c1124Rs;
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f27658a) {
            case 1:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11847O.m8754a()).longValue());
            case 2:
                CX1.f1423b.get();
                Boolean bool = (Boolean) HX1.f4338c.m8754a();
                bool.getClass();
                return bool;
            default:
                C9642hZ1.f28461b.get();
                Boolean bool2 = (Boolean) C10410nZ1.f38369a.m8754a();
                bool2.getClass();
                return bool2;
        }
    }

    @Override // p000.InterfaceC8348Tx0
    public void onFailure(Exception exc) {
    }
}
