package p000;

/* renamed from: rd */
/* loaded from: classes.dex */
public final class C6755rd extends AbstractC1018QA {

    /* renamed from: a */
    public final int f41772a;

    /* renamed from: b */
    public final String f41773b;

    /* renamed from: c */
    public final String f41774c;

    /* renamed from: d */
    public final boolean f41775d;

    public C6755rd(String str, String str2, int i, boolean z) {
        this.f41772a = i;
        this.f41773b = str;
        this.f41774c = str2;
        this.f41775d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1018QA)) {
            return false;
        }
        AbstractC1018QA abstractC1018QA = (AbstractC1018QA) obj;
        if (this.f41772a == ((C6755rd) abstractC1018QA).f41772a) {
            C6755rd c6755rd = (C6755rd) abstractC1018QA;
            if (this.f41773b.equals(c6755rd.f41773b) && this.f41774c.equals(c6755rd.f41774c) && this.f41775d == c6755rd.f41775d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f41772a ^ 1000003) * 1000003) ^ this.f41773b.hashCode()) * 1000003) ^ this.f41774c.hashCode()) * 1000003) ^ (this.f41775d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.f41772a);
        sb.append(", version=");
        sb.append(this.f41773b);
        sb.append(", buildVersion=");
        sb.append(this.f41774c);
        sb.append(", jailbroken=");
        return AbstractC7222ym.m26236m(sb, this.f41775d, "}");
    }
}
