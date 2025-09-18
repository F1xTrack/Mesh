package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* renamed from: oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6317oi implements InterfaceC7446uc1 {
    @Override // defpackage.InterfaceC7446uc1
    public final InterfaceC5506kS0 b(C7903x10 c7903x10, InterfaceC5506kS0 interfaceC5506kS0, int i, int i2) {
        if (!AbstractC0121Bh1.j(i, i2)) {
            throw new IllegalArgumentException(AbstractC8235ym.j("Cannot apply transformation on width: ", " or height: ", i, i2, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        InterfaceC5935mi interfaceC5935mi = a.a(c7903x10).b;
        Bitmap bitmap = (Bitmap) interfaceC5506kS0.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(interfaceC5935mi, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? interfaceC5506kS0 : C6126ni.b(interfaceC5935mi, bitmapC);
    }

    public abstract Bitmap c(InterfaceC5935mi interfaceC5935mi, Bitmap bitmap, int i, int i2);
}
