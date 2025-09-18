package defpackage;

import com.google.android.gms.common.internal.Objects;

/* renamed from: cJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2492cJ1 {
    public final EnumC6184o02 a;
    public final Boolean b;
    public final Y22 c;
    public final ZE1 d;
    public final ZE1 e;

    public /* synthetic */ C2492cJ1(C6045nH c6045nH) {
        this.a = (EnumC6184o02) c6045nH.a;
        this.b = (Boolean) c6045nH.b;
        this.c = (Y22) c6045nH.c;
        this.d = (ZE1) c6045nH.d;
        this.e = (ZE1) c6045nH.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2492cJ1)) {
            return false;
        }
        C2492cJ1 c2492cJ1 = (C2492cJ1) obj;
        return Objects.equal(this.a, c2492cJ1.a) && Objects.equal(null, null) && Objects.equal(this.b, c2492cJ1.b) && Objects.equal(null, null) && Objects.equal(this.c, c2492cJ1.c) && Objects.equal(this.d, c2492cJ1.d) && Objects.equal(this.e, c2492cJ1.e);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, null, this.b, null, this.c, this.d, this.e);
    }
}
