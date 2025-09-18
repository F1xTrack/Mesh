package defpackage;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: lm */
/* loaded from: classes.dex */
public final class C5756lm extends AbstractC6141nn {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ C5756lm() {
    }

    @Override // defpackage.AbstractC6141nn
    public void a(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    AbstractC6141nn abstractC6141nn = (AbstractC6141nn) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(abstractC6141nn)).execute(new RunnableC5338ja(abstractC6141nn, i, 2));
                    } catch (RejectedExecutionException unused) {
                        AbstractC0759Jm0.f("Camera2CameraControlImp");
                    }
                }
                break;
        }
    }

    @Override // defpackage.AbstractC6141nn
    public final void b(int i, InterfaceC7668vn interfaceC7668vn) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    AbstractC6141nn abstractC6141nn = (AbstractC6141nn) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(abstractC6141nn)).execute(new RunnableC6690qf(abstractC6141nn, i, interfaceC7668vn, 2));
                    } catch (RejectedExecutionException unused) {
                        AbstractC0759Jm0.f("Camera2CameraControlImp");
                    }
                }
                break;
            default:
                ((C0365El) this.b).b(null);
                ((InterfaceC6907ro) this.c).z(this);
                break;
        }
    }

    @Override // defpackage.AbstractC6141nn
    public void c(int i, C6714qn c6714qn) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    AbstractC6141nn abstractC6141nn = (AbstractC6141nn) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(abstractC6141nn)).execute(new RunnableC6690qf(abstractC6141nn, i, c6714qn, 1));
                    } catch (RejectedExecutionException unused) {
                        AbstractC0759Jm0.f("Camera2CameraControlImp");
                    }
                }
                break;
        }
    }

    public C5756lm(C0365El c0365El, InterfaceC6907ro interfaceC6907ro) {
        this.b = c0365El;
        this.c = interfaceC6907ro;
    }
}
