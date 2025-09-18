package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: jC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5268jC1 {
    public transient C7936xB1 a;
    public transient C8088y0 b;

    public final Map a() {
        C8088y0 c8088y0 = this.b;
        if (c8088y0 != null) {
            return c8088y0;
        }
        C6223oC1 c6223oC1 = (C6223oC1) this;
        C8088y0 c8088y02 = new C8088y0(c6223oC1, c6223oC1.c, 1);
        this.b = c8088y02;
        return c8088y02;
    }

    public final Set b() {
        C7936xB1 c7936xB1 = this.a;
        if (c7936xB1 != null) {
            return c7936xB1;
        }
        C6223oC1 c6223oC1 = (C6223oC1) this;
        C7936xB1 c7936xB12 = new C7936xB1(c6223oC1, c6223oC1.c);
        this.a = c7936xB12;
        return c7936xB12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5268jC1) {
            return a().equals(((AbstractC5268jC1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((C2223av) ((C8088y0) a()).d).hashCode();
    }

    public final String toString() {
        return ((C2223av) ((C8088y0) a()).d).toString();
    }
}
