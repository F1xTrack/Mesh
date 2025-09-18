package p000;

import android.util.Size;
import android.view.Surface;

/* renamed from: fe */
/* loaded from: classes.dex */
public final class C4066fe extends AbstractC9821iz0 {

    /* renamed from: a */
    public final Surface f27305a;

    /* renamed from: b */
    public final Size f27306b;

    /* renamed from: c */
    public final int f27307c;

    public C4066fe(Surface surface, Size size, int i) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f27305a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f27306b = size;
        this.f27307c = i;
    }

    @Override // p000.AbstractC9821iz0
    /* renamed from: a */
    public final int mo18263a() {
        return this.f27307c;
    }

    @Override // p000.AbstractC9821iz0
    /* renamed from: b */
    public final Size mo18264b() {
        return this.f27306b;
    }

    @Override // p000.AbstractC9821iz0
    /* renamed from: c */
    public final Surface mo18265c() {
        return this.f27305a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9821iz0)) {
            return false;
        }
        AbstractC9821iz0 abstractC9821iz0 = (AbstractC9821iz0) obj;
        if (this.f27305a.equals(((C4066fe) abstractC9821iz0).f27305a)) {
            C4066fe c4066fe = (C4066fe) abstractC9821iz0;
            if (this.f27306b.equals(c4066fe.f27306b) && this.f27307c == c4066fe.f27307c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f27305a.hashCode() ^ 1000003) * 1000003) ^ this.f27306b.hashCode()) * 1000003) ^ this.f27307c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{surface=");
        sb.append(this.f27305a);
        sb.append(", size=");
        sb.append(this.f27306b);
        sb.append(", imageFormat=");
        return AbstractC1374Vq.m8591j(sb, this.f27307c, "}");
    }
}
