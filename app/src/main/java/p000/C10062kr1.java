package p000;

import java.util.ArrayList;

/* renamed from: kr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10062kr1 extends AbstractC10702pr1 {

    /* renamed from: a */
    public final String f36728a;

    /* renamed from: b */
    public final ArrayList f36729b;

    public C10062kr1(String str, ArrayList arrayList) {
        this.f36728a = str;
        this.f36729b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10062kr1)) {
            return false;
        }
        C10062kr1 c10062kr1 = (C10062kr1) obj;
        return O90.m5963a(this.f36728a, c10062kr1.f36728a) && O90.m5963a(this.f36729b, c10062kr1.f36729b);
    }

    public final int hashCode() {
        return this.f36729b.hashCode() + (this.f36728a.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "NoMasterInHostsList(master=" + this.f36728a + ", installedHosts=" + this.f36729b + ')';
    }
}
