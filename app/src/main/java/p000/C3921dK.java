package p000;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dK */
/* loaded from: classes.dex */
public final class C3921dK implements QD0 {

    /* renamed from: a */
    public final /* synthetic */ int f25936a;

    /* renamed from: b */
    public final C0487Hj f25937b;

    /* renamed from: c */
    public final C0487Hj f25938c;

    /* renamed from: d */
    public final Map f25939d;

    /* renamed from: e */
    public final C1210TE f25940e;

    /* renamed from: f */
    public final QD0 f25941f;

    public /* synthetic */ C3921dK(C0487Hj c0487Hj, C0487Hj c0487Hj2, Map map, C1210TE c1210te, QD0 qd0, int i) {
        this.f25936a = i;
        this.f25937b = c0487Hj;
        this.f25938c = c0487Hj2;
        this.f25939d = map;
        this.f25940e = c1210te;
        this.f25941f = qd0;
    }

    /* renamed from: c */
    public static Map m17531c(E90 e90, RD0 rd0, boolean z, int i) {
        if (e90.mo751i(rd0, "DiskCacheProducer")) {
            return z ? C1380Vw.m8641b("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : C1380Vw.m8640a("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    @Override // p000.QD0
    /* renamed from: a */
    public final void mo312a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        R81 r81M6909b;
        boolean zM6912e;
        int i = 16;
        int i2 = 0;
        int i3 = 1;
        switch (this.f25936a) {
            case 0:
                C7027vg c7027vg = (C7027vg) rd0;
                C10737q70 c10737q70 = c7027vg.f44473a;
                if (!c10737q70.m23933c(16)) {
                    m17532d(abstractC1237Tf, rd0);
                    return;
                }
                E90 e90 = c7027vg.f44475c;
                e90.mo752j(rd0, "DiskCacheProducer");
                C1210TE c1210te = this.f25940e;
                c1210te.getClass();
                O01 o01M7641I = c1210te.m7641I(c10737q70.f40609b);
                C0487Hj c0487HjM7392a = SZ1.m7392a(c10737q70, this.f25938c, this.f25937b, this.f25939d);
                if (c0487HjM7392a == null) {
                    e90.mo747e(rd0, "DiskCacheProducer", new C0226Da("Got no disk cache for CacheChoice: " + Integer.valueOf(c10737q70.f40608a.ordinal()).toString(), 5), null);
                    m17532d(abstractC1237Tf, rd0);
                    return;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AbstractC4250iZ.m19063b();
                EncodedImage encodedImageM17837A0 = ((C9196e41) c0487HjM7392a.f4451h).m17837A0(o01M7641I);
                String str = o01M7641I.f8165a;
                if (encodedImageM17837A0 != null) {
                    AbstractC3929dS.m17680m("Found image for %s in staging area", str, C0487Hj.class);
                    ((C7512Dv0) c0487HjM7392a.f4450g).getClass();
                    ExecutorService executorService = R81.f10027g;
                    r81M6909b = new R81();
                    if (!r81M6909b.m6916i(encodedImageM17837A0)) {
                        throw new IllegalStateException("Cannot set the result of a completed task.");
                    }
                    O90.m5967e(r81M6909b, "forResult(pinnedImage)");
                } else {
                    try {
                        R81 r81M6908a = R81.m6908a(new CallableC0298Ej(atomicBoolean, c0487HjM7392a, o01M7641I, i2), (ExecutorService) c0487HjM7392a.f4448e);
                        O90.m5967e(r81M6908a, "{\n      val token = Fres…      readExecutor)\n    }");
                        r81M6909b = r81M6908a;
                    } catch (Exception e) {
                        AbstractC3929dS.m17687t("Failed to schedule disk-cache read for %s", str);
                        r81M6909b = R81.m6909b(e);
                    }
                }
                C1840cK c1840cK = new C1840cK(this, e90, rd0, abstractC1237Tf);
                r81M6909b.getClass();
                ExecutorC9387fa0 executorC9387fa0 = R81.f10028h;
                L21 l21 = new L21(2);
                synchronized (r81M6909b.f10031a) {
                    try {
                        zM6912e = r81M6909b.m6912e();
                        if (!zM6912e) {
                            r81M6909b.f10036f.add(new G81(l21, c1840cK, executorC9387fa0));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (zM6912e) {
                    try {
                        executorC9387fa0.execute(new RunnableC1192Sx(l21, c1840cK, r81M6909b, i));
                    } catch (Exception e2) {
                        l21.m4874f(new C6838sg(e2));
                    }
                }
                c7027vg.m25462a(new C1146SD(i3, atomicBoolean));
                return;
            default:
                C7027vg c7027vg2 = (C7027vg) rd0;
                if (c7027vg2.f44477e.f39845a >= 2) {
                    c7027vg2.m25469k("disk", "nil-result_write");
                    abstractC1237Tf.m7719g(1, null);
                    return;
                } else {
                    if (c7027vg2.f44473a.m23933c(32)) {
                        abstractC1237Tf = new C4235iK(abstractC1237Tf, rd0, this.f25937b, this.f25938c, this.f25939d, this.f25940e);
                    }
                    this.f25941f.mo312a(abstractC1237Tf, rd0);
                    return;
                }
        }
    }

    /* renamed from: d */
    public void m17532d(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        C7027vg c7027vg = (C7027vg) rd0;
        if (c7027vg.f44477e.f39845a < 2) {
            ((C3921dK) this.f25941f).mo312a(abstractC1237Tf, rd0);
        } else {
            c7027vg.m25469k("disk", "nil-result_read");
            abstractC1237Tf.m7719g(1, null);
        }
    }
}
