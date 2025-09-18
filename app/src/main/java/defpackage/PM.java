package defpackage;

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
import ru.ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes2.dex */
public final class PM extends AbstractC0879La0 {
    public static final Set r = Collections.unmodifiableSet(new HashSet(Arrays.asList(EB.b, EB.c, EB.e, EB.f)));
    public final EB n;
    public final C0893Lf o;
    public final C0893Lf p;
    public final C0893Lf q;

    public PM(EB eb, C0893Lf c0893Lf, C0893Lf c0893Lf2, C1361Rf0 c1361Rf0, LinkedHashSet linkedHashSet, L3 l3, String str, URI uri, C0893Lf c0893Lf3, C0893Lf c0893Lf4, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(C1283Qf0.b, c1361Rf0, linkedHashSet, l3, str, uri, c0893Lf3, c0893Lf4, linkedList, date, date2, date3);
        if (eb == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        this.n = eb;
        if (c0893Lf == null) {
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        this.o = c0893Lf;
        if (c0893Lf2 == null) {
            throw new IllegalArgumentException("The 'y' coordinate must not be null");
        }
        this.p = c0893Lf2;
        e(eb, c0893Lf, c0893Lf2);
        d(a());
        this.q = null;
    }

    public static void e(EB eb, C0893Lf c0893Lf, C0893Lf c0893Lf2) {
        if (!r.contains(eb)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + eb);
        }
        BigInteger bigIntegerB = c0893Lf.b();
        BigInteger bigIntegerB2 = c0893Lf2.b();
        eb.getClass();
        ECParameterSpec eCParameterSpec = QM.a;
        EllipticCurve curve = (EB.b.equals(eb) ? QM.a : EB.c.equals(eb) ? QM.b : EB.e.equals(eb) ? QM.c : EB.f.equals(eb) ? QM.d : null).getCurve();
        BigInteger a = curve.getA();
        BigInteger b = curve.getB();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        if (bigIntegerB2.pow(2).mod(p).equals(bigIntegerB.pow(3).add(a.multiply(bigIntegerB)).add(b).mod(p))) {
            return;
        }
        throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + eb + " curve");
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
        mapC.put("y", this.p.a);
        C0893Lf c0893Lf = this.q;
        if (c0893Lf != null) {
            mapC.put(UcumUtils.UCUM_DAYS, c0893Lf.a);
        }
        return mapC;
    }

    public final void d(List list) {
        if (list == null) {
            return;
        }
        boolean zEquals = false;
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) ((X509Certificate) a().get(0)).getPublicKey();
            if (this.o.b().equals(eCPublicKey.getW().getAffineX())) {
                zEquals = this.p.b().equals(eCPublicKey.getW().getAffineY());
            }
        } catch (ClassCastException unused) {
        }
        if (!zEquals) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    @Override // defpackage.AbstractC0879La0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PM) || !super.equals(obj)) {
            return false;
        }
        PM pm = (PM) obj;
        return Objects.equals(this.n, pm.n) && Objects.equals(this.o, pm.o) && Objects.equals(this.p, pm.p) && Objects.equals(this.q, pm.q);
    }

    @Override // defpackage.AbstractC0879La0
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.n, this.o, this.p, this.q, null);
    }

    public PM(EB eb, C0893Lf c0893Lf, C0893Lf c0893Lf2, C0893Lf c0893Lf3, C1361Rf0 c1361Rf0, LinkedHashSet linkedHashSet, L3 l3, String str, URI uri, C0893Lf c0893Lf4, C0893Lf c0893Lf5, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(C1283Qf0.b, c1361Rf0, linkedHashSet, l3, str, uri, c0893Lf4, c0893Lf5, linkedList, date, date2, date3);
        if (eb != null) {
            this.n = eb;
            if (c0893Lf != null) {
                this.o = c0893Lf;
                if (c0893Lf2 != null) {
                    this.p = c0893Lf2;
                    e(eb, c0893Lf, c0893Lf2);
                    d(a());
                    this.q = c0893Lf3;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
