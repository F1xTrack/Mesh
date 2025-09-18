package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class IV extends AbstractC6317oi {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC0660If0.a);

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.AbstractC6317oi
    public final Bitmap c(InterfaceC5935mi interfaceC5935mi, Bitmap bitmap, int i, int i2) {
        return AbstractC7827wc1.b(interfaceC5935mi, bitmap, i, i2);
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        return obj instanceof IV;
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        return 1572326941;
    }
}
