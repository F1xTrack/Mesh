package defpackage;

import java.util.List;
import kotlin.Pair;

/* renamed from: Xc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1820Xc0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C1976Zc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1820Xc0(C1976Zc0 c1976Zc0, int i) {
        super(1);
        this.e = i;
        this.f = c1976Zc0;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        C1976Zc0 c1976Zc0 = this.f;
        boolean z = false;
        z = false;
        switch (this.e) {
            case 0:
                Pair pair = (Pair) obj;
                O90.f(pair, "<name for destructuring parameter 0>");
                String str = (String) pair.a;
                String str2 = (String) pair.b;
                List listE = AbstractC8259yu.e(F5.a(c1976Zc0.a.e, AbstractC7209tN0.x("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), AbstractC8235ym.i(str2, "()"), "HIDDEN", false));
                return listE.isEmpty() ? S20.b : new K5(listE, z ? 1 : 0);
            default:
                InterfaceC8042xl interfaceC8042xl = (InterfaceC8042xl) obj;
                if (interfaceC8042xl.l() == 1) {
                    c1976Zc0.getClass();
                    CD cdI = interfaceC8042xl.i();
                    O90.d(cdI, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String str3 = C7442ub0.a;
                    if (C7442ub0.j.containsKey(AbstractC7002sI.g((InterfaceC7492us) cdI))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
