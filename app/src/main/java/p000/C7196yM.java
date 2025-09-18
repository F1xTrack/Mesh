package p000;

import android.hardware.display.DisplayManager;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Objects;

/* renamed from: yM */
/* loaded from: classes.dex */
public final class C7196yM {

    /* renamed from: a */
    public int f46221a;

    /* renamed from: b */
    public int f46222b;

    /* renamed from: c */
    public final Object f46223c;

    /* renamed from: d */
    public Object f46224d;

    /* renamed from: e */
    public Object f46225e;

    /* renamed from: f */
    public Object f46226f;

    /* renamed from: g */
    public final Object f46227g;

    /* renamed from: h */
    public Object f46228h;

    /* renamed from: i */
    public Object f46229i;

    public C7196yM(S91 s91, C0743Lo c0743Lo) {
        O90.m5968f(s91, "context");
        this.f46223c = c0743Lo;
        this.f46224d = EnumC9693hz0.f28706c;
        Object systemService = s91.getSystemService("display");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        this.f46227g = (DisplayManager) systemService;
        this.f46228h = new C8350Ty0(0, this);
        this.f46229i = new C8402Uy0(this, s91);
    }

    /* renamed from: a */
    public static final void m26140a(C7196yM c7196yM) {
        c7196yM.getClass();
        C7356Av0 c7356Av0 = EnumC8038Ny0.f8146b;
        int i = c7196yM.f46221a;
        c7356Av0.getClass();
        EnumC8038Ny0 enumC8038Ny0M373B = C7356Av0.m373B(i);
        EnumC8038Ny0 enumC8038Ny0 = (EnumC8038Ny0) c7196yM.f46226f;
        C0743Lo c0743Lo = (C0743Lo) c7196yM.f46223c;
        C4140gp c4140gp = c0743Lo.f6857b;
        if (enumC8038Ny0 != enumC8038Ny0M373B) {
            enumC8038Ny0M373B.toString();
            c0743Lo.m5108m();
            enumC8038Ny0M373B.toString();
            int iM6094e = OZ1.m6094e(c4140gp);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("previewOrientation", enumC8038Ny0M373B.f8152a);
            ER1.m2274e(c4140gp, new C4004ef(iM6094e, c4140gp.getId(), writableMapCreateMap, 4));
            c7196yM.f46226f = enumC8038Ny0M373B;
        }
        EnumC8038Ny0 enumC8038Ny0M26141b = c7196yM.m26141b();
        if (((EnumC8038Ny0) c7196yM.f46225e) != enumC8038Ny0M26141b) {
            enumC8038Ny0M26141b.toString();
            c0743Lo.m5108m();
            enumC8038Ny0M26141b.toString();
            int iM6094e2 = OZ1.m6094e(c4140gp);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("outputOrientation", enumC8038Ny0M26141b.f8152a);
            ER1.m2274e(c4140gp, new C4004ef(iM6094e2, c4140gp.getId(), writableMapCreateMap2, 3));
            c7196yM.f46225e = enumC8038Ny0M26141b;
        }
    }

    /* renamed from: b */
    public EnumC8038Ny0 m26141b() {
        int iOrdinal = ((EnumC9693hz0) this.f46224d).ordinal();
        if (iOrdinal == 0) {
            C7356Av0 c7356Av0 = EnumC8038Ny0.f8146b;
            int i = this.f46222b;
            c7356Av0.getClass();
            return C7356Av0.m373B(i);
        }
        if (iOrdinal != 1) {
            throw new C6838sg();
        }
        C7356Av0 c7356Av02 = EnumC8038Ny0.f8146b;
        int i2 = this.f46221a;
        c7356Av02.getClass();
        return C7356Av0.m373B(i2);
    }

    /* renamed from: c */
    public void m26142c(EnumC9693hz0 enumC9693hz0) {
        O90.m5968f(enumC9693hz0, "targetOrientation");
        Objects.toString((EnumC9693hz0) this.f46224d);
        enumC9693hz0.toString();
        this.f46224d = enumC9693hz0;
        DisplayManager displayManager = (DisplayManager) this.f46227g;
        C8350Ty0 c8350Ty0 = (C8350Ty0) this.f46228h;
        displayManager.unregisterDisplayListener(c8350Ty0);
        C8402Uy0 c8402Uy0 = (C8402Uy0) this.f46229i;
        c8402Uy0.disable();
        int iOrdinal = enumC9693hz0.ordinal();
        if (iOrdinal == 0) {
            c8402Uy0.enable();
            displayManager.registerDisplayListener(c8350Ty0, null);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            displayManager.registerDisplayListener(c8350Ty0, null);
        }
    }

    public C7196yM(int i, int i2) {
        this.f46221a = i;
        this.f46222b = i2;
        this.f46223c = new SparseArray();
        this.f46224d = new SparseArray();
        this.f46225e = new SparseArray();
        this.f46226f = new SparseArray();
        this.f46227g = new SparseArray();
    }
}
