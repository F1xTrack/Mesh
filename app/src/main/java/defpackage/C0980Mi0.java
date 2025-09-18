package defpackage;

/* renamed from: Mi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980Mi0 {
    public EnumC0201Ci0 a;
    public InterfaceC0669Ii0 b;

    public final void a(InterfaceC0903Li0 interfaceC0903Li0, EnumC0123Bi0 enumC0123Bi0) {
        EnumC0201Ci0 enumC0201Ci0A = enumC0123Bi0.a();
        EnumC0201Ci0 enumC0201Ci0 = this.a;
        O90.f(enumC0201Ci0, "state1");
        if (enumC0201Ci0A.compareTo(enumC0201Ci0) < 0) {
            enumC0201Ci0 = enumC0201Ci0A;
        }
        this.a = enumC0201Ci0;
        this.b.f(interfaceC0903Li0, enumC0123Bi0);
        this.a = enumC0201Ci0A;
    }
}
