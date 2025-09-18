package p000;

import com.google.android.gms.common.internal.Objects;

/* renamed from: cJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8965cJ1 {

    /* renamed from: a */
    public final EnumC10465o02 f17421a;

    /* renamed from: b */
    public final Boolean f17422b;

    /* renamed from: c */
    public final Y22 f17423c;

    /* renamed from: d */
    public final ZE1 f17424d;

    /* renamed from: e */
    public final ZE1 f17425e;

    public /* synthetic */ C8965cJ1(C6479nH c6479nH) {
        this.f17421a = (EnumC10465o02) c6479nH.f38227a;
        this.f17422b = (Boolean) c6479nH.f38228b;
        this.f17423c = (Y22) c6479nH.f38229c;
        this.f17424d = (ZE1) c6479nH.f38230d;
        this.f17425e = (ZE1) c6479nH.f38231e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8965cJ1)) {
            return false;
        }
        C8965cJ1 c8965cJ1 = (C8965cJ1) obj;
        return Objects.equal(this.f17421a, c8965cJ1.f17421a) && Objects.equal(null, null) && Objects.equal(this.f17422b, c8965cJ1.f17422b) && Objects.equal(null, null) && Objects.equal(this.f17423c, c8965cJ1.f17423c) && Objects.equal(this.f17424d, c8965cJ1.f17424d) && Objects.equal(this.f17425e, c8965cJ1.f17425e);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f17421a, null, this.f17422b, null, this.f17423c, this.f17424d, this.f17425e);
    }
}
