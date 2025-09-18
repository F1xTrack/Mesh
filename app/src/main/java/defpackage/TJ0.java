package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class TJ0 implements InterfaceC5222iz {
    public G10 a;

    @Override // defpackage.InterfaceC4255hz
    public final void a(D40 d40, List list) throws IOException {
        G10 g10 = this.a;
        if (g10 != null) {
            g10.a(d40, list);
        }
    }

    @Override // defpackage.InterfaceC4255hz
    public final List s(D40 d40) throws IOException {
        G10 g10 = this.a;
        if (g10 == null) {
            return Collections.emptyList();
        }
        List<C4064gz> listS = g10.s(d40);
        ArrayList arrayList = new ArrayList();
        for (C4064gz c4064gz : listS) {
            try {
                ArrayList arrayList2 = new ArrayList(20);
                String str = c4064gz.a;
                String str2 = c4064gz.b;
                K12.a(str);
                K12.b(str2, str);
                arrayList2.add(str);
                arrayList2.add(AbstractC7538v51.Y(str2).toString());
                arrayList.add(c4064gz);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }
}
