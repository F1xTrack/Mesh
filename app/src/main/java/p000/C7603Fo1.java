package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: Fo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7603Fo1 {

    /* renamed from: a */
    public final UUID f3420a;

    /* renamed from: b */
    public final int f3421b;

    /* renamed from: c */
    public final C7249zC f3422c;

    /* renamed from: d */
    public final HashSet f3423d;

    /* renamed from: e */
    public final C7249zC f3424e;

    /* renamed from: f */
    public final int f3425f;

    /* renamed from: g */
    public final int f3426g;

    public C7603Fo1(UUID uuid, int i, C7249zC c7249zC, ArrayList arrayList, C7249zC c7249zC2, int i2, int i3) {
        this.f3420a = uuid;
        this.f3421b = i;
        this.f3422c = c7249zC;
        this.f3423d = new HashSet(arrayList);
        this.f3424e = c7249zC2;
        this.f3425f = i2;
        this.f3426g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7603Fo1.class != obj.getClass()) {
            return false;
        }
        C7603Fo1 c7603Fo1 = (C7603Fo1) obj;
        if (this.f3425f == c7603Fo1.f3425f && this.f3426g == c7603Fo1.f3426g && this.f3420a.equals(c7603Fo1.f3420a) && this.f3421b == c7603Fo1.f3421b && this.f3422c.equals(c7603Fo1.f3422c) && this.f3423d.equals(c7603Fo1.f3423d)) {
            return this.f3424e.equals(c7603Fo1.f3424e);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3424e.hashCode() + ((this.f3423d.hashCode() + ((this.f3422c.hashCode() + ((AbstractC7222ym.m26247x(this.f3421b) + (this.f3420a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f3425f) * 31) + this.f3426g;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.f3420a + "', mState=" + F91.m2517G(this.f3421b) + ", mOutputData=" + this.f3422c + ", mTags=" + this.f3423d + ", mProgress=" + this.f3424e + '}';
    }
}
