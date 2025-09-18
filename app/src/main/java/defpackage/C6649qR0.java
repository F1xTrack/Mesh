package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: qR0 */
/* loaded from: classes2.dex */
public final class C6649qR0 {
    public final D40 a;
    public final String b;
    public final K20 c;
    public final AbstractC7221tR0 d;
    public final Map e;
    public C2193al f;

    public C6649qR0(D40 d40, String str, K20 k20, AbstractC7221tR0 abstractC7221tR0, Map map) {
        O90.f(d40, "url");
        O90.f(str, "method");
        this.a = d40;
        this.b = str;
        this.c = k20;
        this.d = abstractC7221tR0;
        this.e = map;
    }

    public final C7375uF a() {
        C7375uF c7375uF = new C7375uF();
        c7375uF.e = new LinkedHashMap();
        c7375uF.a = this.a;
        c7375uF.b = this.b;
        c7375uF.d = this.d;
        Map map = this.e;
        c7375uF.e = map.isEmpty() ? new LinkedHashMap() : AbstractC7096sn0.q(map);
        c7375uF.c = this.c.i();
        return c7375uF;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        K20 k20 = this.c;
        if (k20.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : k20) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC8259yu.j();
                    throw null;
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.a;
                String str2 = (String) pair.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        O90.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
