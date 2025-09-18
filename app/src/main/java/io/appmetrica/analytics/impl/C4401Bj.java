package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.p028io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.Bj */
/* loaded from: classes2.dex */
public final class C4401Bj implements ServiceStorageProvider {

    /* renamed from: a */
    public final Context f29912a;

    /* renamed from: b */
    public final InterfaceC5529vk f29913b;

    /* renamed from: c */
    public final SQLiteOpenHelper f29914c;

    public C4401Bj(Context context, InterfaceC5529vk interfaceC5529vk, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f29912a = context;
        this.f29913b = interfaceC5529vk;
        this.f29914c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f29912a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f29912a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final SQLiteOpenHelper getDbStorage() {
        return this.f29914c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f29912a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final TempCacheStorage getTempCacheStorage() {
        C5381pm c5381pm;
        C4966Z6 c4966z6M20064a = C4966Z6.m20064a(this.f29912a);
        synchronized (c4966z6M20064a) {
            try {
                if (c4966z6M20064a.f31176o == null) {
                    Context context = c4966z6M20064a.f31166e;
                    EnumC4837Tl enumC4837Tl = EnumC4837Tl.SERVICE;
                    if (c4966z6M20064a.f31175n == null) {
                        c4966z6M20064a.f31175n = new C5356om(new C5429rk(c4966z6M20064a.m20075h()), "temp_cache");
                    }
                    c4966z6M20064a.f31176o = new C5381pm(context, enumC4837Tl, c4966z6M20064a.f31175n);
                }
                c5381pm = c4966z6M20064a.f31176o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5381pm;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences legacyModulePreferences() {
        return new C5470tb(this.f29913b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C4541Hc(str, this.f29913b);
    }
}
