package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class G51 extends T4 {
    public final a e;
    public final HashMap f;

    public G51(ReadableMap readableMap, a aVar) {
        ReadableMap map = readableMap.getMap("style");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
        this.f = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.f.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
        this.e = aVar;
    }

    @Override // defpackage.T4
    public final String c() {
        StringBuilder sb = new StringBuilder("StyleAnimatedNode[");
        sb.append(this.d);
        sb.append("] mPropMapping: ");
        HashMap map = this.f;
        sb.append(map != null ? map.toString() : "null");
        return sb.toString();
    }
}
