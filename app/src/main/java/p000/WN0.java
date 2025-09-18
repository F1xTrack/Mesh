package p000;

import android.net.Uri;
import android.view.Surface;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class WN0 implements InterfaceC6650py {

    /* renamed from: a */
    public final /* synthetic */ int f13155a;

    /* renamed from: b */
    public final /* synthetic */ Object f13156b;

    public /* synthetic */ WN0(int i, Object obj) {
        this.f13155a = i;
        this.f13156b = obj;
    }

    @Override // p000.InterfaceC6650py
    /* renamed from: b */
    public final void mo3020b(Object obj) {
        switch (this.f13155a) {
            case 0:
                ((C9491gO0) this.f13156b).f27728J = (Uri) obj;
                break;
            case 1:
                C0922Oe c0922Oe = (C0922Oe) obj;
                for (Map.Entry entry : ((Map) this.f13156b).entrySet()) {
                    int i = c0922Oe.f8548b - ((C1860ce) entry.getKey()).f17671f;
                    if (((C1860ce) entry.getKey()).f17672g) {
                        i = -i;
                    }
                    int iM24954h = AbstractC11184tc1.m24954h(i);
                    R61 r61 = (R61) entry.getValue();
                    r61.getClass();
                    DV1.m1719d(new O61(r61, iM24954h, -1, 0));
                }
                break;
            case 2:
                AbstractC7806Jm0.m4412f("SurfaceViewImpl");
                C4224i9 c4224i9 = (C4224i9) this.f13156b;
                if (c4224i9 != null) {
                    c4224i9.m18973c();
                    break;
                }
                break;
            case 3:
                ((C0300El) this.f13156b).m2375b((C0859Ne) obj);
                break;
            default:
                C0859Ne c0859Ne = (C0859Ne) obj;
                C10715py0 c10715py0 = (C10715py0) this.f13156b;
                c0859Ne.f7933b.hashCode();
                AbstractC7806Jm0.m4412f("VideoEncoderSession");
                Surface surface = c10715py0.f40462b;
                Surface surface2 = c0859Ne.f7933b;
                if (surface2 == surface) {
                    c10715py0.f40462b = null;
                    ((C0300El) c10715py0.f40474n).m2375b((C6820sO) c10715py0.f40467g);
                    c10715py0.m23906a();
                    break;
                } else {
                    surface2.release();
                    break;
                }
        }
    }
}
