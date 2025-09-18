package p000;

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
public abstract class AbstractC7886La0 implements Serializable {

    /* renamed from: a */
    public final C8156Qf0 f6728a;

    /* renamed from: b */
    public final C8208Rf0 f6729b;

    /* renamed from: c */
    public final LinkedHashSet f6730c;

    /* renamed from: d */
    public final C0697L3 f6731d;

    /* renamed from: e */
    public final String f6732e;

    /* renamed from: f */
    public final URI f6733f;

    /* renamed from: g */
    public final C0734Lf f6734g;

    /* renamed from: h */
    public final C0734Lf f6735h;

    /* renamed from: i */
    public final LinkedList f6736i;

    /* renamed from: j */
    public final Date f6737j;

    /* renamed from: k */
    public final Date f6738k;

    /* renamed from: l */
    public final Date f6739l;

    /* renamed from: m */
    public final LinkedList f6740m;

    public AbstractC7886La0(C8156Qf0 c8156Qf0, C8208Rf0 c8208Rf0, LinkedHashSet linkedHashSet, C0697L3 c0697l3, String str, URI uri, C0734Lf c0734Lf, C0734Lf c0734Lf2, LinkedList linkedList, Date date, Date date2, Date date3) throws ParseException {
        X509Certificate x509CertificateM23925b;
        if (c8156Qf0 == null) {
            throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
        }
        this.f6728a = c8156Qf0;
        Map map = AbstractC8260Sf0.f10891a;
        if (c8208Rf0 != null && linkedHashSet != null) {
            Map map2 = AbstractC8260Sf0.f10891a;
            if (map2.containsKey(c8208Rf0) && !((Set) map2.get(c8208Rf0)).containsAll(linkedHashSet)) {
                throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
            }
        }
        this.f6729b = c8208Rf0;
        this.f6730c = linkedHashSet;
        this.f6731d = c0697l3;
        this.f6732e = str;
        this.f6733f = uri;
        this.f6734g = c0734Lf;
        this.f6735h = c0734Lf2;
        if (linkedList != null && linkedList.isEmpty()) {
            throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
        }
        this.f6736i = linkedList;
        LinkedList linkedList2 = null;
        if (linkedList != null) {
            try {
                LinkedList linkedList3 = new LinkedList();
                for (int i = 0; i < linkedList.size(); i++) {
                    if (linkedList.get(i) != null) {
                        try {
                            x509CertificateM23925b = AbstractC10724q12.m23925b(((C0672Kf) linkedList.get(i)).m4698a());
                        } catch (CertificateException unused) {
                            x509CertificateM23925b = null;
                        }
                        if (x509CertificateM23925b == null) {
                            throw new ParseException(AbstractC11153tN0.m24909u(i, "Invalid X.509 certificate at position "), 0);
                        }
                        linkedList3.add(x509CertificateM23925b);
                    }
                }
                linkedList2 = linkedList3;
            } catch (ParseException e) {
                throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e.getMessage(), e);
            }
        }
        this.f6740m = linkedList2;
        this.f6737j = date;
        this.f6738k = date2;
        this.f6739l = date3;
    }

    /* renamed from: a */
    public final List m5028a() {
        LinkedList linkedList = this.f6740m;
        if (linkedList == null) {
            return null;
        }
        return Collections.unmodifiableList(linkedList);
    }

    /* renamed from: b */
    public abstract boolean mo5029b();

    /* renamed from: c */
    public HashMap mo5030c() {
        C1753aw c1753aw = AbstractC11943za0.f46877a;
        HashMap map = new HashMap();
        map.put("kty", this.f6728a.f9713a);
        C8208Rf0 c8208Rf0 = this.f6729b;
        if (c8208Rf0 != null) {
            map.put("use", c8208Rf0.f10371a);
        }
        LinkedHashSet linkedHashSet = this.f6730c;
        if (linkedHashSet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((EnumC7896Lf0) it.next()).f6790a);
            }
            map.put("key_ops", arrayList);
        }
        C0697L3 c0697l3 = this.f6731d;
        if (c0697l3 != null) {
            map.put("alg", c0697l3.f6475a);
        }
        String str = this.f6732e;
        if (str != null) {
            map.put("kid", str);
        }
        URI uri = this.f6733f;
        if (uri != null) {
            map.put("x5u", uri.toString());
        }
        C0734Lf c0734Lf = this.f6734g;
        if (c0734Lf != null) {
            map.put("x5t", c0734Lf.f6248a);
        }
        C0734Lf c0734Lf2 = this.f6735h;
        if (c0734Lf2 != null) {
            map.put("x5t#S256", c0734Lf2.f6248a);
        }
        LinkedList linkedList = this.f6736i;
        if (linkedList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C0672Kf) it2.next()).f6248a);
            }
            map.put("x5c", arrayList2);
        }
        Date date = this.f6737j;
        if (date != null) {
            map.put("exp", Long.valueOf(date.getTime() / 1000));
        }
        Date date2 = this.f6738k;
        if (date2 != null) {
            map.put("nbf", Long.valueOf(date2.getTime() / 1000));
        }
        Date date3 = this.f6739l;
        if (date3 != null) {
            map.put("iat", Long.valueOf(date3.getTime() / 1000));
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7886La0)) {
            return false;
        }
        AbstractC7886La0 abstractC7886La0 = (AbstractC7886La0) obj;
        return Objects.equals(this.f6728a, abstractC7886La0.f6728a) && Objects.equals(this.f6729b, abstractC7886La0.f6729b) && Objects.equals(this.f6730c, abstractC7886La0.f6730c) && Objects.equals(this.f6731d, abstractC7886La0.f6731d) && Objects.equals(this.f6732e, abstractC7886La0.f6732e) && Objects.equals(this.f6733f, abstractC7886La0.f6733f) && Objects.equals(this.f6734g, abstractC7886La0.f6734g) && Objects.equals(this.f6735h, abstractC7886La0.f6735h) && Objects.equals(this.f6736i, abstractC7886La0.f6736i) && Objects.equals(this.f6737j, abstractC7886La0.f6737j) && Objects.equals(this.f6738k, abstractC7886La0.f6738k) && Objects.equals(this.f6739l, abstractC7886La0.f6739l);
    }

    public int hashCode() {
        Date date = this.f6739l;
        return Objects.hash(this.f6728a, this.f6729b, this.f6730c, this.f6731d, this.f6732e, this.f6733f, this.f6734g, this.f6735h, this.f6736i, this.f6737j, this.f6738k, date, null);
    }

    public final String toString() {
        return AbstractC11943za0.m26474h(mo5030c());
    }
}
