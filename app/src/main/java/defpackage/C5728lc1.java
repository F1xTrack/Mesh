package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* renamed from: lc1 */
/* loaded from: classes.dex */
public final class C5728lc1 extends T4 {
    public final a e;
    public final ArrayList f;

    public C5728lc1(ReadableMap readableMap, a aVar) {
        ReadableArray array = readableMap.getArray("transforms");
        this.f = new ArrayList(array.size());
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            String string = map.getString("property");
            if (map.getString("type").equals("animated")) {
                C4379ic1 c4379ic1 = new C4379ic1();
                c4379ic1.a = string;
                c4379ic1.b = map.getInt("nodeTag");
                this.f.add(c4379ic1);
            } else {
                C5346jc1 c5346jc1 = new C5346jc1();
                c5346jc1.a = string;
                c5346jc1.b = map.getDouble("value");
                this.f.add(c5346jc1);
            }
        }
        this.e = aVar;
    }

    @Override // defpackage.T4
    public final String c() {
        StringBuilder sb = new StringBuilder("TransformAnimatedNode[");
        sb.append(this.d);
        sb.append("]: mTransformConfigs: ");
        ArrayList arrayList = this.f;
        sb.append(arrayList != null ? arrayList.toString() : "null");
        return sb.toString();
    }
}
