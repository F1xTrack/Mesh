package defpackage;

import android.util.Size;
import android.view.Surface;

/* renamed from: fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3810fe extends AbstractC5223iz0 {
    public final Surface a;
    public final Size b;
    public final int c;

    public C3810fe(Surface surface, Size size, int i) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.b = size;
        this.c = i;
    }

    @Override // defpackage.AbstractC5223iz0
    public final int a() {
        return this.c;
    }

    @Override // defpackage.AbstractC5223iz0
    public final Size b() {
        return this.b;
    }

    @Override // defpackage.AbstractC5223iz0
    public final Surface c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5223iz0)) {
            return false;
        }
        AbstractC5223iz0 abstractC5223iz0 = (AbstractC5223iz0) obj;
        if (this.a.equals(((C3810fe) abstractC5223iz0).a)) {
            C3810fe c3810fe = (C3810fe) abstractC5223iz0;
            if (this.b.equals(c3810fe.b) && this.c == c3810fe.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{surface=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", imageFormat=");
        return AbstractC1705Vq.j(sb, this.c, "}");
    }
}
