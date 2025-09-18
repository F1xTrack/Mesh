package io.appmetrica.analytics.impl;

import defpackage.O90;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* renamed from: io.appmetrica.analytics.impl.zj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5035zj implements ModuleRemoteConfig {
    public final SdkIdentifiers a;
    public final RemoteConfigMetaInfo b;
    public final Object c;

    public C5035zj(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.a = sdkIdentifiers;
        this.b = remoteConfigMetaInfo;
        this.c = obj;
    }

    public final C5035zj a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C5035zj(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final RemoteConfigMetaInfo b() {
        return this.b;
    }

    public final Object c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5035zj)) {
            return false;
        }
        C5035zj c5035zj = (C5035zj) obj;
        return O90.a(this.a, c5035zj.a) && O90.a(this.b, c5035zj.b) && O90.a(this.c, c5035zj.c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Object obj = this.c;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.a + ", remoteConfigMetaInfo=" + this.b + ", featuresConfig=" + this.c + ')';
    }

    public final SdkIdentifiers a() {
        return this.a;
    }

    public static C5035zj a(C5035zj c5035zj, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            sdkIdentifiers = c5035zj.a;
        }
        if ((i & 2) != 0) {
            remoteConfigMetaInfo = c5035zj.b;
        }
        if ((i & 4) != 0) {
            obj = c5035zj.c;
        }
        c5035zj.getClass();
        return new C5035zj(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
