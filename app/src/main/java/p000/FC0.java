package p000;

import com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;

/* loaded from: classes2.dex */
public final class FC0 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f3087a;

    /* renamed from: b */
    public final /* synthetic */ PreferenceDataStoreByKeyMigration f3088b;

    /* renamed from: c */
    public int f3089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FC0(PreferenceDataStoreByKeyMigration preferenceDataStoreByKeyMigration, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f3088b = preferenceDataStoreByKeyMigration;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f3087a = obj;
        this.f3089c |= Integer.MIN_VALUE;
        return this.f3088b.m13741a(null, this);
    }
}
