package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: yI */
/* loaded from: classes2.dex */
public class C7192yI implements InterfaceC0510I5 {

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC10293mf0[] f46177b;

    /* renamed from: a */
    public final C8426Vk0 f46178a;

    static {
        IP0 ip0 = BP0.f799a;
        f46177b = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C7192yI.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C7192yI(Z41 z41, InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(z41, "storageManager");
        this.f46178a = new C8426Vk0((C8582Yk0) z41, interfaceC6434mZ);
    }

    @Override // p000.InterfaceC0510I5
    /* renamed from: D */
    public final InterfaceC7116x5 mo3260D(C0664KX c0664kx) {
        return AbstractC10642pN1.m23768a(this, c0664kx);
    }

    @Override // p000.InterfaceC0510I5
    /* renamed from: g */
    public final boolean mo3261g(C0664KX c0664kx) {
        return AbstractC10642pN1.m23770c(this, c0664kx);
    }

    @Override // p000.InterfaceC0510I5
    public boolean isEmpty() {
        return ((List) WS1.m8763b(this.f46178a, f46177b[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) WS1.m8763b(this.f46178a, f46177b[0])).iterator();
    }
}
