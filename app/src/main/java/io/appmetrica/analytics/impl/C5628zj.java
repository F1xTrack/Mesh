package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.zj */
/* loaded from: classes2.dex */
public final class C5628zj implements ModuleRemoteConfig {

    /* renamed from: a */
    public final SdkIdentifiers f32935a;

    /* renamed from: b */
    public final RemoteConfigMetaInfo f32936b;

    /* renamed from: c */
    public final Object f32937c;

    public C5628zj(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f32935a = sdkIdentifiers;
        this.f32936b = remoteConfigMetaInfo;
        this.f32937c = obj;
    }

    /* renamed from: a */
    public final C5628zj m21244a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C5628zj(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    /* renamed from: b */
    public final RemoteConfigMetaInfo m21245b() {
        return this.f32936b;
    }

    /* renamed from: c */
    public final Object m21246c() {
        return this.f32937c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5628zj)) {
            return false;
        }
        C5628zj c5628zj = (C5628zj) obj;
        return O90.m5963a(this.f32935a, c5628zj.f32935a) && O90.m5963a(this.f32936b, c5628zj.f32936b) && O90.m5963a(this.f32937c, c5628zj.f32937c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f32937c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f32935a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f32936b;
    }

    public final int hashCode() {
        int iHashCode = (this.f32936b.hashCode() + (this.f32935a.hashCode() * 31)) * 31;
        Object obj = this.f32937c;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f32935a + ", remoteConfigMetaInfo=" + this.f32936b + ", featuresConfig=" + this.f32937c + ')';
    }

    /* renamed from: a */
    public final SdkIdentifiers m21243a() {
        return this.f32935a;
    }

    /* renamed from: a */
    public static C5628zj m21242a(C5628zj c5628zj, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            sdkIdentifiers = c5628zj.f32935a;
        }
        if ((i & 2) != 0) {
            remoteConfigMetaInfo = c5628zj.f32936b;
        }
        if ((i & 4) != 0) {
            obj = c5628zj.f32937c;
        }
        c5628zj.getClass();
        return new C5628zj(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
