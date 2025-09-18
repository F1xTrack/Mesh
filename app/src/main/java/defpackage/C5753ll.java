package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* renamed from: ll, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5753ll {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public YE e;

    public C5753ll(int i, String str, YE ye) {
        this.a = i;
        this.b = str;
        this.e = ye;
    }

    public final boolean a(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            C5562kl c5562kl = (C5562kl) arrayList.get(i);
            long j3 = c5562kl.b;
            long j4 = c5562kl.a;
            if (j3 == -1) {
                if (j >= j4) {
                    return true;
                }
            } else if (j2 != -1 && j4 <= j && j + j2 <= j4 + j3) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5753ll.class != obj.getClass()) {
            return false;
        }
        C5753ll c5753ll = (C5753ll) obj;
        return this.a == c5753ll.a && this.b.equals(c5753ll.b) && this.c.equals(c5753ll.c) && this.e.equals(c5753ll.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + AbstractC1705Vq.e(this.a * 31, 31, this.b);
    }
}
