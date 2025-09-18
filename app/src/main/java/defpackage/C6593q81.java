package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: q81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6593q81 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public C6593q81(String str, boolean z, List list, List list2) {
        O90.f(list, "columns");
        O90.f(list2, "orders");
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        List arrayList = list2;
        if (arrayList.isEmpty()) {
            int size = list.size();
            arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add("ASC");
            }
        }
        this.d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6593q81)) {
            return false;
        }
        C6593q81 c6593q81 = (C6593q81) obj;
        if (this.b != c6593q81.b || !O90.a(this.c, c6593q81.c) || !O90.a(this.d, c6593q81.d)) {
            return false;
        }
        String str = this.a;
        boolean zO = D51.o(str, "index_", false);
        String str2 = c6593q81.a;
        return zO ? D51.o(str2, "index_", false) : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((((D51.o(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + "'}";
    }
}
