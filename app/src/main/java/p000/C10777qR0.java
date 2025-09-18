package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: qR0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10777qR0 {

    /* renamed from: a */
    public final D40 f40870a;

    /* renamed from: b */
    public final String f40871b;

    /* renamed from: c */
    public final K20 f40872c;

    /* renamed from: d */
    public final AbstractC11161tR0 f40873d;

    /* renamed from: e */
    public final Map f40874e;

    /* renamed from: f */
    public C1684al f40875f;

    public C10777qR0(D40 d40, String str, K20 k20, AbstractC11161tR0 abstractC11161tR0, Map map) {
        O90.m5968f(d40, "url");
        O90.m5968f(str, "method");
        this.f40870a = d40;
        this.f40871b = str;
        this.f40872c = k20;
        this.f40873d = abstractC11161tR0;
        this.f40874e = map;
    }

    /* renamed from: a */
    public final C6937uF m23998a() {
        C6937uF c6937uF = new C6937uF();
        c6937uF.f43620e = new LinkedHashMap();
        c6937uF.f43616a = this.f40870a;
        c6937uF.f43617b = this.f40871b;
        c6937uF.f43619d = this.f40873d;
        Map map = this.f40874e;
        c6937uF.f43620e = map.isEmpty() ? new LinkedHashMap() : AbstractC11077sn0.m24789q(map);
        c6937uF.f43618c = this.f40872c.m4526i();
        return c6937uF;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f40871b);
        sb.append(", url=");
        sb.append(this.f40870a);
        K20 k20 = this.f40872c;
        if (k20.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : k20) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC7230yu.m26279j();
                    throw null;
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.f36702a;
                String str2 = (String) pair.f36703b;
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
        Map map = this.f40874e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        O90.m5967e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
