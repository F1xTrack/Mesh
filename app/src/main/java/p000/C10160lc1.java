package p000;

import com.facebook.react.animated.C1881a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* renamed from: lc1 */
/* loaded from: classes.dex */
public final class C10160lc1 extends AbstractC1200T4 {

    /* renamed from: e */
    public final C1881a f37190e;

    /* renamed from: f */
    public final ArrayList f37191f;

    public C10160lc1(ReadableMap readableMap, C1881a c1881a) {
        ReadableArray array = readableMap.getArray("transforms");
        this.f37191f = new ArrayList(array.size());
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            String string = map.getString("property");
            if (map.getString("type").equals("animated")) {
                C9776ic1 c9776ic1 = new C9776ic1();
                c9776ic1.f36573a = string;
                c9776ic1.f29371b = map.getInt("nodeTag");
                this.f37191f.add(c9776ic1);
            } else {
                C9904jc1 c9904jc1 = new C9904jc1();
                c9904jc1.f36573a = string;
                c9904jc1.f35284b = map.getDouble("value");
                this.f37191f.add(c9904jc1);
            }
        }
        this.f37190e = c1881a;
    }

    @Override // p000.AbstractC1200T4
    /* renamed from: c */
    public final String mo2442c() {
        StringBuilder sb = new StringBuilder("TransformAnimatedNode[");
        sb.append(this.f11143d);
        sb.append("]: mTransformConfigs: ");
        ArrayList arrayList = this.f37191f;
        sb.append(arrayList != null ? arrayList.toString() : "null");
        return sb.toString();
    }
}
