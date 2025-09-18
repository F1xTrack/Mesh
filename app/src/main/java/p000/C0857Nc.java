package p000;

/* renamed from: Nc */
/* loaded from: classes.dex */
public final class C0857Nc extends AbstractC6932uA {

    /* renamed from: a */
    public final String f7908a;

    /* renamed from: b */
    public final String f7909b;

    /* renamed from: c */
    public final String f7910c;

    public C0857Nc(String str, String str2, String str3) {
        this.f7908a = str;
        this.f7909b = str2;
        this.f7910c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6932uA)) {
            return false;
        }
        AbstractC6932uA abstractC6932uA = (AbstractC6932uA) obj;
        if (this.f7908a.equals(((C0857Nc) abstractC6932uA).f7908a)) {
            C0857Nc c0857Nc = (C0857Nc) abstractC6932uA;
            if (this.f7909b.equals(c0857Nc.f7909b) && this.f7910c.equals(c0857Nc.f7910c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7908a.hashCode() ^ 1000003) * 1000003) ^ this.f7909b.hashCode()) * 1000003) ^ this.f7910c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f7908a);
        sb.append(", libraryName=");
        sb.append(this.f7909b);
        sb.append(", buildId=");
        return AbstractC1374Vq.m8593l(sb, this.f7910c, "}");
    }
}
