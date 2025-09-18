package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* renamed from: gG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3931gG1 implements InterfaceC0940Lv, InterfaceC6053nJ1, InterfaceC1571Tx0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C3931gG1(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        C1399Rs c1399Rs = new C1399Rs();
        DL0 dl0 = new DL0(1);
        ReferenceQueue referenceQueue = c1399Rs.a;
        Set set = c1399Rs.b;
        set.add(new C6611qE1(c1399Rs, referenceQueue, set, dl0));
        Thread thread = new Thread(new WZ(referenceQueue, 22, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c1399Rs;
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 1:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.O.a()).longValue());
            case 2:
                CX1.b.get();
                Boolean bool = (Boolean) HX1.c.a();
                bool.getClass();
                return bool;
            default:
                C4179hZ1.b.get();
                Boolean bool2 = (Boolean) C6101nZ1.a.a();
                bool2.getClass();
                return bool2;
        }
    }

    @Override // defpackage.InterfaceC1571Tx0
    public void onFailure(Exception exc) {
    }
}
