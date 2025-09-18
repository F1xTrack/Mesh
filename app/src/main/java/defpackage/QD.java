package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;

/* loaded from: classes.dex */
public final class QD extends TD {
    @Override // defpackage.TD
    public final int n(EncodedImage encodedImage) {
        O90.f(encodedImage, "encodedImage");
        return encodedImage.getSize();
    }

    @Override // defpackage.TD
    public final T70 o() {
        T70 t70 = new T70();
        t70.a = 0;
        t70.b = false;
        t70.c = false;
        return t70;
    }

    @Override // defpackage.TD
    public final synchronized boolean s(EncodedImage encodedImage, int i) {
        return AbstractC1516Tf.b(i) ? false : this.h.f(encodedImage, i);
    }
}
