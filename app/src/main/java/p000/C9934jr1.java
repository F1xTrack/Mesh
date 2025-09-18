package p000;

import java.util.List;

/* renamed from: jr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9934jr1 extends AbstractC10702pr1 {

    /* renamed from: a */
    public final List f35429a;

    public C9934jr1(List list) {
        O90.m5968f(list, "installedHosts");
        this.f35429a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9934jr1) && O90.m5963a(this.f35429a, ((C9934jr1) obj).f35429a);
    }

    public final int hashCode() {
        return this.f35429a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC11153tN0.m24883A(new StringBuilder("NoHostsFromApiReceived(installedHosts="), this.f35429a, ')');
    }
}
