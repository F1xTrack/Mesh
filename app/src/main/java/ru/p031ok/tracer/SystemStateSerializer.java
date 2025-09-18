package ru.p031ok.tracer;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11433vZ0;
import p000.C10665pZ0;
import p000.C1156SN;
import p000.O90;
import ru.p031ok.tracer.base.sessionuuuid.SessionUuidUtils;

@Metadata(m22266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004¨\u0006\u0013"}, m22267d2 = {"Lru/ok/tracer/SystemStateSerializer;", "", "()V", "fromJson", "Lru/ok/tracer/SystemState;", "jsonString", "", "librariesInfoFromJsonArray", "", "Lru/ok/tracer/HostedTracerLibraryInfo;", "librariesInfo", "Lorg/json/JSONArray;", "librariesInfoToJsonArray", "libraryInfoFromJsonObject", "libraryInfo", "Lorg/json/JSONObject;", "libraryInfoToJsonObject", "toJson", "systemState", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SystemStateSerializer {
    public static final SystemStateSerializer INSTANCE = new SystemStateSerializer();

    private SystemStateSerializer() {
    }

    private final Set<HostedTracerLibraryInfo> librariesInfoFromJsonArray(JSONArray librariesInfo) throws JSONException {
        if (librariesInfo == null || librariesInfo.length() == 0) {
            return C1156SN.f10705a;
        }
        C10665pZ0 c10665pZ0 = new C10665pZ0();
        int length = librariesInfo.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = librariesInfo.getJSONObject(i);
            SystemStateSerializer systemStateSerializer = INSTANCE;
            O90.m5967e(jSONObject, "libraryInfo");
            c10665pZ0.add(systemStateSerializer.libraryInfoFromJsonObject(jSONObject));
        }
        return AbstractC11433vZ0.m25450a(c10665pZ0);
    }

    private final JSONArray librariesInfoToJsonArray(Set<HostedTracerLibraryInfo> librariesInfo) {
        if (librariesInfo == null || librariesInfo.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<HostedTracerLibraryInfo> it = librariesInfo.iterator();
        while (it.hasNext()) {
            jSONArray.put(INSTANCE.libraryInfoToJsonObject(it.next()));
        }
        return jSONArray;
    }

    private final HostedTracerLibraryInfo libraryInfoFromJsonObject(JSONObject libraryInfo) throws JSONException {
        String string = libraryInfo.getString("packageName");
        O90.m5967e(string, "libraryInfo.getString(\"packageName\")");
        String string2 = libraryInfo.getString("versionName");
        O90.m5967e(string2, "libraryInfo.getString(\"versionName\")");
        return new HostedTracerLibraryInfo(string, string2, libraryInfo.optString("buildUuid"));
    }

    private final JSONObject libraryInfoToJsonObject(HostedTracerLibraryInfo libraryInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packageName", libraryInfo.getPackageName());
        jSONObject.put("versionName", libraryInfo.getVersionName());
        jSONObject.put("buildUuid", libraryInfo.getBuildUuid());
        return jSONObject;
    }

    public final SystemState fromJson(String jsonString) throws JSONException {
        String string;
        O90.m5968f(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
        JSONArray jSONArrayNames = jSONObject2.names();
        int length = jSONArrayNames != null ? jSONArrayNames.length() : 0;
        for (int i = 0; i < length; i++) {
            if (jSONArrayNames != null && (string = jSONArrayNames.getString(i)) != null) {
                String string2 = jSONObject2.getString(string);
                O90.m5967e(string2, "objProps.getString(this)");
                linkedHashMap.put(string, string2);
            }
        }
        String string3 = jSONObject.getString("versionName");
        O90.m5967e(string3, "obj.getString(\"versionName\")");
        long j = jSONObject.getLong("versionCode");
        String strOptString = jSONObject.optString("packageName");
        if (strOptString == null) {
            strOptString = SystemStateSerializerKt.getImpliedPackageName();
        }
        String str = strOptString;
        String strOptString2 = jSONObject.optString("buildUuid");
        String strOptString3 = jSONObject.optString("sessionUuid");
        if (strOptString3 == null) {
            strOptString3 = SessionUuidUtils.createSessionUuid();
        }
        String string4 = jSONObject.getString("device");
        O90.m5967e(string4, "obj.getString(\"device\")");
        String string5 = jSONObject.getString("deviceId");
        O90.m5967e(string5, "obj.getString(\"deviceId\")");
        String string6 = jSONObject.getString("vendor");
        O90.m5967e(string6, "obj.getString(\"vendor\")");
        String string7 = jSONObject.getString("osVersion");
        O90.m5967e(string7, "obj.getString(\"osVersion\")");
        return new SystemState(string3, j, str, strOptString2, strOptString3, string4, string5, string6, string7, jSONObject.getBoolean("inBackground"), jSONObject.getBoolean("isRooted"), linkedHashMap, librariesInfoFromJsonArray(jSONObject.optJSONArray("hostedLibrariesInfo")));
    }

    public final String toJson(SystemState systemState) throws JSONException {
        O90.m5968f(systemState, "systemState");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("versionName", systemState.getVersionName());
        jSONObject.put("versionCode", systemState.getVersionCode());
        jSONObject.put("packageName", systemState.getPackageName());
        jSONObject.put("buildUuid", systemState.getBuildUuid());
        jSONObject.put("sessionUuid", systemState.getSessionUuid());
        jSONObject.put("device", systemState.getDevice());
        jSONObject.put("deviceId", systemState.getDeviceId());
        jSONObject.put("vendor", systemState.getVendor());
        jSONObject.put("osVersion", systemState.getOsVersion());
        jSONObject.put("inBackground", systemState.isInBackground());
        jSONObject.put("isRooted", systemState.isRooted());
        jSONObject.put("properties", new JSONObject(systemState.getProperties()));
        jSONObject.put("hostedLibrariesInfo", INSTANCE.librariesInfoToJsonArray(systemState.getHostedLibrariesInfo()));
        String string = jSONObject.toString();
        O90.m5967e(string, "json.toString()");
        return string;
    }
}
