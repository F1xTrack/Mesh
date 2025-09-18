package p000;

import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Om */
/* loaded from: classes.dex */
public final class C0930Om implements InterfaceC1118Rm {

    /* renamed from: a */
    public final /* synthetic */ C1056Qm f8612a;

    public C0930Om(C1056Qm c1056Qm) {
        this.f8612a = c1056Qm;
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: a */
    public final InterfaceFutureC7800Jj0 mo4404a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8612a.f9776h.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC1118Rm) it.next()).mo4404a(totalCaptureResult));
        }
        C11834yj0 c11834yj0M7479b = AbstractC8301Sz1.m7479b(arrayList);
        C0553Im c0553Im = new C0553Im(2);
        return AbstractC8301Sz1.m7495r(c11834yj0M7479b, new C7391Bm1(20, c0553Im), QR1.m6703a());
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: b */
    public final boolean mo4405b() {
        Iterator it = this.f8612a.f9776h.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1118Rm) it.next()).mo4405b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: c */
    public final void mo4406c() {
        Iterator it = this.f8612a.f9776h.iterator();
        while (it.hasNext()) {
            ((InterfaceC1118Rm) it.next()).mo4406c();
        }
    }
}
