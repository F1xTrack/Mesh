package com.p019vk.push.core.remote.config.omicron;

import android.content.Context;
import android.content.SharedPreferences;
import com.p019vk.push.core.remote.config.omicron.executor.DefaultExecutorFactory;
import com.p019vk.push.core.remote.config.omicron.fingerprint.AppFingerprint;
import com.p019vk.push.core.remote.config.omicron.fingerprint.DeviceFingerprint;
import com.p019vk.push.core.remote.config.omicron.fingerprint.SessionFingerprint;
import com.p019vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.p019vk.push.core.remote.config.omicron.retriever.ResponseParserImpl;
import com.p019vk.push.core.remote.config.omicron.scheduler.WorkManagerScheduledExecutor;
import com.p019vk.push.core.remote.config.omicron.segment.SegmentsHolder;
import com.p019vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import com.p019vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import com.p019vk.push.core.remote.config.omicron.util.PackageInfoUtil;
import java.io.File;
import p000.AbstractC11862yx0;
import p000.AbstractC11989zx0;
import p000.C7360Ax0;
import p000.C7863Ko1;
import p000.C8450Vw0;

/* loaded from: classes2.dex */
public final class Omicron {

    /* renamed from: b */
    public static final Omicron f20502b = new Omicron();

    /* renamed from: a */
    public volatile AbstractC11989zx0 f20503a;

    public static Omicron getInstance() {
        return f20502b;
    }

    /* renamed from: a */
    public final synchronized Data m13751a() {
        Data data;
        try {
            if (this.f20503a == null) {
                throw new IllegalStateException("Trying to access data before method 'init' called");
            }
            data = this.f20503a.f47111b;
            if (data == null) {
                throw new IllegalStateException("init() must be called before any access to logic");
            }
        } catch (Throwable th) {
            throw th;
        }
        return data;
    }

