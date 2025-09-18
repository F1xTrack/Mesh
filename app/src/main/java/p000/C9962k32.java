package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9962k32 implements InterfaceC9834j32 {

    /* renamed from: a */
    public final ArrayList f36281a;

    public C9962k32(Context context, C9706i32 c9706i32) {
        ArrayList arrayList = new ArrayList();
        this.f36281a = arrayList;
        if (c9706i32.f28800b) {
            arrayList.add(new C10474o32(context, c9706i32));
        }
    }

    @Override // p000.InterfaceC9834j32
    /* renamed from: a */
    public final void mo21975a(C1356VY c1356vy) {
        Iterator it = this.f36281a.iterator();
        while (it.hasNext()) {
            ((InterfaceC9834j32) it.next()).mo21975a(c1356vy);
        }
    }
}
