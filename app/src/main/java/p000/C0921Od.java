package p000;

import android.graphics.Matrix;

/* renamed from: Od */
/* loaded from: classes.dex */
public final class C0921Od implements K60 {

    /* renamed from: a */
    public final C10996s81 f8537a;

    /* renamed from: b */
    public final long f8538b;

    /* renamed from: c */
    public final int f8539c;

    /* renamed from: d */
    public final Matrix f8540d;

    public C0921Od(C10996s81 c10996s81, long j, int i, Matrix matrix) {
        if (c10996s81 == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f8537a = c10996s81;
        this.f8538b = j;
        this.f8539c = i;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f8540d = matrix;
    }

    @Override // p000.K60
    /* renamed from: a */
    public final void mo4563a(C6551oQ c6551oQ) {
        c6551oQ.m23400g(this.f8539c);
    }

    @Override // p000.K60
    /* renamed from: b */
    public final C10996s81 mo4564b() {
        return this.f8537a;
    }

    @Override // p000.K60
    /* renamed from: c */
    public final int mo4565c() {
        return this.f8539c;
    }

    @Override // p000.K60
    /* renamed from: d */
    public final Matrix mo4566d() {
        return this.f8540d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0921Od)) {
            return false;
        }
        C0921Od c0921Od = (C0921Od) obj;
        return this.f8537a.equals(c0921Od.f8537a) && this.f8538b == c0921Od.f8538b && this.f8539c == c0921Od.f8539c && this.f8540d.equals(c0921Od.f8540d);
    }

    @Override // p000.K60
    public final long getTimestamp() {
        return this.f8538b;
    }

    public final int hashCode() {
        int iHashCode = (this.f8537a.hashCode() ^ 1000003) * 1000003;
        long j = this.f8538b;
        return ((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f8539c) * 1000003) ^ this.f8540d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f8537a + ", timestamp=" + this.f8538b + ", rotationDegrees=" + this.f8539c + ", sensorToBufferTransformMatrix=" + this.f8540d + "}";
    }
}
