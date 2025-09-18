package p000;

import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.util.ArrayList;

/* renamed from: To1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8331To1 {

    /* renamed from: a */
    public final String f11528a;

    /* renamed from: b */
    public final int f11529b;

    /* renamed from: c */
    public final C7249zC f11530c;

    /* renamed from: d */
    public final int f11531d;

    /* renamed from: e */
    public final int f11532e;

    /* renamed from: f */
    public final ArrayList f11533f;

    /* renamed from: g */
    public final ArrayList f11534g;

    public C8331To1(String str, int i, C7249zC c7249zC, int i2, int i3, ArrayList arrayList, ArrayList arrayList2) {
        O90.m5968f(str, NotificationConstants.f19487ID);
        AbstractC0852NX.m5764m(i, "state");
        this.f11528a = str;
        this.f11529b = i;
        this.f11530c = c7249zC;
        this.f11531d = i2;
        this.f11532e = i3;
        this.f11533f = arrayList;
        this.f11534g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8331To1)) {
            return false;
        }
        C8331To1 c8331To1 = (C8331To1) obj;
        return O90.m5963a(this.f11528a, c8331To1.f11528a) && this.f11529b == c8331To1.f11529b && this.f11530c.equals(c8331To1.f11530c) && this.f11531d == c8331To1.f11531d && this.f11532e == c8331To1.f11532e && this.f11533f.equals(c8331To1.f11533f) && this.f11534g.equals(c8331To1.f11534g);
    }

    public final int hashCode() {
        return this.f11534g.hashCode() + ((this.f11533f.hashCode() + ((((((this.f11530c.hashCode() + ((AbstractC7222ym.m26247x(this.f11529b) + (this.f11528a.hashCode() * 31)) * 31)) * 31) + this.f11531d) * 31) + this.f11532e) * 31)) * 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.f11528a + ", state=" + F91.m2517G(this.f11529b) + ", output=" + this.f11530c + ", runAttemptCount=" + this.f11531d + ", generation=" + this.f11532e + ", tags=" + this.f11533f + ", progress=" + this.f11534g + ')';
    }
}
