package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3369dK implements QD0 {
    public final /* synthetic */ int a;
    public final C0593Hj b;
    public final C0593Hj c;
    public final Map d;
    public final TE e;
    public final QD0 f;

    public /* synthetic */ C3369dK(C0593Hj c0593Hj, C0593Hj c0593Hj2, Map map, TE te, QD0 qd0, int i) {
        this.a = i;
        this.b = c0593Hj;
        this.c = c0593Hj2;
        this.d = map;
        this.e = te;
        this.f = qd0;
    }

    public static Map c(E90 e90, RD0 rd0, boolean z, int i) {
        if (e90.i(rd0, "DiskCacheProducer")) {
            return z ? C1723Vw.b("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : C1723Vw.a("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    @Override // defpackage.QD0
    public final void a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        R81 r81B;
        boolean zE;
        int i = 16;
        int i2 = 0;
        int i3 = 1;
        switch (this.a) {
            case 0:
                C7647vg c7647vg = (C7647vg) rd0;
                C6589q70 c6589q70 = c7647vg.a;
                if (!c6589q70.c(16)) {
                    d(abstractC1516Tf, rd0);
                    return;
                }
                E90 e90 = c7647vg.c;
                e90.j(rd0, "DiskCacheProducer");
                TE te = this.e;
                te.getClass();
                O01 o01I = te.I(c6589q70.b);
                C0593Hj c0593HjA = SZ1.a(c6589q70, this.c, this.b, this.d);
                if (c0593HjA == null) {
                    e90.e(rd0, "DiskCacheProducer", new C0254Da("Got no disk cache for CacheChoice: " + Integer.valueOf(c6589q70.a.ordinal()).toString(), 5), null);
                    d(abstractC1516Tf, rd0);
                    return;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AbstractC4368iZ.b();
                EncodedImage encodedImageA0 = ((C3513e41) c0593HjA.h).A0(o01I);
                String str = o01I.a;
                if (encodedImageA0 != null) {
                    AbstractC3393dS.m("Found image for %s in staging area", str, C0593Hj.class);
                    ((C0318Dv0) c0593HjA.g).getClass();
                    ExecutorService executorService = R81.g;
                    r81B = new R81();
                    if (!r81B.i(encodedImageA0)) {
                        throw new IllegalStateException("Cannot set the result of a completed task.");
                    }
                    O90.e(r81B, "forResult(pinnedImage)");
                } else {
                    try {
                        R81 r81A = R81.a(new CallableC0359Ej(atomicBoolean, c0593HjA, o01I, i2), (ExecutorService) c0593HjA.e);
                        O90.e(r81A, "{\n      val token = Fres…      readExecutor)\n    }");
                        r81B = r81A;
                    } catch (Exception e) {
                        AbstractC3393dS.t("Failed to schedule disk-cache read for %s", str);
                        r81B = R81.b(e);
                    }
                }
                C2493cK c2493cK = new C2493cK(this, e90, rd0, abstractC1516Tf);
                r81B.getClass();
                ExecutorC3799fa0 executorC3799fa0 = R81.h;
                L21 l21 = new L21(2);
                synchronized (r81B.a) {
                    try {
                        zE = r81B.e();
                        if (!zE) {
                            r81B.f.add(new G81(l21, c2493cK, executorC3799fa0));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (zE) {
                    try {
                        executorC3799fa0.execute(new RunnableC1492Sx(l21, c2493cK, r81B, i));
                    } catch (Exception e2) {
                        l21.f(new C7074sg(e2));
                    }
                }
                c7647vg.a(new SD(i3, atomicBoolean));
                return;
            default:
                C7647vg c7647vg2 = (C7647vg) rd0;
                if (c7647vg2.e.a >= 2) {
                    c7647vg2.k("disk", "nil-result_write");
                    abstractC1516Tf.g(1, null);
                    return;
                } else {
                    if (c7647vg2.a.c(32)) {
                        abstractC1516Tf = new C4323iK(abstractC1516Tf, rd0, this.b, this.c, this.d, this.e);
                    }
                    this.f.a(abstractC1516Tf, rd0);
                    return;
                }
        }
    }

    public void d(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        C7647vg c7647vg = (C7647vg) rd0;
        if (c7647vg.e.a < 2) {
            ((C3369dK) this.f).a(abstractC1516Tf, rd0);
        } else {
            c7647vg.k("disk", "nil-result_read");
            abstractC1516Tf.g(1, null);
        }
    }
}
