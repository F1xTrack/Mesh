package defpackage;

import android.content.Context;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration;

/* loaded from: classes2.dex */
public final class JC0 extends AbstractC1963Yy {
    public Context a;
    public PreferenceDataStoreMigration b;
    public /* synthetic */ Object c;
    public final /* synthetic */ PreferenceDataStoreMigration d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JC0(PreferenceDataStoreMigration preferenceDataStoreMigration, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.d = preferenceDataStoreMigration;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objA = PreferenceDataStoreMigration.a(this.d, null, this);
        return objA == EnumC1030Mz.a ? objA : new PS0(objA);
    }
}
