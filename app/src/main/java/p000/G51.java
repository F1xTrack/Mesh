package p000;

import com.facebook.react.animated.C1881a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class G51 extends AbstractC1200T4 {

    /* renamed from: e */
    public final C1881a f3567e;

    /* renamed from: f */
    public final HashMap f3568f;

    public G51(ReadableMap readableMap, C1881a c1881a) {
        ReadableMap map = readableMap.getMap("style");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
        this.f3568f = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.f3568f.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
        this.f3567e = c1881a;
    }

    @Override // p000.AbstractC1200T4
    /* renamed from: c */
    public final String mo2442c() {
        StringBuilder sb = new StringBuilder("StyleAnimatedNode[");
        sb.append(this.f11143d);
        sb.append("] mPropMapping: ");
        HashMap map = this.f3568f;
        sb.append(map != null ? map.toString() : "null");
        return sb.toString();
    }
}
