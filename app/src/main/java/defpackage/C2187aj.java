package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;

/* renamed from: aj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2187aj extends AbstractC8332zH {
    public final RD0 c;
    public final /* synthetic */ W91 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2187aj(W91 w91, AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        super(abstractC1516Tf);
        this.d = w91;
        this.c = rd0;
    }

    @Override // defpackage.AbstractC8332zH, defpackage.AbstractC1516Tf
    public final void f(Throwable th) {
        ((C2543ca1) this.d.c).a(this.b, this.c);
    }

    @Override // defpackage.AbstractC1516Tf
    public final void h(int i, Object obj) throws Throwable {
        EncodedImage encodedImage = (EncodedImage) obj;
        RD0 rd0 = this.c;
        C6589q70 c6589q70 = ((C7647vg) rd0).a;
        boolean zA = AbstractC1516Tf.a(i);
        boolean zF = AbstractC7625vY1.f(encodedImage, c6589q70.h);
        AbstractC1516Tf abstractC1516Tf = this.b;
        if (encodedImage != null && zF) {
            if (zA && zF) {
                abstractC1516Tf.g(i, encodedImage);
            } else {
                abstractC1516Tf.g(i & (-2), encodedImage);
            }
        }
        if (!zA || zF || c6589q70.a()) {
            return;
        }
        EncodedImage.closeSafely(encodedImage);
        ((C2543ca1) this.d.c).a(abstractC1516Tf, rd0);
    }
}
