package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* renamed from: mS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5888mS0 implements InterfaceC0660If0 {
    public static final C8425zm j = new C8425zm(50);
    public final C8426zm0 b;
    public final InterfaceC0660If0 c;
    public final InterfaceC0660If0 d;
    public final int e;
    public final int f;
    public final Class g;
    public final C0795Jy0 h;
    public final InterfaceC7446uc1 i;

    public C5888mS0(C8426zm0 c8426zm0, InterfaceC0660If0 interfaceC0660If0, InterfaceC0660If0 interfaceC0660If02, int i, int i2, InterfaceC7446uc1 interfaceC7446uc1, Class cls, C0795Jy0 c0795Jy0) {
        this.b = c8426zm0;
        this.c = interfaceC0660If0;
        this.d = interfaceC0660If02;
        this.e = i;
        this.f = i2;
        this.i = interfaceC7446uc1;
        this.g = cls;
        this.h = c0795Jy0;
    }

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        Object objF;
        C8426zm0 c8426zm0 = this.b;
        synchronized (c8426zm0) {
            C8236ym0 c8236ym0 = (C8236ym0) c8426zm0.d;
            InterfaceC3918gC0 interfaceC3918gC0W1 = (InterfaceC3918gC0) ((ArrayDeque) c8236ym0.b).poll();
            if (interfaceC3918gC0W1 == null) {
                interfaceC3918gC0W1 = c8236ym0.w1();
            }
            C8046xm0 c8046xm0 = (C8046xm0) interfaceC3918gC0W1;
            c8046xm0.b = 8;
            c8046xm0.c = byte[].class;
            objF = c8426zm0.f(c8046xm0, byte[].class);
        }
        byte[] bArr = (byte[]) objF;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC7446uc1 interfaceC7446uc1 = this.i;
        if (interfaceC7446uc1 != null) {
            interfaceC7446uc1.a(messageDigest);
        }
        this.h.a(messageDigest);
        C8425zm c8425zm = j;
        Class cls = this.g;
        byte[] bytes = (byte[]) c8425zm.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC0660If0.a);
            c8425zm.f(cls, bytes);
        }
        messageDigest.update(bytes);
        this.b.h(bArr);
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        if (!(obj instanceof C5888mS0)) {
            return false;
        }
        C5888mS0 c5888mS0 = (C5888mS0) obj;
        return this.f == c5888mS0.f && this.e == c5888mS0.e && AbstractC0121Bh1.b(this.i, c5888mS0.i) && this.g.equals(c5888mS0.g) && this.c.equals(c5888mS0.c) && this.d.equals(c5888mS0.d) && this.h.equals(c5888mS0.h);
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        InterfaceC7446uc1 interfaceC7446uc1 = this.i;
        if (interfaceC7446uc1 != null) {
            iHashCode = (iHashCode * 31) + interfaceC7446uc1.hashCode();
        }
        return this.h.b.hashCode() + ((this.g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
