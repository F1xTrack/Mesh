package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: q81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10740q81 {

    /* renamed from: a */
    public final String f40625a;

    /* renamed from: b */
    public final boolean f40626b;

    /* renamed from: c */
    public final List f40627c;

    /* renamed from: d */
    public final List f40628d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public C10740q81(String str, boolean z, List list, List list2) {
        O90.m5968f(list, "columns");
        O90.m5968f(list2, "orders");
        this.f40625a = str;
        this.f40626b = z;
        this.f40627c = list;
        this.f40628d = list2;
        List arrayList = list2;
        if (arrayList.isEmpty()) {
            int size = list.size();
            arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add("ASC");
            }
        }
        this.f40628d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10740q81)) {
            return false;
        }
        C10740q81 c10740q81 = (C10740q81) obj;
        if (this.f40626b != c10740q81.f40626b || !O90.m5963a(this.f40627c, c10740q81.f40627c) || !O90.m5963a(this.f40628d, c10740q81.f40628d)) {
            return false;
        }
        String str = this.f40625a;
        boolean zM1556o = D51.m1556o(str, "index_", false);
        String str2 = c10740q81.f40625a;
        return zM1556o ? D51.m1556o(str2, "index_", false) : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f40625a;
        return this.f40628d.hashCode() + ((this.f40627c.hashCode() + ((((D51.m1556o(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f40626b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f40625a + "', unique=" + this.f40626b + ", columns=" + this.f40627c + ", orders=" + this.f40628d + "'}";
    }
}
