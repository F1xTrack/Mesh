package com.vk.push.core.remote.config.omicron;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.push.core.remote.config.omicron.executor.DefaultExecutorFactory;
import com.vk.push.core.remote.config.omicron.fingerprint.AppFingerprint;
import com.vk.push.core.remote.config.omicron.fingerprint.DeviceFingerprint;
import com.vk.push.core.remote.config.omicron.fingerprint.SessionFingerprint;
import com.vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.vk.push.core.remote.config.omicron.retriever.ResponseParserImpl;
import com.vk.push.core.remote.config.omicron.scheduler.WorkManagerScheduledExecutor;
import com.vk.push.core.remote.config.omicron.segment.SegmentsHolder;
import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import com.vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import com.vk.push.core.remote.config.omicron.util.PackageInfoUtil;
import defpackage.AbstractC8269yx0;
import defpackage.AbstractC8459zx0;
import defpackage.C0090Ax0;
import defpackage.C0844Ko1;
import defpackage.C1724Vw0;
import java.io.File;

/* loaded from: classes2.dex */
public final class Omicron {
    public static final Omicron b = new Omicron();
    public volatile AbstractC8459zx0 a;

    public static Omicron getInstance() {
        return b;
    }

    public final synchronized Data a() {
        Data data;
        try {
            if (this.a == null) {
                throw new IllegalStateException("Trying to access data before method 'init' called");
            }
            data = this.a.b;
            if (data == null) {
                throw new IllegalStateException("init() must be called before any access to logic");
            }
        } catch (Throwable th) {
            throw th;
        }
        return data;
    }

