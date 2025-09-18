package p000;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: iK */
/* loaded from: classes.dex */
public final class C4235iK extends AbstractC7254zH {

    /* renamed from: c */
    public final RD0 f29080c;

    /* renamed from: d */
    public final C0487Hj f29081d;

    /* renamed from: e */
    public final C0487Hj f29082e;

    /* renamed from: f */
    public final Map f29083f;

    /* renamed from: g */
    public final C1210TE f29084g;

    public C4235iK(AbstractC1237Tf abstractC1237Tf, RD0 rd0, C0487Hj c0487Hj, C0487Hj c0487Hj2, Map map, C1210TE c1210te) {
        super(abstractC1237Tf);
        this.f29080c = rd0;
        this.f29081d = c0487Hj;
        this.f29082e = c0487Hj2;
        this.f29083f = map;
        this.f29084g = c1210te;
    }

    @Override // p000.AbstractC1237Tf
    /* renamed from: h */
    public final void mo6846h(int i, Object obj) {
        EncodedImage encodedImage = (EncodedImage) obj;
        RD0 rd0 = this.f29080c;
        C7027vg c7027vg = (C7027vg) rd0;
        c7027vg.f44475c.mo752j(rd0, "DiskCacheWriteProducer");
        boolean zM7715b = AbstractC1237Tf.m7715b(i);
        E90 e90 = c7027vg.f44475c;
        AbstractC1237Tf abstractC1237Tf = this.f46773b;
        if (zM7715b || encodedImage == null || (i & 10) != 0 || encodedImage.getImageFormat() == D60.f1843c) {
            e90.mo743a(rd0, "DiskCacheWriteProducer", null);
            abstractC1237Tf.m7719g(i, encodedImage);
            return;
        }
        C1210TE c1210te = this.f29084g;
        c1210te.getClass();
        C10737q70 c10737q70 = c7027vg.f44473a;
        O01 o01M7641I = c1210te.m7641I(c10737q70.f40609b);
        C0487Hj c0487HjM7392a = SZ1.m7392a(c10737q70, this.f29082e, this.f29081d, this.f29083f);
        if (c0487HjM7392a == null) {
            e90.mo747e(rd0, "DiskCacheWriteProducer", new C0226Da("Got no disk cache for CacheChoice: " + Integer.valueOf(c10737q70.f40608a.ordinal()).toString(), 5), null);
            abstractC1237Tf.m7719g(i, encodedImage);
            return;
        }
        c0487HjM7392a.getClass();
        O90.m5968f(o01M7641I, "key");
        O90.m5968f(encodedImage, "encodedImage");
        AbstractC4250iZ.m19063b();
        if (!EncodedImage.isValid(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        C9196e41 c9196e41 = (C9196e41) c0487HjM7392a.f4451h;
        synchronized (c9196e41) {
            if (!EncodedImage.isValid(encodedImage)) {
                throw new IllegalArgumentException();
            }
            EncodedImage.closeSafely((EncodedImage) ((HashMap) c9196e41.f26532b).put(o01M7641I, EncodedImage.cloneOrNull(encodedImage)));
            c9196e41.m17851N0();
        }
        EncodedImage encodedImageCloneOrNull = EncodedImage.cloneOrNull(encodedImage);
        try {
            ((ExecutorService) c0487HjM7392a.f4449f).execute(new RunnableC8339Ts1(c0487HjM7392a, o01M7641I, encodedImageCloneOrNull, 7));
        } catch (Exception unused) {
            AbstractC3929dS.m17687t("Failed to schedule disk-cache write for %s", o01M7641I.f8165a);
            c9196e41.m17855R0(o01M7641I, encodedImage);
            EncodedImage.closeSafely(encodedImageCloneOrNull);
        }
        e90.mo743a(rd0, "DiskCacheWriteProducer", null);
        abstractC1237Tf.m7719g(i, encodedImage);
    }
}
