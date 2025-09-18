package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5432k32 implements InterfaceC5241j32 {
    public final ArrayList a;

    public C5432k32(Context context, C4274i32 c4274i32) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (c4274i32.b) {
            arrayList.add(new C6196o32(context, c4274i32));
        }
    }

    @Override // defpackage.InterfaceC5241j32
    public final void a(VY vy) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5241j32) it.next()).a(vy);
        }
    }
}
