package p000;

import android.opengl.EGLSurface;

/* renamed from: ee */
/* loaded from: classes.dex */
public final class C4003ee {

    /* renamed from: a */
    public final EGLSurface f26791a;

    /* renamed from: b */
    public final int f26792b;

    /* renamed from: c */
    public final int f26793c;

    public C4003ee(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f26791a = eGLSurface;
        this.f26792b = i;
        this.f26793c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4003ee)) {
            return false;
        }
        C4003ee c4003ee = (C4003ee) obj;
        return this.f26791a.equals(c4003ee.f26791a) && this.f26792b == c4003ee.f26792b && this.f26793c == c4003ee.f26793c;
    }

    public final int hashCode() {
        return ((((this.f26791a.hashCode() ^ 1000003) * 1000003) ^ this.f26792b) * 1000003) ^ this.f26793c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.f26791a);
        sb.append(", width=");
        sb.append(this.f26792b);
        sb.append(", height=");
        return AbstractC1374Vq.m8591j(sb, this.f26793c, "}");
    }
}
