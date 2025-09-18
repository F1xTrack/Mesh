package defpackage;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;
import ru.ok.tracer.base.ucum.UcumUtils;

/* renamed from: fx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3868fx0 extends AbstractC0879La0 {
    public static final Set s = Collections.unmodifiableSet(new HashSet(Arrays.asList(EB.g, EB.h, EB.i, EB.j)));
    public final EB n;
    public final C0893Lf o;
    public final byte[] p;
    public final C0893Lf q;
    public final byte[] r;

    public C3868fx0(EB eb, C0893Lf c0893Lf, C1361Rf0 c1361Rf0, LinkedHashSet linkedHashSet, L3 l3, String str, URI uri, C0893Lf c0893Lf2, C0893Lf c0893Lf3, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(C1283Qf0.e, c1361Rf0, linkedHashSet, l3, str, uri, c0893Lf2, c0893Lf3, linkedList, date, date2, date3);
        if (eb == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        if (!s.contains(eb)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + eb);
        }
        this.n = eb;
        if (c0893Lf == null) {
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        }
        this.o = c0893Lf;
        this.p = c0893Lf.a();
        this.q = null;
        this.r = null;
    }

    @Override // defpackage.AbstractC0879La0
    public final boolean b() {
        return this.q != null;
    }

    @Override // defpackage.AbstractC0879La0
    public final HashMap c() {
        HashMap mapC = super.c();
        mapC.put("crv", this.n.a);
        mapC.put("x", this.o.a);
        C0893Lf c0893Lf = this.q;
        if (c0893Lf != null) {
            mapC.put(UcumUtils.UCUM_DAYS, c0893Lf.a);
        }
        return mapC;
    }

    @Override // defpackage.AbstractC0879La0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3868fx0) || !super.equals(obj)) {
            return false;
        }
        C3868fx0 c3868fx0 = (C3868fx0) obj;
        return Objects.equals(this.n, c3868fx0.n) && Objects.equals(this.o, c3868fx0.o) && Arrays.equals(this.p, c3868fx0.p) && Objects.equals(this.q, c3868fx0.q) && Arrays.equals(this.r, c3868fx0.r);
    }

    @Override // defpackage.AbstractC0879La0
    public final int hashCode() {
        return Arrays.hashCode(this.r) + ((Arrays.hashCode(this.p) + (Objects.hash(Integer.valueOf(super.hashCode()), this.n, this.o, this.q) * 31)) * 31);
    }

    public C3868fx0(EB eb, C0893Lf c0893Lf, C0893Lf c0893Lf2, C1361Rf0 c1361Rf0, LinkedHashSet linkedHashSet, L3 l3, String str, URI uri, C0893Lf c0893Lf3, C0893Lf c0893Lf4, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(C1283Qf0.e, c1361Rf0, linkedHashSet, l3, str, uri, c0893Lf3, c0893Lf4, linkedList, date, date2, date3);
        if (eb != null) {
            if (s.contains(eb)) {
                this.n = eb;
                if (c0893Lf != null) {
                    this.o = c0893Lf;
                    this.p = c0893Lf.a();
                    this.q = c0893Lf2;
                    this.r = c0893Lf2.a();
                    return;
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + eb);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
