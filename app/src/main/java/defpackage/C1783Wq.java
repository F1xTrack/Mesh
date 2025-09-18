package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* renamed from: Wq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1783Wq extends AbstractC6317oi {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC0660If0.a);

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.AbstractC6317oi
    public final Bitmap c(InterfaceC5935mi interfaceC5935mi, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC7827wc1.a;
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
        Bitmap bitmapO = interfaceC5935mi.o(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapO.setHasAlpha(bitmap.hasAlpha());
        AbstractC7827wc1.a(bitmap, bitmapO, matrix);
        return bitmapO;
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        return obj instanceof C1783Wq;
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        return -599754482;
    }
}
