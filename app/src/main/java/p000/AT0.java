package p000;

import android.view.MotionEvent;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes2.dex */
public final class AT0 {

    /* renamed from: a */
    public final C10641pN0 f200a;

    /* renamed from: b */
    public long f201b;

    /* renamed from: c */
    public long f202c;

    /* renamed from: d */
    public double f203d;

    /* renamed from: e */
    public double f204e;

    /* renamed from: f */
    public float f205f;

    /* renamed from: g */
    public float f206g;

    /* renamed from: h */
    public boolean f207h;

    /* renamed from: i */
    public final int[] f208i = new int[2];

    /* renamed from: j */
    public boolean f209j;

    public AT0(C10641pN0 c10641pN0) {
        this.f200a = c10641pN0;
    }

    /* renamed from: a */
    public final void m186a(MotionEvent motionEvent) {
        this.f202c = this.f201b;
        this.f201b = motionEvent.getEventTime();
        int[] iArr = this.f208i;
        int iFindPointerIndex = motionEvent.findPointerIndex(iArr[0]);
        int iFindPointerIndex2 = motionEvent.findPointerIndex(iArr[1]);
        if (iFindPointerIndex == -1 || iFindPointerIndex2 == -1) {
            return;
        }
        float x = motionEvent.getX(iFindPointerIndex);
        float y = motionEvent.getY(iFindPointerIndex);
        float x2 = motionEvent.getX(iFindPointerIndex2);
        float y2 = motionEvent.getY(iFindPointerIndex2);
        this.f205f = (x + x2) * 0.5f;
        this.f206g = (y + y2) * 0.5f;
        double d = -Math.atan2(y2 - y, x2 - x);
        if (this.f209j) {
            this.f203d = d;
            this.f209j = false;
        }
        double d2 = Double.isNaN(this.f203d) ? ConfigValue.DOUBLE_DEFAULT_VALUE : this.f203d - d;
        this.f204e = d2;
        this.f203d = d;
        if (d2 > 3.141592653589793d) {
            this.f204e = d2 - 3.141592653589793d;
        } else if (d2 < -3.141592653589793d) {
            this.f204e = d2 + 3.141592653589793d;
        }
        double d3 = this.f204e;
        if (d3 > 1.5707963267948966d) {
            this.f204e = d3 - 3.141592653589793d;
        } else if (d3 < -1.5707963267948966d) {
            this.f204e = d3 + 3.141592653589793d;
        }
    }
}
