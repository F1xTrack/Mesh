package defpackage;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;

/* renamed from: gx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4059gx0 extends AbstractC0879La0 {
    public final C0893Lf n;

    public C4059gx0(C0893Lf c0893Lf, C1361Rf0 c1361Rf0, LinkedHashSet linkedHashSet, L3 l3, String str, URI uri, C0893Lf c0893Lf2, C0893Lf c0893Lf3, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(C1283Qf0.d, c1361Rf0, linkedHashSet, l3, str, uri, c0893Lf2, c0893Lf3, linkedList, date, date2, date3);
        if (c0893Lf == null) {
            throw new IllegalArgumentException("The key value must not be null");
        }
        this.n = c0893Lf;
    }

    @Override // defpackage.AbstractC0879La0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.AbstractC0879La0
    public final HashMap c() {
        HashMap mapC = super.c();
        mapC.put("k", this.n.a);
        return mapC;
    }

    @Override // defpackage.AbstractC0879La0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4059gx0) && super.equals(obj)) {
            return Objects.equals(this.n, ((C4059gx0) obj).n);
        }
        return false;
    }

    @Override // defpackage.AbstractC0879La0
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.n);
    }
}
