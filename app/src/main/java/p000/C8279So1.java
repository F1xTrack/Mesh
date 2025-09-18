package p000;

/* renamed from: So1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8279So1 {

    /* renamed from: a */
    public String f10987a;

    /* renamed from: b */
    public int f10988b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8279So1)) {
            return false;
        }
        C8279So1 c8279So1 = (C8279So1) obj;
        return O90.m5963a(this.f10987a, c8279So1.f10987a) && this.f10988b == c8279So1.f10988b;
    }

    public final int hashCode() {
        return AbstractC7222ym.m26247x(this.f10988b) + (this.f10987a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f10987a + ", state=" + F91.m2517G(this.f10988b) + ')';
    }
}
