package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* renamed from: Wq */
/* loaded from: classes.dex */
public final class C1437Wq extends AbstractC6569oi {

    /* renamed from: b */
    public static final byte[] f13418b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC7740If0.f5069a);

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        messageDigest.update(f13418b);
    }

    @Override // p000.AbstractC6569oi
    /* renamed from: c */
    public final Bitmap mo3881c(InterfaceC6443mi interfaceC6443mi, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC11567wc1.f44995a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo320o = interfaceC6443mi.mo320o(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo320o.setHasAlpha(bitmap.hasAlpha());
        AbstractC11567wc1.m25655a(bitmap, bitmapMo320o, matrix);
        return bitmapMo320o;
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        return obj instanceof C1437Wq;
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        return -599754482;
    }
}
