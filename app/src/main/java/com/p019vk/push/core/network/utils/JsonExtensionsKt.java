package com.p019vk.push.core.network.utils;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC7433Ch1;
import p000.InterfaceC6497nZ;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m22267d2 = {"", "T", "Lorg/json/JSONArray;", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "transform", "", "map", "(Lorg/json/JSONArray;LnZ;)Ljava/util/List;", "core-network_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class JsonExtensionsKt {
    public static final <T> List<T> map(JSONArray jSONArray, InterfaceC6497nZ interfaceC6497nZ) throws JSONException {
        O90.m5968f(jSONArray, "<this>");
        O90.m5968f(interfaceC6497nZ, "transform");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            O90.m5967e(jSONObject, "jsonItemObject");
            arrayList.add(interfaceC6497nZ.invoke(jSONObject));
        }
        return AbstractC7433Ch1.m1296y(arrayList);
    }
}
