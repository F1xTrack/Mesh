package defpackage;

import com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;

/* loaded from: classes2.dex */
public final class FC0 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ PreferenceDataStoreByKeyMigration b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FC0(PreferenceDataStoreByKeyMigration preferenceDataStoreByKeyMigration, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.b = preferenceDataStoreByKeyMigration;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
