package p000;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: wE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11519wE1 implements NZ1, InterfaceC9307ey0, InterfaceC8348Tx0, InterfaceC7932Lx0 {

    /* renamed from: a */
    public final /* synthetic */ int f44721a;

    /* renamed from: b */
    public final Executor f44722b;

    /* renamed from: c */
    public final InterfaceC1319Uy f44723c;

    /* renamed from: d */
    public final C9450g32 f44724d;

    public /* synthetic */ C11519wE1(Executor executor, InterfaceC1319Uy interfaceC1319Uy, C9450g32 c9450g32, int i) {
        this.f44721a = i;
        this.f44722b = executor;
        this.f44723c = interfaceC1319Uy;
        this.f44724d = c9450g32;
    }

    @Override // p000.NZ1
    /* renamed from: a */
    public final void mo4299a(Task task) {
        switch (this.f44721a) {
            case 0:
                this.f44722b.execute(new RunnableC1420WZ(this, task, false, 23));
                break;
            default:
                this.f44722b.execute(new RunnableC1483XZ(this, task, false, 27));
                break;
        }
    }

    @Override // p000.InterfaceC7932Lx0
    /* renamed from: b */
    public void mo4300b() {
        this.f44724d.m18390q();
    }

    @Override // p000.InterfaceC8348Tx0
    public void onFailure(Exception exc) {
        this.f44724d.m18388o(exc);
    }

    @Override // p000.InterfaceC9307ey0
    public void onSuccess(Object obj) {
        this.f44724d.m18389p(obj);
    }
}
