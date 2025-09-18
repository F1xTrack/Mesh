package io.appmetrica.analytics.remotepermissions.internal;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.remotepermissions.impl.C5689a;
import io.appmetrica.analytics.remotepermissions.impl.C5690b;
import io.appmetrica.analytics.remotepermissions.impl.C5692d;
import io.appmetrica.analytics.remotepermissions.impl.C5693e;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC11205tn0;
import p000.C0779MN;
import p000.C1156SN;

@Metadata(m22266d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m22267d2 = {"Lio/appmetrica/analytics/remotepermissions/internal/RemotePermissionsModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/remotepermissions/impl/a;", "Lio/appmetrica/analytics/modulesapi/internal/common/AskForPermissionStrategyModuleProvider;", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigUpdateListener;", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "config", "LTf1;", "onRemoteConfigUpdated", "(Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "initialConfig", "initServiceSide", "(Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "", "e", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/coreapi/internal/permission/PermissionStrategy;", "getAskForPermissionStrategy", "()Lio/appmetrica/analytics/coreapi/internal/permission/PermissionStrategy;", "askForPermissionStrategy", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "f", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "remote-permissions_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class RemotePermissionsModuleEntryPoint extends ModuleServiceEntryPoint<C5689a> implements AskForPermissionStrategyModuleProvider, RemoteConfigUpdateListener<C5689a> {

    /* renamed from: a */
    private final C5692d f33193a = new C5692d();

    /* renamed from: b */
    private final C5690b f33194b = new C5690b();

    /* renamed from: c */
    private final RemotePermissionsModuleEntryPoint f33195c = this;

    /* renamed from: d */
    private final C5693e f33196d = new C5693e();

    /* renamed from: e, reason: from kotlin metadata */
    private final String identifier = "rp";

    /* renamed from: f */
    private final C5695xf567e408 f33198f = new RemoteConfigExtensionConfiguration<C5689a>() { // from class: io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return AbstractC11205tn0.m24984c(new Pair("permissions", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return C0779MN.f7117a;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<C5689a> getJsonParser() {
            return this.f33199a.f33193a;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<C5689a, byte[]> getProtobufConverter() {
            return this.f33199a.f33194b;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public RemoteConfigUpdateListener<C5689a> getRemoteConfigUpdateListener() {
            return this.f33199a.f33195c;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public PermissionStrategy getAskForPermissionStrategy() {
        return this.f33196d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<C5689a> getRemoteConfigExtensionConfiguration() {
        return this.f33198f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<C5689a> initialConfig) {
        Set set;
        C5693e c5693e = this.f33196d;
        C5689a featuresConfig = initialConfig.getFeaturesConfig();
        if (featuresConfig == null || (set = featuresConfig.f33184a) == null) {
            set = C1156SN.f10705a;
        }
        synchronized (c5693e) {
            c5693e.f33190a = set;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public void onRemoteConfigUpdated(ModuleRemoteConfig<C5689a> config) {
        Set set;
        C5693e c5693e = this.f33196d;
        C5689a featuresConfig = config.getFeaturesConfig();
        if (featuresConfig == null || (set = featuresConfig.f33184a) == null) {
            set = C1156SN.f10705a;
        }
        synchronized (c5693e) {
            c5693e.f33190a = set;
        }
    }
}
