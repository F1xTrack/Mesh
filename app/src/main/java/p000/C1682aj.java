package p000;

import com.facebook.imagepipeline.image.EncodedImage;

/* renamed from: aj */
/* loaded from: classes.dex */
public final class C1682aj extends AbstractC7254zH {

    /* renamed from: c */
    public final RD0 f15635c;

    /* renamed from: d */
    public final /* synthetic */ W91 f15636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682aj(W91 w91, AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        super(abstractC1237Tf);
        this.f15636d = w91;
        this.f15635c = rd0;
    }

    @Override // p000.AbstractC7254zH, p000.AbstractC1237Tf
    /* renamed from: f */
    public final void mo6845f(Throwable th) {
        ((C8999ca1) this.f15636d.f13015c).mo312a(this.f46773b, this.f15635c);
    }

    @Override // p000.AbstractC1237Tf
    /* renamed from: h */
    public final void mo6846h(int i, Object obj) throws Throwable {
        EncodedImage encodedImage = (EncodedImage) obj;
        RD0 rd0 = this.f15635c;
        C10737q70 c10737q70 = ((C7027vg) rd0).f44473a;
        boolean zM7714a = AbstractC1237Tf.m7714a(i);
        boolean zM25449f = AbstractC11432vY1.m25449f(encodedImage, c10737q70.f40615h);
        AbstractC1237Tf abstractC1237Tf = this.f46773b;
        if (encodedImage != null && zM25449f) {
            if (zM7714a && zM25449f) {
                abstractC1237Tf.m7719g(i, encodedImage);
            } else {
                abstractC1237Tf.m7719g(i & (-2), encodedImage);
            }
        }
        if (!zM7714a || zM25449f || c10737q70.m23931a()) {
            return;
        }
        EncodedImage.closeSafely(encodedImage);
        ((C8999ca1) this.f15636d.f13015c).mo312a(abstractC1237Tf, rd0);
    }
}
