package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: iK */
/* loaded from: classes.dex */
public final class C4323iK extends AbstractC8332zH {
    public final RD0 c;
    public final C0593Hj d;
    public final C0593Hj e;
    public final Map f;
    public final TE g;

    public C4323iK(AbstractC1516Tf abstractC1516Tf, RD0 rd0, C0593Hj c0593Hj, C0593Hj c0593Hj2, Map map, TE te) {
        super(abstractC1516Tf);
        this.c = rd0;
        this.d = c0593Hj;
        this.e = c0593Hj2;
        this.f = map;
        this.g = te;
    }

    @Override // defpackage.AbstractC1516Tf
    public final void h(int i, Object obj) {
        EncodedImage encodedImage = (EncodedImage) obj;
        RD0 rd0 = this.c;
        C7647vg c7647vg = (C7647vg) rd0;
        c7647vg.c.j(rd0, "DiskCacheWriteProducer");
        boolean zB = AbstractC1516Tf.b(i);
        E90 e90 = c7647vg.c;
        AbstractC1516Tf abstractC1516Tf = this.b;
        if (zB || encodedImage == null || (i & 10) != 0 || encodedImage.getImageFormat() == D60.c) {
            e90.a(rd0, "DiskCacheWriteProducer", null);
            abstractC1516Tf.g(i, encodedImage);
            return;
        }
        TE te = this.g;
        te.getClass();
        C6589q70 c6589q70 = c7647vg.a;
        O01 o01I = te.I(c6589q70.b);
        C0593Hj c0593HjA = SZ1.a(c6589q70, this.e, this.d, this.f);
        if (c0593HjA == null) {
            e90.e(rd0, "DiskCacheWriteProducer", new C0254Da("Got no disk cache for CacheChoice: " + Integer.valueOf(c6589q70.a.ordinal()).toString(), 5), null);
            abstractC1516Tf.g(i, encodedImage);
            return;
        }
        c0593HjA.getClass();
        O90.f(o01I, "key");
        O90.f(encodedImage, "encodedImage");
        AbstractC4368iZ.b();
        if (!EncodedImage.isValid(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        C3513e41 c3513e41 = (C3513e41) c0593HjA.h;
        synchronized (c3513e41) {
            if (!EncodedImage.isValid(encodedImage)) {
                throw new IllegalArgumentException();
            }
            EncodedImage.closeSafely((EncodedImage) ((HashMap) c3513e41.b).put(o01I, EncodedImage.cloneOrNull(encodedImage)));
            c3513e41.N0();
        }
        EncodedImage encodedImageCloneOrNull = EncodedImage.cloneOrNull(encodedImage);
        try {
            ((ExecutorService) c0593HjA.f).execute(new RunnableC1557Ts1(c0593HjA, o01I, encodedImageCloneOrNull, 7));
        } catch (Exception unused) {
            AbstractC3393dS.t("Failed to schedule disk-cache write for %s", o01I.a);
            c3513e41.R0(o01I, encodedImage);
            EncodedImage.closeSafely(encodedImageCloneOrNull);
        }
        e90.a(rd0, "DiskCacheWriteProducer", null);
        abstractC1516Tf.g(i, encodedImage);
    }
}
