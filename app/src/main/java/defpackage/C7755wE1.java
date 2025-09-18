package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: wE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7755wE1 implements NZ1, InterfaceC3680ey0, InterfaceC1571Tx0, InterfaceC0947Lx0 {
    public final /* synthetic */ int a;
    public final Executor b;
    public final InterfaceC1651Uy c;
    public final C3892g32 d;

    public /* synthetic */ C7755wE1(Executor executor, InterfaceC1651Uy interfaceC1651Uy, C3892g32 c3892g32, int i) {
        this.a = i;
        this.b = executor;
        this.c = interfaceC1651Uy;
        this.d = c3892g32;
    }

    @Override // defpackage.NZ1
    public final void a(Task task) {
        switch (this.a) {
            case 0:
                this.b.execute(new WZ(this, task, false, 23));
                break;
            default:
                this.b.execute(new XZ(this, task, false, 27));
                break;
        }
    }

    @Override // defpackage.InterfaceC0947Lx0
    public void b() {
        this.d.q();
    }

    @Override // defpackage.InterfaceC1571Tx0
    public void onFailure(Exception exc) {
        this.d.o(exc);
    }

    @Override // defpackage.InterfaceC3680ey0
    public void onSuccess(Object obj) {
        this.d.p(obj);
    }
}
