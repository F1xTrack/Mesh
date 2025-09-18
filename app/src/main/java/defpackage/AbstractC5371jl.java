package defpackage;

import java.io.File;

/* renamed from: jl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5371jl implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public AbstractC5371jl(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC5371jl abstractC5371jl) {
        String str = abstractC5371jl.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(abstractC5371jl.a);
        }
        long j = this.b - abstractC5371jl.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.b);
        sb.append(", ");
        return NX.i(sb, this.c, "]");
    }
}
