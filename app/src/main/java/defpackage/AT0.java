package defpackage;

import android.view.MotionEvent;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes2.dex */
public final class AT0 {
    public final C6446pN0 a;
    public long b;
    public long c;
    public double d;
    public double e;
    public float f;
    public float g;
    public boolean h;
    public final int[] i = new int[2];
    public boolean j;

    public AT0(C6446pN0 c6446pN0) {
        this.a = c6446pN0;
    }

    public final void a(MotionEvent motionEvent) {
        this.c = this.b;
        this.b = motionEvent.getEventTime();
        int[] iArr = this.i;
        int iFindPointerIndex = motionEvent.findPointerIndex(iArr[0]);
        int iFindPointerIndex2 = motionEvent.findPointerIndex(iArr[1]);
        if (iFindPointerIndex == -1 || iFindPointerIndex2 == -1) {
            return;
        }
        float x = motionEvent.getX(iFindPointerIndex);
        float y = motionEvent.getY(iFindPointerIndex);
        float x2 = motionEvent.getX(iFindPointerIndex2);
        float y2 = motionEvent.getY(iFindPointerIndex2);
        this.f = (x + x2) * 0.5f;
        this.g = (y + y2) * 0.5f;
        double d = -Math.atan2(y2 - y, x2 - x);
        if (this.j) {
            this.d = d;
            this.j = false;
        }
        double d2 = Double.isNaN(this.d) ? ConfigValue.DOUBLE_DEFAULT_VALUE : this.d - d;
        this.e = d2;
        this.d = d;
        if (d2 > 3.141592653589793d) {
            this.e = d2 - 3.141592653589793d;
        } else if (d2 < -3.141592653589793d) {
            this.e = d2 + 3.141592653589793d;
        }
        double d3 = this.e;
        if (d3 > 1.5707963267948966d) {
            this.e = d3 - 3.141592653589793d;
        } else if (d3 < -1.5707963267948966d) {
            this.e = d3 + 3.141592653589793d;
        }
    }
}
