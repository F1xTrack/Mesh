package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Om */
/* loaded from: classes.dex */
public final class C1147Om implements InterfaceC1381Rm {
    public final /* synthetic */ C1303Qm a;

    public C1147Om(C1303Qm c1303Qm) {
        this.a = c1303Qm;
    }

    @Override // defpackage.InterfaceC1381Rm
    public final InterfaceFutureC0750Jj0 a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC1381Rm) it.next()).a(totalCaptureResult));
        }
        C8227yj0 c8227yj0B = AbstractC1500Sz1.b(arrayList);
        C0680Im c0680Im = new C0680Im(2);
        return AbstractC1500Sz1.r(c8227yj0B, new C0136Bm1(20, c0680Im), QR1.a());
    }

    @Override // defpackage.InterfaceC1381Rm
    public final boolean b() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1381Rm) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1381Rm
    public final void c() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((InterfaceC1381Rm) it.next()).c();
        }
    }
}
