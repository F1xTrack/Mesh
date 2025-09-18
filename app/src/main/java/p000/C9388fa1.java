package p000;

import com.facebook.imagepipeline.image.EncodedImage;

/* renamed from: fa1 */
/* loaded from: classes.dex */
public final class C9388fa1 extends AbstractC7254zH {

    /* renamed from: c */
    public final RD0 f27243c;

    /* renamed from: d */
    public final int f27244d;

    /* renamed from: e */
    public final C9115dS0 f27245e;

    /* renamed from: f */
    public final /* synthetic */ C6402m3 f27246f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9388fa1(C6402m3 c6402m3, AbstractC1237Tf abstractC1237Tf, RD0 rd0, int i) {
        super(abstractC1237Tf);
        this.f27246f = c6402m3;
        this.f27243c = rd0;
        this.f27244d = i;
        this.f27245e = ((C7027vg) rd0).f44473a.f40615h;
    }

    @Override // p000.AbstractC7254zH, p000.AbstractC1237Tf
    /* renamed from: f */
    public final void mo6845f(Throwable th) {
        int i = this.f27244d + 1;
        C6402m3 c6402m3 = this.f27246f;
        AbstractC1237Tf abstractC1237Tf = this.f46773b;
        if (c6402m3.m22645c(i, abstractC1237Tf, this.f27243c)) {
            return;
        }
        abstractC1237Tf.m7718e(th);
    }

    @Override // p000.AbstractC1237Tf
    /* renamed from: h */
    public final void mo6846h(int i, Object obj) {
        EncodedImage encodedImage = (EncodedImage) obj;
        AbstractC1237Tf abstractC1237Tf = this.f46773b;
        if (encodedImage != null && (AbstractC1237Tf.m7715b(i) || AbstractC11432vY1.m25449f(encodedImage, this.f27245e))) {
            abstractC1237Tf.m7719g(i, encodedImage);
            return;
        }
        if (AbstractC1237Tf.m7714a(i)) {
            EncodedImage.closeSafely(encodedImage);
            if (this.f27246f.m22645c(this.f27244d + 1, abstractC1237Tf, this.f27243c)) {
                return;
            }
            abstractC1237Tf.m7719g(1, null);
        }
    }
}
