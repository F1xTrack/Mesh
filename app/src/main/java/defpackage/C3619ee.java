package defpackage;

import android.opengl.EGLSurface;

/* renamed from: ee, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3619ee {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public C3619ee(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3619ee)) {
            return false;
        }
        C3619ee c3619ee = (C3619ee) obj;
        return this.a.equals(c3619ee.a) && this.b == c3619ee.b && this.c == c3619ee.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return AbstractC1705Vq.j(sb, this.c, "}");
    }
}
