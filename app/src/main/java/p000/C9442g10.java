package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.security.MessageDigest;

/* renamed from: g10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9442g10 implements InterfaceC11312uc1 {

    /* renamed from: b */
    public final InterfaceC11312uc1 f27526b;

    public C9442g10(InterfaceC11312uc1 interfaceC11312uc1) {
        IL1.m3830d(interfaceC11312uc1, "Argument must not be null");
        this.f27526b = interfaceC11312uc1;
    }

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        this.f27526b.mo967a(messageDigest);
    }

    @Override // p000.InterfaceC11312uc1
    /* renamed from: b */
    public final InterfaceC10011kS0 mo8829b(C11617x10 c11617x10, InterfaceC10011kS0 interfaceC10011kS0, int i, int i2) {
        C9186e10 c9186e10 = (C9186e10) interfaceC10011kS0.get();
        InterfaceC10011kS0 c6506ni = new C6506ni(ComponentCallbacks2C1874a.m10883a(c11617x10).f17774b, ((C10082l10) c9186e10.f26481a.f17293b).f36816l);
        InterfaceC11312uc1 interfaceC11312uc1 = this.f27526b;
        InterfaceC10011kS0 interfaceC10011kS0Mo8829b = interfaceC11312uc1.mo8829b(c11617x10, c6506ni, i, i2);
        if (!c6506ni.equals(interfaceC10011kS0Mo8829b)) {
            c6506ni.recycle();
        }
        ((C10082l10) c9186e10.f26481a.f17293b).m22334c(interfaceC11312uc1, (Bitmap) interfaceC10011kS0Mo8829b.get());
        return interfaceC10011kS0;
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        if (obj instanceof C9442g10) {
            return this.f27526b.equals(((C9442g10) obj).f27526b);
        }
        return false;
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        return this.f27526b.hashCode();
    }
}
