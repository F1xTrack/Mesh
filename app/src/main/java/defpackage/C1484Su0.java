package defpackage;

import android.os.SystemClock;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: Su0 */
/* loaded from: classes.dex */
public final class C1484Su0 implements QD0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ C1484Su0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public static void e(C7678vq0 c7678vq0, int i, C0908Lk c0908Lk, AbstractC1516Tf abstractC1516Tf) throws Throwable {
        UE ueJ = AbstractC8446zt.J(c7678vq0.n());
        EncodedImage encodedImage = null;
        try {
            EncodedImage encodedImage2 = new EncodedImage(ueJ);
            try {
                encodedImage2.setBytesRange(c0908Lk);
                encodedImage2.parseMetaData();
                abstractC1516Tf.g(i, encodedImage2);
                EncodedImage.closeSafely(encodedImage2);
                AbstractC8446zt.p(ueJ);
            } catch (Throwable th) {
                th = th;
                encodedImage = encodedImage2;
                EncodedImage.closeSafely(encodedImage);
                AbstractC8446zt.p(ueJ);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.QD0
    public final void a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        switch (this.a) {
            case 0:
                ((C7647vg) rd0).c.j(rd0, "NetworkFetchProducer");
                AbstractC8355zO1 abstractC8355zO1 = (AbstractC8355zO1) this.d;
                AbstractC2139aT abstractC2139aTA = abstractC8355zO1.a(abstractC1516Tf, rd0);
                abstractC8355zO1.c(abstractC2139aTA, new ES1(this, 16, abstractC2139aTA));
                break;
            case 1:
                C7647vg c7647vg = (C7647vg) rd0;
                E90 e90 = c7647vg.c;
                C6589q70 c6589q70 = c7647vg.a;
                InterfaceC6604qC0 interfaceC6604qC0 = c6589q70.p;
                C1484Su0 c1484Su0 = (C1484Su0) this.d;
                if (interfaceC6604qC0 != null && interfaceC6604qC0.b() != null) {
                    e90.j(rd0, "PostprocessedBitmapMemoryCacheProducer");
                    C4204hi c4204hiK = ((TE) this.c).K(c6589q70, c7647vg.d);
                    boolean zC = c6589q70.c(1);
                    CC0 cc0 = (CC0) this.b;
                    AbstractC8446zt abstractC8446ztU = zC ? cc0.U(c4204hiK) : null;
                    if (abstractC8446ztU == null) {
                        C5362ji c5362ji = new C5362ji(abstractC1516Tf, c4204hiK, cc0, c6589q70.c(2));
                        e90.a(rd0, "PostprocessedBitmapMemoryCacheProducer", e90.i(rd0, "PostprocessedBitmapMemoryCacheProducer") ? C1723Vw.a("cached_value_found", "false") : null);
                        c1484Su0.a(c5362ji, rd0);
                        break;
                    } else {
                        e90.a(rd0, "PostprocessedBitmapMemoryCacheProducer", e90.i(rd0, "PostprocessedBitmapMemoryCacheProducer") ? C1723Vw.a("cached_value_found", "true") : null);
                        e90.f(rd0, "PostprocessedBitmapMemoryCacheProducer", true);
                        c7647vg.k("memory_bitmap", "postprocessed");
                        abstractC1516Tf.i(1.0f);
                        abstractC1516Tf.g(1, abstractC8446ztU);
                        abstractC8446ztU.close();
                        break;
                    }
                } else {
                    c1484Su0.a(abstractC1516Tf, rd0);
                    break;
                }
                break;
            default:
                C7647vg c7647vg2 = (C7647vg) rd0;
                E90 e902 = c7647vg2.c;
                InterfaceC6604qC0 interfaceC6604qC02 = c7647vg2.a.p;
                interfaceC6604qC02.getClass();
                ((QD0) this.b).a(new C5620l3(new C6794rC0(this, abstractC1516Tf, e902, interfaceC6604qC02, rd0), 1), rd0);
                break;
        }
    }

    public void c(C7678vq0 c7678vq0, AbstractC2139aT abstractC2139aT) throws Throwable {
        int i = c7678vq0.c;
        E90 e90 = (E90) abstractC2139aT.a();
        RD0 rd0 = abstractC2139aT.b;
        Map mapD = !e90.i(rd0, "NetworkFetchProducer") ? null : ((AbstractC8355zO1) this.d).d(abstractC2139aT, i);
        E90 e902 = (E90) abstractC2139aT.a();
        e902.a(rd0, "NetworkFetchProducer", mapD);
        e902.f(rd0, "NetworkFetchProducer", true);
        ((C7647vg) rd0).k("network", "default");
        e(c7678vq0, 1 | abstractC2139aT.d, abstractC2139aT.e, abstractC2139aT.a);
    }

    public void d(C7678vq0 c7678vq0, AbstractC2139aT abstractC2139aT) throws Throwable {
        C7647vg c7647vg = (C7647vg) abstractC2139aT.b;
        if (c7647vg.l.n == null || !c7647vg.g()) {
            return;
        }
        ((AbstractC8355zO1) this.d).getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - abstractC2139aT.c >= 100) {
            abstractC2139aT.c = jUptimeMillis;
            ((E90) abstractC2139aT.a()).c(abstractC2139aT.b);
            e(c7678vq0, abstractC2139aT.d, abstractC2139aT.e, abstractC2139aT.a);
        }
    }

    public C1484Su0(QD0 qd0, N8 n8, ExecutorService executorService) {
        this.a = 2;
        qd0.getClass();
        this.b = qd0;
        this.c = n8;
        executorService.getClass();
        this.d = executorService;
    }
}
