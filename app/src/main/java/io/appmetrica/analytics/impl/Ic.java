package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ic implements JsonParser, Converter {
    public final RemoteConfigExtensionConfiguration a;
    public final /* synthetic */ JsonParser b;
    public final /* synthetic */ Converter c;

    public Ic(RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.a = remoteConfigExtensionConfiguration;
        this.b = remoteConfigExtensionConfiguration.getJsonParser();
        this.c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    public final byte[] a(Object obj) {
        return (byte[]) this.c.fromModel(obj);
    }

    public final Object b(JSONObject jSONObject) {
        return this.b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.c.toModel((byte[]) obj);
    }

    public final Object a(JSONObject jSONObject) {
        return this.b.parse(jSONObject);
    }

    public final Object a(byte[] bArr) {
        return this.c.toModel(bArr);
    }

    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.a;
    }
}
