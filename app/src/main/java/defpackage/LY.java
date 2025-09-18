package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public final class LY extends AbstractC4087h5 {
    public long e;
    public double[] f;
    public double g;
    public double h;
    public int i;
    public int j;
    public int k;

    @Override // defpackage.AbstractC4087h5
    public final void a(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.f;
        if (dArr == null || dArr.length != size) {
            this.f = new double[size];
        }
        for (int i = 0; i < size; i++) {
            this.f[i] = array.getDouble(i);
        }
        boolean zHasKey = readableMap.hasKey("toValue");
        double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
        if (zHasKey) {
            if (readableMap.getType("toValue") == ReadableType.Number) {
                d = readableMap.getDouble("toValue");
            }
            this.g = d;
        } else {
            this.g = ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        if (readableMap.hasKey("iterations")) {
            this.i = readableMap.getType("iterations") == ReadableType.Number ? readableMap.getInt("iterations") : 1;
        } else {
            this.i = 1;
        }
        this.j = 1;
        this.a = this.i == 0;
        this.e = -1L;
    }

    @Override // defpackage.AbstractC4087h5
    public final void b(long j) {
        double d;
        if (this.e < 0) {
            this.e = j;
            if (this.j == 1) {
                this.h = this.b.e;
            }
        }
        int iRound = (int) Math.round(((j - this.e) / 1000000) / 16.666666666666668d);
        if (iRound < 0) {
            if (this.k < 100) {
                AbstractC3393dS.p("ReactNative");
                this.k++;
                return;
            }
            return;
        }
        if (this.a) {
            return;
        }
        double[] dArr = this.f;
        if (iRound >= dArr.length - 1) {
            d = this.g;
            int i = this.i;
            if (i == -1 || this.j < i) {
                this.e = -1L;
                this.j++;
            } else {
                this.a = true;
            }
        } else {
            double d2 = this.h;
            d = ((this.g - d2) * dArr[iRound]) + d2;
        }
        this.b.e = d;
    }
}
