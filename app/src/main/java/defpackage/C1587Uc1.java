package defpackage;

import java.util.Set;

/* renamed from: Uc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1587Uc1 implements InterfaceC1509Tc1 {
    public final Set a;
    public final C1513Te b;
    public final C2362bd1 c;

    public C1587Uc1(Set set, C1513Te c1513Te, C2362bd1 c2362bd1) {
        this.a = set;
        this.b = c1513Te;
        this.c = c2362bd1;
    }

    public final C1665Vc1 a(String str, C7973xO c7973xO, InterfaceC8207yc1 interfaceC8207yc1) {
        Set set = this.a;
        if (set.contains(c7973xO)) {
            return new C1665Vc1(this.b, str, c7973xO, interfaceC8207yc1, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c7973xO, set));
    }
}
