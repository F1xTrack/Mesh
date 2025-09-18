package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.concurrent.CancellationException;

/* renamed from: cK */
/* loaded from: classes.dex */
public final class C2493cK implements InterfaceC1807Wy {
    public final /* synthetic */ E90 a;
    public final /* synthetic */ RD0 b;
    public final /* synthetic */ AbstractC1516Tf c;
    public final /* synthetic */ C3369dK d;

    public C2493cK(C3369dK c3369dK, E90 e90, RD0 rd0, AbstractC1516Tf abstractC1516Tf) {
        this.d = c3369dK;
        this.a = e90;
        this.b = rd0;
        this.c = abstractC1516Tf;
    }

    @Override // defpackage.InterfaceC1807Wy
    public final void a(R81 r81) {
        boolean z;
        synchronized (r81.a) {
            z = r81.c;
        }
        AbstractC1516Tf abstractC1516Tf = this.c;
        E90 e90 = this.a;
        RD0 rd0 = this.b;
        if (z || (r81.f() && (r81.c() instanceof CancellationException))) {
            e90.k(rd0, "DiskCacheProducer");
            abstractC1516Tf.c();
            return;
        }
        boolean zF = r81.f();
        C3369dK c3369dK = this.d;
        if (zF) {
            e90.e(rd0, "DiskCacheProducer", r81.c(), null);
            ((C3369dK) c3369dK.f).a(abstractC1516Tf, rd0);
            return;
        }
        EncodedImage encodedImage = (EncodedImage) r81.d();
        if (encodedImage == null) {
            e90.a(rd0, "DiskCacheProducer", C3369dK.c(e90, rd0, false, 0));
            ((C3369dK) c3369dK.f).a(abstractC1516Tf, rd0);
            return;
        }
        e90.a(rd0, "DiskCacheProducer", C3369dK.c(e90, rd0, true, encodedImage.getSize()));
        e90.f(rd0, "DiskCacheProducer", true);
        ((C7647vg) rd0).k("disk", "default");
        abstractC1516Tf.i(1.0f);
        abstractC1516Tf.g(1, encodedImage);
        encodedImage.close();
    }
}
