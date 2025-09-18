package ru.ok.tracer.utils.config;

import defpackage.C2391bn0;
import defpackage.InterfaceC5908mZ;
import defpackage.O90;
import kotlin.Metadata;
import ru.ok.tracer.TracerFeature;
import ru.ok.tracer.utils.SimpleFileKeyValueStorage;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0003JE\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ok/tracer/utils/config/ConfigStorage;", "", "<init>", "()V", "Lkotlin/Function0;", "Ljava/io/File;", "fileProvider", "LTf1;", "init$tracer_commons_release", "(LmZ;)V", "init", "Lru/ok/tracer/TracerFeature;", "who", "", "tag", "", "isLimited", "(Lru/ok/tracer/TracerFeature;Ljava/lang/String;)Z", "save", "featureName", "", "globalShutdownMs", "featureShutdownMs", "tagShutdownMs", "setLimits", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "Lru/ok/tracer/utils/SimpleFileKeyValueStorage;", "_settingsStorage", "Lru/ok/tracer/utils/SimpleFileKeyValueStorage;", "getSettingsStorage", "()Lru/ok/tracer/utils/SimpleFileKeyValueStorage;", "settingsStorage", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConfigStorage {
    public static final ConfigStorage INSTANCE = new ConfigStorage();
    private static volatile SimpleFileKeyValueStorage _settingsStorage;

    private ConfigStorage() {
    }

    private final SimpleFileKeyValueStorage getSettingsStorage() {
        SimpleFileKeyValueStorage simpleFileKeyValueStorage = _settingsStorage;
        if (simpleFileKeyValueStorage != null) {
            return simpleFileKeyValueStorage;
        }
        throw new IllegalStateException("Tracer settings are not initialized.");
    }

    public static /* synthetic */ boolean isLimited$default(ConfigStorage configStorage, TracerFeature tracerFeature, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return configStorage.isLimited(tracerFeature, str);
    }

    public final void init$tracer_commons_release(InterfaceC5908mZ fileProvider) {
        O90.f(fileProvider, "fileProvider");
        _settingsStorage = new SimpleFileKeyValueStorage(fileProvider);
    }

    public final boolean isLimited(TracerFeature who, String tag) {
        O90.f(who, "who");
        SimpleFileKeyValueStorage settingsStorage = getSettingsStorage();
        if (ConfigStorageKt.isShutdown(settingsStorage, "system.shutdown.until.ts")) {
            return true;
        }
        if (ConfigStorageKt.isShutdown(settingsStorage, "system." + who.getName() + ".shutdown.until.ts")) {
            return true;
        }
        if (tag != null) {
            if (ConfigStorageKt.isShutdown(settingsStorage, "system." + who.getName() + '.' + tag + ".shutdown.until.ts")) {
                return true;
            }
        }
        return false;
    }

    public final void save() {
        getSettingsStorage().save();
    }

    public final void setLimits(String featureName, String tag, Long globalShutdownMs, Long featureShutdownMs, Long tagShutdownMs) {
        O90.f(featureName, "featureName");
        C2391bn0 c2391bn0 = new C2391bn0();
        ConfigStorageKt.putShutdownMs(c2391bn0, "system.shutdown.until.ts", globalShutdownMs);
        ConfigStorageKt.putShutdownMs(c2391bn0, "system." + featureName + ".shutdown.until.ts", featureShutdownMs);
        if (tag != null) {
            ConfigStorageKt.putShutdownMs(c2391bn0, "system." + featureName + '.' + tag + ".shutdown.until.ts", tagShutdownMs);
        }
        getSettingsStorage().putAll(c2391bn0.b());
    }
}
