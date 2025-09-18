package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: Mf0 */
/* loaded from: classes.dex */
public final class C7948Mf0 {

    /* renamed from: c */
    public static final C7948Mf0 f7292c = new C7948Mf0("COMPOSITION");

    /* renamed from: a */
    public final List f7293a;

    /* renamed from: b */
    public InterfaceC8000Nf0 f7294b;

    public C7948Mf0(String... strArr) {
        this.f7293a = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public final boolean m5413a(int i, String str) {
        List list = this.f7293a;
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

    /* renamed from: b */
    public final int m5414b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f7293a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    /* renamed from: c */
    public final boolean m5415c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f7293a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    /* renamed from: d */
    public final boolean m5416d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f7293a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7948Mf0.class != obj.getClass()) {
            return false;
        }
        C7948Mf0 c7948Mf0 = (C7948Mf0) obj;
        if (!this.f7293a.equals(c7948Mf0.f7293a)) {
            return false;
        }
        InterfaceC8000Nf0 interfaceC8000Nf0 = this.f7294b;
        InterfaceC8000Nf0 interfaceC8000Nf02 = c7948Mf0.f7294b;
        return interfaceC8000Nf0 != null ? interfaceC8000Nf0.equals(interfaceC8000Nf02) : interfaceC8000Nf02 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f7293a.hashCode() * 31;
        InterfaceC8000Nf0 interfaceC8000Nf0 = this.f7294b;
        return iHashCode + (interfaceC8000Nf0 != null ? interfaceC8000Nf0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f7293a);
        sb.append(",resolved=");
        return F91.m2540w(sb, this.f7294b != null, '}');
    }

    public C7948Mf0(C7948Mf0 c7948Mf0) {
        this.f7293a = new ArrayList(c7948Mf0.f7293a);
        this.f7294b = c7948Mf0.f7294b;
    }
}
