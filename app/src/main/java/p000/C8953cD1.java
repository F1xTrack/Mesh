package p000;

/* renamed from: cD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8953cD1 {

    /* renamed from: d */
    public static final /* synthetic */ int f17369d = 0;

    /* renamed from: a */
    public final String f17370a;

    /* renamed from: b */
    public final int f17371b;

    /* renamed from: c */
    public final int f17372c;

    static {
        ZC1 zc1 = new ZC1();
        zc1.f14792a = "";
        zc1.f14795d = (byte) (zc1.f14795d | 1);
        zc1.f14793b = 1;
        zc1.f14794c = 1;
        zc1.m9504a();
        ZC1 zc12 = new ZC1();
        zc12.f14792a = "";
        zc12.f14795d = (byte) (zc12.f14795d | 1);
        zc12.f14793b = 4;
        zc12.f14794c = 1;
        zc12.m9504a();
        ZC1 zc13 = new ZC1();
        zc13.f14792a = "";
        zc13.f14795d = (byte) (zc13.f14795d | 1);
        zc13.f14793b = 2;
        zc13.f14794c = 1;
        zc13.m9504a();
    }

    public C8953cD1(String str, int i, int i2) {
        this.f17370a = str;
        this.f17371b = i;
        this.f17372c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8953cD1) {
            C8953cD1 c8953cD1 = (C8953cD1) obj;
            if (this.f17370a.equals(c8953cD1.f17370a) && AbstractC7222ym.m26226c(this.f17371b, c8953cD1.f17371b) && AbstractC7222ym.m26226c(this.f17372c, c8953cD1.f17372c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f17370a.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ AbstractC7222ym.m26247x(this.f17371b)) * 583896283) ^ AbstractC7222ym.m26247x(this.f17372c);
    }

    public final String toString() {
        int i = this.f17371b;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        int i2 = this.f17372c;
        String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "WRITE_ONLY" : "READ_ONLY" : "READ_AND_WRITE";
        StringBuilder sb = new StringBuilder("FileComplianceOptions{fileOwner=");
        sb.append(this.f17370a);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str);
        sb.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        return AbstractC1374Vq.m8593l(sb, str2, "}");
    }
}
