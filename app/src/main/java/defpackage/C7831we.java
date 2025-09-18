package defpackage;

import java.util.HashMap;

/* renamed from: we, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7831we {
    public final InterfaceC6541pt a;
    public final HashMap b;

    public C7831we(InterfaceC6541pt interfaceC6541pt, HashMap map) {
        this.a = interfaceC6541pt;
        this.b = map;
    }

    public final long a(EnumC7370uD0 enumC7370uD0, long j, int i) {
        long jD = j - this.a.d();
        C8021xe c8021xe = (C8021xe) this.b.get(enumC7370uD0);
        long j2 = c8021xe.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), jD), c8021xe.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7831we)) {
            return false;
        }
        C7831we c7831we = (C7831we) obj;
        return this.a.equals(c7831we.a) && this.b.equals(c7831we.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
