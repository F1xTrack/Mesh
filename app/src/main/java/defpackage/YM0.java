package defpackage;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.textinput.ReactTextInputManager;

/* loaded from: classes.dex */
public final class YM0 implements InterfaceC0560Gy, OW0, UX0 {
    public final Object a;
    public Object b;
    public final int c;
    public int d;
    public int e;

    public YM0(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public void a() {
        int i = this.e;
        this.e = i == Integer.MIN_VALUE ? this.c : i + this.d;
        this.b = ((String) this.a) + this.e;
    }

    public void b() {
        if (this.e == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public void c(int i, int i2) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        if (this.d == iMin && this.e == iMax) {
            return;
        }
        C0482Fy c0482Fy = new C0482Fy(this.c, ((C3370dK0) this.a).getId());
        c0482Fy.b = iMin;
        c0482Fy.c = iMax;
        ((InterfaceC7405uP) this.b).g(c0482Fy);
        this.d = iMin;
        this.e = iMax;
    }

    public YM0(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.a = str;
        this.c = i2;
        this.d = i3;
        this.e = Integer.MIN_VALUE;
        this.b = "";
    }

    public YM0(C3370dK0 c3370dK0, int i) {
        switch (i) {
            case 1:
                this.a = c3370dK0;
                ReactContext reactContextC = OZ1.c(c3370dK0);
                this.b = ReactTextInputManager.getEventDispatcher(reactContextC, c3370dK0);
                this.c = OZ1.d(reactContextC);
                break;
            case 2:
                this.a = c3370dK0;
                ReactContext reactContextC2 = OZ1.c(c3370dK0);
                this.b = ReactTextInputManager.getEventDispatcher(reactContextC2, c3370dK0);
                this.c = OZ1.d(reactContextC2);
                break;
            default:
                this.d = 0;
                this.e = 0;
                this.a = c3370dK0;
                ReactContext reactContextC3 = OZ1.c(c3370dK0);
                this.b = ReactTextInputManager.getEventDispatcher(reactContextC3, c3370dK0);
                this.c = OZ1.d(reactContextC3);
                break;
        }
    }
}
