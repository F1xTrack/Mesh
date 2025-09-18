package p000;

import android.util.Base64;
import java.util.List;

/* renamed from: bX */
/* loaded from: classes.dex */
public final class C1791bX {

    /* renamed from: a */
    public final String f17057a;

    /* renamed from: b */
    public final String f17058b;

    /* renamed from: c */
    public final String f17059c;

    /* renamed from: d */
    public final List f17060d;

    /* renamed from: e */
    public final String f17061e;

    public C1791bX(List list, String str, String str2, String str3) {
        str.getClass();
        this.f17057a = str;
        str2.getClass();
        this.f17058b = str2;
        this.f17059c = str3;
        list.getClass();
        this.f17060d = list;
        this.f17061e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f17057a + ", mProviderPackage: " + this.f17058b + ", mQuery: " + this.f17059c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f17060d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
