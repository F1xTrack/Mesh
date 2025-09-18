package p000;

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
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: Na0 */
/* loaded from: classes2.dex */
public final class C7990Na0 extends AbstractC1189Su {

    /* renamed from: p */
    public static final Set f7892p;

    /* renamed from: o */
    public final boolean f7893o;

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
        f7892p = Collections.unmodifiableSet(hashSet);
    }

    public C7990Na0(C7938Ma0 c7938Ma0, C11307ua0 c11307ua0, String str, HashSet hashSet, URI uri, AbstractC7886La0 abstractC7886La0, URI uri2, C0734Lf c0734Lf, C0734Lf c0734Lf2, LinkedList linkedList, String str2, boolean z, HashMap map, C0734Lf c0734Lf3) {
        super(c7938Ma0, c11307ua0, str, hashSet, uri, abstractC7886La0, uri2, c0734Lf, c0734Lf2, linkedList, str2, map, c0734Lf3);
        if (c7938Ma0 == null) {
            throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
        }
        if (c7938Ma0.f6475a.equals(C0697L3.f6474b.f6475a)) {
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
        this.f7893o = z;
    }

    /* renamed from: a */
    public static C7990Na0 m5783a(C0734Lf c0734Lf) throws ParseException {
        C0697L3 c7938Ma0;
        String str;
        Iterator it;
        HashSet hashSet;
        URI uri;
        AbstractC7886La0 c9433fx0;
        ArrayList arrayList;
        List list;
        Iterator it2;
        Map mapM26473g = AbstractC11943za0.m26473g(20000, new String(c0734Lf.m4698a(), AbstractC9964k41.f36286a));
        String str2 = "alg";
        String strM26470d = AbstractC11943za0.m26470d("alg", mapM26473g);
        if (strM26470d == null) {
            throw new ParseException("Missing \"alg\" in header JSON object", 0);
        }
        C0697L3 c0697l3 = C0697L3.f6474b;
        if (strM26470d.equals(c0697l3.f6475a)) {
            c7938Ma0 = c0697l3;
        } else if (mapM26473g.containsKey("enc")) {
            c7938Ma0 = C7834Ka0.f6196c;
            if (!strM26470d.equals(c7938Ma0.f6475a)) {
                c7938Ma0 = C7834Ka0.f6197d;
                if (!strM26470d.equals(c7938Ma0.f6475a)) {
                    c7938Ma0 = C7834Ka0.f6198e;
                    if (!strM26470d.equals(c7938Ma0.f6475a)) {
                        c7938Ma0 = C7834Ka0.f6199f;
                        if (!strM26470d.equals(c7938Ma0.f6475a)) {
                            c7938Ma0 = C7834Ka0.f6200g;
                            if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                c7938Ma0 = C7834Ka0.f6201h;
                                if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                    c7938Ma0 = C7834Ka0.f6202i;
                                    if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                        c7938Ma0 = C7834Ka0.f6203j;
                                        if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                            c7938Ma0 = C7834Ka0.f6204k;
                                            if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                c7938Ma0 = C7834Ka0.f6205l;
                                                if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                    c7938Ma0 = C7834Ka0.f6206m;
                                                    if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                        c7938Ma0 = C7834Ka0.f6207n;
                                                        if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                            c7938Ma0 = C7834Ka0.f6208o;
                                                            if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                c7938Ma0 = C7834Ka0.f6209p;
                                                                if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                    c7938Ma0 = C7834Ka0.f6210q;
                                                                    if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                        c7938Ma0 = C7834Ka0.f6211r;
                                                                        if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                            c7938Ma0 = C7834Ka0.f6212s;
                                                                            if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                                c7938Ma0 = C7834Ka0.f6213t;
                                                                                if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                                    c7938Ma0 = C7834Ka0.f6214u;
                                                                                    if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                                        c7938Ma0 = C7834Ka0.f6215v;
                                                                                        if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                                            c7938Ma0 = C7834Ka0.f6216w;
                                                                                            if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                                                c7938Ma0 = C7834Ka0.f6217x;
                                                                                                if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                                                    c7938Ma0 = C7834Ka0.f6218y;
                                                                                                    if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                                                        c7938Ma0 = new C7834Ka0(strM26470d);
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
            c7938Ma0 = C7938Ma0.f7230c;
            if (!strM26470d.equals(c7938Ma0.f6475a)) {
                c7938Ma0 = C7938Ma0.f7231d;
                if (!strM26470d.equals(c7938Ma0.f6475a)) {
                    c7938Ma0 = C7938Ma0.f7232e;
                    if (!strM26470d.equals(c7938Ma0.f6475a)) {
                        c7938Ma0 = C7938Ma0.f7233f;
                        if (!strM26470d.equals(c7938Ma0.f6475a)) {
                            c7938Ma0 = C7938Ma0.f7234g;
                            if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                c7938Ma0 = C7938Ma0.f7235h;
                                if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                    c7938Ma0 = C7938Ma0.f7236i;
                                    if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                        c7938Ma0 = C7938Ma0.f7237j;
                                        if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                            c7938Ma0 = C7938Ma0.f7238k;
                                            if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                c7938Ma0 = C7938Ma0.f7239l;
                                                if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                    c7938Ma0 = C7938Ma0.f7240m;
                                                    if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                        c7938Ma0 = C7938Ma0.f7241n;
                                                        if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                            c7938Ma0 = C7938Ma0.f7242o;
                                                            if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                c7938Ma0 = C7938Ma0.f7243p;
                                                                if (!strM26470d.equals(c7938Ma0.f6475a)) {
                                                                    c7938Ma0 = new C7938Ma0(strM26470d);
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
        if (!(c7938Ma0 instanceof C7938Ma0)) {
            throw new ParseException("Not a JWS header", 0);
        }
        C7938Ma0 c7938Ma02 = (C7938Ma0) c7938Ma0;
        if (c7938Ma02.f6475a.equals(c0697l3.f6475a)) {
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
        Iterator it3 = mapM26473g.keySet().iterator();
        boolean zBooleanValue = true;
        C11307ua0 c11307ua0 = null;
        String str3 = null;
        HashSet hashSet2 = null;
        URI uriM26472f = null;
        AbstractC7886La0 abstractC7886La0 = null;
        URI uriM26472f2 = null;
        C0734Lf c0734Lf2 = null;
        C0734Lf c0734Lf3 = null;
        LinkedList linkedListM23593b = null;
        String str4 = null;
        HashMap map = null;
        while (it3.hasNext()) {
            String str5 = (String) it3.next();
            if (str2.equals(str5)) {
                str = str2;
                it = it3;
            } else {
                if ("typ".equals(str5)) {
                    String str6 = (String) AbstractC11943za0.m26468b(mapM26473g, str5, String.class);
                    if (str6 != null) {
                        c11307ua0 = new C11307ua0(str6);
                    }
                } else if ("cty".equals(str5)) {
                    str3 = (String) AbstractC11943za0.m26468b(mapM26473g, str5, String.class);
                } else if ("crit".equals(str5)) {
                    List listM26471e = AbstractC11943za0.m26471e(str5, mapM26473g);
                    if (listM26471e != null) {
                        hashSet2 = new HashSet(listM26471e);
                    }
                } else if ("jku".equals(str5)) {
                    uriM26472f = AbstractC11943za0.m26472f(str5, mapM26473g);
                } else {
                    str = str2;
                    it = it3;
                    C0734Lf c0734Lf4 = c0734Lf3;
                    C0734Lf c0734Lf5 = c0734Lf2;
                    URI uri2 = uriM26472f2;
                    if ("jwk".equals(str5)) {
                        Map map2 = (Map) AbstractC11943za0.m26468b(mapM26473g, str5, Map.class);
                        if (map2 == null) {
                            map2 = null;
                        } else {
                            Iterator it4 = map2.keySet().iterator();
                            while (it4.hasNext()) {
                                Map map3 = map2;
                                if (!(it4.next() instanceof String)) {
                                    throw new ParseException(AbstractC7222ym.m26234k("JSON object member with key ", str5, " not a JSON object"), 0);
                                }
                                map2 = map3;
                            }
                        }
                        if (map2 == null) {
                            hashSet = hashSet2;
                            uri = uriM26472f;
                            abstractC7886La0 = null;
                        } else {
                            String str7 = (String) AbstractC11943za0.m26468b(map2, "kty", String.class);
                            if (str7 == null) {
                                throw new ParseException("Missing key type \"kty\" parameter", 0);
                            }
                            C8156Qf0 c8156Qf0M6741a = C8156Qf0.m6741a(str7);
                            C8156Qf0 c8156Qf0 = C8156Qf0.f9709b;
                            uri = uriM26472f;
                            hashSet = hashSet2;
                            if (c8156Qf0M6741a == c8156Qf0) {
                                Set set = C0967PM.f9001r;
                                if (!c8156Qf0.equals(D22.m1503e(map2))) {
                                    throw new ParseException("The key type \"kty\" must be EC", 0);
                                }
                                try {
                                    C0264EB c0264ebM2064a = C0264EB.m2064a((String) AbstractC11943za0.m26468b(map2, "crv", String.class));
                                    C0734Lf c0734LfM26467a = AbstractC11943za0.m26467a("x", map2);
                                    C0734Lf c0734LfM26467a2 = AbstractC11943za0.m26467a("y", map2);
                                    C0734Lf c0734LfM26467a3 = AbstractC11943za0.m26467a(UcumUtils.UCUM_DAYS, map2);
                                    if (c0734LfM26467a3 == null) {
                                        try {
                                            c9433fx0 = new C0967PM(c0264ebM2064a, c0734LfM26467a, c0734LfM26467a2, D22.m1504f(map2), D22.m1502d(map2), D22.m1499a(map2), (String) AbstractC11943za0.m26468b(map2, "kid", String.class), AbstractC11943za0.m26472f("x5u", map2), AbstractC11943za0.m26467a("x5t", map2), AbstractC11943za0.m26467a("x5t#S256", map2), D22.m1506h(map2), D22.m1500b(map2), D22.m1505g(map2), D22.m1501c(map2));
                                        } catch (IllegalArgumentException e) {
                                            throw new ParseException(e.getMessage(), 0);
                                        }
                                    } else {
                                        c9433fx0 = new C0967PM(c0264ebM2064a, c0734LfM26467a, c0734LfM26467a2, c0734LfM26467a3, D22.m1504f(map2), D22.m1502d(map2), D22.m1499a(map2), (String) AbstractC11943za0.m26468b(map2, "kid", String.class), AbstractC11943za0.m26472f("x5u", map2), AbstractC11943za0.m26467a("x5t", map2), AbstractC11943za0.m26467a("x5t#S256", map2), D22.m1506h(map2), D22.m1500b(map2), D22.m1505g(map2), D22.m1501c(map2));
                                    }
                                } catch (IllegalArgumentException e2) {
                                    throw new ParseException(e2.getMessage(), 0);
                                }
                            } else {
                                C8156Qf0 c8156Qf02 = C8156Qf0.f9710c;
                                if (c8156Qf0M6741a != c8156Qf02) {
                                    C8156Qf0 c8156Qf03 = C8156Qf0.f9711d;
                                    if (c8156Qf0M6741a != c8156Qf03) {
                                        C8156Qf0 c8156Qf04 = C8156Qf0.f9712e;
                                        if (c8156Qf0M6741a != c8156Qf04) {
                                            throw new ParseException("Unsupported key type \"kty\" parameter: " + c8156Qf0M6741a, 0);
                                        }
                                        Set set2 = C9433fx0.f27507s;
                                        if (!c8156Qf04.equals(D22.m1503e(map2))) {
                                            throw new ParseException("The key type kty must be " + c8156Qf04.f9713a, 0);
                                        }
                                        try {
                                            C0264EB c0264ebM2064a2 = C0264EB.m2064a((String) AbstractC11943za0.m26468b(map2, "crv", String.class));
                                            C0734Lf c0734LfM26467a4 = AbstractC11943za0.m26467a("x", map2);
                                            C0734Lf c0734LfM26467a5 = AbstractC11943za0.m26467a(UcumUtils.UCUM_DAYS, map2);
                                            if (c0734LfM26467a5 == null) {
                                                try {
                                                    c9433fx0 = new C9433fx0(c0264ebM2064a2, c0734LfM26467a4, D22.m1504f(map2), D22.m1502d(map2), D22.m1499a(map2), (String) AbstractC11943za0.m26468b(map2, "kid", String.class), AbstractC11943za0.m26472f("x5u", map2), AbstractC11943za0.m26467a("x5t", map2), AbstractC11943za0.m26467a("x5t#S256", map2), D22.m1506h(map2), D22.m1500b(map2), D22.m1505g(map2), D22.m1501c(map2));
                                                } catch (IllegalArgumentException e3) {
                                                    throw new ParseException(e3.getMessage(), 0);
                                                }
                                            } else {
                                                c9433fx0 = new C9433fx0(c0264ebM2064a2, c0734LfM26467a4, c0734LfM26467a5, D22.m1504f(map2), D22.m1502d(map2), D22.m1499a(map2), (String) AbstractC11943za0.m26468b(map2, "kid", String.class), AbstractC11943za0.m26472f("x5u", map2), AbstractC11943za0.m26467a("x5t", map2), AbstractC11943za0.m26467a("x5t#S256", map2), D22.m1506h(map2), D22.m1500b(map2), D22.m1505g(map2), D22.m1501c(map2));
                                            }
                                        } catch (IllegalArgumentException e4) {
                                            throw new ParseException(e4.getMessage(), 0);
                                        }
                                    } else {
                                        if (!c8156Qf03.equals(D22.m1503e(map2))) {
                                            throw new ParseException("The key type kty must be " + c8156Qf03.f9713a, 0);
                                        }
                                        try {
                                            c9433fx0 = new C9561gx0(AbstractC11943za0.m26467a("k", map2), D22.m1504f(map2), D22.m1502d(map2), D22.m1499a(map2), (String) AbstractC11943za0.m26468b(map2, "kid", String.class), AbstractC11943za0.m26472f("x5u", map2), AbstractC11943za0.m26467a("x5t", map2), AbstractC11943za0.m26467a("x5t#S256", map2), D22.m1506h(map2), D22.m1500b(map2), D22.m1505g(map2), D22.m1501c(map2));
                                        } catch (IllegalArgumentException e5) {
                                            throw new ParseException(e5.getMessage(), 0);
                                        }
                                    }
                                } else {
                                    if (!c8156Qf02.equals(D22.m1503e(map2))) {
                                        throw new ParseException("The key type \"kty\" must be RSA", 0);
                                    }
                                    C0734Lf c0734LfM26467a6 = AbstractC11943za0.m26467a("n", map2);
                                    C0734Lf c0734LfM26467a7 = AbstractC11943za0.m26467a("e", map2);
                                    C0734Lf c0734LfM26467a8 = AbstractC11943za0.m26467a(UcumUtils.UCUM_DAYS, map2);
                                    C0734Lf c0734LfM26467a9 = AbstractC11943za0.m26467a("p", map2);
                                    C0734Lf c0734LfM26467a10 = AbstractC11943za0.m26467a("q", map2);
                                    C0734Lf c0734LfM26467a11 = AbstractC11943za0.m26467a("dp", map2);
                                    C0734Lf c0734LfM26467a12 = AbstractC11943za0.m26467a("dq", map2);
                                    C0734Lf c0734LfM26467a13 = AbstractC11943za0.m26467a("qi", map2);
                                    if (!map2.containsKey("oth") || (list = (List) AbstractC11943za0.m26468b(map2, "oth", List.class)) == null) {
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
                                                    arrayList2.add(new XI0(AbstractC11943za0.m26467a("r", map4), AbstractC11943za0.m26467a("dq", map4), AbstractC11943za0.m26467a("t", map4)));
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
                                        c9433fx0 = new YI0(c0734LfM26467a6, c0734LfM26467a7, c0734LfM26467a8, c0734LfM26467a9, c0734LfM26467a10, c0734LfM26467a11, c0734LfM26467a12, c0734LfM26467a13, arrayList, D22.m1504f(map2), D22.m1502d(map2), D22.m1499a(map2), (String) AbstractC11943za0.m26468b(map2, "kid", String.class), AbstractC11943za0.m26472f("x5u", map2), AbstractC11943za0.m26467a("x5t", map2), AbstractC11943za0.m26467a("x5t#S256", map2), D22.m1506h(map2), D22.m1500b(map2), D22.m1505g(map2), D22.m1501c(map2));
                                    } catch (IllegalArgumentException e7) {
                                        throw new ParseException(e7.getMessage(), 0);
                                    }
                                }
                            }
                            if (c9433fx0.mo5029b()) {
                                throw new ParseException("Non-public key in jwk header parameter", 0);
                            }
                            abstractC7886La0 = c9433fx0;
                        }
                        if (abstractC7886La0 != null && abstractC7886La0.mo5029b()) {
                            throw new IllegalArgumentException("The JWK must be public");
                        }
                    } else {
                        hashSet = hashSet2;
                        uri = uriM26472f;
                        if ("x5u".equals(str5)) {
                            uriM26472f2 = AbstractC11943za0.m26472f(str5, mapM26473g);
                            c0734Lf3 = c0734Lf4;
                            c0734Lf2 = c0734Lf5;
                            uriM26472f = uri;
                            hashSet2 = hashSet;
                        } else if ("x5t".equals(str5)) {
                            String str8 = (String) AbstractC11943za0.m26468b(mapM26473g, str5, String.class);
                            c0734Lf2 = str8 == null ? null : new C0734Lf(str8);
                            c0734Lf3 = c0734Lf4;
                            uriM26472f2 = uri2;
                            uriM26472f = uri;
                            hashSet2 = hashSet;
                        } else if ("x5t#S256".equals(str5)) {
                            String str9 = (String) AbstractC11943za0.m26468b(mapM26473g, str5, String.class);
                            c0734Lf3 = str9 == null ? null : new C0734Lf(str9);
                            c0734Lf2 = c0734Lf5;
                            uriM26472f2 = uri2;
                            uriM26472f = uri;
                            hashSet2 = hashSet;
                        } else if ("x5c".equals(str5)) {
                            linkedListM23593b = AbstractC10596p12.m23593b((List) AbstractC11943za0.m26468b(mapM26473g, str5, List.class));
                        } else if ("kid".equals(str5)) {
                            str4 = (String) AbstractC11943za0.m26468b(mapM26473g, str5, String.class);
                        } else if ("b64".equals(str5)) {
                            Boolean bool = (Boolean) AbstractC11943za0.m26468b(mapM26473g, str5, Boolean.class);
                            if (bool == null) {
                                throw new ParseException(AbstractC7222ym.m26234k("JSON object member with key ", str5, " is missing or null"), 0);
                            }
                            zBooleanValue = bool.booleanValue();
                        } else {
                            Object obj = mapM26473g.get(str5);
                            if (f7892p.contains(str5)) {
                                throw new IllegalArgumentException(AbstractC7222ym.m26234k("The parameter name \"", str5, "\" matches a registered name"));
                            }
                            if (map == null) {
                                map = new HashMap();
                            }
                            HashMap map5 = map;
                            map5.put(str5, obj);
                            map = map5;
                        }
                    }
                    c0734Lf3 = c0734Lf4;
                    c0734Lf2 = c0734Lf5;
                    uriM26472f2 = uri2;
                    uriM26472f = uri;
                    hashSet2 = hashSet;
                }
                str = str2;
                it = it3;
            }
            str2 = str;
            it3 = it;
        }
        return new C7990Na0(c7938Ma02, c11307ua0, str3, hashSet2, uriM26472f, abstractC7886La0, uriM26472f2, c0734Lf2, c0734Lf3, linkedListM23593b, str4, zBooleanValue, map, c0734Lf);
    }
}
