package p000;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Collections;
import java.util.List;

/* renamed from: RD */
/* loaded from: classes.dex */
public final class C1083RD extends AbstractC1209TD {

    /* renamed from: k */
    public final C9855jE0 f10062k;

    /* renamed from: l */
    public final C10641pN0 f10063l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1083RD(C1272UD c1272ud, AbstractC1237Tf abstractC1237Tf, RD0 rd0, C9855jE0 c9855jE0, C10641pN0 c10641pN0, int i) {
        super(c1272ud, abstractC1237Tf, rd0, i);
        O90.m5968f(abstractC1237Tf, "consumer");
        O90.m5968f(rd0, "producerContext");
        O90.m5968f(c10641pN0, "progressiveJpegConfig");
        this.f10062k = c9855jE0;
        this.f10063l = c10641pN0;
        this.f11204i = 0;
    }

    @Override // p000.AbstractC1209TD
    /* renamed from: n */
    public final int mo6615n(EncodedImage encodedImage) {
        O90.m5968f(encodedImage, "encodedImage");
        return this.f10062k.f35000f;
    }

    @Override // p000.AbstractC1209TD
    /* renamed from: o */
    public final T70 mo6616o() {
        int i = this.f10062k.f34999e;
        Object obj = this.f10063l.f40042b;
        boolean z = i >= 0;
        T70 t70 = new T70();
        t70.f11168a = i;
        t70.f11169b = z;
        t70.f11170c = false;
        return t70;
    }

    @Override // p000.AbstractC1209TD
    /* renamed from: s */
    public final synchronized boolean mo6617s(EncodedImage encodedImage, int i) {
        int iIntValue;
        if (encodedImage == null) {
            return false;
        }
        try {
            boolean zM9097f = this.f11203h.m9097f(encodedImage, i);
            if (AbstractC1237Tf.m7715b(i) || AbstractC1237Tf.m7716l(i, 8)) {
                if (!AbstractC1237Tf.m7716l(i, 4) && EncodedImage.isValid(encodedImage) && encodedImage.getImageFormat() == AbstractC0646KF.f5957a) {
                    if (!this.f10062k.m22010b(encodedImage)) {
                        return false;
                    }
                    int i2 = this.f10062k.f34999e;
                    int i3 = this.f11204i;
                    if (i2 <= i3) {
                        return false;
                    }
                    Object obj = this.f10063l.f40042b;
                    List list = Collections.EMPTY_LIST;
                    if (list != null && !list.isEmpty()) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= list.size()) {
                                iIntValue = Integer.MAX_VALUE;
                                break;
                            }
                            if (((Integer) list.get(i4)).intValue() > i3) {
                                iIntValue = ((Integer) list.get(i4)).intValue();
                                break;
                            }
                            i4++;
                        }
                    } else {
                        iIntValue = i3 + 1;
                    }
                    if (i2 < iIntValue && !this.f10062k.f35001g) {
                        return false;
                    }
                    this.f11204i = i2;
                }
            }
            return zM9097f;
        } catch (Throwable th) {
            throw th;
        }
    }
}
