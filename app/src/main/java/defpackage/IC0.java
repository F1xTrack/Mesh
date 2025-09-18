package defpackage;

import com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class IC0 extends AbstractC4286i71 implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PreferenceDataStoreByKeyMigration b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IC0(PreferenceDataStoreByKeyMigration preferenceDataStoreByKeyMigration, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = preferenceDataStoreByKeyMigration;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        IC0 ic0 = new IC0(this.b, interfaceC1729Vy);
        ic0.a = obj;
        return ic0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        IC0 ic0 = (IC0) create((C0546Gt0) obj, (InterfaceC1729Vy) obj2);
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        ic0.invokeSuspend(c1518Tf1);
        return c1518Tf1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        C0546Gt0 c0546Gt0 = (C0546Gt0) this.a;
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            c0546Gt0.c((LC0) it.next());
        }
        return C1518Tf1.a;
    }
}
