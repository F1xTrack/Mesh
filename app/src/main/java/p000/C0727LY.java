package p000;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: LY */
/* loaded from: classes.dex */
public final class C0727LY extends AbstractC4157h5 {

    /* renamed from: e */
    public long f6702e;

    /* renamed from: f */
    public double[] f6703f;

    /* renamed from: g */
    public double f6704g;

    /* renamed from: h */
    public double f6705h;

    /* renamed from: i */
    public int f6706i;

    /* renamed from: j */
    public int f6707j;

    /* renamed from: k */
    public int f6708k;

    @Override // p000.AbstractC4157h5
    /* renamed from: a */
    public final void mo558a(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.f6703f;
        if (dArr == null || dArr.length != size) {
            this.f6703f = new double[size];
        }
        for (int i = 0; i < size; i++) {
            this.f6703f[i] = array.getDouble(i);
        }
        boolean zHasKey = readableMap.hasKey("toValue");
        double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
        if (zHasKey) {
            if (readableMap.getType("toValue") == ReadableType.Number) {
                d = readableMap.getDouble("toValue");
            }
            this.f6704g = d;
        } else {
            this.f6704g = ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        if (readableMap.hasKey("iterations")) {
            this.f6706i = readableMap.getType("iterations") == ReadableType.Number ? readableMap.getInt("iterations") : 1;
        } else {
            this.f6706i = 1;
        }
        this.f6707j = 1;
        this.f28239a = this.f6706i == 0;
        this.f6702e = -1L;
    }

    @Override // p000.AbstractC4157h5
    /* renamed from: b */
    public final void mo559b(long j) {
        double d;
        if (this.f6702e < 0) {
            this.f6702e = j;
            if (this.f6707j == 1) {
                this.f6705h = this.f28240b.f6259e;
            }
        }
        int iRound = (int) Math.round(((j - this.f6702e) / 1000000) / 16.666666666666668d);
        if (iRound < 0) {
            if (this.f6708k < 100) {
                AbstractC3929dS.m17683p("ReactNative");
                this.f6708k++;
                return;
            }
            return;
        }
        if (this.f28239a) {
            return;
        }
        double[] dArr = this.f6703f;
        if (iRound >= dArr.length - 1) {
            d = this.f6704g;
            int i = this.f6706i;
            if (i == -1 || this.f6707j < i) {
                this.f6702e = -1L;
                this.f6707j++;
            } else {
                this.f28239a = true;
            }
        } else {
            double d2 = this.f6705h;
            d = ((this.f6704g - d2) * dArr[iRound]) + d2;
        }
        this.f28240b.f6259e = d;
    }
}