    public final synchronized Data b() {
        AbstractC8459zx0 abstractC8459zx0;
        try {
            if (this.a == null) {
                throw new IllegalStateException("Trying to access latest data before method 'init' called");
            }
            abstractC8459zx0 = this.a;
            if (abstractC8459zx0.b == null) {
                throw new IllegalStateException("init() must be called before any access to logic");
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Data) abstractC8459zx0.a.get();
    }

    public void clearLogic() {
        SegmentsHolder.clearProvider();
        this.a = null;
    }

    public boolean getBoolean(String str) {
        return a().getBoolean(str);
    }

    public double getDouble(String str) {
        return a().getDouble(str);
    }

    public float getFloat(String str) {
        return a().getFloat(str);
    }

    public int getInt(String str) {
        return a().getInt(str);
    }

    @Deprecated
    public boolean getLatestBoolean(String str) {
        return b().getBoolean(str);
    }

    public Boolean getLatestBooleanOrNull(String str) {
        return b().getBooleanOrNull(str);
    }

    @Deprecated
    public double getLatestDouble(String str) {
        return b().getDouble(str);
    }

    public Double getLatestDoubleOrNull(String str) {
        return b().getDoubleOrNull(str);
    }

    @Deprecated
    public float getLatestFloat(String str) {
        return b().getFloat(str);
    }

    public Float getLatestFloatOrNull(String str) {
        return b().getFloatOrNull(str);
    }

    @Deprecated
    public int getLatestInt(String str) {
        return b().getInt(str);
    }

    public Integer getLatestIntOrNull(String str) {
        return b().getIntOrNull(str);
    }

    @Deprecated
    public long getLatestLong(String str) {
        return b().getLong(str);
    }

    public Long getLatestLongOrNull(String str) {
        return b().getLongOrNull(str);
    }

    @Deprecated
    public String getLatestString(String str) {
        return b().getString(str);
    }

    public String getLatestStringOrNull(String str) {
        return b().getString(str);
    }

    public long getLong(String str) {
        return a().getLong(str);
    }

    public String getString(String str) {
        return a().getString(str);
    }

    public synchronized void init(Context context, OmicronConfig omicronConfig) {
        try {
            if (this.a != null) {
                return;
            }
            SerializationDataStorage serializationDataStorage = new SerializationDataStorage(new File(context.getFilesDir(), "push_sdk_omicron"), omicronConfig.f);
            NetworkDataRetriever networkDataRetriever = new NetworkDataRetriever(omicronConfig.m, new ResponseParserImpl(omicronConfig.f), omicronConfig.f);
            SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = new SharedPreferencesUpdateTimetable(context.getSharedPreferences("push_sdk_omicron_".concat("timetable"), 0), omicronConfig.n);
            DefaultExecutorFactory defaultExecutorFactory = new DefaultExecutorFactory();
            SharedPreferences sharedPreferences = context.getSharedPreferences("push_sdk_omicron_".concat("session_counter"), 0);
            int versionCode = PackageInfoUtil.getVersionCode(context);
            SessionCounter sessionCounter = new SessionCounter(sharedPreferences, versionCode);
            sharedPreferences.edit().putInt("current_count", (versionCode != sharedPreferences.getInt("last_version_code", -1) ? 0 : sharedPreferences.getInt("current_count", 0)) + 1).putInt("total_count", sharedPreferences.getInt("total_count", 0) + 1).putInt("last_version_code", versionCode).apply();
            omicronConfig.e.add(new DeviceFingerprint(context, omicronConfig.f));
            omicronConfig.e.add(new AppFingerprint(context));
            omicronConfig.e.add(new SessionFingerprint(sessionCounter));
            C0090Ax0 c0090Ax0 = new C0090Ax0(serializationDataStorage, networkDataRetriever, sharedPreferencesUpdateTimetable, omicronConfig.n, defaultExecutorFactory, omicronConfig.j == UpdateBehaviour.SCHEDULED ? new WorkManagerScheduledExecutor(C0844Ko1.d(context)) : null);
            int i = AbstractC8269yx0.a[omicronConfig.j.ordinal()];
            this.a = i != 1 ? i != 2 ? i != 3 ? new b(c0090Ax0, omicronConfig) : new c(c0090Ax0, omicronConfig) : new a(c0090Ax0, omicronConfig) : new d(c0090Ax0, omicronConfig);
            if (omicronConfig.l) {
                this.a.e.a.clearData();
                AbstractC8459zx0 abstractC8459zx0 = this.a;
                abstractC8459zx0.e.c.setNeedUpdate(abstractC8459zx0.d);
            }
            AbstractC8459zx0 abstractC8459zx02 = this.a;
            Data dataC = abstractC8459zx02.c();
            abstractC8459zx02.b = dataC;
            abstractC8459zx02.a.set(dataC);
            SegmentsHolder.registerProvider(new C1724Vw0(1, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void needUpdateCache() {
        if (this.a == null) {
            throw new IllegalStateException("Should be called after 'init' method");
        }
        AbstractC8459zx0 abstractC8459zx0 = this.a;
        abstractC8459zx0.e.c.setNeedUpdate(abstractC8459zx0.d);
        AbstractC8459zx0 abstractC8459zx02 = this.a;
        Data dataC = abstractC8459zx02.c();
        abstractC8459zx02.b = dataC;
        abstractC8459zx02.a.set(dataC);
    }

    public synchronized void reInit() {
        if (this.a == null) {
            throw new IllegalStateException("Should be called after 'init' method");
        }
        AbstractC8459zx0 abstractC8459zx0 = this.a;
        Data dataC = abstractC8459zx0.c();
        abstractC8459zx0.b = dataC;
        abstractC8459zx0.a.set(dataC);
    }

    public boolean getBoolean(String str, boolean z) {
        return a().getBoolean(str, z);
    }

    public double getDouble(String str, double d) {
        return a().getDouble(str, d);
    }

    public float getFloat(String str, float f) {
        return a().getFloat(str, f);
    }

    public int getInt(String str, int i) {
        return a().getInt(str, i);
    }

    public boolean getLatestBoolean(String str, boolean z) {
        return b().getBoolean(str, z);
    }

    public double getLatestDouble(String str, double d) {
        return b().getDouble(str, d);
    }

    public float getLatestFloat(String str, float f) {
        return b().getFloat(str, f);
    }

    public int getLatestInt(String str, int i) {
        return b().getInt(str, i);
    }

    public long getLatestLong(String str, long j) {
        return b().getLong(str, j);
    }

    public String getLatestString(String str, String str2) {
        return b().getString(str, str2);
    }

    public long getLong(String str, long j) {
        return a().getLong(str, j);
    }

    public String getString(String str, String str2) {
        return a().getString(str, str2);
    }
}
