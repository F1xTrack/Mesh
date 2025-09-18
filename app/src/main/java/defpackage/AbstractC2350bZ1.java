package defpackage;

import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.huawei.hms.rn.push.constants.RemoteMessageAttributes;
import com.vk.push.common.messaging.ClickActionType;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;

/* renamed from: bZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2350bZ1 {
    public static WritableNativeMap a(NQ0 nq0) {
        ClickActionType clickActionType;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        String strName = null;
        C1721Vv0 c1721Vv0 = nq0.h;
        writableNativeMap.putString("title", c1721Vv0 != null ? c1721Vv0.a : null);
        writableNativeMap.putString("body", c1721Vv0 != null ? c1721Vv0.b : null);
        writableNativeMap.putString("channelId", c1721Vv0 != null ? c1721Vv0.c : null);
        writableNativeMap.putString("imageUrl", String.valueOf(c1721Vv0 != null ? c1721Vv0.d : null));
        writableNativeMap.putString("color", c1721Vv0 != null ? c1721Vv0.e : null);
        writableNativeMap.putString("icon", c1721Vv0 != null ? c1721Vv0.f : null);
        writableNativeMap.putString("clickAction", c1721Vv0 != null ? c1721Vv0.g : null);
        if (c1721Vv0 != null && (clickActionType = c1721Vv0.h) != null) {
            strName = clickActionType.name();
        }
        writableNativeMap.putString("clickActionType", strName);
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString(RemoteMessageAttributes.MESSAGE_ID, nq0.a);
        writableNativeMap2.putInt("priority", nq0.b);
        writableNativeMap2.putInt("ttl", nq0.c);
        writableNativeMap2.putString("from", nq0.d);
        writableNativeMap2.putString("collapseKey", nq0.e);
        Map map = nq0.f;
        O90.f(map, "map");
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        for (Map.Entry entry : map.entrySet()) {
            writableNativeMap3.putString((String) entry.getKey(), (String) entry.getValue());
        }
        writableNativeMap2.putMap("data", writableNativeMap3);
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        byte[] bArr = nq0.g;
        if (bArr != null) {
            for (byte b : bArr) {
                writableNativeArray.pushInt(b);
            }
        }
        writableNativeMap2.putArray("rawData", writableNativeArray);
        writableNativeMap2.putMap("notification", writableNativeMap);
        return writableNativeMap2;
    }

    public static final Pair b(String str, Serializable serializable) {
        return new Pair(str, serializable);
    }
}
