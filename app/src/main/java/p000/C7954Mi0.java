package p000;

/* renamed from: Mi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7954Mi0 {

    /* renamed from: a */
    public EnumC7434Ci0 f7309a;

    /* renamed from: b */
    public InterfaceC7746Ii0 f7310b;

    /* renamed from: a */
    public final void m5428a(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
        EnumC7434Ci0 enumC7434Ci0M812a = enumC7382Bi0.m812a();
        EnumC7434Ci0 enumC7434Ci0 = this.f7309a;
        O90.m5968f(enumC7434Ci0, "state1");
        if (enumC7434Ci0M812a.compareTo(enumC7434Ci0) < 0) {
            enumC7434Ci0 = enumC7434Ci0M812a;
        }
        this.f7309a = enumC7434Ci0;
        this.f7310b.mo2792f(interfaceC7902Li0, enumC7382Bi0);
        this.f7309a = enumC7434Ci0M812a;
    }
}
