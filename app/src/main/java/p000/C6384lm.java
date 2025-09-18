package p000;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: lm */
/* loaded from: classes.dex */
public final class C6384lm extends AbstractC6511nn {

    /* renamed from: a */
    public final /* synthetic */ int f37284a = 0;

    /* renamed from: b */
    public Object f37285b;

    /* renamed from: c */
    public Object f37286c;

    public /* synthetic */ C6384lm() {
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: a */
    public void mo6422a(int i) {
        switch (this.f37284a) {
            case 0:
                Iterator it = ((HashSet) this.f37285b).iterator();
                while (it.hasNext()) {
                    AbstractC6511nn abstractC6511nn = (AbstractC6511nn) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.f37286c).get(abstractC6511nn)).execute(new RunnableC6246ja(abstractC6511nn, i, 2));
                    } catch (RejectedExecutionException unused) {
                        AbstractC7806Jm0.m4412f("Camera2CameraControlImp");
                    }
                }
                break;
        }
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: b */
    public final void mo5817b(int i, InterfaceC7034vn interfaceC7034vn) {
        switch (this.f37284a) {
            case 0:
                Iterator it = ((HashSet) this.f37285b).iterator();
                while (it.hasNext()) {
                    AbstractC6511nn abstractC6511nn = (AbstractC6511nn) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.f37286c).get(abstractC6511nn)).execute(new RunnableC6694qf(abstractC6511nn, i, interfaceC7034vn, 2));
                    } catch (RejectedExecutionException unused) {
                        AbstractC7806Jm0.m4412f("Camera2CameraControlImp");
                    }
                }
                break;
            default:
                ((C0300El) this.f37285b).m2375b(null);
                ((InterfaceC6766ro) this.f37286c).mo2414z(this);
                break;
        }
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: c */
    public void mo6423c(int i, C6702qn c6702qn) {
        switch (this.f37284a) {
            case 0:
                Iterator it = ((HashSet) this.f37285b).iterator();
                while (it.hasNext()) {
                    AbstractC6511nn abstractC6511nn = (AbstractC6511nn) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.f37286c).get(abstractC6511nn)).execute(new RunnableC6694qf(abstractC6511nn, i, c6702qn, 1));
                    } catch (RejectedExecutionException unused) {
                        AbstractC7806Jm0.m4412f("Camera2CameraControlImp");
                    }
                }
                break;
        }
    }

    public C6384lm(C0300El c0300El, InterfaceC6766ro interfaceC6766ro) {
        this.f37285b = c0300El;
        this.f37286c = interfaceC6766ro;
    }
}
