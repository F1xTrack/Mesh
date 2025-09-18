package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import java.io.File;

/* loaded from: classes2.dex */
public final class Bj implements ServiceStorageProvider {
    public final Context a;
    public final InterfaceC4940vk b;
    public final SQLiteOpenHelper c;

    public Bj(Context context, InterfaceC4940vk interfaceC4940vk, SQLiteOpenHelper sQLiteOpenHelper) {
        this.a = context;
        this.b = interfaceC4940vk;
        this.c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final SQLiteOpenHelper getDbStorage() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final TempCacheStorage getTempCacheStorage() {
        C4799pm c4799pm;
        Z6 z6A = Z6.a(this.a);
        synchronized (z6A) {
            try {
                if (z6A.o == null) {
                    Context context = z6A.e;
                    Tl tl = Tl.SERVICE;
                    if (z6A.n == null) {
                        z6A.n = new C4775om(new C4844rk(z6A.h()), "temp_cache");
                    }
                    z6A.o = new C4799pm(context, tl, z6A.n);
                }
                c4799pm = z6A.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4799pm;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences legacyModulePreferences() {
        return new C4883tb(this.b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new Hc(str, this.b);
    }
}
