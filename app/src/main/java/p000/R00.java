package p000;

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

/* loaded from: classes2.dex */
public abstract class R00 {

    /* renamed from: J */
    public static MotionEvent.PointerProperties[] f9888J;

    /* renamed from: K */
    public static MotionEvent.PointerCoords[] f9889K;

    /* renamed from: L */
    public static short f9890L;

    /* renamed from: A */
    public T00 f9891A;

    /* renamed from: B */
    public KH0 f9892B;

    /* renamed from: C */
    public GH0 f9893C;

    /* renamed from: D */
    public int f9894D;

    /* renamed from: E */
    public int f9895E;

    /* renamed from: F */
    public int f9896F;

    /* renamed from: G */
    public boolean f9897G;

    /* renamed from: H */
    public boolean f9898H;

    /* renamed from: I */
    public boolean f9899I;

    /* renamed from: a */
    public final int[] f9900a = new int[12];

    /* renamed from: b */
    public int f9901b;

    /* renamed from: c */
    public final int[] f9902c;

    /* renamed from: d */
    public int f9903d;

    /* renamed from: e */
    public View f9904e;

    /* renamed from: f */
    public int f9905f;

    /* renamed from: g */
    public float f9906g;

    /* renamed from: h */
    public float f9907h;

    /* renamed from: i */
    public boolean f9908i;

    /* renamed from: j */
    public boolean f9909j;

    /* renamed from: k */
    public int f9910k;

    /* renamed from: l */
    public WritableArray f9911l;

    /* renamed from: m */
    public WritableArray f9912m;

    /* renamed from: n */
    public int f9913n;

    /* renamed from: o */
    public int f9914o;

    /* renamed from: p */
    public final Q00[] f9915p;

    /* renamed from: q */
    public boolean f9916q;

    /* renamed from: r */
    public float[] f9917r;

    /* renamed from: s */
    public short f9918s;

    /* renamed from: t */
    public float f9919t;

    /* renamed from: u */
    public float f9920u;

    /* renamed from: v */
    public boolean f9921v;

    /* renamed from: w */
    public float f9922w;

    /* renamed from: x */
    public float f9923x;

    /* renamed from: y */
    public boolean f9924y;

    /* renamed from: z */
    public int f9925z;

