package p000;

/* renamed from: LZ */
/* loaded from: classes2.dex */
public final class C0728LZ {

    /* renamed from: a */
    public final AbstractC0666KZ f6712a;

    /* renamed from: b */
    public final int f6713b;

    public C0728LZ(AbstractC0666KZ abstractC0666KZ, int i) {
        this.f6712a = abstractC0666KZ;
        this.f6713b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0728LZ)) {
            return false;
        }
        C0728LZ c0728lz = (C0728LZ) obj;
        return O90.m5963a(this.f6712a, c0728lz.f6712a) && this.f6713b == c0728lz.f6713b;
    }

    public final int hashCode() {
        return (this.f6712a.hashCode() * 31) + this.f6713b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.f6712a);
        sb.append(", arity=");
        return AbstractC7222ym.m26235l(sb, this.f6713b, ')');
    }
}
