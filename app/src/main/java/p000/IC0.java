package p000;

import com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class IC0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public /* synthetic */ Object f4839a;

    /* renamed from: b */
    public final /* synthetic */ PreferenceDataStoreByKeyMigration f4840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IC0(PreferenceDataStoreByKeyMigration preferenceDataStoreByKeyMigration, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f4840b = preferenceDataStoreByKeyMigration;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        IC0 ic0 = new IC0(this.f4840b, interfaceC1382Vy);
        ic0.f4839a = obj;
        return ic0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        IC0 ic0 = (IC0) create((C7664Gt0) obj, (InterfaceC1382Vy) obj2);
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        ic0.invokeSuspend(c8313Tf1);
        return c8313Tf1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        C7664Gt0 c7664Gt0 = (C7664Gt0) this.f4839a;
        Iterator it = this.f4840b.f20430b.iterator();
        while (it.hasNext()) {
            c7664Gt0.m3187c((LC0) it.next());
        }
        return C8313Tf1.f11463a;
    }
}
