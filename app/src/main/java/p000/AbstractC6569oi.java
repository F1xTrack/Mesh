package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C1874a;

/* renamed from: oi */
/* loaded from: classes.dex */
public abstract class AbstractC6569oi implements InterfaceC11312uc1 {
    @Override // p000.InterfaceC11312uc1
    /* renamed from: b */
    public final InterfaceC10011kS0 mo8829b(C11617x10 c11617x10, InterfaceC10011kS0 interfaceC10011kS0, int i, int i2) {
        if (!AbstractC7381Bh1.m811j(i, i2)) {
            throw new IllegalArgumentException(AbstractC7222ym.m26233j("Cannot apply transformation on width: ", " or height: ", i, i2, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        InterfaceC6443mi interfaceC6443mi = ComponentCallbacks2C1874a.m10883a(c11617x10).f17774b;
        Bitmap bitmap = (Bitmap) interfaceC10011kS0.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo3881c = mo3881c(interfaceC6443mi, bitmap, i, i2);
        return bitmap.equals(bitmapMo3881c) ? interfaceC10011kS0 : C6506ni.m23171b(interfaceC6443mi, bitmapMo3881c);
    }

    /* renamed from: c */
    public abstract Bitmap mo3881c(InterfaceC6443mi interfaceC6443mi, Bitmap bitmap, int i, int i2);
}
