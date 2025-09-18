package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Vo */
/* loaded from: classes.dex */
public final /* synthetic */ class C1699Vo implements InterfaceC6556py {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C1699Vo(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC6556py
    public final void b(Object obj) {
        switch (this.a) {
            case 0:
                ((Surface) this.b).release();
                ((SurfaceTexture) this.c).release();
                break;
            case 1:
                JG jg = (JG) this.b;
                jg.getClass();
                T61 t61 = (T61) this.c;
                t61.close();
                Surface surface = (Surface) jg.h.remove(t61);
                if (surface != null) {
                    C6557py0 c6557py0 = jg.a;
                    AbstractC3306d00.d((AtomicBoolean) c6557py0.d, true);
                    AbstractC3306d00.c((Thread) c6557py0.f);
                    c6557py0.j(surface, true);
                    break;
                }
                break;
            case 2:
                C5869mM c5869mM = (C5869mM) this.b;
                c5869mM.getClass();
                T61 t612 = (T61) this.c;
                t612.close();
                Surface surface2 = (Surface) c5869mM.h.remove(t612);
                if (surface2 != null) {
                    C5487kM c5487kM = c5869mM.a;
                    AbstractC3306d00.d((AtomicBoolean) c5487kM.d, true);
                    AbstractC3306d00.c((Thread) c5487kM.f);
                    c5487kM.j(surface2, true);
                    break;
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                C3954gO0 c3954gO0 = (C3954gO0) this.b;
                if (c3954gO0.W == null) {
                    if (th instanceof UN) {
                        c3954gO0.y(5);
                    } else {
                        c3954gO0.y(6);
                    }
                    c3954gO0.W = th;
                    c3954gO0.I();
                    ((C0365El) this.c).b(null);
                    break;
                }
                break;
        }
    }
}
