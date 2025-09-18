package defpackage;

import android.content.Context;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;

/* loaded from: classes2.dex */
public final class HC0 extends AbstractC1963Yy {
    public Context a;
    public PreferenceDataStoreByKeyMigration b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ PreferenceDataStoreByKeyMigration f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HC0(PreferenceDataStoreByKeyMigration preferenceDataStoreByKeyMigration, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.f = preferenceDataStoreByKeyMigration;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        Object objMo81migrategIAlus = this.f.mo81migrategIAlus(null, this);
        return objMo81migrategIAlus == EnumC1030Mz.a ? objMo81migrategIAlus : new PS0(objMo81migrategIAlus);
    }
}
