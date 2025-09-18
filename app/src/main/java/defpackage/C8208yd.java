package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: yd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8208yd implements InterfaceC7402uO {
    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public C8208yd(int i, int i2, List list, List list2) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.d = list2;
    }

    public static C8208yd e(int i, int i2, List list, List list2) {
        return new C8208yd(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
    }

    @Override // defpackage.InterfaceC7402uO
    public final int a() {
        return this.a;
    }

    @Override // defpackage.InterfaceC7402uO
    public final int b() {
        return this.b;
    }

    @Override // defpackage.InterfaceC7402uO
    public final List c() {
        return this.c;
    }

    @Override // defpackage.InterfaceC7402uO
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8208yd)) {
            return false;
        }
        C8208yd c8208yd = (C8208yd) obj;
        return this.a == c8208yd.a && this.b == c8208yd.b && this.c.equals(c8208yd.c) && this.d.equals(c8208yd.d);
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + "}";
    }
}
