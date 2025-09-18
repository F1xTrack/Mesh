package defpackage;

import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.util.ArrayList;

/* renamed from: To1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1545To1 {
    public final String a;
    public final int b;
    public final C8317zC c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final ArrayList g;

    public C1545To1(String str, int i, C8317zC c8317zC, int i2, int i3, ArrayList arrayList, ArrayList arrayList2) {
        O90.f(str, NotificationConstants.ID);
        NX.m(i, "state");
        this.a = str;
        this.b = i;
        this.c = c8317zC;
        this.d = i2;
        this.e = i3;
        this.f = arrayList;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1545To1)) {
            return false;
        }
        C1545To1 c1545To1 = (C1545To1) obj;
        return O90.a(this.a, c1545To1.a) && this.b == c1545To1.b && this.c.equals(c1545To1.c) && this.d == c1545To1.d && this.e == c1545To1.e && this.f.equals(c1545To1.f) && this.g.equals(c1545To1.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((((((this.c.hashCode() + ((AbstractC8235ym.x(this.b) + (this.a.hashCode() * 31)) * 31)) * 31) + this.d) * 31) + this.e) * 31)) * 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + F91.G(this.b) + ", output=" + this.c + ", runAttemptCount=" + this.d + ", generation=" + this.e + ", tags=" + this.f + ", progress=" + this.g + ')';
    }
}
