package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: Fo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454Fo1 {
    public final UUID a;
    public final int b;
    public final C8317zC c;
    public final HashSet d;
    public final C8317zC e;
    public final int f;
    public final int g;

    public C0454Fo1(UUID uuid, int i, C8317zC c8317zC, ArrayList arrayList, C8317zC c8317zC2, int i2, int i3) {
        this.a = uuid;
        this.b = i;
        this.c = c8317zC;
        this.d = new HashSet(arrayList);
        this.e = c8317zC2;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0454Fo1.class != obj.getClass()) {
            return false;
        }
        C0454Fo1 c0454Fo1 = (C0454Fo1) obj;
        if (this.f == c0454Fo1.f && this.g == c0454Fo1.g && this.a.equals(c0454Fo1.a) && this.b == c0454Fo1.b && this.c.equals(c0454Fo1.c) && this.d.equals(c0454Fo1.d)) {
            return this.e.equals(c0454Fo1.e);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((AbstractC8235ym.x(this.b) + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.a + "', mState=" + F91.G(this.b) + ", mOutputData=" + this.c + ", mTags=" + this.d + ", mProgress=" + this.e + '}';
    }
}
