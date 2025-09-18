package defpackage;

import java.io.Serializable;
import java.security.Key;

/* renamed from: Xr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1864Xr extends E6 {
    public final Serializable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864Xr(byte[] bArr, byte[] bArr2, AbstractC3280cs abstractC3280cs) {
        super(bArr, bArr2);
        String strB = abstractC3280cs.b();
        this.c = strB;
    }

    public C1864Xr(Key key, byte[] bArr, byte[] bArr2) {
        super(bArr2, bArr);
        this.c = key;
    }
}
