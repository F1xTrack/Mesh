package p000;

import com.facebook.imagepipeline.image.EncodedImage;

/* renamed from: QD */
/* loaded from: classes.dex */
public final class C1021QD extends AbstractC1209TD {
    @Override // p000.AbstractC1209TD
    /* renamed from: n */
    public final int mo6615n(EncodedImage encodedImage) {
        O90.m5968f(encodedImage, "encodedImage");
        return encodedImage.getSize();
    }

    @Override // p000.AbstractC1209TD
    /* renamed from: o */
    public final T70 mo6616o() {
        T70 t70 = new T70();
        t70.f11168a = 0;
        t70.f11169b = false;
        t70.f11170c = false;
        return t70;
    }

    @Override // p000.AbstractC1209TD
    /* renamed from: s */
    public final synchronized boolean mo6617s(EncodedImage encodedImage, int i) {
        return AbstractC1237Tf.m7715b(i) ? false : this.f11203h.m9097f(encodedImage, i);
    }
}
