package p000;

/* renamed from: od */
/* loaded from: classes.dex */
public final class C6564od extends AbstractC0766MA {

    /* renamed from: a */
    public final String f39123a;

    /* renamed from: b */
    public final String f39124b;

    public C6564od(String str, String str2) {
        this.f39123a = str;
        this.f39124b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0766MA)) {
            return false;
        }
        AbstractC0766MA abstractC0766MA = (AbstractC0766MA) obj;
        return this.f39123a.equals(((C6564od) abstractC0766MA).f39123a) && this.f39124b.equals(((C6564od) abstractC0766MA).f39124b);
    }

    public final int hashCode() {
        return ((this.f39123a.hashCode() ^ 1000003) * 1000003) ^ this.f39124b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f39123a);
        sb.append(", variantId=");
        return AbstractC1374Vq.m8593l(sb, this.f39124b, "}");
    }
}
