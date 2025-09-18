package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Ic */
/* loaded from: classes2.dex */
public final class C4565Ic implements JsonParser, Converter {

    /* renamed from: a */
    public final RemoteConfigExtensionConfiguration f30280a;

    /* renamed from: b */
    public final /* synthetic */ JsonParser f30281b;

    /* renamed from: c */
    public final /* synthetic */ Converter f30282c;

    public C4565Ic(RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f30280a = remoteConfigExtensionConfiguration;
        this.f30281b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f30282c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    /* renamed from: a */
    public final byte[] m19502a(Object obj) {
        return (byte[]) this.f30282c.fromModel(obj);
    }

    /* renamed from: b */
    public final Object m19503b(JSONObject jSONObject) {
        return this.f30281b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f30282c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f30281b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f30281b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f30282c.toModel((byte[]) obj);
    }

    /* renamed from: a */
    public final Object m19500a(JSONObject jSONObject) {
        return this.f30281b.parse(jSONObject);
    }

    /* renamed from: a */
    public final Object m19501a(byte[] bArr) {
        return this.f30282c.toModel(bArr);
    }

    /* renamed from: a */
    public final RemoteConfigExtensionConfiguration<Object> m19499a() {
        return this.f30280a;
    }
}
