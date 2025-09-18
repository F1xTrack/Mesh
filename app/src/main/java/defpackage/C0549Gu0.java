package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;

/* renamed from: Gu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549Gu0 {
    public ViewParent a;
    public ViewParent b;
    public final ViewGroup c;
    public boolean d;
    public int[] e;

    public C0549Gu0(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent viewParentE;
        if (!this.d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return AbstractC6137nl1.a(viewParentE, this.c, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParentE);
            return false;
        }
    }

    public final boolean b(float f, float f2) {
        ViewParent viewParentE;
        if (!this.d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return AbstractC6137nl1.b(viewParentE, this.c, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParentE);
            return false;
        }
    }

    public final boolean c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.d || (viewParentE = e(i3)) == null) {
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
        ViewGroup viewGroup = this.c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof InterfaceC0627Hu0) {
            ((InterfaceC0627Hu0) viewParentE).f(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                AbstractC6137nl1.c(viewParentE, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentE;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (viewParentE = e(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (viewParentE instanceof InterfaceC0705Iu0) {
            ((InterfaceC0705Iu0) viewParentE).b(viewGroup, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (viewParentE instanceof InterfaceC0627Hu0) {
                ((InterfaceC0627Hu0) viewParentE).c(viewGroup, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    AbstractC6137nl1.d(viewParentE, viewGroup, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentE);
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

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i2) {
        boolean zF;
        if (f(i2)) {
            return true;
        }
        if (this.d) {
            ViewGroup viewGroup = this.c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof InterfaceC0627Hu0;
                if (z) {
                    zF = ((InterfaceC0627Hu0) parent).d(view, viewGroup, i, i2);
                } else if (i2 == 0) {
                    try {
                        zF = AbstractC6137nl1.f(parent, view, viewGroup, i);
                    } catch (AbstractMethodError unused) {
                        Objects.toString(parent);
                    }
                } else {
                    zF = false;
                }
                if (zF) {
                    if (i2 == 0) {
                        this.a = parent;
                    } else if (i2 == 1) {
                        this.b = parent;
                    }
                    if (z) {
                        ((InterfaceC0627Hu0) parent).e(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            AbstractC6137nl1.e(parent, view, viewGroup, i);
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

    public final void h(int i) {
        ViewParent viewParentE = e(i);
        if (viewParentE != null) {
            boolean z = viewParentE instanceof InterfaceC0627Hu0;
            ViewGroup viewGroup = this.c;
            if (z) {
                ((InterfaceC0627Hu0) viewParentE).a(i, viewGroup);
            } else if (i == 0) {
                try {
                    AbstractC6137nl1.g(viewParentE, viewGroup);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentE);
                }
            }
            if (i == 0) {
                this.a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.b = null;
            }
        }
    }
}
