package com.vk.push.core.filedatastore;

import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0011\u0010\u0003\u001a\u00028\u0000*\u00020\u0004H&¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/vk/push/core/filedatastore/JsonDeserializer;", "T", "", "fromJson", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface JsonDeserializer<T> {
    T fromJson(JSONObject jSONObject);
}
