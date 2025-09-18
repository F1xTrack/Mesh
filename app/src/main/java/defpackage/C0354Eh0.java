package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Eh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0354Eh0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C0432Fh0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0354Eh0(C0432Fh0 c0432Fh0, int i) {
        super(0);
        this.e = i;
        this.f = c0432Fh0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                C0432Fh0 c0432Fh0 = this.f;
                C4375ib0 c4375ib0 = (C4375ib0) c0432Fh0.i.b;
                c0432Fh0.f.b();
                ((C0318Dv0) c4375ib0.l).getClass();
                return AbstractC7096sn0.n(new ArrayList());
            case 1:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) WS1.b(this.f.j, C0432Fh0.n[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    C7977xP0 c7977xP0 = (C7977xP0) entry.getValue();
                    C3427dd0 c3427dd0D = C3427dd0.d(str);
                    C5350je c5350je = c7977xP0.b;
                    EnumC0039Ag0 enumC0039Ag0 = (EnumC0039Ag0) c5350je.d;
                    int iOrdinal = enumC0039Ag0.ordinal();
                    if (iOrdinal == 2) {
                        map.put(c3427dd0D, c3427dd0D);
                    } else if (iOrdinal == 5) {
                        String str2 = enumC0039Ag0 == EnumC0039Ag0.i ? (String) c5350je.c : null;
                        if (str2 != null) {
                            map.put(c3427dd0D, C3427dd0.d(str2));
                        }
                    }
                }
                return map;
            default:
                this.f.h.getClass();
                return new ArrayList(AbstractC8449zu.k(MN.a));
        }
    }
}
