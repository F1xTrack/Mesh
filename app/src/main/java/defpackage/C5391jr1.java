package defpackage;

import java.util.List;

/* renamed from: jr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5391jr1 extends AbstractC6537pr1 {
    public final List a;

    public C5391jr1(List list) {
        O90.f(list, "installedHosts");
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5391jr1) && O90.a(this.a, ((C5391jr1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC7209tN0.A(new StringBuilder("NoHostsFromApiReceived(installedHosts="), this.a, ')');
    }
}
