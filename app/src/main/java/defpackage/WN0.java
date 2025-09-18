package defpackage;

import android.net.Uri;
import android.view.Surface;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class WN0 implements InterfaceC6556py {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ WN0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC6556py
    public final void b(Object obj) {
        switch (this.a) {
            case 0:
                ((C3954gO0) this.b).J = (Uri) obj;
                break;
            case 1:
                C1123Oe c1123Oe = (C1123Oe) obj;
                for (Map.Entry entry : ((Map) this.b).entrySet()) {
                    int i = c1123Oe.b - ((C2553ce) entry.getKey()).f;
                    if (((C2553ce) entry.getKey()).g) {
                        i = -i;
                    }
                    int iH = AbstractC7255tc1.h(i);
                    R61 r61 = (R61) entry.getValue();
                    r61.getClass();
                    DV1.d(new O61(r61, iH, -1, 0));
                }
                break;
            case 2:
                AbstractC0759Jm0.f("SurfaceViewImpl");
                C4290i9 c4290i9 = (C4290i9) this.b;
                if (c4290i9 != null) {
                    c4290i9.c();
                    break;
                }
                break;
            case 3:
                ((C0365El) this.b).b((C1045Ne) obj);
                break;
            default:
                C1045Ne c1045Ne = (C1045Ne) obj;
                C6557py0 c6557py0 = (C6557py0) this.b;
                c1045Ne.b.hashCode();
                AbstractC0759Jm0.f("VideoEncoderSession");
                Surface surface = c6557py0.b;
                Surface surface2 = c1045Ne.b;
                if (surface2 == surface) {
                    c6557py0.b = null;
                    ((C0365El) c6557py0.n).b((C7020sO) c6557py0.g);
                    c6557py0.a();
                    break;
                } else {
                    surface2.release();
                    break;
                }
        }
    }
}
