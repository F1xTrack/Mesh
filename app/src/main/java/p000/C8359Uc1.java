package p000;

import java.util.Set;

/* renamed from: Uc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8359Uc1 implements InterfaceC8307Tc1 {

    /* renamed from: a */
    public final Set f11931a;

    /* renamed from: b */
    public final C1236Te f11932b;

    /* renamed from: c */
    public final C8877bd1 f11933c;

    public C8359Uc1(Set set, C1236Te c1236Te, C8877bd1 c8877bd1) {
        this.f11931a = set;
        this.f11932b = c1236Te;
        this.f11933c = c8877bd1;
    }

    /* renamed from: a */
    public final C8411Vc1 m8089a(String str, C7135xO c7135xO, InterfaceC11821yc1 interfaceC11821yc1) {
        Set set = this.f11931a;
        if (set.contains(c7135xO)) {
            return new C8411Vc1(this.f11932b, str, c7135xO, interfaceC11821yc1, this.f11933c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c7135xO, set));
    }
}
