package p000;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.concurrent.CancellationException;

/* renamed from: cK */
/* loaded from: classes.dex */
public final class C1840cK implements InterfaceC1445Wy {

    /* renamed from: a */
    public final /* synthetic */ E90 f17426a;

    /* renamed from: b */
    public final /* synthetic */ RD0 f17427b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC1237Tf f17428c;

    /* renamed from: d */
    public final /* synthetic */ C3921dK f17429d;

    public C1840cK(C3921dK c3921dK, E90 e90, RD0 rd0, AbstractC1237Tf abstractC1237Tf) {
        this.f17429d = c3921dK;
        this.f17426a = e90;
        this.f17427b = rd0;
        this.f17428c = abstractC1237Tf;
    }

    @Override // p000.InterfaceC1445Wy
    /* renamed from: a */
    public final void mo2929a(R81 r81) {
        boolean z;
        synchronized (r81.f10031a) {
            z = r81.f10033c;
        }
        AbstractC1237Tf abstractC1237Tf = this.f17428c;
        E90 e90 = this.f17426a;
        RD0 rd0 = this.f17427b;
        if (z || (r81.m6913f() && (r81.m6910c() instanceof CancellationException))) {
            e90.mo753k(rd0, "DiskCacheProducer");
            abstractC1237Tf.m7717c();
            return;
        }
        boolean zM6913f = r81.m6913f();
        C3921dK c3921dK = this.f17429d;
        if (zM6913f) {
            e90.mo747e(rd0, "DiskCacheProducer", r81.m6910c(), null);
            ((C3921dK) c3921dK.f25941f).mo312a(abstractC1237Tf, rd0);
            return;
        }
        EncodedImage encodedImage = (EncodedImage) r81.m6911d();
        if (encodedImage == null) {
            e90.mo743a(rd0, "DiskCacheProducer", C3921dK.m17531c(e90, rd0, false, 0));
            ((C3921dK) c3921dK.f25941f).mo312a(abstractC1237Tf, rd0);
            return;
        }
        e90.mo743a(rd0, "DiskCacheProducer", C3921dK.m17531c(e90, rd0, true, encodedImage.getSize()));
        e90.mo748f(rd0, "DiskCacheProducer", true);
        ((C7027vg) rd0).m25469k("disk", "default");
        abstractC1237Tf.m7720i(1.0f);
        abstractC1237Tf.m7719g(1, encodedImage);
        encodedImage.close();
    }
}
