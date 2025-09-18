package p000;

import java.util.Arrays;

/* renamed from: sm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11075sm0 {

    /* renamed from: a */
    public final C8532Xl0 f42591a;

    /* renamed from: b */
    public final Throwable f42592b;

    public C11075sm0(C8532Xl0 c8532Xl0) {
        this.f42591a = c8532Xl0;
        this.f42592b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11075sm0)) {
            return false;
        }
        C11075sm0 c11075sm0 = (C11075sm0) obj;
        C8532Xl0 c8532Xl0 = this.f42591a;
        if (c8532Xl0 != null && c8532Xl0.equals(c11075sm0.f42591a)) {
            return true;
        }
        Throwable th = this.f42592b;
        if (th == null || c11075sm0.f42592b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42591a, this.f42592b});
    }

    public C11075sm0(Throwable th) {
        this.f42592b = th;
        this.f42591a = null;
    }
}
