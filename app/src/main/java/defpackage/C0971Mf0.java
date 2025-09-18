package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: Mf0 */
/* loaded from: classes.dex */
public final class C0971Mf0 {
    public static final C0971Mf0 c = new C0971Mf0("COMPOSITION");
    public final List a;
    public InterfaceC1049Nf0 b;

    public C0971Mf0(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    public final boolean a(int i, String str) {
        List list = this.a;
        if (i >= list.size()) {
            return false;
        }
        boolean z = i == list.size() - 1;
        String str2 = (String) list.get(i);
        if (!str2.equals("**")) {
            return (z || (i == list.size() + (-2) && ((String) list.get(list.size() - 1)).equals("**"))) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && ((String) list.get(i + 1)).equals(str)) {
            return i == list.size() + (-2) || (i == list.size() + (-3) && ((String) list.get(list.size() - 1)).equals("**"));
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < list.size() - 1) {
            return false;
        }
        return ((String) list.get(i2)).equals(str);
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0971Mf0.class != obj.getClass()) {
            return false;
        }
        C0971Mf0 c0971Mf0 = (C0971Mf0) obj;
        if (!this.a.equals(c0971Mf0.a)) {
            return false;
        }
        InterfaceC1049Nf0 interfaceC1049Nf0 = this.b;
        InterfaceC1049Nf0 interfaceC1049Nf02 = c0971Mf0.b;
        return interfaceC1049Nf0 != null ? interfaceC1049Nf0.equals(interfaceC1049Nf02) : interfaceC1049Nf02 == null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        InterfaceC1049Nf0 interfaceC1049Nf0 = this.b;
        return iHashCode + (interfaceC1049Nf0 != null ? interfaceC1049Nf0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        return F91.w(sb, this.b != null, '}');
    }

    public C0971Mf0(C0971Mf0 c0971Mf0) {
        this.a = new ArrayList(c0971Mf0.a);
        this.b = c0971Mf0.b;
    }
}
