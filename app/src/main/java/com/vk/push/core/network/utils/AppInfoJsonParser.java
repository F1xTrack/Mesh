package com.vk.push.core.network.utils;

import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.push.core.network.data.model.AppInfoRemote;
import defpackage.AbstractC0199Ch1;
import defpackage.O90;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/vk/push/core/network/utils/AppInfoJsonParser;", "", "", "jsonData", "Lcom/vk/push/core/network/data/model/AppInfoRemote;", "parseAppInfo", "(Ljava/lang/String;)Lcom/vk/push/core/network/data/model/AppInfoRemote;", "Lorg/json/JSONObject;", "jsonObject", "(Lorg/json/JSONObject;)Lcom/vk/push/core/network/data/model/AppInfoRemote;", "", "parseAppInfoList", "(Ljava/lang/String;)Ljava/util/List;", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppInfoJsonParser {
    public static final AppInfoJsonParser INSTANCE = new AppInfoJsonParser();

    public final AppInfoRemote parseAppInfo(String jsonData) throws JSONException {
        O90.f(jsonData, "jsonData");
        return parseAppInfo(new JSONObject(jsonData));
    }

    public final List<AppInfoRemote> parseAppInfoList(String jsonData) throws JSONException {
        O90.f(jsonData, "jsonData");
        JSONArray jSONArray = new JSONObject(jsonData).getJSONArray("hosts");
        O90.e(jSONArray, "jsonObject.getJSONArray(\"hosts\")");
        AppInfoJsonParser appInfoJsonParser = INSTANCE;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            O90.e(jSONObject, "jsonItemObject");
            arrayList.add(appInfoJsonParser.parseAppInfo(jSONObject));
        }
        return AbstractC0199Ch1.y(arrayList);
    }

    public final AppInfoRemote parseAppInfo(JSONObject jsonObject) throws JSONException {
        O90.f(jsonObject, "jsonObject");
        String string = jsonObject.getString(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME);
        String string2 = jsonObject.getString("pub_key");
        boolean zOptBoolean = jsonObject.optBoolean("is_arbiter");
        O90.e(string, "packageName");
        O90.e(string2, "pubKey");
        return new AppInfoRemote(string, string2, zOptBoolean);
    }
}
