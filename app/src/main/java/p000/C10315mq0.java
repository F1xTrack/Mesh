package p000;

/* renamed from: mq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10315mq0 {

    /* renamed from: a */
    public final String f37960a;

    public C10315mq0(String str) {
        this.f37960a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10315mq0) && O90.m5963a(this.f37960a, ((C10315mq0) obj).f37960a);
    }

    public final int hashCode() {
        return this.f37960a.hashCode();
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("MemberSignature(signature="), this.f37960a, ')');
    }
}
