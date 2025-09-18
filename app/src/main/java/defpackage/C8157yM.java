package defpackage;

import android.hardware.display.DisplayManager;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Objects;

/* renamed from: yM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8157yM {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;
    public Object h;
    public Object i;

    public C8157yM(S91 s91, C0920Lo c0920Lo) {
        O90.f(s91, "context");
        this.c = c0920Lo;
        this.d = EnumC4256hz0.c;
        Object systemService = s91.getSystemService("display");
        O90.d(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        this.g = (DisplayManager) systemService;
        this.h = new C1574Ty0(0, this);
        this.i = new C1652Uy0(this, s91);
    }

    public static final void a(C8157yM c8157yM) {
        c8157yM.getClass();
        C0084Av0 c0084Av0 = EnumC1106Ny0.b;
        int i = c8157yM.a;
        c0084Av0.getClass();
        EnumC1106Ny0 enumC1106Ny0B = C0084Av0.B(i);
        EnumC1106Ny0 enumC1106Ny0 = (EnumC1106Ny0) c8157yM.f;
        C0920Lo c0920Lo = (C0920Lo) c8157yM.c;
        C4034gp c4034gp = c0920Lo.b;
        if (enumC1106Ny0 != enumC1106Ny0B) {
            enumC1106Ny0B.toString();
            c0920Lo.m();
            enumC1106Ny0B.toString();
            int iE = OZ1.e(c4034gp);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("previewOrientation", enumC1106Ny0B.a);
            ER1.e(c4034gp, new C3622ef(iE, c4034gp.getId(), writableMapCreateMap, 4));
            c8157yM.f = enumC1106Ny0B;
        }
        EnumC1106Ny0 enumC1106Ny0B2 = c8157yM.b();
        if (((EnumC1106Ny0) c8157yM.e) != enumC1106Ny0B2) {
            enumC1106Ny0B2.toString();
            c0920Lo.m();
            enumC1106Ny0B2.toString();
            int iE2 = OZ1.e(c4034gp);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("outputOrientation", enumC1106Ny0B2.a);
            ER1.e(c4034gp, new C3622ef(iE2, c4034gp.getId(), writableMapCreateMap2, 3));
            c8157yM.e = enumC1106Ny0B2;
        }
    }

    public EnumC1106Ny0 b() {
        int iOrdinal = ((EnumC4256hz0) this.d).ordinal();
        if (iOrdinal == 0) {
            C0084Av0 c0084Av0 = EnumC1106Ny0.b;
            int i = this.b;
            c0084Av0.getClass();
            return C0084Av0.B(i);
        }
        if (iOrdinal != 1) {
            throw new C7074sg();
        }
        C0084Av0 c0084Av02 = EnumC1106Ny0.b;
        int i2 = this.a;
        c0084Av02.getClass();
        return C0084Av0.B(i2);
    }

    public void c(EnumC4256hz0 enumC4256hz0) {
        O90.f(enumC4256hz0, "targetOrientation");
        Objects.toString((EnumC4256hz0) this.d);
        enumC4256hz0.toString();
        this.d = enumC4256hz0;
        DisplayManager displayManager = (DisplayManager) this.g;
        C1574Ty0 c1574Ty0 = (C1574Ty0) this.h;
        displayManager.unregisterDisplayListener(c1574Ty0);
        C1652Uy0 c1652Uy0 = (C1652Uy0) this.i;
        c1652Uy0.disable();
        int iOrdinal = enumC4256hz0.ordinal();
        if (iOrdinal == 0) {
            c1652Uy0.enable();
            displayManager.registerDisplayListener(c1574Ty0, null);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            displayManager.registerDisplayListener(c1574Ty0, null);
        }
    }

    public C8157yM(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.f = new SparseArray();
        this.g = new SparseArray();
    }
}
