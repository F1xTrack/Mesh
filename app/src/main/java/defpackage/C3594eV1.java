package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: eV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3594eV1 implements XU1 {
    public final ArrayList a;

    public C3594eV1(Context context, RU1 ru1) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new C7806wV1(context, ru1));
    }

    @Override // defpackage.XU1
    public final void a(C1632Ur1 c1632Ur1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((XU1) it.next()).a(c1632Ur1);
        }
    }
}
