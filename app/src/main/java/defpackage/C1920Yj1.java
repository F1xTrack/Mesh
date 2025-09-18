package defpackage;

/* renamed from: Yj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1920Yj1 {
    public static final C2209aq0 c = new C2209aq0(25);
    public final int a;
    public final int b;

    public C1920Yj1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != C1920Yj1.class) {
            return false;
        }
        C1920Yj1 c1920Yj1 = (C1920Yj1) obj;
        return this.b == c1920Yj1.b && this.a == c1920Yj1.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.a);
        sb.append(", ");
        return AbstractC1705Vq.j(sb, this.b, "]");
    }
}
