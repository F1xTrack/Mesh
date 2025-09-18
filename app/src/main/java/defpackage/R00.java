package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.rn.push.constants.NotificationConstants;

/* loaded from: classes2.dex */
public abstract class R00 {
    public static MotionEvent.PointerProperties[] J;
    public static MotionEvent.PointerCoords[] K;
    public static short L;
    public T00 A;
    public KH0 B;
    public GH0 C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final int[] a = new int[12];
    public int b;
    public final int[] c;
    public int d;
    public View e;
    public int f;
    public float g;
    public float h;
    public boolean i;
    public boolean j;
    public int k;
    public WritableArray l;
    public WritableArray m;
    public int n;
    public int o;
    public final Q00[] p;
    public boolean q;
    public float[] r;
    public short s;
    public float t;
    public float u;
    public boolean v;
    public float w;
    public float x;
    public boolean y;
    public int z;

    public R00() {
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = 0;
        }
        this.c = iArr;
        this.j = true;
        Q00[] q00Arr = new Q00[12];
        for (int i2 = 0; i2 < 12; i2++) {
            q00Arr[i2] = null;
        }
        this.p = q00Arr;
        this.D = 3;
    }

    public static WritableMap f(Q00 q00) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(NotificationConstants.ID, q00.a);
        writableMapCreateMap.putDouble("x", AbstractC7586vL1.a(q00.b));
        writableMapCreateMap.putDouble("y", AbstractC7586vL1.a(q00.c));
        writableMapCreateMap.putDouble("absoluteX", AbstractC7586vL1.a(q00.d));
        writableMapCreateMap.putDouble("absoluteY", AbstractC7586vL1.a(q00.e));
        return writableMapCreateMap;
    }

    public static Activity n(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return n(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final void B(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.r == null) {
            this.r = new float[6];
        }
        float[] fArr = this.r;
        O90.c(fArr);
        fArr[0] = f;
        float[] fArr2 = this.r;
        O90.c(fArr2);
        fArr2[1] = f2;
        float[] fArr3 = this.r;
        O90.c(fArr3);
        fArr3[2] = f3;
        float[] fArr4 = this.r;
        O90.c(fArr4);
        fArr4[3] = f4;
        float[] fArr5 = this.r;
        O90.c(fArr5);
        fArr5[4] = f5;
        float[] fArr6 = this.r;
        O90.c(fArr6);
        fArr6[5] = f6;
        if (!Float.isNaN(f5) && !Float.isNaN(f) && !Float.isNaN(f3)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (!Float.isNaN(f5) && Float.isNaN(f) && Float.isNaN(f3)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (!Float.isNaN(f6) && !Float.isNaN(f4) && !Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (!Float.isNaN(f6) && Float.isNaN(f4) && Float.isNaN(f2)) {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }

    public final boolean C(MotionEvent motionEvent) {
        O90.f(motionEvent, "sourceEvent");
        if (motionEvent.getToolType(0) == 3) {
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6 && motionEvent.getAction() != 5) {
                if (motionEvent.getAction() != 2) {
                    int actionButton = motionEvent.getActionButton();
                    int i = this.E;
                    if (i != 0 ? (actionButton & i) == 0 : actionButton != 1) {
                        return false;
                    }
                }
                if (motionEvent.getAction() == 2) {
                    int buttonState = motionEvent.getButtonState();
                    int i2 = this.E;
                    if (i2 != 0 ? (buttonState & i2) == 0 : buttonState != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean D(R00 r00) {
        O90.f(r00, "handler");
        if (r00 == this || this.C == null) {
            return false;
        }
        return r00 instanceof C8070xu0 ? ((C8070xu0) r00).N : r00 instanceof NH0;
    }

    public boolean E(R00 r00) {
        int[] iArr;
        O90.f(r00, "handler");
        boolean z = true;
        if (r00 == this) {
            return true;
        }
        GH0 gh0 = this.C;
        if (gh0 == null || (iArr = (int[]) gh0.b.get(this.d)) == null) {
            return false;
        }
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (iArr[i] == r00.d) {
                break;
            }
            i++;
        }
        return z;
    }

    public boolean F(R00 r00) {
        GH0 gh0;
        int[] iArr;
        O90.f(r00, "handler");
        if (r00 == this || (gh0 = this.C) == null || (iArr = (int[]) gh0.c.get(this.d)) == null) {
            return false;
        }
        for (int i : iArr) {
            if (i == r00.d) {
                return true;
            }
        }
        return false;
    }

    public final void G(int i) {
        int[] iArr = this.a;
        if (iArr[i] == -1) {
            int i2 = 0;
            while (i2 < this.b) {
                int i3 = 0;
                while (i3 < iArr.length && iArr[i3] != i2) {
                    i3++;
                }
                if (i3 == iArr.length) {
                    break;
                } else {
                    i2++;
                }
            }
            iArr[i] = i2;
            this.b++;
        }
    }

    public final void H(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.f(motionEvent2, "sourceEvent");
        int actionMasked = motionEvent.getActionMasked();
        Q00[] q00Arr = this.p;
        int[] iArr = this.c;
        if (actionMasked == 0 || motionEvent.getActionMasked() == 5) {
            this.l = null;
            this.n = 1;
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            Q00 q00 = new Q00(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - iArr[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - iArr[1]);
            q00Arr[pointerId] = q00;
            this.o++;
            c(q00);
            l();
            i();
            j(motionEvent, motionEvent2);
            return;
        }
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 6) {
            if (motionEvent.getActionMasked() == 2) {
                j(motionEvent, motionEvent2);
                return;
            }
            return;
        }
        j(motionEvent, motionEvent2);
        l();
        this.l = null;
        this.n = 3;
        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
        Q00 q002 = new Q00(pointerId2, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - iArr[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - iArr[1]);
        q00Arr[pointerId2] = q002;
        c(q002);
        q00Arr[pointerId2] = null;
        this.o--;
        i();
    }

    public void a(boolean z) {
        if (!this.v || z) {
            int i = this.f;
            if (i == 0 || i == 2) {
                s(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.MotionEvent b(android.view.MotionEvent r31) throws defpackage.P00 {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R00.b(android.view.MotionEvent):android.view.MotionEvent");
    }

    public final void c(Q00 q00) {
        if (this.l == null) {
            this.l = Arguments.createArray();
        }
        WritableArray writableArray = this.l;
        O90.c(writableArray);
        writableArray.pushMap(f(q00));
    }

    public final void d() {
        if (this.f == 0) {
            s(2);
        }
    }

    public final void e() {
        int i = this.f;
        if (i == 4 || i == 0 || i == 2 || this.H) {
            t();
            s(3);
        }
    }

    public void g(MotionEvent motionEvent) {
        KH0 kh0 = this.B;
        if (kh0 != null) {
            kh0.a.onHandlerUpdate(this);
        }
    }

    public void h(int i, int i2) {
        KH0 kh0 = this.B;
        if (kh0 != null) {
            kh0.a.onStateChange(this, i, i2);
        }
    }

    public final void i() {
        KH0 kh0;
        if (this.l == null || (kh0 = this.B) == null) {
            return;
        }
        kh0.a.onTouchEvent(this);
    }

    public final void j(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.l = null;
        this.n = 2;
        float rawX = motionEvent2.getRawX() - motionEvent2.getX();
        float rawY = motionEvent2.getRawY() - motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            Q00 q00 = this.p[motionEvent.getPointerId(i2)];
            if (q00 != null && (q00.b != motionEvent.getX(i2) || q00.c != motionEvent.getY(i2))) {
                q00.b = motionEvent.getX(i2);
                q00.c = motionEvent.getY(i2);
                float x = motionEvent2.getX(i2) + rawX;
                int[] iArr = this.c;
                q00.d = x - iArr[0];
                q00.e = (motionEvent2.getY(i2) + rawY) - iArr[1];
                c(q00);
                i++;
            }
        }
        if (i > 0) {
            l();
            i();
        }
    }

    public final void k() {
        int i = this.f;
        if (i == 2 || i == 4) {
            s(5);
        }
    }

    public final void l() {
        this.m = null;
        for (Q00 q00 : this.p) {
            if (q00 != null) {
                if (this.m == null) {
                    this.m = Arguments.createArray();
                }
                WritableArray writableArray = this.m;
                O90.c(writableArray);
                writableArray.pushMap(f(q00));
            }
        }
    }

    public final void m() {
        int i = this.f;
        if (i == 4 || i == 0 || i == 2) {
            s(1);
        }
    }

    public final float o() {
        return (this.t + this.w) - this.c[0];
    }

    public final float p() {
        return (this.u + this.x) - this.c[1];
    }

    public final boolean q(R00 r00) {
        O90.f(r00, "other");
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iArr[i] != -1 && r00.a[i] != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(View view, float f, float f2) {
        float f3;
        O90.c(view);
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.r;
        if (fArr != null) {
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[2];
            float f7 = fArr[3];
            float f8 = !Float.isNaN(f4) ? 0.0f - f4 : 0.0f;
            f = Float.isNaN(f5) ? 0.0f : 0.0f - f5;
            if (!Float.isNaN(f6)) {
                width += f6;
            }
            if (!Float.isNaN(f7)) {
                height += f7;
            }
            float f9 = fArr[4];
            float f10 = fArr[5];
            if (!Float.isNaN(f9)) {
                if (Float.isNaN(f4)) {
                    f8 = width - f9;
                } else if (Float.isNaN(f6)) {
                    width = f9 + f8;
                }
            }
            if (!Float.isNaN(f10)) {
                if (Float.isNaN(f5)) {
                    f = height - f10;
                } else if (Float.isNaN(f7)) {
                    height = f10 + f;
                }
            }
            f3 = f;
            f = f8;
        } else {
            f3 = 0.0f;
        }
        return f <= f && f <= width && f3 <= f2 && f2 <= height;
    }

    public final void s(int i) {
        UiThreadUtil.assertOnUiThread();
        if (this.f == i) {
            return;
        }
        if (this.o > 0 && (i == 5 || i == 3 || i == 1)) {
            this.n = 4;
            this.l = null;
            l();
            Q00[] q00Arr = this.p;
            for (Q00 q00 : q00Arr) {
                if (q00 != null) {
                    c(q00);
                }
            }
            this.o = 0;
            J8.k(q00Arr, 0, q00Arr.length);
            i();
        }
        int i2 = this.f;
        this.f = i;
        if (i == 4) {
            short s = L;
            L = (short) (s + 1);
            this.s = s;
        }
        T00 t00 = this.A;
        O90.c(t00);
        t00.i++;
        PointF pointF = T00.l;
        if (NV1.l(i)) {
            for (R00 r00 : AbstractC8069xu.b0(t00.e)) {
                if (NV1.n(r00, this) && t00.g.contains(Integer.valueOf(r00.d))) {
                    if (i == 5) {
                        r00.e();
                        if (r00.f == 5) {
                            r00.h(3, 2);
                        }
                        r00.H = false;
                    } else {
                        t00.j(r00);
                    }
                }
            }
            t00.a();
        }
        if (i == 4) {
            t00.j(this);
        } else if (i2 == 4 || i2 == 5) {
            if (this.G) {
                h(i, i2);
            } else if (i2 == 4 && (i == 3 || i == 1)) {
                h(i, 2);
            }
        } else if (i2 != 0 || i != 3) {
            h(i, i2);
        }
        int i3 = t00.i - 1;
        t00.i = i3;
        if (t00.h || i3 != 0) {
            t00.j = true;
        } else {
            t00.b();
        }
        y();
    }

    public final String toString() {
        String simpleName;
        View view = this.e;
        if (view == null) {
            simpleName = null;
        } else {
            O90.c(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.d + "]:" + simpleName;
    }

    public abstract void u(MotionEvent motionEvent, MotionEvent motionEvent2);

    public void v(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.f(motionEvent2, "sourceEvent");
    }

    public void z() {
        this.q = false;
        this.v = false;
        this.y = false;
        this.j = true;
        this.r = null;
    }

    public void A() {
    }

    public void t() {
    }

    public void w() {
    }

    public void x() {
    }

    public void y() {
    }
}
