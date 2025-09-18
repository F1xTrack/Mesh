package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;

/* renamed from: l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5620l3 extends AbstractC8332zH {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5620l3(AbstractC1516Tf abstractC1516Tf, int i) {
        super(abstractC1516Tf);
        this.c = i;
    }

    @Override // defpackage.AbstractC1516Tf
    public final void h(int i, Object obj) throws Throwable {
        switch (this.c) {
            case 0:
                EncodedImage encodedImage = (EncodedImage) obj;
                AbstractC1516Tf abstractC1516Tf = this.b;
                if (encodedImage == null) {
                    abstractC1516Tf.g(i, null);
                    return;
                }
                if (!EncodedImage.isMetaDataAvailable(encodedImage)) {
                    encodedImage.parseMetaData();
                }
                abstractC1516Tf.g(i, encodedImage);
                return;
            case 1:
                AbstractC8446zt abstractC8446zt = (AbstractC8446zt) obj;
                if (AbstractC1516Tf.b(i)) {
                    return;
                }
                this.b.g(i, abstractC8446zt);
                return;
            case 2:
                EncodedImage encodedImage2 = (EncodedImage) obj;
                AbstractC8446zt byteBufferRef = null;
                try {
                    if (EncodedImage.isValid(encodedImage2) && encodedImage2 != null) {
                        byteBufferRef = encodedImage2.getByteBufferRef();
                    }
                    this.b.g(i, byteBufferRef);
                    AbstractC8446zt.p(byteBufferRef);
                    return;
                } catch (Throwable th) {
                    AbstractC8446zt.p(byteBufferRef);
                    throw th;
                }
            default:
                if (AbstractC1516Tf.a(i)) {
                    this.b.g(i, null);
                    return;
                }
                return;
        }
    }
}
