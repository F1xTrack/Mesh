package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: yI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8145yI implements I5 {
    public static final /* synthetic */ InterfaceC5927mf0[] b;
    public final C1688Vk0 a;

    static {
        IP0 ip0 = BP0.a;
        b = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C8145yI.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C8145yI(Z41 z41, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(z41, "storageManager");
        this.a = new C1688Vk0((C1922Yk0) z41, interfaceC5908mZ);
    }

    @Override // defpackage.I5
    public final InterfaceC7916x5 D(KX kx) {
        return AbstractC6447pN1.a(this, kx);
    }

    @Override // defpackage.I5
    public final boolean g(KX kx) {
        return AbstractC6447pN1.c(this, kx);
    }

    @Override // defpackage.I5
    public boolean isEmpty() {
        return ((List) WS1.b(this.a, b[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) WS1.b(this.a, b[0])).iterator();
    }
}
