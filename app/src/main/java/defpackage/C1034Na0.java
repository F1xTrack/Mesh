package defpackage;

import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ok.tracer.base.ucum.UcumUtils;

/* renamed from: Na0 */
/* loaded from: classes2.dex */
public final class C1034Na0 extends AbstractC1483Su {
    public static final Set p;
    public final boolean o;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        p = Collections.unmodifiableSet(hashSet);
    }

    public C1034Na0(C0956Ma0 c0956Ma0, C7439ua0 c7439ua0, String str, HashSet hashSet, URI uri, AbstractC0879La0 abstractC0879La0, URI uri2, C0893Lf c0893Lf, C0893Lf c0893Lf2, LinkedList linkedList, String str2, boolean z, HashMap map, C0893Lf c0893Lf3) {
        super(c0956Ma0, c7439ua0, str, hashSet, uri, abstractC0879La0, uri2, c0893Lf, c0893Lf2, linkedList, str2, map, c0893Lf3);
        if (c0956Ma0 == null) {
            throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
        }
        if (c0956Ma0.a.equals(L3.b.a)) {
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
        this.o = z;
    }

    public static C1034Na0 a(C0893Lf c0893Lf) throws ParseException {
        L3 c0956Ma0;
        String str;
        Iterator it;
        HashSet hashSet;
        URI uri;
        AbstractC0879La0 c3868fx0;
        ArrayList arrayList;
        List list;
        Iterator it2;
        Map mapG = AbstractC8390za0.g(20000, new String(c0893Lf.a(), AbstractC5435k41.a));
        String str2 = "alg";
        String strD = AbstractC8390za0.d("alg", mapG);
        if (strD == null) {
            throw new ParseException("Missing \"alg\" in header JSON object", 0);
        }
        L3 l3 = L3.b;
        if (strD.equals(l3.a)) {
            c0956Ma0 = l3;
        } else if (mapG.containsKey("enc")) {
            c0956Ma0 = C0801Ka0.c;
            if (!strD.equals(c0956Ma0.a)) {
                c0956Ma0 = C0801Ka0.d;
                if (!strD.equals(c0956Ma0.a)) {
                    c0956Ma0 = C0801Ka0.e;
                    if (!strD.equals(c0956Ma0.a)) {
                        c0956Ma0 = C0801Ka0.f;
                        if (!strD.equals(c0956Ma0.a)) {
                            c0956Ma0 = C0801Ka0.g;
                            if (!strD.equals(c0956Ma0.a)) {
                                c0956Ma0 = C0801Ka0.h;
                                if (!strD.equals(c0956Ma0.a)) {
                                    c0956Ma0 = C0801Ka0.i;
                                    if (!strD.equals(c0956Ma0.a)) {
                                        c0956Ma0 = C0801Ka0.j;
                                        if (!strD.equals(c0956Ma0.a)) {
                                            c0956Ma0 = C0801Ka0.k;
                                            if (!strD.equals(c0956Ma0.a)) {
                                                c0956Ma0 = C0801Ka0.l;
                                                if (!strD.equals(c0956Ma0.a)) {
                                                    c0956Ma0 = C0801Ka0.m;
                                                    if (!strD.equals(c0956Ma0.a)) {
                                                        c0956Ma0 = C0801Ka0.n;
                                                        if (!strD.equals(c0956Ma0.a)) {
                                                            c0956Ma0 = C0801Ka0.o;
                                                            if (!strD.equals(c0956Ma0.a)) {
                                                                c0956Ma0 = C0801Ka0.p;
                                                                if (!strD.equals(c0956Ma0.a)) {
                                                                    c0956Ma0 = C0801Ka0.q;
                                                                    if (!strD.equals(c0956Ma0.a)) {
                                                                        c0956Ma0 = C0801Ka0.r;
                                                                        if (!strD.equals(c0956Ma0.a)) {
                                                                            c0956Ma0 = C0801Ka0.s;
                                                                            if (!strD.equals(c0956Ma0.a)) {
                                                                                c0956Ma0 = C0801Ka0.t;
                                                                                if (!strD.equals(c0956Ma0.a)) {
                                                                                    c0956Ma0 = C0801Ka0.u;
                                                                                    if (!strD.equals(c0956Ma0.a)) {
                                                                                        c0956Ma0 = C0801Ka0.v;
                                                                                        if (!strD.equals(c0956Ma0.a)) {
                                                                                            c0956Ma0 = C0801Ka0.w;
                                                                                            if (!strD.equals(c0956Ma0.a)) {
                                                                                                c0956Ma0 = C0801Ka0.x;
                                                                                                if (!strD.equals(c0956Ma0.a)) {
                                                                                                    c0956Ma0 = C0801Ka0.y;
                                                                                                    if (!strD.equals(c0956Ma0.a)) {
                                                                                                        c0956Ma0 = new C0801Ka0(strD);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            c0956Ma0 = C0956Ma0.c;
            if (!strD.equals(c0956Ma0.a)) {
                c0956Ma0 = C0956Ma0.d;
                if (!strD.equals(c0956Ma0.a)) {
                    c0956Ma0 = C0956Ma0.e;
                    if (!strD.equals(c0956Ma0.a)) {
                        c0956Ma0 = C0956Ma0.f;
                        if (!strD.equals(c0956Ma0.a)) {
                            c0956Ma0 = C0956Ma0.g;
                            if (!strD.equals(c0956Ma0.a)) {
                                c0956Ma0 = C0956Ma0.h;
                                if (!strD.equals(c0956Ma0.a)) {
                                    c0956Ma0 = C0956Ma0.i;
                                    if (!strD.equals(c0956Ma0.a)) {
                                        c0956Ma0 = C0956Ma0.j;
                                        if (!strD.equals(c0956Ma0.a)) {
                                            c0956Ma0 = C0956Ma0.k;
                                            if (!strD.equals(c0956Ma0.a)) {
                                                c0956Ma0 = C0956Ma0.l;
                                                if (!strD.equals(c0956Ma0.a)) {
                                                    c0956Ma0 = C0956Ma0.m;
                                                    if (!strD.equals(c0956Ma0.a)) {
                                                        c0956Ma0 = C0956Ma0.n;
                                                        if (!strD.equals(c0956Ma0.a)) {
                                                            c0956Ma0 = C0956Ma0.o;
                                                            if (!strD.equals(c0956Ma0.a)) {
                                                                c0956Ma0 = C0956Ma0.p;
                                                                if (!strD.equals(c0956Ma0.a)) {
                                                                    c0956Ma0 = new C0956Ma0(strD);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!(c0956Ma0 instanceof C0956Ma0)) {
            throw new ParseException("Not a JWS header", 0);
        }
        C0956Ma0 c0956Ma02 = (C0956Ma0) c0956Ma0;
        if (c0956Ma02.a.equals(l3.a)) {
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
        Iterator it3 = mapG.keySet().iterator();
        boolean zBooleanValue = true;
        C7439ua0 c7439ua0 = null;
        String str3 = null;
        HashSet hashSet2 = null;
        URI uriF = null;
        AbstractC0879La0 abstractC0879La0 = null;
        URI uriF2 = null;
        C0893Lf c0893Lf2 = null;
        C0893Lf c0893Lf3 = null;
        LinkedList linkedListB = null;
        String str4 = null;
        HashMap map = null;
        while (it3.hasNext()) {
            String str5 = (String) it3.next();
            if (str2.equals(str5)) {
                str = str2;
                it = it3;
            } else {
                if ("typ".equals(str5)) {
                    String str6 = (String) AbstractC8390za0.b(mapG, str5, String.class);
                    if (str6 != null) {
                        c7439ua0 = new C7439ua0(str6);
                    }
                } else if ("cty".equals(str5)) {
                    str3 = (String) AbstractC8390za0.b(mapG, str5, String.class);
                } else if ("crit".equals(str5)) {
                    List listE = AbstractC8390za0.e(str5, mapG);
                    if (listE != null) {
                        hashSet2 = new HashSet(listE);
                    }
                } else if ("jku".equals(str5)) {
                    uriF = AbstractC8390za0.f(str5, mapG);
                } else {
                    str = str2;
                    it = it3;
                    C0893Lf c0893Lf4 = c0893Lf3;
                    C0893Lf c0893Lf5 = c0893Lf2;
                    URI uri2 = uriF2;
                    if ("jwk".equals(str5)) {
                        Map map2 = (Map) AbstractC8390za0.b(mapG, str5, Map.class);
                        if (map2 == null) {
                            map2 = null;
                        } else {
                            Iterator it4 = map2.keySet().iterator();
                            while (it4.hasNext()) {
                                Map map3 = map2;
                                if (!(it4.next() instanceof String)) {
                                    throw new ParseException(AbstractC8235ym.k("JSON object member with key ", str5, " not a JSON object"), 0);
                                }
                                map2 = map3;
                            }
                        }
                        if (map2 == null) {
                            hashSet = hashSet2;
                            uri = uriF;
                            abstractC0879La0 = null;
                        } else {
                            String str7 = (String) AbstractC8390za0.b(map2, "kty", String.class);
                            if (str7 == null) {
                                throw new ParseException("Missing key type \"kty\" parameter", 0);
                            }
                            C1283Qf0 c1283Qf0A = C1283Qf0.a(str7);
                            C1283Qf0 c1283Qf0 = C1283Qf0.b;
                            uri = uriF;
                            hashSet = hashSet2;
                            if (c1283Qf0A == c1283Qf0) {
                                Set set = PM.r;
                                if (!c1283Qf0.equals(D22.e(map2))) {
                                    throw new ParseException("The key type \"kty\" must be EC", 0);
                                }
                                try {
                                    EB ebA = EB.a((String) AbstractC8390za0.b(map2, "crv", String.class));
                                    C0893Lf c0893LfA = AbstractC8390za0.a("x", map2);
                                    C0893Lf c0893LfA2 = AbstractC8390za0.a("y", map2);
                                    C0893Lf c0893LfA3 = AbstractC8390za0.a(UcumUtils.UCUM_DAYS, map2);
                                    if (c0893LfA3 == null) {
                                        try {
                                            c3868fx0 = new PM(ebA, c0893LfA, c0893LfA2, D22.f(map2), D22.d(map2), D22.a(map2), (String) AbstractC8390za0.b(map2, "kid", String.class), AbstractC8390za0.f("x5u", map2), AbstractC8390za0.a("x5t", map2), AbstractC8390za0.a("x5t#S256", map2), D22.h(map2), D22.b(map2), D22.g(map2), D22.c(map2));
                                        } catch (IllegalArgumentException e) {
                                            throw new ParseException(e.getMessage(), 0);
                                        }
                                    } else {
                                        c3868fx0 = new PM(ebA, c0893LfA, c0893LfA2, c0893LfA3, D22.f(map2), D22.d(map2), D22.a(map2), (String) AbstractC8390za0.b(map2, "kid", String.class), AbstractC8390za0.f("x5u", map2), AbstractC8390za0.a("x5t", map2), AbstractC8390za0.a("x5t#S256", map2), D22.h(map2), D22.b(map2), D22.g(map2), D22.c(map2));
                                    }
                                } catch (IllegalArgumentException e2) {
                                    throw new ParseException(e2.getMessage(), 0);
                                }
                            } else {
                                C1283Qf0 c1283Qf02 = C1283Qf0.c;
                                if (c1283Qf0A != c1283Qf02) {
                                    C1283Qf0 c1283Qf03 = C1283Qf0.d;
                                    if (c1283Qf0A != c1283Qf03) {
                                        C1283Qf0 c1283Qf04 = C1283Qf0.e;
                                        if (c1283Qf0A != c1283Qf04) {
                                            throw new ParseException("Unsupported key type \"kty\" parameter: " + c1283Qf0A, 0);
                                        }
                                        Set set2 = C3868fx0.s;
                                        if (!c1283Qf04.equals(D22.e(map2))) {
                                            throw new ParseException("The key type kty must be " + c1283Qf04.a, 0);
                                        }
                                        try {
                                            EB ebA2 = EB.a((String) AbstractC8390za0.b(map2, "crv", String.class));
                                            C0893Lf c0893LfA4 = AbstractC8390za0.a("x", map2);
                                            C0893Lf c0893LfA5 = AbstractC8390za0.a(UcumUtils.UCUM_DAYS, map2);
                                            if (c0893LfA5 == null) {
                                                try {
                                                    c3868fx0 = new C3868fx0(ebA2, c0893LfA4, D22.f(map2), D22.d(map2), D22.a(map2), (String) AbstractC8390za0.b(map2, "kid", String.class), AbstractC8390za0.f("x5u", map2), AbstractC8390za0.a("x5t", map2), AbstractC8390za0.a("x5t#S256", map2), D22.h(map2), D22.b(map2), D22.g(map2), D22.c(map2));
                                                } catch (IllegalArgumentException e3) {
                                                    throw new ParseException(e3.getMessage(), 0);
                                                }
                                            } else {
                                                c3868fx0 = new C3868fx0(ebA2, c0893LfA4, c0893LfA5, D22.f(map2), D22.d(map2), D22.a(map2), (String) AbstractC8390za0.b(map2, "kid", String.class), AbstractC8390za0.f("x5u", map2), AbstractC8390za0.a("x5t", map2), AbstractC8390za0.a("x5t#S256", map2), D22.h(map2), D22.b(map2), D22.g(map2), D22.c(map2));
                                            }
                                        } catch (IllegalArgumentException e4) {
                                            throw new ParseException(e4.getMessage(), 0);
                                        }
                                    } else {
                                        if (!c1283Qf03.equals(D22.e(map2))) {
                                            throw new ParseException("The key type kty must be " + c1283Qf03.a, 0);
                                        }
                                        try {
                                            c3868fx0 = new C4059gx0(AbstractC8390za0.a("k", map2), D22.f(map2), D22.d(map2), D22.a(map2), (String) AbstractC8390za0.b(map2, "kid", String.class), AbstractC8390za0.f("x5u", map2), AbstractC8390za0.a("x5t", map2), AbstractC8390za0.a("x5t#S256", map2), D22.h(map2), D22.b(map2), D22.g(map2), D22.c(map2));
                                        } catch (IllegalArgumentException e5) {
                                            throw new ParseException(e5.getMessage(), 0);
                                        }
                                    }
                                } else {
                                    if (!c1283Qf02.equals(D22.e(map2))) {
                                        throw new ParseException("The key type \"kty\" must be RSA", 0);
                                    }
                                    C0893Lf c0893LfA6 = AbstractC8390za0.a("n", map2);
                                    C0893Lf c0893LfA7 = AbstractC8390za0.a("e", map2);
                                    C0893Lf c0893LfA8 = AbstractC8390za0.a(UcumUtils.UCUM_DAYS, map2);
                                    C0893Lf c0893LfA9 = AbstractC8390za0.a("p", map2);
                                    C0893Lf c0893LfA10 = AbstractC8390za0.a("q", map2);
                                    C0893Lf c0893LfA11 = AbstractC8390za0.a("dp", map2);
                                    C0893Lf c0893LfA12 = AbstractC8390za0.a("dq", map2);
                                    C0893Lf c0893LfA13 = AbstractC8390za0.a("qi", map2);
                                    if (!map2.containsKey("oth") || (list = (List) AbstractC8390za0.b(map2, "oth", List.class)) == null) {
                                        arrayList = null;
                                    } else {
                                        ArrayList arrayList2 = new ArrayList(list.size());
                                        Iterator it5 = list.iterator();
                                        while (it5.hasNext()) {
                                            Object next = it5.next();
                                            if (next instanceof Map) {
                                                Map map4 = (Map) next;
                                                it2 = it5;
                                                try {
                                                    arrayList2.add(new XI0(AbstractC8390za0.a("r", map4), AbstractC8390za0.a("dq", map4), AbstractC8390za0.a("t", map4)));
                                                } catch (IllegalArgumentException e6) {
                                                    throw new ParseException(e6.getMessage(), 0);
                                                }
                                            } else {
                                                it2 = it5;
                                            }
                                            it5 = it2;
                                        }
                                        arrayList = arrayList2;
                                    }
                                    try {
                                        c3868fx0 = new YI0(c0893LfA6, c0893LfA7, c0893LfA8, c0893LfA9, c0893LfA10, c0893LfA11, c0893LfA12, c0893LfA13, arrayList, D22.f(map2), D22.d(map2), D22.a(map2), (String) AbstractC8390za0.b(map2, "kid", String.class), AbstractC8390za0.f("x5u", map2), AbstractC8390za0.a("x5t", map2), AbstractC8390za0.a("x5t#S256", map2), D22.h(map2), D22.b(map2), D22.g(map2), D22.c(map2));
                                    } catch (IllegalArgumentException e7) {
                                        throw new ParseException(e7.getMessage(), 0);
                                    }
                                }
                            }
                            if (c3868fx0.b()) {
                                throw new ParseException("Non-public key in jwk header parameter", 0);
                            }
                            abstractC0879La0 = c3868fx0;
                        }
                        if (abstractC0879La0 != null && abstractC0879La0.b()) {
                            throw new IllegalArgumentException("The JWK must be public");
                        }
                    } else {
                        hashSet = hashSet2;
                        uri = uriF;
                        if ("x5u".equals(str5)) {
                            uriF2 = AbstractC8390za0.f(str5, mapG);
                            c0893Lf3 = c0893Lf4;
                            c0893Lf2 = c0893Lf5;
                            uriF = uri;
                            hashSet2 = hashSet;
                        } else if ("x5t".equals(str5)) {
                            String str8 = (String) AbstractC8390za0.b(mapG, str5, String.class);
                            c0893Lf2 = str8 == null ? null : new C0893Lf(str8);
                            c0893Lf3 = c0893Lf4;
                            uriF2 = uri2;
                            uriF = uri;
                            hashSet2 = hashSet;
                        } else if ("x5t#S256".equals(str5)) {
                            String str9 = (String) AbstractC8390za0.b(mapG, str5, String.class);
                            c0893Lf3 = str9 == null ? null : new C0893Lf(str9);
                            c0893Lf2 = c0893Lf5;
                            uriF2 = uri2;
                            uriF = uri;
                            hashSet2 = hashSet;
                        } else if ("x5c".equals(str5)) {
                            linkedListB = AbstractC6379p12.b((List) AbstractC8390za0.b(mapG, str5, List.class));
                        } else if ("kid".equals(str5)) {
                            str4 = (String) AbstractC8390za0.b(mapG, str5, String.class);
                        } else if ("b64".equals(str5)) {
                            Boolean bool = (Boolean) AbstractC8390za0.b(mapG, str5, Boolean.class);
                            if (bool == null) {
                                throw new ParseException(AbstractC8235ym.k("JSON object member with key ", str5, " is missing or null"), 0);
                            }
                            zBooleanValue = bool.booleanValue();
                        } else {
                            Object obj = mapG.get(str5);
                            if (p.contains(str5)) {
                                throw new IllegalArgumentException(AbstractC8235ym.k("The parameter name \"", str5, "\" matches a registered name"));
                            }
                            if (map == null) {
                                map = new HashMap();
                            }
                            HashMap map5 = map;
                            map5.put(str5, obj);
                            map = map5;
                        }
                    }
                    c0893Lf3 = c0893Lf4;
                    c0893Lf2 = c0893Lf5;
                    uriF2 = uri2;
                    uriF = uri;
                    hashSet2 = hashSet;
                }
                str = str2;
                it = it3;
            }
            str2 = str;
            it3 = it;
        }
        return new C1034Na0(c0956Ma02, c7439ua0, str3, hashSet2, uriF, abstractC0879La0, uriF2, c0893Lf2, c0893Lf3, linkedListB, str4, zBooleanValue, map, c0893Lf);
    }
}
