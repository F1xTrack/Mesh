package p000;

/* renamed from: Yj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8581Yj1 {

    /* renamed from: c */
    public static final C8774aq0 f14492c = new C8774aq0(25);

    /* renamed from: a */
    public final int f14493a;

    /* renamed from: b */
    public final int f14494b;

    public C8581Yj1(int i, int i2) {
        this.f14493a = i;
        this.f14494b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != C8581Yj1.class) {
            return false;
        }
        C8581Yj1 c8581Yj1 = (C8581Yj1) obj;
        return this.f14494b == c8581Yj1.f14494b && this.f14493a == c8581Yj1.f14493a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f14493a);
        sb.append(", ");
        return AbstractC1374Vq.m8591j(sb, this.f14494b, "]");
    }
}
