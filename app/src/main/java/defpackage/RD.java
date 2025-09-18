package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class RD extends TD {
    public final C5273jE0 k;
    public final C6446pN0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RD(UD ud, AbstractC1516Tf abstractC1516Tf, RD0 rd0, C5273jE0 c5273jE0, C6446pN0 c6446pN0, int i) {
        super(ud, abstractC1516Tf, rd0, i);
        O90.f(abstractC1516Tf, "consumer");
        O90.f(rd0, "producerContext");
        O90.f(c6446pN0, "progressiveJpegConfig");
        this.k = c5273jE0;
        this.l = c6446pN0;
        this.i = 0;
    }

    @Override // defpackage.TD
    public final int n(EncodedImage encodedImage) {
        O90.f(encodedImage, "encodedImage");
        return this.k.f;
    }

    @Override // defpackage.TD
    public final T70 o() {
        int i = this.k.e;
        Object obj = this.l.b;
        boolean z = i >= 0;
        T70 t70 = new T70();
        t70.a = i;
        t70.b = z;
        t70.c = false;
        return t70;
    }

    @Override // defpackage.TD
    public final synchronized boolean s(EncodedImage encodedImage, int i) {
        int iIntValue;
        if (encodedImage == null) {
            return false;
        }
        try {
            boolean zF = this.h.f(encodedImage, i);
            if (AbstractC1516Tf.b(i) || AbstractC1516Tf.l(i, 8)) {
                if (!AbstractC1516Tf.l(i, 4) && EncodedImage.isValid(encodedImage) && encodedImage.getImageFormat() == KF.a) {
                    if (!this.k.b(encodedImage)) {
                        return false;
                    }
                    int i2 = this.k.e;
                    int i3 = this.i;
                    if (i2 <= i3) {
                        return false;
                    }
                    Object obj = this.l.b;
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
                    if (i2 < iIntValue && !this.k.g) {
                        return false;
                    }
                    this.i = i2;
                }
            }
            return zF;
        } catch (Throwable th) {
            throw th;
        }
    }
}
