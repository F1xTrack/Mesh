package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;

/* renamed from: fa1 */
/* loaded from: classes.dex */
public final class C3800fa1 extends AbstractC8332zH {
    public final RD0 c;
    public final int d;
    public final C3394dS0 e;
    public final /* synthetic */ C5811m3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3800fa1(C5811m3 c5811m3, AbstractC1516Tf abstractC1516Tf, RD0 rd0, int i) {
        super(abstractC1516Tf);
        this.f = c5811m3;
        this.c = rd0;
        this.d = i;
        this.e = ((C7647vg) rd0).a.h;
    }

    @Override // defpackage.AbstractC8332zH, defpackage.AbstractC1516Tf
    public final void f(Throwable th) {
        int i = this.d + 1;
        C5811m3 c5811m3 = this.f;
        AbstractC1516Tf abstractC1516Tf = this.b;
        if (c5811m3.c(i, abstractC1516Tf, this.c)) {
            return;
        }
        abstractC1516Tf.e(th);
    }

    @Override // defpackage.AbstractC1516Tf
    public final void h(int i, Object obj) {
        EncodedImage encodedImage = (EncodedImage) obj;
        AbstractC1516Tf abstractC1516Tf = this.b;
        if (encodedImage != null && (AbstractC1516Tf.b(i) || AbstractC7625vY1.f(encodedImage, this.e))) {
            abstractC1516Tf.g(i, encodedImage);
            return;
        }
        if (AbstractC1516Tf.a(i)) {
            EncodedImage.closeSafely(encodedImage);
            if (this.f.c(this.d + 1, abstractC1516Tf, this.c)) {
                return;
            }
            abstractC1516Tf.g(1, null);
        }
    }
}
