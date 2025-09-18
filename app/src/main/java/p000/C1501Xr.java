package p000;

import java.io.Serializable;
import java.security.Key;

/* renamed from: Xr */
/* loaded from: classes2.dex */
public final class C1501Xr extends AbstractC0259E6 {

    /* renamed from: c */
    public final Serializable f13993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1501Xr(byte[] bArr, byte[] bArr2, AbstractC3892cs abstractC3892cs) {
        super(bArr, bArr2);
        String strMo9616b = abstractC3892cs.mo9616b();
        this.f13993c = strMo9616b;
    }

    public C1501Xr(Key key, byte[] bArr, byte[] bArr2) {
        super(bArr2, bArr);
        this.f13993c = key;
    }
}
