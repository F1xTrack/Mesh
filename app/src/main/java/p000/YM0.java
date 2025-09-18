package p000;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.textinput.ReactTextInputManager;

/* loaded from: classes.dex */
public final class YM0 implements InterfaceC0439Gy, OW0, UX0 {

    /* renamed from: a */
    public final Object f14268a;

    /* renamed from: b */
    public Object f14269b;

    /* renamed from: c */
    public final int f14270c;

    /* renamed from: d */
    public int f14271d;

    /* renamed from: e */
    public int f14272e;

    public YM0(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    /* renamed from: a */
    public void m9266a() {
        int i = this.f14272e;
        this.f14272e = i == Integer.MIN_VALUE ? this.f14270c : i + this.f14271d;
        this.f14269b = ((String) this.f14268a) + this.f14272e;
    }

    /* renamed from: b */
    public void m9267b() {
        if (this.f14272e == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: c */
    public void m9268c(int i, int i2) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        if (this.f14271d == iMin && this.f14272e == iMax) {
            return;
        }
        C0376Fy c0376Fy = new C0376Fy(this.f14270c, ((C9099dK0) this.f14268a).getId());
        c0376Fy.f3496b = iMin;
        c0376Fy.f3497c = iMax;
        ((InterfaceC6947uP) this.f14269b).mo11046g(c0376Fy);
        this.f14271d = iMin;
        this.f14272e = iMax;
    }

    public YM0(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f14268a = str;
        this.f14270c = i2;
        this.f14271d = i3;
        this.f14272e = Integer.MIN_VALUE;
        this.f14269b = "";
    }

    public YM0(C9099dK0 c9099dK0, int i) {
        switch (i) {
            case 1:
                this.f14268a = c9099dK0;
                ReactContext reactContextM6092c = OZ1.m6092c(c9099dK0);
                this.f14269b = ReactTextInputManager.getEventDispatcher(reactContextM6092c, c9099dK0);
                this.f14270c = OZ1.m6093d(reactContextM6092c);
                break;
            case 2:
                this.f14268a = c9099dK0;
                ReactContext reactContextM6092c2 = OZ1.m6092c(c9099dK0);
                this.f14269b = ReactTextInputManager.getEventDispatcher(reactContextM6092c2, c9099dK0);
                this.f14270c = OZ1.m6093d(reactContextM6092c2);
                break;
            default:
                this.f14271d = 0;
                this.f14272e = 0;
                this.f14268a = c9099dK0;
                ReactContext reactContextM6092c3 = OZ1.m6092c(c9099dK0);
                this.f14269b = ReactTextInputManager.getEventDispatcher(reactContextM6092c3, c9099dK0);
                this.f14270c = OZ1.m6093d(reactContextM6092c3);
                break;
        }
    }
}
