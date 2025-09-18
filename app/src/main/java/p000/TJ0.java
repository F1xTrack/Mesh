package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class TJ0 implements InterfaceC6208iz {

    /* renamed from: a */
    public G10 f11322a;

    @Override // p000.InterfaceC4213hz
    /* renamed from: a */
    public final void mo2894a(D40 d40, List list) throws IOException {
        G10 g10 = this.f11322a;
        if (g10 != null) {
            g10.mo2894a(d40, list);
        }
    }

    @Override // p000.InterfaceC4213hz
    /* renamed from: s */
    public final List mo2904s(D40 d40) throws IOException {
        G10 g10 = this.f11322a;
        if (g10 == null) {
            return Collections.emptyList();
        }
        List<C4150gz> listMo2904s = g10.mo2904s(d40);
        ArrayList arrayList = new ArrayList();
        for (C4150gz c4150gz : listMo2904s) {
            try {
                ArrayList arrayList2 = new ArrayList(20);
                String str = c4150gz.f28128a;
                String str2 = c4150gz.f28129b;
                K12.m4520a(str);
                K12.m4521b(str2, str);
                arrayList2.add(str);
                arrayList2.add(AbstractC11374v51.m25350Y(str2).toString());
                arrayList.add(c4150gz);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }
}
