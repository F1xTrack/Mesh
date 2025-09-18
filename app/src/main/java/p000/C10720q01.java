package p000;

/* renamed from: q01, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10720q01 {

    /* renamed from: a */
    public final int f40484a;

    public final boolean equals(Object obj) {
        if (obj instanceof C10720q01) {
            return this.f40484a == ((C10720q01) obj).f40484a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40484a;
    }

    public final String toString() {
        return AbstractC1374Vq.m8591j(new StringBuilder("SharedObjectId(value="), this.f40484a, ")");
    }
}
