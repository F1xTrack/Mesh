package p000;

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

/* renamed from: Su */
/* loaded from: classes2.dex */
public abstract class AbstractC1189Su implements Serializable {

    /* renamed from: n */
    public static final Map f11049n = Collections.unmodifiableMap(new HashMap());

    /* renamed from: a */
    public final C7938Ma0 f11050a;

    /* renamed from: b */
    public final C11307ua0 f11051b;

    /* renamed from: c */
    public final String f11052c;

    /* renamed from: d */
    public final Set f11053d;

    /* renamed from: e */
    public final Map f11054e;

    /* renamed from: f */
    public final C0734Lf f11055f;

    /* renamed from: g */
    public final URI f11056g;

    /* renamed from: h */
    public final AbstractC7886La0 f11057h;

    /* renamed from: i */
    public final URI f11058i;

    /* renamed from: j */
    public final C0734Lf f11059j;

    /* renamed from: k */
    public final C0734Lf f11060k;

    /* renamed from: l */
    public final List f11061l;

    /* renamed from: m */
    public final String f11062m;

    public AbstractC1189Su(C7938Ma0 c7938Ma0, C11307ua0 c11307ua0, String str, HashSet hashSet, URI uri, AbstractC7886La0 abstractC7886La0, URI uri2, C0734Lf c0734Lf, C0734Lf c0734Lf2, LinkedList linkedList, String str2, HashMap map, C0734Lf c0734Lf3) {
        this.f11050a = c7938Ma0;
        this.f11051b = c11307ua0;
        this.f11052c = str;
        if (hashSet != null) {
            this.f11053d = Collections.unmodifiableSet(new HashSet(hashSet));
        } else {
            this.f11053d = null;
        }
        if (map != null) {
            this.f11054e = AbstractC7222ym.m26242s(map);
        } else {
            this.f11054e = f11049n;
        }
        this.f11055f = c0734Lf3;
        this.f11056g = uri;
        this.f11057h = abstractC7886La0;
        this.f11058i = uri2;
        this.f11059j = c0734Lf;
        this.f11060k = c0734Lf2;
        if (linkedList != null) {
            this.f11061l = Collections.unmodifiableList(new ArrayList(linkedList));
        } else {
            this.f11061l = null;
        }
        this.f11062m = str2;
    }

    public final String toString() {
        C7990Na0 c7990Na0 = (C7990Na0) this;
        C1753aw c1753aw = AbstractC11943za0.f46877a;
        HashMap map = new HashMap();
        map.putAll(c7990Na0.f11054e);
        C7938Ma0 c7938Ma0 = c7990Na0.f11050a;
        if (c7938Ma0 != null) {
            map.put("alg", c7938Ma0.f6475a);
        }
        C11307ua0 c11307ua0 = c7990Na0.f11051b;
        if (c11307ua0 != null) {
            map.put("typ", c11307ua0.f43754a);
        }
        String str = c7990Na0.f11052c;
        if (str != null) {
            map.put("cty", str);
        }
        Set set = c7990Na0.f11053d;
        if (set != null && !set.isEmpty()) {
            map.put("crit", new ArrayList(set));
        }
        URI uri = c7990Na0.f11056g;
        if (uri != null) {
            map.put("jku", uri.toString());
        }
        AbstractC7886La0 abstractC7886La0 = c7990Na0.f11057h;
        if (abstractC7886La0 != null) {
            map.put("jwk", abstractC7886La0.mo5030c());
        }
        URI uri2 = c7990Na0.f11058i;
        if (uri2 != null) {
            map.put("x5u", uri2.toString());
        }
        C0734Lf c0734Lf = c7990Na0.f11059j;
        if (c0734Lf != null) {
            map.put("x5t", c0734Lf.f6248a);
        }
        C0734Lf c0734Lf2 = c7990Na0.f11060k;
        if (c0734Lf2 != null) {
            map.put("x5t#S256", c0734Lf2.f6248a);
        }
        List list = c7990Na0.f11061l;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0672Kf) it.next()).f6248a);
            }
            map.put("x5c", arrayList);
        }
        String str2 = c7990Na0.f11062m;
        if (str2 != null) {
            map.put("kid", str2);
        }
        if (!c7990Na0.f7893o) {
            map.put("b64", Boolean.FALSE);
        }
        return AbstractC11943za0.m26474h(map);
    }
}
