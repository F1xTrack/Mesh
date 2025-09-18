package p000;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.security.MessageDigest;

/* renamed from: lL */
/* loaded from: classes.dex */
public final class C6357lL implements InterfaceC11312uc1 {

    /* renamed from: b */
    public final InterfaceC11312uc1 f37013b;

    /* renamed from: c */
    public final boolean f37014c;

    public C6357lL(InterfaceC11312uc1 interfaceC11312uc1, boolean z) {
        this.f37013b = interfaceC11312uc1;
        this.f37014c = z;
    }

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        this.f37013b.mo967a(messageDigest);
    }

    @Override // p000.InterfaceC11312uc1
    /* renamed from: b */
    public final InterfaceC10011kS0 mo8829b(C11617x10 c11617x10, InterfaceC10011kS0 interfaceC10011kS0, int i, int i2) {
        InterfaceC6443mi interfaceC6443mi = ComponentCallbacks2C1874a.m10883a(c11617x10).f17774b;
        Drawable drawable = (Drawable) interfaceC10011kS0.get();
        C6506ni c6506niM24982a = AbstractC11205tn0.m24982a(interfaceC6443mi, drawable, i, i2);
        if (c6506niM24982a != null) {
            InterfaceC10011kS0 interfaceC10011kS0Mo8829b = this.f37013b.mo8829b(c11617x10, c6506niM24982a, i, i2);
            if (!interfaceC10011kS0Mo8829b.equals(c6506niM24982a)) {
                return new C6506ni(c11617x10.getResources(), interfaceC10011kS0Mo8829b);
            }
            interfaceC10011kS0Mo8829b.recycle();
            return interfaceC10011kS0;
        }
        if (!this.f37014c) {
            return interfaceC10011kS0;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        if (obj instanceof C6357lL) {
            return this.f37013b.equals(((C6357lL) obj).f37013b);
        }
        return false;
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        return this.f37013b.hashCode();
    }
}
