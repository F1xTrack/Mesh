package defpackage;

/* renamed from: cD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2474cD1 {
    public static final /* synthetic */ int d = 0;
    public final String a;
    public final int b;
    public final int c;

    static {
        ZC1 zc1 = new ZC1();
        zc1.a = "";
        zc1.d = (byte) (zc1.d | 1);
        zc1.b = 1;
        zc1.c = 1;
        zc1.a();
        ZC1 zc12 = new ZC1();
        zc12.a = "";
        zc12.d = (byte) (zc12.d | 1);
        zc12.b = 4;
        zc12.c = 1;
        zc12.a();
        ZC1 zc13 = new ZC1();
        zc13.a = "";
        zc13.d = (byte) (zc13.d | 1);
        zc13.b = 2;
        zc13.c = 1;
        zc13.a();
    }

    public C2474cD1(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2474cD1) {
            C2474cD1 c2474cD1 = (C2474cD1) obj;
            if (this.a.equals(c2474cD1.a) && AbstractC8235ym.c(this.b, c2474cD1.b) && AbstractC8235ym.c(this.c, c2474cD1.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ AbstractC8235ym.x(this.b)) * 583896283) ^ AbstractC8235ym.x(this.c);
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        int i2 = this.c;
        String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "WRITE_ONLY" : "READ_ONLY" : "READ_AND_WRITE";
        StringBuilder sb = new StringBuilder("FileComplianceOptions{fileOwner=");
        sb.append(this.a);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str);
        sb.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        return AbstractC1705Vq.l(sb, str2, "}");
    }
}
