package defpackage;

/* renamed from: Nc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1039Nc extends AbstractC7360uA {
    public final String a;
    public final String b;
    public final String c;

    public C1039Nc(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7360uA)) {
            return false;
        }
        AbstractC7360uA abstractC7360uA = (AbstractC7360uA) obj;
        if (this.a.equals(((C1039Nc) abstractC7360uA).a)) {
            C1039Nc c1039Nc = (C1039Nc) abstractC7360uA;
            if (this.b.equals(c1039Nc.b) && this.c.equals(c1039Nc.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return AbstractC1705Vq.l(sb, this.c, "}");
    }
}
