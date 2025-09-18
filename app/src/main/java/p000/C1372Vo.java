package p000;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Vo */
/* loaded from: classes.dex */
public final /* synthetic */ class C1372Vo implements InterfaceC6650py {

    /* renamed from: a */
    public final /* synthetic */ int f12757a;

    /* renamed from: b */
    public final /* synthetic */ Object f12758b;

    /* renamed from: c */
    public final /* synthetic */ Object f12759c;

    public /* synthetic */ C1372Vo(Object obj, int i, Object obj2) {
        this.f12757a = i;
        this.f12758b = obj;
        this.f12759c = obj2;
    }

    @Override // p000.InterfaceC6650py
    /* renamed from: b */
    public final void mo3020b(Object obj) {
        switch (this.f12757a) {
            case 0:
                ((Surface) this.f12758b).release();
                ((SurfaceTexture) this.f12759c).release();
                break;
            case 1:
                C0584JG c0584jg = (C0584JG) this.f12758b;
                c0584jg.getClass();
                T61 t61 = (T61) this.f12759c;
                t61.close();
                Surface surface = (Surface) c0584jg.f5437h.remove(t61);
                if (surface != null) {
                    C10715py0 c10715py0 = c0584jg.f5430a;
                    AbstractC9055d00.m17455d((AtomicBoolean) c10715py0.f40464d, true);
                    AbstractC9055d00.m17454c((Thread) c10715py0.f40466f);
                    c10715py0.m23914j(surface, true);
                    break;
                }
                break;
            case 2:
                C6421mM c6421mM = (C6421mM) this.f12758b;
                c6421mM.getClass();
                T61 t612 = (T61) this.f12759c;
                t612.close();
                Surface surface2 = (Surface) c6421mM.f37646h.remove(t612);
                if (surface2 != null) {
                    C6295kM c6295kM = c6421mM.f37639a;
                    AbstractC9055d00.m17455d((AtomicBoolean) c6295kM.f40464d, true);
                    AbstractC9055d00.m17454c((Thread) c6295kM.f40466f);
                    c6295kM.m23914j(surface2, true);
                    break;
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                C9491gO0 c9491gO0 = (C9491gO0) this.f12758b;
                if (c9491gO0.f27741W == null) {
                    if (th instanceof C1282UN) {
                        c9491gO0.m18510y(5);
                    } else {
                        c9491gO0.m18510y(6);
                    }
                    c9491gO0.f27741W = th;
                    c9491gO0.m18492I();
                    ((C0300El) this.f12759c).m2375b(null);
                    break;
                }
                break;
        }
    }
}
