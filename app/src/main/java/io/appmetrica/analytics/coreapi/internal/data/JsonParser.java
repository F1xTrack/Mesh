package io.appmetrica.analytics.coreapi.internal.data;

import io.appmetrica.analytics.coreapi.internal.data.Parser;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003¨\u0006\u0005"}, m22267d2 = {"Lio/appmetrica/analytics/coreapi/internal/data/JsonParser;", "T", "", "Lio/appmetrica/analytics/coreapi/internal/data/Parser;", "Lorg/json/JSONObject;", "core-api_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface JsonParser<T> extends Parser<JSONObject, T> {

    @Metadata(m22268k = 3, m22269mv = {1, 6, 0}, m22271xi = 48)
    public static final class DefaultImpls {
        public static <T> T parseOrNull(JsonParser<? extends T> jsonParser, JSONObject jSONObject) {
            return (T) Parser.DefaultImpls.parseOrNull(jsonParser, jSONObject);
        }
    }
}
