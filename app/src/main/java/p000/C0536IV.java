package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: IV */
/* loaded from: classes.dex */
public final class C0536IV extends AbstractC6569oi {

    /* renamed from: b */
    public static final byte[] f4958b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC7740If0.f5069a);

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        messageDigest.update(f4958b);
    }

    @Override // p000.AbstractC6569oi
    /* renamed from: c */
    public final Bitmap mo3881c(InterfaceC6443mi interfaceC6443mi, Bitmap bitmap, int i, int i2) {
        return AbstractC11567wc1.m25656b(interfaceC6443mi, bitmap, i, i2);
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        return obj instanceof C0536IV;
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        return 1572326941;
    }
}
