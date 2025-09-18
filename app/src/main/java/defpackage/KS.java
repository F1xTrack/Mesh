package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.FilterUtils;
import java.util.HashMap;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class KS extends AbstractC6466pU {
    public String c;
    public EnumC7038sU d;
    public ReadableArray e;

    @Override // defpackage.AbstractC6466pU
    public final Bitmap l(HashMap map, Bitmap bitmap) {
        Bitmap bitmapM = AbstractC6466pU.m(map, bitmap, this.c);
        ColorMatrix colorMatrix = new ColorMatrix();
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            if (this.e.size() < 20) {
                return bitmapM;
            }
            float[] fArr = new float[this.e.size()];
            for (int i = 0; i < this.e.size(); i++) {
                fArr[i] = ((float) this.e.getDouble(i)) * (i % 5 == 4 ? KotlinVersion.MAX_COMPONENT_VALUE : 1);
            }
            colorMatrix.set(fArr);
        } else if (iOrdinal == 1) {
            if (this.e.size() != 1) {
                return bitmapM;
            }
            colorMatrix.setSaturation((float) this.e.getDouble(0));
        } else if (iOrdinal == 2) {
            if (this.e.size() != 1) {
                return bitmapM;
            }
            double d = (((float) this.e.getDouble(0)) * 3.141592653589793d) / 180.0d;
            float fCos = (float) Math.cos(d);
            float fSin = (float) Math.sin(d);
            float f = 0.715f - (fCos * 0.715f);
            float f2 = fSin * 0.715f;
            float f3 = 0.072f - (fCos * 0.072f);
            float f4 = 0.213f - (fCos * 0.213f);
            colorMatrix.set(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f - f2, (fSin * 0.928f) + f3, 0.0f, 0.0f, (0.143f * fSin) + f4, (0.14f * fSin) + (0.285f * fCos) + 0.715f, f3 - (0.283f * fSin), 0.0f, 0.0f, f4 - (0.787f * fSin), f + f2, (fSin * 0.072f) + (fCos * 0.928f) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        } else if (iOrdinal == 3) {
            colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapM);
    }
}
