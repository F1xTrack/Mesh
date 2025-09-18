package defpackage;

import android.graphics.Matrix;

/* renamed from: Od, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1120Od implements K60 {
    public final C6974s81 a;
    public final long b;
    public final int c;
    public final Matrix d;

    public C1120Od(C6974s81 c6974s81, long j, int i, Matrix matrix) {
        if (c6974s81 == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.a = c6974s81;
        this.b = j;
        this.c = i;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.d = matrix;
    }

    @Override // defpackage.K60
    public final void a(C6263oQ c6263oQ) {
        c6263oQ.g(this.c);
    }

    @Override // defpackage.K60
    public final C6974s81 b() {
        return this.a;
    }

    @Override // defpackage.K60
    public final int c() {
        return this.c;
    }

    @Override // defpackage.K60
    public final Matrix d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1120Od)) {
            return false;
        }
        C1120Od c1120Od = (C1120Od) obj;
        return this.a.equals(c1120Od.a) && this.b == c1120Od.b && this.c == c1120Od.c && this.d.equals(c1120Od.d);
    }

    @Override // defpackage.K60
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.a + ", timestamp=" + this.b + ", rotationDegrees=" + this.c + ", sensorToBufferTransformMatrix=" + this.d + "}";
    }
}
