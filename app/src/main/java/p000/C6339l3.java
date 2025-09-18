package p000;

import com.facebook.imagepipeline.image.EncodedImage;

/* renamed from: l3 */
/* loaded from: classes.dex */
public final class C6339l3 extends AbstractC7254zH {

    /* renamed from: c */
    public final /* synthetic */ int f36843c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6339l3(AbstractC1237Tf abstractC1237Tf, int i) {
        super(abstractC1237Tf);
        this.f36843c = i;
    }

    @Override // p000.AbstractC1237Tf
    /* renamed from: h */
    public final void mo6846h(int i, Object obj) throws Throwable {
        switch (this.f36843c) {
            case 0:
                EncodedImage encodedImage = (EncodedImage) obj;
                AbstractC1237Tf abstractC1237Tf = this.f46773b;
                if (encodedImage == null) {
                    abstractC1237Tf.m7719g(i, null);
                    return;
                }
                if (!EncodedImage.isMetaDataAvailable(encodedImage)) {
                    encodedImage.parseMetaData();
                }
                abstractC1237Tf.m7719g(i, encodedImage);
                return;
            case 1:
                AbstractC7292zt abstractC7292zt = (AbstractC7292zt) obj;
                if (AbstractC1237Tf.m7715b(i)) {
                    return;
                }
                this.f46773b.m7719g(i, abstractC7292zt);
                return;
            case 2:
                EncodedImage encodedImage2 = (EncodedImage) obj;
                AbstractC7292zt byteBufferRef = null;
                try {
                    if (EncodedImage.isValid(encodedImage2) && encodedImage2 != null) {
                        byteBufferRef = encodedImage2.getByteBufferRef();
                    }
                    this.f46773b.m7719g(i, byteBufferRef);
                    AbstractC7292zt.m26569p(byteBufferRef);
                    return;
                } catch (Throwable th) {
                    AbstractC7292zt.m26569p(byteBufferRef);
                    throw th;
                }
            default:
                if (AbstractC1237Tf.m7714a(i)) {
                    this.f46773b.m7719g(i, null);
                    return;
                }
                return;
        }
    }
}
