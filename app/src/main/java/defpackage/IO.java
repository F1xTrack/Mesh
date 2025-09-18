package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public final class IO implements InterfaceC0660If0 {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final InterfaceC0660If0 g;
    public final Map h;
    public final C0795Jy0 i;
    public int j;

    public IO(Object obj, InterfaceC0660If0 interfaceC0660If0, int i, int i2, Map map, Class cls, Class cls2, C0795Jy0 c0795Jy0) {
        IL1.d(obj, "Argument must not be null");
        this.b = obj;
        IL1.d(interfaceC0660If0, "Signature must not be null");
        this.g = interfaceC0660If0;
        this.c = i;
        this.d = i2;
        IL1.d(map, "Argument must not be null");
        this.h = map;
        IL1.d(cls, "Resource class must not be null");
        this.e = cls;
        IL1.d(cls2, "Transcode class must not be null");
        this.f = cls2;
        IL1.d(c0795Jy0, "Argument must not be null");
        this.i = c0795Jy0;
    }

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        if (!(obj instanceof IO)) {
            return false;
        }
        IO io2 = (IO) obj;
        return this.b.equals(io2.b) && this.g.equals(io2.g) && this.d == io2.d && this.c == io2.c && this.h.equals(io2.h) && this.e.equals(io2.e) && this.f.equals(io2.f) && this.i.equals(io2.i);
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.i.b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
