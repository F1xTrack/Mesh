package p000;

import java.io.File;

/* renamed from: jl */
/* loaded from: classes.dex */
public abstract class AbstractC6257jl implements Comparable {

    /* renamed from: a */
    public final String f35353a;

    /* renamed from: b */
    public final long f35354b;

    /* renamed from: c */
    public final long f35355c;

    /* renamed from: d */
    public final boolean f35356d;

    /* renamed from: e */
    public final File f35357e;

    /* renamed from: f */
    public final long f35358f;

    public AbstractC6257jl(String str, long j, long j2, long j3, File file) {
        this.f35353a = str;
        this.f35354b = j;
        this.f35355c = j2;
        this.f35356d = file != null;
        this.f35357e = file;
        this.f35358f = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC6257jl abstractC6257jl) {
        String str = abstractC6257jl.f35353a;
        String str2 = this.f35353a;
        if (!str2.equals(str)) {
            return str2.compareTo(abstractC6257jl.f35353a);
        }
        long j = this.f35354b - abstractC6257jl.f35354b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f35354b);
        sb.append(", ");
        return AbstractC0852NX.m5760i(sb, this.f35355c, "]");
    }
}
