package p000;

/* renamed from: Wq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8491Wq1 {

    /* renamed from: a */
    public final String f13419a;

    public /* synthetic */ C8491Wq1(String str) {
        this.f13419a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8491Wq1) {
            if (O90.m5963a(this.f13419a, ((C8491Wq1) obj).f13419a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13419a.hashCode();
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("PushToken(value="), this.f13419a, ')');
    }
}
