package p000;

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
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: fx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9433fx0 extends AbstractC7886La0 {

    /* renamed from: s */
    public static final Set f27507s = Collections.unmodifiableSet(new HashSet(Arrays.asList(C0264EB.f2529g, C0264EB.f2530h, C0264EB.f2531i, C0264EB.f2532j)));

    /* renamed from: n */
    public final C0264EB f27508n;

    /* renamed from: o */
    public final C0734Lf f27509o;

    /* renamed from: p */
    public final byte[] f27510p;

    /* renamed from: q */
    public final C0734Lf f27511q;

    /* renamed from: r */
    public final byte[] f27512r;

    public C9433fx0(C0264EB c0264eb, C0734Lf c0734Lf, C8208Rf0 c8208Rf0, LinkedHashSet linkedHashSet, C0697L3 c0697l3, String str, URI uri, C0734Lf c0734Lf2, C0734Lf c0734Lf3, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(C8156Qf0.f9712e, c8208Rf0, linkedHashSet, c0697l3, str, uri, c0734Lf2, c0734Lf3, linkedList, date, date2, date3);
        if (c0264eb == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        if (!f27507s.contains(c0264eb)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + c0264eb);
        }
        this.f27508n = c0264eb;
        if (c0734Lf == null) {
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        }
        this.f27509o = c0734Lf;
        this.f27510p = c0734Lf.m4698a();
        this.f27511q = null;
        this.f27512r = null;
    }

    @Override // p000.AbstractC7886La0
    /* renamed from: b */
    public final boolean mo5029b() {
        return this.f27511q != null;
    }

    @Override // p000.AbstractC7886La0
    /* renamed from: c */
    public final HashMap mo5030c() {
        HashMap mapMo5030c = super.mo5030c();
        mapMo5030c.put("crv", this.f27508n.f2533a);
        mapMo5030c.put("x", this.f27509o.f6248a);
        C0734Lf c0734Lf = this.f27511q;
        if (c0734Lf != null) {
            mapMo5030c.put(UcumUtils.UCUM_DAYS, c0734Lf.f6248a);
        }
        return mapMo5030c;
    }

    @Override // p000.AbstractC7886La0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9433fx0) || !super.equals(obj)) {
            return false;
        }
        C9433fx0 c9433fx0 = (C9433fx0) obj;
        return Objects.equals(this.f27508n, c9433fx0.f27508n) && Objects.equals(this.f27509o, c9433fx0.f27509o) && Arrays.equals(this.f27510p, c9433fx0.f27510p) && Objects.equals(this.f27511q, c9433fx0.f27511q) && Arrays.equals(this.f27512r, c9433fx0.f27512r);
    }

    @Override // p000.AbstractC7886La0
    public final int hashCode() {
        return Arrays.hashCode(this.f27512r) + ((Arrays.hashCode(this.f27510p) + (Objects.hash(Integer.valueOf(super.hashCode()), this.f27508n, this.f27509o, this.f27511q) * 31)) * 31);
    }

    public C9433fx0(C0264EB c0264eb, C0734Lf c0734Lf, C0734Lf c0734Lf2, C8208Rf0 c8208Rf0, LinkedHashSet linkedHashSet, C0697L3 c0697l3, String str, URI uri, C0734Lf c0734Lf3, C0734Lf c0734Lf4, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(C8156Qf0.f9712e, c8208Rf0, linkedHashSet, c0697l3, str, uri, c0734Lf3, c0734Lf4, linkedList, date, date2, date3);
        if (c0264eb != null) {
            if (f27507s.contains(c0264eb)) {
                this.f27508n = c0264eb;
                if (c0734Lf != null) {
                    this.f27509o = c0734Lf;
                    this.f27510p = c0734Lf.m4698a();
                    this.f27511q = c0734Lf2;
                    this.f27512r = c0734Lf2.m4698a();
                    return;
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + c0264eb);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
