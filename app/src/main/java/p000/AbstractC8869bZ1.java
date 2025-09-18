package p000;

import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import com.p019vk.push.common.messaging.ClickActionType;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;

/* renamed from: bZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8869bZ1 {
    /* renamed from: a */
    public static WritableNativeMap m10459a(NQ0 nq0) {
        ClickActionType clickActionType;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        String strName = null;
        C8448Vv0 c8448Vv0 = nq0.f7774h;
        writableNativeMap.putString("title", c8448Vv0 != null ? c8448Vv0.f12862a : null);
        writableNativeMap.putString("body", c8448Vv0 != null ? c8448Vv0.f12863b : null);
        writableNativeMap.putString("channelId", c8448Vv0 != null ? c8448Vv0.f12864c : null);
        writableNativeMap.putString("imageUrl", String.valueOf(c8448Vv0 != null ? c8448Vv0.f12865d : null));
        writableNativeMap.putString("color", c8448Vv0 != null ? c8448Vv0.f12866e : null);
        writableNativeMap.putString("icon", c8448Vv0 != null ? c8448Vv0.f12867f : null);
        writableNativeMap.putString("clickAction", c8448Vv0 != null ? c8448Vv0.f12868g : null);
        if (c8448Vv0 != null && (clickActionType = c8448Vv0.f12869h) != null) {
            strName = clickActionType.name();
        }
        writableNativeMap.putString("clickActionType", strName);
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString(RemoteMessageAttributes.MESSAGE_ID, nq0.f7767a);
        writableNativeMap2.putInt("priority", nq0.f7768b);
        writableNativeMap2.putInt("ttl", nq0.f7769c);
        writableNativeMap2.putString("from", nq0.f7770d);
        writableNativeMap2.putString("collapseKey", nq0.f7771e);
        Map map = nq0.f7772f;
        O90.m5968f(map, "map");
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        for (Map.Entry entry : map.entrySet()) {
            writableNativeMap3.putString((String) entry.getKey(), (String) entry.getValue());
        }
        writableNativeMap2.putMap("data", writableNativeMap3);
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        byte[] bArr = nq0.f7773g;
        if (bArr != null) {
            for (byte b : bArr) {
                writableNativeArray.pushInt(b);
            }
        }
        writableNativeMap2.putArray("rawData", writableNativeArray);
        writableNativeMap2.putMap("notification", writableNativeMap);
        return writableNativeMap2;
    }

    /* renamed from: b */
    public static final Pair m10460b(String str, Serializable serializable) {
        return new Pair(str, serializable);
    }
}
