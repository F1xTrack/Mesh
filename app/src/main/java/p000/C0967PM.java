package p000;

import java.math.BigInteger;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: PM */
/* loaded from: classes2.dex */
public final class C0967PM extends AbstractC7886La0 {

    /* renamed from: r */
    public static final Set f9001r = Collections.unmodifiableSet(new HashSet(Arrays.asList(C0264EB.f2524b, C0264EB.f2525c, C0264EB.f2527e, C0264EB.f2528f)));

    /* renamed from: n */
    public final C0264EB f9002n;

    /* renamed from: o */
    public final C0734Lf f9003o;

    /* renamed from: p */
    public final C0734Lf f9004p;

    /* renamed from: q */
    public final C0734Lf f9005q;

    public C0967PM(C0264EB c0264eb, C0734Lf c0734Lf, C0734Lf c0734Lf2, C8208Rf0 c8208Rf0, LinkedHashSet linkedHashSet, C0697L3 c0697l3, String str, URI uri, C0734Lf c0734Lf3, C0734Lf c0734Lf4, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(C8156Qf0.f9709b, c8208Rf0, linkedHashSet, c0697l3, str, uri, c0734Lf3, c0734Lf4, linkedList, date, date2, date3);
        if (c0264eb == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        this.f9002n = c0264eb;
        if (c0734Lf == null) {
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        this.f9003o = c0734Lf;
        if (c0734Lf2 == null) {
            throw new IllegalArgumentException("The 'y' coordinate must not be null");
        }
        this.f9004p = c0734Lf2;
        m6306e(c0264eb, c0734Lf, c0734Lf2);
        m6307d(m5028a());
        this.f9005q = null;
    }

    /* renamed from: e */
    public static void m6306e(C0264EB c0264eb, C0734Lf c0734Lf, C0734Lf c0734Lf2) {
        if (!f9001r.contains(c0264eb)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + c0264eb);
        }
        BigInteger bigIntegerM4699b = c0734Lf.m4699b();
        BigInteger bigIntegerM4699b2 = c0734Lf2.m4699b();
        c0264eb.getClass();
        ECParameterSpec eCParameterSpec = AbstractC1030QM.f9593a;
        EllipticCurve curve = (C0264EB.f2524b.equals(c0264eb) ? AbstractC1030QM.f9593a : C0264EB.f2525c.equals(c0264eb) ? AbstractC1030QM.f9594b : C0264EB.f2527e.equals(c0264eb) ? AbstractC1030QM.f9595c : C0264EB.f2528f.equals(c0264eb) ? AbstractC1030QM.f9596d : null).getCurve();
        BigInteger a = curve.getA();
        BigInteger b = curve.getB();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        if (bigIntegerM4699b2.pow(2).mod(p).equals(bigIntegerM4699b.pow(3).add(a.multiply(bigIntegerM4699b)).add(b).mod(p))) {
            return;
        }
        throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + c0264eb + " curve");
    }

    @Override // p000.AbstractC7886La0
    /* renamed from: b */
    public final boolean mo5029b() {
        return this.f9005q != null;
    }

    @Override // p000.AbstractC7886La0
    /* renamed from: c */
    public final HashMap mo5030c() {
        HashMap mapMo5030c = super.mo5030c();
        mapMo5030c.put("crv", this.f9002n.f2533a);
        mapMo5030c.put("x", this.f9003o.f6248a);
        mapMo5030c.put("y", this.f9004p.f6248a);
        C0734Lf c0734Lf = this.f9005q;
        if (c0734Lf != null) {
            mapMo5030c.put(UcumUtils.UCUM_DAYS, c0734Lf.f6248a);
        }
        return mapMo5030c;
    }

    /* renamed from: d */
    public final void m6307d(List list) {
        if (list == null) {
            return;
        }
        boolean zEquals = false;
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) ((X509Certificate) m5028a().get(0)).getPublicKey();
            if (this.f9003o.m4699b().equals(eCPublicKey.getW().getAffineX())) {
                zEquals = this.f9004p.m4699b().equals(eCPublicKey.getW().getAffineY());
            }
        } catch (ClassCastException unused) {
        }
        if (!zEquals) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    @Override // p000.AbstractC7886La0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0967PM) || !super.equals(obj)) {
            return false;
        }
        C0967PM c0967pm = (C0967PM) obj;
        return Objects.equals(this.f9002n, c0967pm.f9002n) && Objects.equals(this.f9003o, c0967pm.f9003o) && Objects.equals(this.f9004p, c0967pm.f9004p) && Objects.equals(this.f9005q, c0967pm.f9005q);
    }

    @Override // p000.AbstractC7886La0
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f9002n, this.f9003o, this.f9004p, this.f9005q, null);
    }

    public C0967PM(C0264EB c0264eb, C0734Lf c0734Lf, C0734Lf c0734Lf2, C0734Lf c0734Lf3, C8208Rf0 c8208Rf0, LinkedHashSet linkedHashSet, C0697L3 c0697l3, String str, URI uri, C0734Lf c0734Lf4, C0734Lf c0734Lf5, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(C8156Qf0.f9709b, c8208Rf0, linkedHashSet, c0697l3, str, uri, c0734Lf4, c0734Lf5, linkedList, date, date2, date3);
        if (c0264eb != null) {
            this.f9002n = c0264eb;
            if (c0734Lf != null) {
                this.f9003o = c0734Lf;
                if (c0734Lf2 != null) {
                    this.f9004p = c0734Lf2;
                    m6306e(c0264eb, c0734Lf, c0734Lf2);
                    m6307d(m5028a());
                    this.f9005q = c0734Lf3;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
