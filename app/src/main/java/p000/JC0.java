package p000;

import android.content.Context;
import com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreMigration;

/* loaded from: classes2.dex */
public final class JC0 extends AbstractC1571Yy {

    /* renamed from: a */
    public Context f5376a;

    /* renamed from: b */
    public PreferenceDataStoreMigration f5377b;

    /* renamed from: c */
    public /* synthetic */ Object f5378c;

    /* renamed from: d */
    public final /* synthetic */ PreferenceDataStoreMigration f5379d;

    /* renamed from: e */
    public int f5380e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JC0(PreferenceDataStoreMigration preferenceDataStoreMigration, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f5379d = preferenceDataStoreMigration;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f5378c = obj;
        this.f5380e |= Integer.MIN_VALUE;
        Object objM13743a = PreferenceDataStoreMigration.m13743a(this.f5379d, null, this);
        return objM13743a == EnumC0817Mz.f7418a ? objM13743a : new PS0(objM13743a);
    }
}
