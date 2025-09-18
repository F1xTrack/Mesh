package defpackage;

import java.util.HashMap;

/* renamed from: hy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4254hy1 {
    public static final V70 d = V70.t(3, "_syn", "_err", "_el");
    public String a;
    public final long b;
    public final HashMap c;

    public C4254hy1(String str, long j, HashMap map) {
        this.a = str;
        this.b = j;
        HashMap map2 = new HashMap();
        this.c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object a(Object obj, Object obj2, String str) {
        return (d.contains(str) && (obj2 instanceof Double)) ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : str.startsWith("_") ? ((obj instanceof String) || obj == null) ? obj2 : obj : obj instanceof Double ? obj2 : obj instanceof Long ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : obj instanceof String ? obj2.toString() : obj2;
    }

    public final /* synthetic */ Object clone() {
        return new C4254hy1(this.a, this.b, new HashMap(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4254hy1)) {
            return false;
        }
        C4254hy1 c4254hy1 = (C4254hy1) obj;
        if (this.b == c4254hy1.b && this.a.equals(c4254hy1.a)) {
            return this.c.equals(c4254hy1.c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.a;
        String strValueOf = String.valueOf(this.c);
        StringBuilder sbQ = AbstractC8235ym.q("Event{name='", str, "', timestamp=");
        sbQ.append(this.b);
        sbQ.append(", params=");
        sbQ.append(strValueOf);
        sbQ.append("}");
        return sbQ.toString();
    }
}
