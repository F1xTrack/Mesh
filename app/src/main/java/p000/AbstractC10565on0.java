package p000;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.yandex.varioqub.config.VarioqubSettings;
import java.util.Iterator;
import java.util.Map;

/* renamed from: on0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10565on0 {
    /* renamed from: a */
    public static VarioqubSettings m23557a(ReadableMap readableMap) {
        String string = readableMap.getString("clientId");
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("Client id should not be empty");
        }
        VarioqubSettings.Builder builder = new VarioqubSettings.Builder(string);
        if (readableMap.hasKey("url")) {
            builder.withUrl(readableMap.getString("url"));
        }
        if (readableMap.hasKey("fetchThrottleIntervalSeconds")) {
            builder.withThrottleInterval(readableMap.getInt("fetchThrottleIntervalSeconds"));
        }
        if (readableMap.hasKey("clientFeatures")) {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getMap("clientFeatures").getEntryIterator();
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                builder.withClientFeature(next.getKey(), next.getValue().toString());
            }
        }
        if (readableMap.hasKey("logs")) {
            builder.withLogs();
        }
        return builder.build();
    }
}
