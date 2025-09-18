package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;

/* renamed from: Gu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7666Gu0 {

    /* renamed from: a */
    public ViewParent f3951a;

    /* renamed from: b */
    public ViewParent f3952b;

    /* renamed from: c */
    public final ViewGroup f3953c;

    /* renamed from: d */
    public boolean f3954d;

    /* renamed from: e */
    public int[] f3955e;

    public C7666Gu0(ViewGroup viewGroup) {
        this.f3953c = viewGroup;
    }

    /* renamed from: a */
    public final boolean m3191a(float f, float f2, boolean z) {
        ViewParent viewParentM3195e;
        if (!this.f3954d || (viewParentM3195e = m3195e(0)) == null) {
            return false;
        }
        try {
            return AbstractC10434nl1.m23215a(viewParentM3195e, this.f3953c, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParentM3195e);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m3192b(float f, float f2) {
        ViewParent viewParentM3195e;
        if (!this.f3954d || (viewParentM3195e = m3195e(0)) == null) {
            return false;
        }
        try {
            return AbstractC10434nl1.m23216b(viewParentM3195e, this.f3953c, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParentM3195e);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m3193c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentM3195e;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f3954d || (viewParentM3195e = m3195e(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f3953c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f3955e == null) {
                this.f3955e = new int[2];
            }
            iArr3 = this.f3955e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM3195e instanceof InterfaceC7718Hu0) {
            ((InterfaceC7718Hu0) viewParentM3195e).mo3645f(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                AbstractC10434nl1.m23217c(viewParentM3195e, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentM3195e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* renamed from: d */
    public final boolean m3194d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM3195e;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f3954d || (viewParentM3195e = m3195e(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f3953c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f3955e == null) {
                this.f3955e = new int[2];
            }
            int[] iArr4 = this.f3955e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (viewParentM3195e instanceof InterfaceC7770Iu0) {
            ((InterfaceC7770Iu0) viewParentM3195e).mo4065b(viewGroup, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (viewParentM3195e instanceof InterfaceC7718Hu0) {
                ((InterfaceC7718Hu0) viewParentM3195e).mo3642c(viewGroup, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    AbstractC10434nl1.m23218d(viewParentM3195e, viewGroup, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentM3195e);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: e */
    public final ViewParent m3195e(int i) {
        if (i == 0) {
            return this.f3951a;
        }
        if (i != 1) {
            return null;
        }
        return this.f3952b;
    }

    /* renamed from: f */
    public final boolean m3196f(int i) {
        return m3195e(i) != null;
    }

    /* renamed from: g */
    public final boolean m3197g(int i, int i2) {
        boolean zM23220f;
        if (m3196f(i2)) {
            return true;
        }
        if (this.f3954d) {
            ViewGroup viewGroup = this.f3953c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof InterfaceC7718Hu0;
                if (z) {
                    zM23220f = ((InterfaceC7718Hu0) parent).mo3643d(view, viewGroup, i, i2);
                } else if (i2 == 0) {
                    try {
                        zM23220f = AbstractC10434nl1.m23220f(parent, view, viewGroup, i);
                    } catch (AbstractMethodError unused) {
                        Objects.toString(parent);
                    }
                } else {
                    zM23220f = false;
                }
                if (zM23220f) {
                    if (i2 == 0) {
                        this.f3951a = parent;
                    } else if (i2 == 1) {
                        this.f3952b = parent;
                    }
                    if (z) {
                        ((InterfaceC7718Hu0) parent).mo3644e(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            AbstractC10434nl1.m23219e(parent, view, viewGroup, i);
                        } catch (AbstractMethodError unused2) {
                            Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void m3198h(int i) {
        ViewParent viewParentM3195e = m3195e(i);
        if (viewParentM3195e != null) {
            boolean z = viewParentM3195e instanceof InterfaceC7718Hu0;
            ViewGroup viewGroup = this.f3953c;
            if (z) {
                ((InterfaceC7718Hu0) viewParentM3195e).mo3641a(i, viewGroup);
            } else if (i == 0) {
                try {
                    AbstractC10434nl1.m23221g(viewParentM3195e, viewGroup);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentM3195e);
                }
            }
            if (i == 0) {
                this.f3951a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f3952b = null;
            }
        }
    }
}
