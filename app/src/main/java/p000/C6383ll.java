package p000;

import java.util.ArrayList;
import java.util.TreeSet;

/* renamed from: ll */
/* loaded from: classes.dex */
public final class C6383ll {

    /* renamed from: a */
    public final int f37278a;

    /* renamed from: b */
    public final String f37279b;

    /* renamed from: c */
    public final TreeSet f37280c = new TreeSet();

    /* renamed from: d */
    public final ArrayList f37281d = new ArrayList();

    /* renamed from: e */
    public C1525YE f37282e;

    public C6383ll(int i, String str, C1525YE c1525ye) {
        this.f37278a = i;
        this.f37279b = str;
        this.f37282e = c1525ye;
    }

    /* renamed from: a */
    public final boolean m22539a(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f37281d;
            if (i >= arrayList.size()) {
                return false;
            }
            C6320kl c6320kl = (C6320kl) arrayList.get(i);
            long j3 = c6320kl.f36658b;
            long j4 = c6320kl.f36657a;
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
        if (obj == null || C6383ll.class != obj.getClass()) {
            return false;
        }
        C6383ll c6383ll = (C6383ll) obj;
        return this.f37278a == c6383ll.f37278a && this.f37279b.equals(c6383ll.f37279b) && this.f37280c.equals(c6383ll.f37280c) && this.f37282e.equals(c6383ll.f37282e);
    }

    public final int hashCode() {
        return this.f37282e.hashCode() + AbstractC1374Vq.m8586e(this.f37278a * 31, 31, this.f37279b);
    }
}
