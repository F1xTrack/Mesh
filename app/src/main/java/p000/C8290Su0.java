package p000;

import android.os.SystemClock;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: Su0 */
/* loaded from: classes.dex */
public final class C8290Su0 implements QD0 {

    /* renamed from: a */
    public final /* synthetic */ int f11063a;

    /* renamed from: b */
    public final Object f11064b;

    /* renamed from: c */
    public final Object f11065c;

    /* renamed from: d */
    public final Object f11066d;

    public /* synthetic */ C8290Su0(Object obj, Object obj2, Object obj3, int i) {
        this.f11063a = i;
        this.f11064b = obj;
        this.f11065c = obj2;
        this.f11066d = obj3;
    }

    /* renamed from: e */
    public static void m7461e(C11467vq0 c11467vq0, int i, C0739Lk c0739Lk, AbstractC1237Tf abstractC1237Tf) throws Throwable {
        C1273UE c1273ueM26566J = AbstractC7292zt.m26566J(c11467vq0.m25523n());
        EncodedImage encodedImage = null;
        try {
            EncodedImage encodedImage2 = new EncodedImage(c1273ueM26566J);
            try {
                encodedImage2.setBytesRange(c0739Lk);
                encodedImage2.parseMetaData();
                abstractC1237Tf.m7719g(i, encodedImage2);
                EncodedImage.closeSafely(encodedImage2);
                AbstractC7292zt.m26569p(c1273ueM26566J);
            } catch (Throwable th) {
                th = th;
                encodedImage = encodedImage2;
                EncodedImage.closeSafely(encodedImage);
                AbstractC7292zt.m26569p(c1273ueM26566J);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p000.QD0
    /* renamed from: a */
    public final void mo312a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        switch (this.f11063a) {
            case 0:
                ((C7027vg) rd0).f44475c.mo752j(rd0, "NetworkFetchProducer");
                AbstractC11920zO1 abstractC11920zO1 = (AbstractC11920zO1) this.f11066d;
                AbstractC1666aT abstractC1666aTMo2920a = abstractC11920zO1.mo2920a(abstractC1237Tf, rd0);
                abstractC11920zO1.mo2921c(abstractC1666aTMo2920a, new ES1(this, 16, abstractC1666aTMo2920a));
                break;
            case 1:
                C7027vg c7027vg = (C7027vg) rd0;
                E90 e90 = c7027vg.f44475c;
                C10737q70 c10737q70 = c7027vg.f44473a;
                InterfaceC10747qC0 interfaceC10747qC0 = c10737q70.f40623p;
                C8290Su0 c8290Su0 = (C8290Su0) this.f11066d;
                if (interfaceC10747qC0 != null && interfaceC10747qC0.mo22219b() != null) {
                    e90.mo752j(rd0, "PostprocessedBitmapMemoryCacheProducer");
                    C4196hi c4196hiM7642K = ((C1210TE) this.f11065c).m7642K(c10737q70, c7027vg.f44476d);
                    boolean zM23933c = c10737q70.m23933c(1);
                    CC0 cc0 = (CC0) this.f11064b;
                    AbstractC7292zt abstractC7292ztMo1043U = zM23933c ? cc0.mo1043U(c4196hiM7642K) : null;
                    if (abstractC7292ztMo1043U == null) {
                        C6254ji c6254ji = new C6254ji(abstractC1237Tf, c4196hiM7642K, cc0, c10737q70.m23933c(2));
                        e90.mo743a(rd0, "PostprocessedBitmapMemoryCacheProducer", e90.mo751i(rd0, "PostprocessedBitmapMemoryCacheProducer") ? C1380Vw.m8640a("cached_value_found", "false") : null);
                        c8290Su0.mo312a(c6254ji, rd0);
                        break;
                    } else {
                        e90.mo743a(rd0, "PostprocessedBitmapMemoryCacheProducer", e90.mo751i(rd0, "PostprocessedBitmapMemoryCacheProducer") ? C1380Vw.m8640a("cached_value_found", "true") : null);
                        e90.mo748f(rd0, "PostprocessedBitmapMemoryCacheProducer", true);
                        c7027vg.m25469k("memory_bitmap", "postprocessed");
                        abstractC1237Tf.m7720i(1.0f);
                        abstractC1237Tf.m7719g(1, abstractC7292ztMo1043U);
                        abstractC7292ztMo1043U.close();
                        break;
                    }
                } else {
                    c8290Su0.mo312a(abstractC1237Tf, rd0);
                    break;
                }
                break;
            default:
                C7027vg c7027vg2 = (C7027vg) rd0;
                E90 e902 = c7027vg2.f44475c;
                InterfaceC10747qC0 interfaceC10747qC02 = c7027vg2.f44473a.f40623p;
                interfaceC10747qC02.getClass();
                ((QD0) this.f11064b).mo312a(new C6339l3(new C10875rC0(this, abstractC1237Tf, e902, interfaceC10747qC02, rd0), 1), rd0);
                break;
        }
    }

    /* renamed from: c */
    public void m7462c(C11467vq0 c11467vq0, AbstractC1666aT abstractC1666aT) throws Throwable {
        int i = c11467vq0.f44555c;
        E90 e90 = (E90) abstractC1666aT.m9748a();
        RD0 rd0 = abstractC1666aT.f15523b;
        Map mapMo2922d = !e90.mo751i(rd0, "NetworkFetchProducer") ? null : ((AbstractC11920zO1) this.f11066d).mo2922d(abstractC1666aT, i);
        E90 e902 = (E90) abstractC1666aT.m9748a();
        e902.mo743a(rd0, "NetworkFetchProducer", mapMo2922d);
        e902.mo748f(rd0, "NetworkFetchProducer", true);
        ((C7027vg) rd0).m25469k("network", "default");
        m7461e(c11467vq0, 1 | abstractC1666aT.f15525d, abstractC1666aT.f15526e, abstractC1666aT.f15522a);
    }

    /* renamed from: d */
    public void m7463d(C11467vq0 c11467vq0, AbstractC1666aT abstractC1666aT) throws Throwable {
        C7027vg c7027vg = (C7027vg) abstractC1666aT.f15523b;
        if (c7027vg.f44484l.f16798n == null || !c7027vg.m25465g()) {
            return;
        }
        ((AbstractC11920zO1) this.f11066d).getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - abstractC1666aT.f15524c >= 100) {
            abstractC1666aT.f15524c = jUptimeMillis;
            ((E90) abstractC1666aT.m9748a()).mo745c(abstractC1666aT.f15523b);
            m7461e(c11467vq0, abstractC1666aT.f15525d, abstractC1666aT.f15526e, abstractC1666aT.f15522a);
        }
    }

    public C8290Su0(QD0 qd0, C0827N8 c0827n8, ExecutorService executorService) {
        this.f11063a = 2;
        qd0.getClass();
        this.f11064b = qd0;
        this.f11065c = c0827n8;
        executorService.getClass();
        this.f11066d = executorService;
    }
}
