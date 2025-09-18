package com.yandex.varioqub.config;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.config.impl.C3857A;
import com.yandex.varioqub.config.impl.C3858B;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import p000.AbstractC0705LB;
import p000.InterfaceC6434mZ;

@Metadata(m22266d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u000b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u0019\u001a\u00020\u000b2\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0019\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0007¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\u0017H\u0007¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020+H\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0017H\u0007¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0017H\u0007¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000bH\u0007¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020\u001705H\u0007¢\u0006\u0004\b6\u00107¨\u00068"}, m22267d2 = {"Lcom/yandex/varioqub/config/Varioqub;", "", "Lcom/yandex/varioqub/config/VarioqubApi;", "getInstance", "()Lcom/yandex/varioqub/config/VarioqubApi;", "Lcom/yandex/varioqub/config/VarioqubSettings;", "settings", "Lcom/yandex/varioqub/analyticadapter/VarioqubConfigAdapter;", "adapter", "Landroid/content/Context;", "context", "LTf1;", "init", "(Lcom/yandex/varioqub/config/VarioqubSettings;Lcom/yandex/varioqub/analyticadapter/VarioqubConfigAdapter;Landroid/content/Context;)V", "Lcom/yandex/varioqub/config/OnFetchCompleteListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "fetchConfig", "(Lcom/yandex/varioqub/config/OnFetchCompleteListener;)V", "Lkotlin/Function0;", "onComplete", "activateConfig", "(LmZ;)V", "", "", "defaults", "setDefaults", "(Ljava/util/Map;)V", "", "resId", "(ILmZ;)V", "key", "Lcom/yandex/varioqub/config/model/ConfigValue;", "getValue", "(Ljava/lang/String;)Lcom/yandex/varioqub/config/model/ConfigValue;", "", "default", "getDouble", "(Ljava/lang/String;D)D", "", "getLong", "(Ljava/lang/String;J)J", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getBoolean", "(Ljava/lang/String;Z)Z", "getId", "()Ljava/lang/String;", "value", "putClientFeature", "(Ljava/lang/String;Ljava/lang/String;)V", "clearClientFeatures", "()V", "", "getAllKeys", "()Ljava/util/Set;", "config_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class Varioqub {
    public static final Varioqub INSTANCE = new Varioqub();

    /* renamed from: a */
    private static final Lazy f25568a = AbstractC0705LB.m4915b(C3857A.f25582a);

    private Varioqub() {
    }

    public static final void activateConfig(InterfaceC6434mZ onComplete) {
        getInstance().activateConfig(onComplete);
    }

    public static /* synthetic */ void activateConfig$default(InterfaceC6434mZ interfaceC6434mZ, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6434mZ = null;
        }
        activateConfig(interfaceC6434mZ);
    }

    public static final void clearClientFeatures() {
        getInstance().clearClientFeatures();
    }

    public static final void fetchConfig(OnFetchCompleteListener listener) {
        getInstance().fetchConfig(listener);
    }

    public static final Set<String> getAllKeys() {
        return getInstance().getAllKeys();
    }

    public static final boolean getBoolean(String key, boolean z) {
        return getInstance().getBoolean(key, z);
    }

    public static /* synthetic */ boolean getBoolean$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getBoolean(str, z);
    }

    public static final double getDouble(String key, double d) {
        return getInstance().getDouble(key, d);
    }

    public static /* synthetic */ double getDouble$default(String str, double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        return getDouble(str, d);
    }

    public static final String getId() {
        return getInstance().getId();
    }

    public static final VarioqubApi getInstance() {
        INSTANCE.getClass();
        return (C3858B) f25568a.getValue();
    }

    public static final long getLong(String key, long j) {
        return getInstance().getLong(key, j);
    }

    public static /* synthetic */ long getLong$default(String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return getLong(str, j);
    }

    public static final String getString(String key, String str) {
        return getInstance().getString(key, str);
    }

    public static /* synthetic */ String getString$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return getString(str, str2);
    }

    public static final ConfigValue getValue(String key) {
        return getInstance().getValue(key);
    }

    public static final void init(VarioqubSettings settings, VarioqubConfigAdapter adapter, Context context) {
        getInstance().init(settings, adapter, context);
    }

    public static final void putClientFeature(String key, String value) {
        getInstance().putClientFeature(key, value);
    }

    public static final void setDefaults(Map<String, ? extends Object> defaults) {
        getInstance().setDefaults(defaults);
    }

    public static /* synthetic */ void setDefaults$default(int i, InterfaceC6434mZ interfaceC6434mZ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC6434mZ = null;
        }
        setDefaults(i, interfaceC6434mZ);
    }

    public static final void setDefaults(int resId, InterfaceC6434mZ onComplete) {
        getInstance().setDefaults(resId, onComplete);
    }
}
