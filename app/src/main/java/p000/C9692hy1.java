package p000;

import java.util.HashMap;

/* renamed from: hy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9692hy1 {

    /* renamed from: d */
    public static final V70 f28700d = V70.m8307t(3, "_syn", "_err", "_el");

    /* renamed from: a */
    public String f28701a;

    /* renamed from: b */
    public final long f28702b;

    /* renamed from: c */
    public final HashMap f28703c;

    public C9692hy1(String str, long j, HashMap map) {
        this.f28701a = str;
        this.f28702b = j;
        HashMap map2 = new HashMap();
        this.f28703c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* renamed from: a */
    public static Object m18930a(Object obj, Object obj2, String str) {
        return (f28700d.contains(str) && (obj2 instanceof Double)) ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : str.startsWith("_") ? ((obj instanceof String) || obj == null) ? obj2 : obj : obj instanceof Double ? obj2 : obj instanceof Long ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : obj instanceof String ? obj2.toString() : obj2;
    }

    public final /* synthetic */ Object clone() {
        return new C9692hy1(this.f28701a, this.f28702b, new HashMap(this.f28703c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9692hy1)) {
            return false;
        }
        C9692hy1 c9692hy1 = (C9692hy1) obj;
        if (this.f28702b == c9692hy1.f28702b && this.f28701a.equals(c9692hy1.f28701a)) {
            return this.f28703c.equals(c9692hy1.f28703c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f28701a.hashCode() * 31;
        long j = this.f28702b;
        return this.f28703c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f28701a;
        String strValueOf = String.valueOf(this.f28703c);
        StringBuilder sbM26240q = AbstractC7222ym.m26240q("Event{name='", str, "', timestamp=");
        sbM26240q.append(this.f28702b);
        sbM26240q.append(", params=");
        sbM26240q.append(strValueOf);
        sbM26240q.append("}");
        return sbM26240q.toString();
    }
}
