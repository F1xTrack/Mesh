package p000;

import com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;

/* loaded from: classes2.dex */
public final class GC0 extends AbstractC1571Yy {

    /* renamed from: a */
    public PreferenceDataStoreByKeyMigration f3639a;

    /* renamed from: b */
    public /* synthetic */ Object f3640b;

    /* renamed from: c */
    public final /* synthetic */ PreferenceDataStoreByKeyMigration f3641c;

    /* renamed from: d */
    public int f3642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GC0(PreferenceDataStoreByKeyMigration preferenceDataStoreByKeyMigration, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f3641c = preferenceDataStoreByKeyMigration;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f3640b = obj;
        this.f3642d |= Integer.MIN_VALUE;
        return this.f3641c.m13742b(null, this);
    }
}
