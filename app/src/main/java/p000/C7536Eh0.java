package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Eh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7536Eh0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f2841e;

    /* renamed from: f */
    public final /* synthetic */ C7588Fh0 f2842f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7536Eh0(C7588Fh0 c7588Fh0, int i) {
        super(0);
        this.f2841e = i;
        this.f2842f = c7588Fh0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f2841e) {
            case 0:
                C7588Fh0 c7588Fh0 = this.f2842f;
                C9773ib0 c9773ib0 = (C9773ib0) c7588Fh0.f3392i.f38228b;
                c7588Fh0.f494f.m4654b();
                ((C7512Dv0) c9773ib0.f29349l).getClass();
                return AbstractC11077sn0.m24786n(new ArrayList());
            case 1:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) WS1.m8763b(this.f2842f.f3393j, C7588Fh0.f3390n[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    C11667xP0 c11667xP0 = (C11667xP0) entry.getValue();
                    C9137dd0 c9137dd0M17717d = C9137dd0.m17717d(str);
                    C6250je c6250je = c11667xP0.f45573b;
                    EnumC7326Ag0 enumC7326Ag0 = (EnumC7326Ag0) c6250je.f35299d;
                    int iOrdinal = enumC7326Ag0.ordinal();
                    if (iOrdinal == 2) {
                        map.put(c9137dd0M17717d, c9137dd0M17717d);
                    } else if (iOrdinal == 5) {
                        String str2 = enumC7326Ag0 == EnumC7326Ag0.f330i ? (String) c6250je.f35298c : null;
                        if (str2 != null) {
                            map.put(c9137dd0M17717d, C9137dd0.m17717d(str2));
                        }
                    }
                }
                return map;
            default:
                this.f2842f.f3391h.getClass();
                return new ArrayList(AbstractC7293zu.m26586k(C0779MN.f7117a));
        }
    }
}
