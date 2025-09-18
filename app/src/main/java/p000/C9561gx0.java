package p000;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;

/* renamed from: gx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9561gx0 extends AbstractC7886La0 {

    /* renamed from: n */
    public final C0734Lf f28112n;

    public C9561gx0(C0734Lf c0734Lf, C8208Rf0 c8208Rf0, LinkedHashSet linkedHashSet, C0697L3 c0697l3, String str, URI uri, C0734Lf c0734Lf2, C0734Lf c0734Lf3, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(C8156Qf0.f9711d, c8208Rf0, linkedHashSet, c0697l3, str, uri, c0734Lf2, c0734Lf3, linkedList, date, date2, date3);
        if (c0734Lf == null) {
            throw new IllegalArgumentException("The key value must not be null");
        }
        this.f28112n = c0734Lf;
    }

    @Override // p000.AbstractC7886La0
    /* renamed from: b */
    public final boolean mo5029b() {
        return true;
    }

    @Override // p000.AbstractC7886La0
    /* renamed from: c */
    public final HashMap mo5030c() {
        HashMap mapMo5030c = super.mo5030c();
        mapMo5030c.put("k", this.f28112n.f6248a);
        return mapMo5030c;
    }

    @Override // p000.AbstractC7886La0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C9561gx0) && super.equals(obj)) {
            return Objects.equals(this.f28112n, ((C9561gx0) obj).f28112n);
        }
        return false;
    }

    @Override // p000.AbstractC7886La0
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f28112n);
    }
}
