package defpackage;

import java.io.Serializable;
import java.net.URI;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: La0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0879La0 implements Serializable {
    public final C1283Qf0 a;
    public final C1361Rf0 b;
    public final LinkedHashSet c;
    public final L3 d;
    public final String e;
    public final URI f;
    public final C0893Lf g;
    public final C0893Lf h;
    public final LinkedList i;
    public final Date j;
    public final Date k;
    public final Date l;
    public final LinkedList m;

    public AbstractC0879La0(C1283Qf0 c1283Qf0, C1361Rf0 c1361Rf0, LinkedHashSet linkedHashSet, L3 l3, String str, URI uri, C0893Lf c0893Lf, C0893Lf c0893Lf2, LinkedList linkedList, Date date, Date date2, Date date3) throws ParseException {
        X509Certificate x509CertificateB;
        if (c1283Qf0 == null) {
            throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
        }
        this.a = c1283Qf0;
        Map map = AbstractC1439Sf0.a;
        if (c1361Rf0 != null && linkedHashSet != null) {
            Map map2 = AbstractC1439Sf0.a;
            if (map2.containsKey(c1361Rf0) && !((Set) map2.get(c1361Rf0)).containsAll(linkedHashSet)) {
                throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
            }
        }
        this.b = c1361Rf0;
        this.c = linkedHashSet;
        this.d = l3;
        this.e = str;
        this.f = uri;
        this.g = c0893Lf;
        this.h = c0893Lf2;
        if (linkedList != null && linkedList.isEmpty()) {
            throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
        }
        this.i = linkedList;
        LinkedList linkedList2 = null;
        if (linkedList != null) {
            try {
                LinkedList linkedList3 = new LinkedList();
                for (int i = 0; i < linkedList.size(); i++) {
                    if (linkedList.get(i) != null) {
                        try {
                            x509CertificateB = AbstractC6570q12.b(((C0815Kf) linkedList.get(i)).a());
                        } catch (CertificateException unused) {
                            x509CertificateB = null;
                        }
                        if (x509CertificateB == null) {
                            throw new ParseException(AbstractC7209tN0.u(i, "Invalid X.509 certificate at position "), 0);
                        }
                        linkedList3.add(x509CertificateB);
                    }
                }
                linkedList2 = linkedList3;
            } catch (ParseException e) {
                throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e.getMessage(), e);
            }
        }
        this.m = linkedList2;
        this.j = date;
        this.k = date2;
        this.l = date3;
    }

    public final List a() {
        LinkedList linkedList = this.m;
        if (linkedList == null) {
            return null;
        }
        return Collections.unmodifiableList(linkedList);
    }

    public abstract boolean b();

    public HashMap c() {
        C2226aw c2226aw = AbstractC8390za0.a;
        HashMap map = new HashMap();
        map.put("kty", this.a.a);
        C1361Rf0 c1361Rf0 = this.b;
        if (c1361Rf0 != null) {
            map.put("use", c1361Rf0.a);
        }
        LinkedHashSet linkedHashSet = this.c;
        if (linkedHashSet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((EnumC0894Lf0) it.next()).a);
            }
            map.put("key_ops", arrayList);
        }
        L3 l3 = this.d;
        if (l3 != null) {
            map.put("alg", l3.a);
        }
        String str = this.e;
        if (str != null) {
            map.put("kid", str);
        }
        URI uri = this.f;
        if (uri != null) {
            map.put("x5u", uri.toString());
        }
        C0893Lf c0893Lf = this.g;
        if (c0893Lf != null) {
            map.put("x5t", c0893Lf.a);
        }
        C0893Lf c0893Lf2 = this.h;
        if (c0893Lf2 != null) {
            map.put("x5t#S256", c0893Lf2.a);
        }
        LinkedList linkedList = this.i;
        if (linkedList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C0815Kf) it2.next()).a);
            }
            map.put("x5c", arrayList2);
        }
        Date date = this.j;
        if (date != null) {
            map.put("exp", Long.valueOf(date.getTime() / 1000));
        }
        Date date2 = this.k;
        if (date2 != null) {
            map.put("nbf", Long.valueOf(date2.getTime() / 1000));
        }
        Date date3 = this.l;
        if (date3 != null) {
            map.put("iat", Long.valueOf(date3.getTime() / 1000));
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0879La0)) {
            return false;
        }
        AbstractC0879La0 abstractC0879La0 = (AbstractC0879La0) obj;
        return Objects.equals(this.a, abstractC0879La0.a) && Objects.equals(this.b, abstractC0879La0.b) && Objects.equals(this.c, abstractC0879La0.c) && Objects.equals(this.d, abstractC0879La0.d) && Objects.equals(this.e, abstractC0879La0.e) && Objects.equals(this.f, abstractC0879La0.f) && Objects.equals(this.g, abstractC0879La0.g) && Objects.equals(this.h, abstractC0879La0.h) && Objects.equals(this.i, abstractC0879La0.i) && Objects.equals(this.j, abstractC0879La0.j) && Objects.equals(this.k, abstractC0879La0.k) && Objects.equals(this.l, abstractC0879La0.l);
    }

    public int hashCode() {
        Date date = this.l;
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, date, null);
    }

    public final String toString() {
        return AbstractC8390za0.h(c());
    }
}