    /* renamed from: b */
    public final synchronized Data m13752b() {
        AbstractC11989zx0 abstractC11989zx0;
        try {
            if (this.f20503a == null) {
                throw new IllegalStateException("Trying to access latest data before method 'init' called");
            }
            abstractC11989zx0 = this.f20503a;
            if (abstractC11989zx0.f47111b == null) {
                throw new IllegalStateException("init() must be called before any access to logic");
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Data) abstractC11989zx0.f47110a.get();
    }

    public void clearLogic() {
        SegmentsHolder.clearProvider();
        this.f20503a = null;
    }

    public boolean getBoolean(String str) {
        return m13751a().getBoolean(str);
    }

    public double getDouble(String str) {
        return m13751a().getDouble(str);
    }

    public float getFloat(String str) {
        return m13751a().getFloat(str);
    }

    public int getInt(String str) {
        return m13751a().getInt(str);
    }

    @Deprecated
    public boolean getLatestBoolean(String str) {
        return m13752b().getBoolean(str);
    }

    public Boolean getLatestBooleanOrNull(String str) {
        return m13752b().getBooleanOrNull(str);
    }

    @Deprecated
    public double getLatestDouble(String str) {
        return m13752b().getDouble(str);
    }

    public Double getLatestDoubleOrNull(String str) {
        return m13752b().getDoubleOrNull(str);
    }

    @Deprecated
    public float getLatestFloat(String str) {
        return m13752b().getFloat(str);
    }

    public Float getLatestFloatOrNull(String str) {
        return m13752b().getFloatOrNull(str);
    }

    @Deprecated
    public int getLatestInt(String str) {
        return m13752b().getInt(str);
    }

    public Integer getLatestIntOrNull(String str) {
        return m13752b().getIntOrNull(str);
    }

    @Deprecated
    public long getLatestLong(String str) {
        return m13752b().getLong(str);
    }

    public Long getLatestLongOrNull(String str) {
        return m13752b().getLongOrNull(str);
    }

    @Deprecated
    public String getLatestString(String str) {
        return m13752b().getString(str);
    }

    public String getLatestStringOrNull(String str) {
        return m13752b().getString(str);
    }

    public long getLong(String str) {
        return m13751a().getLong(str);
    }

    public String getString(String str) {
        return m13751a().getString(str);
    }

    public synchronized void init(Context context, OmicronConfig omicronConfig) {
        try {
            if (this.f20503a != null) {
                return;
            }
            SerializationDataStorage serializationDataStorage = new SerializationDataStorage(new File(context.getFilesDir(), "push_sdk_omicron"), omicronConfig.f20510f);
            NetworkDataRetriever networkDataRetriever = new NetworkDataRetriever(omicronConfig.f20517m, new ResponseParserImpl(omicronConfig.f20510f), omicronConfig.f20510f);
            SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = new SharedPreferencesUpdateTimetable(context.getSharedPreferences("push_sdk_omicron_".concat("timetable"), 0), omicronConfig.f20518n);
            DefaultExecutorFactory defaultExecutorFactory = new DefaultExecutorFactory();
            SharedPreferences sharedPreferences = context.getSharedPreferences("push_sdk_omicron_".concat("session_counter"), 0);
            int versionCode = PackageInfoUtil.getVersionCode(context);
            SessionCounter sessionCounter = new SessionCounter(sharedPreferences, versionCode);
            sharedPreferences.edit().putInt("current_count", (versionCode != sharedPreferences.getInt("last_version_code", -1) ? 0 : sharedPreferences.getInt("current_count", 0)) + 1).putInt("total_count", sharedPreferences.getInt("total_count", 0) + 1).putInt("last_version_code", versionCode).apply();
            omicronConfig.f20509e.add(new DeviceFingerprint(context, omicronConfig.f20510f));
            omicronConfig.f20509e.add(new AppFingerprint(context));
            omicronConfig.f20509e.add(new SessionFingerprint(sessionCounter));
            C7360Ax0 c7360Ax0 = new C7360Ax0(serializationDataStorage, networkDataRetriever, sharedPreferencesUpdateTimetable, omicronConfig.f20518n, defaultExecutorFactory, omicronConfig.f20514j == UpdateBehaviour.SCHEDULED ? new WorkManagerScheduledExecutor(C7863Ko1.m4736d(context)) : null);
            int i = AbstractC11862yx0.f46549a[omicronConfig.f20514j.ordinal()];
            this.f20503a = i != 1 ? i != 2 ? i != 3 ? new C2423b(c7360Ax0, omicronConfig) : new C2424c(c7360Ax0, omicronConfig) : new C2422a(c7360Ax0, omicronConfig) : new C2425d(c7360Ax0, omicronConfig);
            if (omicronConfig.f20516l) {
                this.f20503a.f47114e.f484a.clearData();
                AbstractC11989zx0 abstractC11989zx0 = this.f20503a;
                abstractC11989zx0.f47114e.f486c.setNeedUpdate(abstractC11989zx0.f47113d);
            }
            AbstractC11989zx0 abstractC11989zx02 = this.f20503a;
            Data dataMo13753c = abstractC11989zx02.mo13753c();
            abstractC11989zx02.f47111b = dataMo13753c;
            abstractC11989zx02.f47110a.set(dataMo13753c);
            SegmentsHolder.registerProvider(new C8450Vw0(1, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void needUpdateCache() {
        if (this.f20503a == null) {
            throw new IllegalStateException("Should be called after 'init' method");
        }
        AbstractC11989zx0 abstractC11989zx0 = this.f20503a;
        abstractC11989zx0.f47114e.f486c.setNeedUpdate(abstractC11989zx0.f47113d);
        AbstractC11989zx0 abstractC11989zx02 = this.f20503a;
        Data dataMo13753c = abstractC11989zx02.mo13753c();
        abstractC11989zx02.f47111b = dataMo13753c;
        abstractC11989zx02.f47110a.set(dataMo13753c);
    }

    public synchronized void reInit() {
        if (this.f20503a == null) {
            throw new IllegalStateException("Should be called after 'init' method");
        }
        AbstractC11989zx0 abstractC11989zx0 = this.f20503a;
        Data dataMo13753c = abstractC11989zx0.mo13753c();
        abstractC11989zx0.f47111b = dataMo13753c;
        abstractC11989zx0.f47110a.set(dataMo13753c);
    }

    public boolean getBoolean(String str, boolean z) {
        return m13751a().getBoolean(str, z);
    }

    public double getDouble(String str, double d) {
        return m13751a().getDouble(str, d);
    }

    public float getFloat(String str, float f) {
        return m13751a().getFloat(str, f);
    }

    public int getInt(String str, int i) {
        return m13751a().getInt(str, i);
    }

    public boolean getLatestBoolean(String str, boolean z) {
        return m13752b().getBoolean(str, z);
    }

    public double getLatestDouble(String str, double d) {
        return m13752b().getDouble(str, d);
    }

    public float getLatestFloat(String str, float f) {
        return m13752b().getFloat(str, f);
    }

    public int getLatestInt(String str, int i) {
        return m13752b().getInt(str, i);
    }

    public long getLatestLong(String str, long j) {
        return m13752b().getLong(str, j);
    }

    public String getLatestString(String str, String str2) {
        return m13752b().getString(str, str2);
    }

    public long getLong(String str, long j) {
        return m13751a().getLong(str, j);
    }

    public String getString(String str, String str2) {
        return m13751a().getString(str, str2);
    }
}
