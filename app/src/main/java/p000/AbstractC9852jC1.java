package p000;

import java.util.Map;
import java.util.Set;

/* renamed from: jC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9852jC1 {

    /* renamed from: a */
    public transient C11640xB1 f34972a;

    /* renamed from: b */
    public transient C7174y0 f34973b;

    /* renamed from: a */
    public final Map m21986a() {
        C7174y0 c7174y0 = this.f34973b;
        if (c7174y0 != null) {
            return c7174y0;
        }
        C10492oC1 c10492oC1 = (C10492oC1) this;
        C7174y0 c7174y02 = new C7174y0(c10492oC1, c10492oC1.f38885c, 1);
        this.f34973b = c7174y02;
        return c7174y02;
    }

    /* renamed from: b */
    public final Set m21987b() {
        C11640xB1 c11640xB1 = this.f34972a;
        if (c11640xB1 != null) {
            return c11640xB1;
        }
        C10492oC1 c10492oC1 = (C10492oC1) this;
        C11640xB1 c11640xB12 = new C11640xB1(c10492oC1, c10492oC1.f38885c);
        this.f34972a = c11640xB12;
        return c11640xB12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9852jC1) {
            return m21986a().equals(((AbstractC9852jC1) obj).m21986a());
        }
        return false;
    }

    public final int hashCode() {
        return ((C1752av) ((C7174y0) m21986a()).f46001d).hashCode();
    }

    public final String toString() {
        return ((C1752av) ((C7174y0) m21986a()).f46001d).toString();
    }
}
