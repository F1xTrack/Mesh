package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class AV1 extends U0 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AV1(int i) {
        super(8);
        this.c = i;
    }

    @Override // defpackage.U0
    public final Object f1(Object obj) {
        switch (this.c) {
            case 0:
                C2406bs0 c2406bs0C = C2406bs0.c();
                return new C5898mV1(c2406bs0C.b(), (C6755r01) c2406bs0C.a(C6755r01.class), new C3594eV1(C2406bs0.c().b(), (RU1) obj));
            case 1:
                C2406bs0 c2406bs0C2 = C2406bs0.c();
                Context contextB = C2406bs0.c().b();
                ArrayList arrayList = new ArrayList();
                C7189tG1 c7189tG1 = new C7189tG1(4);
                C1141Ok c1141Ok = C1141Ok.e;
                C2362bd1.b(contextB);
                C2362bd1.a().c(c1141Ok);
                C1141Ok.d.contains(new C7973xO("json"));
                arrayList.add(c7189tG1);
                return new V02(c2406bs0C2.b(), (C6755r01) c2406bs0C2.a(C6755r01.class));
            default:
                C4274i32 c4274i32 = (C4274i32) obj;
                C2406bs0 c2406bs0C3 = C2406bs0.c();
                return new C5814m32(c2406bs0C3.b(), (C6755r01) c2406bs0C3.a(C6755r01.class), new C5432k32(C2406bs0.c().b(), c4274i32), c4274i32.a);
        }
    }
}
