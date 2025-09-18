package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;

/* renamed from: kh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5551kh0 {
    public float a;
    public int b;

    public final void a(Dynamic dynamic) {
        if (dynamic.isNull()) {
            this.b = 1;
            this.a = Float.NaN;
            return;
        }
        if (dynamic.getType() != ReadableType.String) {
            if (dynamic.getType() == ReadableType.Number) {
                this.b = 2;
                this.a = AbstractC7586vL1.b((float) dynamic.asDouble());
                return;
            } else {
                this.b = 1;
                this.a = Float.NaN;
                return;
            }
        }
        String strAsString = dynamic.asString();
        if (strAsString.equals("auto")) {
            this.b = 4;
            this.a = Float.NaN;
        } else if (strAsString.endsWith("%")) {
            this.b = 3;
            this.a = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
        } else {
            "Unknown value: ".concat(strAsString);
            AbstractC3393dS.p("ReactNative");
            this.b = 1;
            this.a = Float.NaN;
        }
    }
}
