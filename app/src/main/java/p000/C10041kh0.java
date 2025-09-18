package p000;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;

/* renamed from: kh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10041kh0 {

    /* renamed from: a */
    public float f36609a;

    /* renamed from: b */
    public int f36610b;

    /* renamed from: a */
    public final void m22241a(Dynamic dynamic) {
        if (dynamic.isNull()) {
            this.f36610b = 1;
            this.f36609a = Float.NaN;
            return;
        }
        if (dynamic.getType() != ReadableType.String) {
            if (dynamic.getType() == ReadableType.Number) {
                this.f36610b = 2;
                this.f36609a = AbstractC11406vL1.m25403b((float) dynamic.asDouble());
                return;
            } else {
                this.f36610b = 1;
                this.f36609a = Float.NaN;
                return;
            }
        }
        String strAsString = dynamic.asString();
        if (strAsString.equals("auto")) {
            this.f36610b = 4;
            this.f36609a = Float.NaN;
        } else if (strAsString.endsWith("%")) {
            this.f36610b = 3;
            this.f36609a = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
        } else {
            "Unknown value: ".concat(strAsString);
            AbstractC3929dS.m17683p("ReactNative");
            this.f36610b = 1;
            this.f36609a = Float.NaN;
        }
    }
}
