package p000;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;

/* renamed from: Xq */
/* loaded from: classes.dex */
public final class C1500Xq extends AbstractC6569oi {

    /* renamed from: b */
    public static final byte[] f13992b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC7740If0.f5069a);

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        messageDigest.update(f13992b);
    }

    @Override // p000.AbstractC6569oi
    /* renamed from: c */
    public final Bitmap mo3881c(InterfaceC6443mi interfaceC6443mi, Bitmap bitmap, int i, int i2) {
        Paint paint = AbstractC11567wc1.f44995a;
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? AbstractC11567wc1.m25656b(interfaceC6443mi, bitmap, i, i2) : bitmap;
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        return obj instanceof C1500Xq;
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        return -670243078;
    }
}
