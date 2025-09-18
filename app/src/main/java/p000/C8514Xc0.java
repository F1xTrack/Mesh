package p000;

import java.util.List;
import kotlin.Pair;

/* renamed from: Xc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8514Xc0 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f13875e;

    /* renamed from: f */
    public final /* synthetic */ C8618Zc0 f13876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8514Xc0(C8618Zc0 c8618Zc0, int i) {
        super(1);
        this.f13875e = i;
        this.f13876f = c8618Zc0;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        C8618Zc0 c8618Zc0 = this.f13876f;
        boolean z = false;
        z = false;
        switch (this.f13875e) {
            case 0:
                Pair pair = (Pair) obj;
                O90.m5968f(pair, "<name for destructuring parameter 0>");
                String str = (String) pair.f36702a;
                String str2 = (String) pair.f36703b;
                List listM26274e = AbstractC7230yu.m26274e(AbstractC0321F5.m2491a(c8618Zc0.f15020a.f1735e, AbstractC11153tN0.m24912x("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), AbstractC7222ym.m26232i(str2, "()"), "HIDDEN", false));
                return listM26274e.isEmpty() ? S20.f10539b : new C0636K5(listM26274e, z ? 1 : 0);
            default:
                InterfaceC7158xl interfaceC7158xl = (InterfaceC7158xl) obj;
                if (interfaceC7158xl.mo116l() == 1) {
                    c8618Zc0.getClass();
                    InterfaceC0140CD interfaceC0140CDMo423i = interfaceC7158xl.mo423i();
                    O90.m5966d(interfaceC0140CDMo423i, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String str3 = C11309ub0.f43758a;
                    if (C11309ub0.f43767j.containsKey(AbstractC6814sI.m24695g((InterfaceC6976us) interfaceC0140CDMo423i))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
