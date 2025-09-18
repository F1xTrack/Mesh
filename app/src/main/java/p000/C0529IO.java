package p000;

import java.security.MessageDigest;
import java.util.Map;

/* renamed from: IO */
/* loaded from: classes.dex */
public final class C0529IO implements InterfaceC7740If0 {

    /* renamed from: b */
    public final Object f4911b;

    /* renamed from: c */
    public final int f4912c;

    /* renamed from: d */
    public final int f4913d;

    /* renamed from: e */
    public final Class f4914e;

    /* renamed from: f */
    public final Class f4915f;

    /* renamed from: g */
    public final InterfaceC7740If0 f4916g;

    /* renamed from: h */
    public final Map f4917h;

    /* renamed from: i */
    public final C7830Jy0 f4918i;

    /* renamed from: j */
    public int f4919j;

    public C0529IO(Object obj, InterfaceC7740If0 interfaceC7740If0, int i, int i2, Map map, Class cls, Class cls2, C7830Jy0 c7830Jy0) {
        IL1.m3830d(obj, "Argument must not be null");
        this.f4911b = obj;
        IL1.m3830d(interfaceC7740If0, "Signature must not be null");
        this.f4916g = interfaceC7740If0;
        this.f4912c = i;
        this.f4913d = i2;
        IL1.m3830d(map, "Argument must not be null");
        this.f4917h = map;
        IL1.m3830d(cls, "Resource class must not be null");
        this.f4914e = cls;
        IL1.m3830d(cls2, "Transcode class must not be null");
        this.f4915f = cls2;
        IL1.m3830d(c7830Jy0, "Argument must not be null");
        this.f4918i = c7830Jy0;
    }

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0529IO)) {
            return false;
        }
        C0529IO c0529io = (C0529IO) obj;
        return this.f4911b.equals(c0529io.f4911b) && this.f4916g.equals(c0529io.f4916g) && this.f4913d == c0529io.f4913d && this.f4912c == c0529io.f4912c && this.f4917h.equals(c0529io.f4917h) && this.f4914e.equals(c0529io.f4914e) && this.f4915f.equals(c0529io.f4915f) && this.f4918i.equals(c0529io.f4918i);
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        if (this.f4919j == 0) {
            int iHashCode = this.f4911b.hashCode();
            this.f4919j = iHashCode;
            int iHashCode2 = ((((this.f4916g.hashCode() + (iHashCode * 31)) * 31) + this.f4912c) * 31) + this.f4913d;
            this.f4919j = iHashCode2;
            int iHashCode3 = this.f4917h.hashCode() + (iHashCode2 * 31);
            this.f4919j = iHashCode3;
            int iHashCode4 = this.f4914e.hashCode() + (iHashCode3 * 31);
            this.f4919j = iHashCode4;
            int iHashCode5 = this.f4915f.hashCode() + (iHashCode4 * 31);
            this.f4919j = iHashCode5;
            this.f4919j = this.f4918i.f5819b.hashCode() + (iHashCode5 * 31);
        }
        return this.f4919j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f4911b + ", width=" + this.f4912c + ", height=" + this.f4913d + ", resourceClass=" + this.f4914e + ", transcodeClass=" + this.f4915f + ", signature=" + this.f4916g + ", hashCode=" + this.f4919j + ", transformations=" + this.f4917h + ", options=" + this.f4918i + '}';
    }
}
