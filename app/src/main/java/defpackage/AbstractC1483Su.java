package defpackage;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: Su, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1483Su implements Serializable {
    public static final Map n = Collections.unmodifiableMap(new HashMap());
    public final C0956Ma0 a;
    public final C7439ua0 b;
    public final String c;
    public final Set d;
    public final Map e;
    public final C0893Lf f;
    public final URI g;
    public final AbstractC0879La0 h;
    public final URI i;
    public final C0893Lf j;
    public final C0893Lf k;
    public final List l;
    public final String m;

    public AbstractC1483Su(C0956Ma0 c0956Ma0, C7439ua0 c7439ua0, String str, HashSet hashSet, URI uri, AbstractC0879La0 abstractC0879La0, URI uri2, C0893Lf c0893Lf, C0893Lf c0893Lf2, LinkedList linkedList, String str2, HashMap map, C0893Lf c0893Lf3) {
        this.a = c0956Ma0;
        this.b = c7439ua0;
        this.c = str;
        if (hashSet != null) {
            this.d = Collections.unmodifiableSet(new HashSet(hashSet));
        } else {
            this.d = null;
        }
        if (map != null) {
            this.e = AbstractC8235ym.s(map);
        } else {
            this.e = n;
        }
        this.f = c0893Lf3;
        this.g = uri;
        this.h = abstractC0879La0;
        this.i = uri2;
        this.j = c0893Lf;
        this.k = c0893Lf2;
        if (linkedList != null) {
            this.l = Collections.unmodifiableList(new ArrayList(linkedList));
        } else {
            this.l = null;
        }
        this.m = str2;
    }

    public final String toString() {
        C1034Na0 c1034Na0 = (C1034Na0) this;
        C2226aw c2226aw = AbstractC8390za0.a;
        HashMap map = new HashMap();
        map.putAll(c1034Na0.e);
        C0956Ma0 c0956Ma0 = c1034Na0.a;
        if (c0956Ma0 != null) {
            map.put("alg", c0956Ma0.a);
        }
        C7439ua0 c7439ua0 = c1034Na0.b;
        if (c7439ua0 != null) {
            map.put("typ", c7439ua0.a);
        }
        String str = c1034Na0.c;
        if (str != null) {
            map.put("cty", str);
        }
        Set set = c1034Na0.d;
        if (set != null && !set.isEmpty()) {
            map.put("crit", new ArrayList(set));
        }
        URI uri = c1034Na0.g;
        if (uri != null) {
            map.put("jku", uri.toString());
        }
        AbstractC0879La0 abstractC0879La0 = c1034Na0.h;
        if (abstractC0879La0 != null) {
            map.put("jwk", abstractC0879La0.c());
        }
        URI uri2 = c1034Na0.i;
        if (uri2 != null) {
            map.put("x5u", uri2.toString());
        }
        C0893Lf c0893Lf = c1034Na0.j;
        if (c0893Lf != null) {
            map.put("x5t", c0893Lf.a);
        }
        C0893Lf c0893Lf2 = c1034Na0.k;
        if (c0893Lf2 != null) {
            map.put("x5t#S256", c0893Lf2.a);
        }
        List list = c1034Na0.l;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0815Kf) it.next()).a);
            }
            map.put("x5c", arrayList);
        }
        String str2 = c1034Na0.m;
        if (str2 != null) {
            map.put("kid", str2);
        }
        if (!c1034Na0.o) {
            map.put("b64", Boolean.FALSE);
        }
        return AbstractC8390za0.h(map);
    }
}