    public R00() {
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = 0;
        }
        this.f9902c = iArr;
        this.f9909j = true;
        Q00[] q00Arr = new Q00[12];
        for (int i2 = 0; i2 < 12; i2++) {
            q00Arr[i2] = null;
        }
        this.f9915p = q00Arr;
        this.f9894D = 3;
    }

    /* renamed from: f */
    public static WritableMap m6848f(Q00 q00) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(NotificationConstants.f19487ID, q00.f9395a);
        writableMapCreateMap.putDouble("x", AbstractC11406vL1.m25402a(q00.f9396b));
        writableMapCreateMap.putDouble("y", AbstractC11406vL1.m25402a(q00.f9397c));
        writableMapCreateMap.putDouble("absoluteX", AbstractC11406vL1.m25402a(q00.f9398d));
        writableMapCreateMap.putDouble("absoluteY", AbstractC11406vL1.m25402a(q00.f9399e));
        return writableMapCreateMap;
    }

    /* renamed from: n */
    public static Activity m6849n(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m6849n(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: B */
    public final void m6850B(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f9917r == null) {
            this.f9917r = new float[6];
        }
        float[] fArr = this.f9917r;
        O90.m5965c(fArr);
        fArr[0] = f;
        float[] fArr2 = this.f9917r;
        O90.m5965c(fArr2);
        fArr2[1] = f2;
        float[] fArr3 = this.f9917r;
        O90.m5965c(fArr3);
        fArr3[2] = f3;
        float[] fArr4 = this.f9917r;
        O90.m5965c(fArr4);
        fArr4[3] = f4;
        float[] fArr5 = this.f9917r;
        O90.m5965c(fArr5);
        fArr5[4] = f5;
        float[] fArr6 = this.f9917r;
        O90.m5965c(fArr6);
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

    /* renamed from: C */
    public final boolean m6851C(MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "sourceEvent");
        if (motionEvent.getToolType(0) == 3) {
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6 && motionEvent.getAction() != 5) {
                if (motionEvent.getAction() != 2) {
                    int actionButton = motionEvent.getActionButton();
                    int i = this.f9895E;
                    if (i != 0 ? (actionButton & i) == 0 : actionButton != 1) {
                        return false;
                    }
                }
                if (motionEvent.getAction() == 2) {
                    int buttonState = motionEvent.getButtonState();
                    int i2 = this.f9895E;
                    if (i2 != 0 ? (buttonState & i2) == 0 : buttonState != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public boolean mo5530D(R00 r00) {
        O90.m5968f(r00, "handler");
        if (r00 == this || this.f9893C == null) {
            return false;
        }
        return r00 instanceof C11729xu0 ? ((C11729xu0) r00).f45881N : r00 instanceof NH0;
    }

    /* renamed from: E */
    public boolean mo5531E(R00 r00) {
        int[] iArr;
        O90.m5968f(r00, "handler");
        boolean z = true;
        if (r00 == this) {
            return true;
        }
        GH0 gh0 = this.f9893C;
        if (gh0 == null || (iArr = (int[]) gh0.f3663b.get(this.f9903d)) == null) {
            return false;
        }
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (iArr[i] == r00.f9903d) {
                break;
            }
            i++;
        }
        return z;
    }

    /* renamed from: F */
    public boolean mo5532F(R00 r00) {
        GH0 gh0;
        int[] iArr;
        O90.m5968f(r00, "handler");
        if (r00 == this || (gh0 = this.f9893C) == null || (iArr = (int[]) gh0.f3664c.get(this.f9903d)) == null) {
            return false;
        }
        for (int i : iArr) {
            if (i == r00.f9903d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public final void m6852G(int i) {
        int[] iArr = this.f9900a;
        if (iArr[i] == -1) {
            int i2 = 0;
            while (i2 < this.f9901b) {
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
            this.f9901b++;
        }
    }

    /* renamed from: H */
    public final void m6853H(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.m5968f(motionEvent2, "sourceEvent");
        int actionMasked = motionEvent.getActionMasked();
        Q00[] q00Arr = this.f9915p;
        int[] iArr = this.f9902c;
        if (actionMasked == 0 || motionEvent.getActionMasked() == 5) {
            this.f9911l = null;
            this.f9913n = 1;
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            Q00 q00 = new Q00(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - iArr[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - iArr[1]);
            q00Arr[pointerId] = q00;
            this.f9914o++;
            m6855c(q00);
            m6863l();
            m6860i();
            m6861j(motionEvent, motionEvent2);
            return;
        }
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 6) {
            if (motionEvent.getActionMasked() == 2) {
                m6861j(motionEvent, motionEvent2);
                return;
            }
            return;
        }
        m6861j(motionEvent, motionEvent2);
        m6863l();
        this.f9911l = null;
        this.f9913n = 3;
        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
        Q00 q002 = new Q00(pointerId2, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - iArr[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - iArr[1]);
        q00Arr[pointerId2] = q002;
        m6855c(q002);
        q00Arr[pointerId2] = null;
        this.f9914o--;
        m6860i();
    }

    /* renamed from: a */
    public void mo721a(boolean z) {
        if (!this.f9921v || z) {
            int i = this.f9905f;
            if (i == 0 || i == 2) {
                m6869s(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0041  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.MotionEvent m6854b(android.view.MotionEvent r31) throws p000.P00 {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.R00.m6854b(android.view.MotionEvent):android.view.MotionEvent");
    }

    /* renamed from: c */
    public final void m6855c(Q00 q00) {
        if (this.f9911l == null) {
            this.f9911l = Arguments.createArray();
        }
        WritableArray writableArray = this.f9911l;
        O90.m5965c(writableArray);
        writableArray.pushMap(m6848f(q00));
    }

    /* renamed from: d */
    public final void m6856d() {
        if (this.f9905f == 0) {
            m6869s(2);
        }
    }

    /* renamed from: e */
    public final void m6857e() {
        int i = this.f9905f;
        if (i == 4 || i == 0 || i == 2 || this.f9898H) {
            mo5614t();
            m6869s(3);
        }
    }

    /* renamed from: g */
    public void mo6858g(MotionEvent motionEvent) {
        KH0 kh0 = this.f9892B;
        if (kh0 != null) {
            kh0.f5981a.onHandlerUpdate(this);
        }
    }

    /* renamed from: h */
    public void mo6859h(int i, int i2) {
        KH0 kh0 = this.f9892B;
        if (kh0 != null) {
            kh0.f5981a.onStateChange(this, i, i2);
        }
    }

    /* renamed from: i */
    public final void m6860i() {
        KH0 kh0;
        if (this.f9911l == null || (kh0 = this.f9892B) == null) {
            return;
        }
        kh0.f5981a.onTouchEvent(this);
    }

    /* renamed from: j */
    public final void m6861j(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f9911l = null;
        this.f9913n = 2;
        float rawX = motionEvent2.getRawX() - motionEvent2.getX();
        float rawY = motionEvent2.getRawY() - motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            Q00 q00 = this.f9915p[motionEvent.getPointerId(i2)];
            if (q00 != null && (q00.f9396b != motionEvent.getX(i2) || q00.f9397c != motionEvent.getY(i2))) {
                q00.f9396b = motionEvent.getX(i2);
                q00.f9397c = motionEvent.getY(i2);
                float x = motionEvent2.getX(i2) + rawX;
                int[] iArr = this.f9902c;
                q00.f9398d = x - iArr[0];
                q00.f9399e = (motionEvent2.getY(i2) + rawY) - iArr[1];
                m6855c(q00);
                i++;
            }
        }
        if (i > 0) {
            m6863l();
            m6860i();
        }
    }

    /* renamed from: k */
    public final void m6862k() {
        int i = this.f9905f;
        if (i == 2 || i == 4) {
            m6869s(5);
        }
    }

    /* renamed from: l */
    public final void m6863l() {
        this.f9912m = null;
        for (Q00 q00 : this.f9915p) {
            if (q00 != null) {
                if (this.f9912m == null) {
                    this.f9912m = Arguments.createArray();
                }
                WritableArray writableArray = this.f9912m;
                O90.m5965c(writableArray);
                writableArray.pushMap(m6848f(q00));
            }
        }
    }

    /* renamed from: m */
    public final void m6864m() {
        int i = this.f9905f;
        if (i == 4 || i == 0 || i == 2) {
            m6869s(1);
        }
    }

    /* renamed from: o */
    public final float m6865o() {
        return (this.f9919t + this.f9922w) - this.f9902c[0];
    }

    /* renamed from: p */
    public final float m6866p() {
        return (this.f9920u + this.f9923x) - this.f9902c[1];
    }

    /* renamed from: q */
    public final boolean m6867q(R00 r00) {
        O90.m5968f(r00, "other");
        int[] iArr = this.f9900a;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iArr[i] != -1 && r00.f9900a[i] != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m6868r(View view, float f, float f2) {
        float f3;
        O90.m5965c(view);
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.f9917r;
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

    /* renamed from: s */
    public final void m6869s(int i) {
        UiThreadUtil.assertOnUiThread();
        if (this.f9905f == i) {
            return;
        }
        if (this.f9914o > 0 && (i == 5 || i == 3 || i == 1)) {
            this.f9913n = 4;
            this.f9911l = null;
            m6863l();
            Q00[] q00Arr = this.f9915p;
            for (Q00 q00 : q00Arr) {
                if (q00 != null) {
                    m6855c(q00);
                }
            }
            this.f9914o = 0;
            AbstractC0576J8.m4184k(q00Arr, 0, q00Arr.length);
            m6860i();
        }
        int i2 = this.f9905f;
        this.f9905f = i;
        if (i == 4) {
            short s = f9890L;
            f9890L = (short) (s + 1);
            this.f9918s = s;
        }
        T00 t00 = this.f9891A;
        O90.m5965c(t00);
        t00.f11100i++;
        PointF pointF = T00.f11087l;
        if (NV1.m5732l(i)) {
            for (R00 r00 : AbstractC7167xu.m25982b0(t00.f11096e)) {
                if (NV1.m5734n(r00, this) && t00.f11098g.contains(Integer.valueOf(r00.f9903d))) {
                    if (i == 5) {
                        r00.m6857e();
                        if (r00.f9905f == 5) {
                            r00.mo6859h(3, 2);
                        }
                        r00.f9898H = false;
                    } else {
                        t00.m7516j(r00);
                    }
                }
            }
            t00.m7507a();
        }
        if (i == 4) {
            t00.m7516j(this);
        } else if (i2 == 4 || i2 == 5) {
            if (this.f9897G) {
                mo6859h(i, i2);
            } else if (i2 == 4 && (i == 3 || i == 1)) {
                mo6859h(i, 2);
            }
        } else if (i2 != 0 || i != 3) {
            mo6859h(i, i2);
        }
        int i3 = t00.f11100i - 1;
        t00.f11100i = i3;
        if (t00.f11099h || i3 != 0) {
            t00.f11101j = true;
        } else {
            t00.m7508b();
        }
        mo6871y();
    }

    public final String toString() {
        String simpleName;
        View view = this.f9904e;
        if (view == null) {
            simpleName = null;
        } else {
            O90.m5965c(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.f9903d + "]:" + simpleName;
    }

    /* renamed from: u */
    public abstract void mo722u(MotionEvent motionEvent, MotionEvent motionEvent2);

    /* renamed from: v */
    public void mo5535v(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.m5968f(motionEvent2, "sourceEvent");
    }

    /* renamed from: z */
    public void mo6872z() {
        this.f9916q = false;
        this.f9921v = false;
        this.f9924y = false;
        this.f9909j = true;
        this.f9917r = null;
    }

    /* renamed from: A */
    public void mo720A() {
    }

    /* renamed from: t */
    public void mo5614t() {
    }

    /* renamed from: w */
    public void mo6870w() {
    }

    /* renamed from: x */
    public void mo723x() {
    }

    /* renamed from: y */
    public void mo6871y() {
    }
}
