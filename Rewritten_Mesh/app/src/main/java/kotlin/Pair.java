package kotlin;

import java.io.Serializable;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m22267d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Pair<A, B> implements Serializable {

    /* renamed from: a */
    public final Object f36702a;

    /* renamed from: b */
    public final Object f36703b;

    public Pair(Object obj, Object obj2) {
        this.f36702a = obj;
        this.f36703b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return O90.m5963a(this.f36702a, pair.f36702a) && O90.m5963a(this.f36703b, pair.f36703b);
    }

    public final int hashCode() {
        Object obj = this.f36702a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f36703b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f36702a + ", " + this.f36703b + ')';
    }
}
