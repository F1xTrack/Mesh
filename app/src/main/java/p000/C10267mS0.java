package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* renamed from: mS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10267mS0 implements InterfaceC7740If0 {

    /* renamed from: j */
    public static final C7285zm f37712j = new C7285zm(50);

    /* renamed from: b */
    public final C11967zm0 f37713b;

    /* renamed from: c */
    public final InterfaceC7740If0 f37714c;

    /* renamed from: d */
    public final InterfaceC7740If0 f37715d;

    /* renamed from: e */
    public final int f37716e;

    /* renamed from: f */
    public final int f37717f;

    /* renamed from: g */
    public final Class f37718g;

    /* renamed from: h */
    public final C7830Jy0 f37719h;

    /* renamed from: i */
    public final InterfaceC11312uc1 f37720i;

    public C10267mS0(C11967zm0 c11967zm0, InterfaceC7740If0 interfaceC7740If0, InterfaceC7740If0 interfaceC7740If02, int i, int i2, InterfaceC11312uc1 interfaceC11312uc1, Class cls, C7830Jy0 c7830Jy0) {
        this.f37713b = c11967zm0;
        this.f37714c = interfaceC7740If0;
        this.f37715d = interfaceC7740If02;
        this.f37716e = i;
        this.f37717f = i2;
        this.f37720i = interfaceC11312uc1;
        this.f37718g = cls;
        this.f37719h = c7830Jy0;
    }

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        Object objM26544f;
        C11967zm0 c11967zm0 = this.f37713b;
        synchronized (c11967zm0) {
            C11840ym0 c11840ym0 = (C11840ym0) c11967zm0.f46991d;
            InterfaceC9467gC0 interfaceC9467gC0M26250w1 = (InterfaceC9467gC0) ((ArrayDeque) c11840ym0.f11615b).poll();
            if (interfaceC9467gC0M26250w1 == null) {
                interfaceC9467gC0M26250w1 = c11840ym0.m26250w1();
            }
            C11713xm0 c11713xm0 = (C11713xm0) interfaceC9467gC0M26250w1;
            c11713xm0.f45771b = 8;
            c11713xm0.f45772c = byte[].class;
            objM26544f = c11967zm0.m26544f(c11713xm0, byte[].class);
        }
        byte[] bArr = (byte[]) objM26544f;
        ByteBuffer.wrap(bArr).putInt(this.f37716e).putInt(this.f37717f).array();
        this.f37715d.mo967a(messageDigest);
        this.f37714c.mo967a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC11312uc1 interfaceC11312uc1 = this.f37720i;
        if (interfaceC11312uc1 != null) {
            interfaceC11312uc1.mo967a(messageDigest);
        }
        this.f37719h.mo967a(messageDigest);
        C7285zm c7285zm = f37712j;
        Class cls = this.f37718g;
        byte[] bytes = (byte[]) c7285zm.m26534a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC7740If0.f5069a);
            c7285zm.m26537f(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f37713b.m26546h(bArr);
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        if (!(obj instanceof C10267mS0)) {
            return false;
        }
        C10267mS0 c10267mS0 = (C10267mS0) obj;
        return this.f37717f == c10267mS0.f37717f && this.f37716e == c10267mS0.f37716e && AbstractC7381Bh1.m803b(this.f37720i, c10267mS0.f37720i) && this.f37718g.equals(c10267mS0.f37718g) && this.f37714c.equals(c10267mS0.f37714c) && this.f37715d.equals(c10267mS0.f37715d) && this.f37719h.equals(c10267mS0.f37719h);
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        int iHashCode = ((((this.f37715d.hashCode() + (this.f37714c.hashCode() * 31)) * 31) + this.f37716e) * 31) + this.f37717f;
        InterfaceC11312uc1 interfaceC11312uc1 = this.f37720i;
        if (interfaceC11312uc1 != null) {
            iHashCode = (iHashCode * 31) + interfaceC11312uc1.hashCode();
        }
        return this.f37719h.f5819b.hashCode() + ((this.f37718g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f37714c + ", signature=" + this.f37715d + ", width=" + this.f37716e + ", height=" + this.f37717f + ", decodedResourceClass=" + this.f37718g + ", transformation='" + this.f37720i + "', options=" + this.f37719h + '}';
    }
}
