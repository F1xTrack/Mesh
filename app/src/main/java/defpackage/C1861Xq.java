package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;

/* renamed from: Xq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1861Xq extends AbstractC6317oi {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC0660If0.a);

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.AbstractC6317oi
    public final Bitmap c(InterfaceC5935mi interfaceC5935mi, Bitmap bitmap, int i, int i2) {
        Paint paint = AbstractC7827wc1.a;
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? AbstractC7827wc1.b(interfaceC5935mi, bitmap, i, i2) : bitmap;
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        return obj instanceof C1861Xq;
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        return -670243078;
    }
}
