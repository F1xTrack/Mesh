package com.yandex.varioqub.config;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import p000.InterfaceC6434mZ;

@Metadata(m22266d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\u00182\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fH&¢\u0006\u0004\b\u0016\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u0014H&¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020#H&¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020\u0014H&¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0014H&¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0014H&¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\bH&¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020\u001402H&¢\u0006\u0004\b3\u00104¨\u00065"}, m22267d2 = {"Lcom/yandex/varioqub/config/VarioqubApi;", "", "Lcom/yandex/varioqub/config/VarioqubSettings;", "settings", "Lcom/yandex/varioqub/analyticadapter/VarioqubConfigAdapter;", "adapter", "Landroid/content/Context;", "context", "LTf1;", "init", "(Lcom/yandex/varioqub/config/VarioqubSettings;Lcom/yandex/varioqub/analyticadapter/VarioqubConfigAdapter;Landroid/content/Context;)V", "Lcom/yandex/varioqub/config/OnFetchCompleteListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "fetchConfig", "(Lcom/yandex/varioqub/config/OnFetchCompleteListener;)V", "Lkotlin/Function0;", "onComplete", "activateConfig", "(LmZ;)V", "", "", "defaults", "setDefaults", "(Ljava/util/Map;)V", "", "resId", "(ILmZ;)V", "key", "Lcom/yandex/varioqub/config/model/ConfigValue;", "getValue", "(Ljava/lang/String;)Lcom/yandex/varioqub/config/model/ConfigValue;", "", "default", "getDouble", "(Ljava/lang/String;D)D", "", "getLong", "(Ljava/lang/String;J)J", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getBoolean", "(Ljava/lang/String;Z)Z", "getId", "()Ljava/lang/String;", "value", "putClientFeature", "(Ljava/lang/String;Ljava/lang/String;)V", "clearClientFeatures", "()V", "", "getAllKeys", "()Ljava/util/Set;", "config_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface VarioqubApi {

    @Metadata(m22268k = 3, m22269mv = {1, 6, 0}, m22271xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void activateConfig$default(VarioqubApi varioqubApi, InterfaceC6434mZ interfaceC6434mZ, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activateConfig");
            }
            if ((i & 1) != 0) {
                interfaceC6434mZ = null;
            }
            varioqubApi.activateConfig(interfaceC6434mZ);
        }

        public static /* synthetic */ boolean getBoolean$default(VarioqubApi varioqubApi, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return varioqubApi.getBoolean(str, z);
        }

        public static /* synthetic */ double getDouble$default(VarioqubApi varioqubApi, String str, double d, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDouble");
            }
            if ((i & 2) != 0) {
                d = ConfigValue.DOUBLE_DEFAULT_VALUE;
            }
            return varioqubApi.getDouble(str, d);
        }

        public static /* synthetic */ long getLong$default(VarioqubApi varioqubApi, String str, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i & 2) != 0) {
                j = 0;
            }
            return varioqubApi.getLong(str, j);
        }

        public static /* synthetic */ String getString$default(VarioqubApi varioqubApi, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return varioqubApi.getString(str, str2);
        }

        public static /* synthetic */ void setDefaults$default(VarioqubApi varioqubApi, int i, InterfaceC6434mZ interfaceC6434mZ, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDefaults");
            }
            if ((i2 & 2) != 0) {
                interfaceC6434mZ = null;
            }
            varioqubApi.setDefaults(i, interfaceC6434mZ);
        }
    }

    void activateConfig(InterfaceC6434mZ onComplete);

    void clearClientFeatures();

    void fetchConfig(OnFetchCompleteListener listener);

    Set<String> getAllKeys();

    boolean getBoolean(String key, boolean z);

    double getDouble(String key, double d);

    String getId();

    long getLong(String key, long j);

    String getString(String key, String str);

    ConfigValue getValue(String key);

    void init(VarioqubSettings settings, VarioqubConfigAdapter adapter, Context context);

    void putClientFeature(String key, String value);

    void setDefaults(int resId, InterfaceC6434mZ onComplete);

    void setDefaults(Map<String, ? extends Object> defaults);
}
