package defpackage;

import com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;

/* loaded from: classes2.dex */
public final class GC0 extends AbstractC1963Yy {
    public PreferenceDataStoreByKeyMigration a;
    public /* synthetic */ Object b;
    public final /* synthetic */ PreferenceDataStoreByKeyMigration c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GC0(PreferenceDataStoreByKeyMigration preferenceDataStoreByKeyMigration, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.c = preferenceDataStoreByKeyMigration;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
