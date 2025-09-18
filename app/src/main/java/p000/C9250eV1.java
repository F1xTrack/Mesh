package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: eV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9250eV1 implements XU1 {

    /* renamed from: a */
    public final ArrayList f26728a;

    public C9250eV1(Context context, RU1 ru1) {
        ArrayList arrayList = new ArrayList();
        this.f26728a = arrayList;
        arrayList.add(new C11553wV1(context, ru1));
    }

    @Override // p000.XU1
    /* renamed from: a */
    public final void mo9058a(C8389Ur1 c8389Ur1) {
        Iterator it = this.f26728a.iterator();
        while (it.hasNext()) {
            ((XU1) it.next()).mo9058a(c8389Ur1);
        }
    }
}
