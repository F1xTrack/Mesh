package p000;

import android.content.Context;
import com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;

/* loaded from: classes2.dex */
public final class HC0 extends AbstractC1571Yy {

    /* renamed from: a */
    public Context f4166a;

    /* renamed from: b */
    public PreferenceDataStoreByKeyMigration f4167b;

    /* renamed from: c */
    public Object f4168c;

    /* renamed from: d */
    public Object f4169d;

    /* renamed from: e */
    public /* synthetic */ Object f4170e;

    /* renamed from: f */
    public final /* synthetic */ PreferenceDataStoreByKeyMigration f4171f;

    /* renamed from: g */
    public int f4172g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HC0(PreferenceDataStoreByKeyMigration preferenceDataStoreByKeyMigration, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f4171f = preferenceDataStoreByKeyMigration;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f4170e = obj;
        this.f4172g |= Integer.MIN_VALUE;
        Object objMo26675migrategIAlus = this.f4171f.mo26675migrategIAlus(null, this);
        return objMo26675migrategIAlus == EnumC0817Mz.f7418a ? objMo26675migrategIAlus : new PS0(objMo26675migrategIAlus);
    }
}
