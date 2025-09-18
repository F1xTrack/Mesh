package com.vk.push.core.network.utils;

import defpackage.AbstractC0199Ch1;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"", "T", "Lorg/json/JSONArray;", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "transform", "", "map", "(Lorg/json/JSONArray;LnZ;)Ljava/util/List;", "core-network_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class JsonExtensionsKt {
    public static final <T> List<T> map(JSONArray jSONArray, InterfaceC6099nZ interfaceC6099nZ) throws JSONException {
        O90.f(jSONArray, "<this>");
        O90.f(interfaceC6099nZ, "transform");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            O90.e(jSONObject, "jsonItemObject");
            arrayList.add(interfaceC6099nZ.invoke(jSONObject));
        }
        return AbstractC0199Ch1.y(arrayList);
    }
}
