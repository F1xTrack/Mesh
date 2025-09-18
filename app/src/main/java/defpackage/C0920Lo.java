package defpackage;

import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.util.Rational;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.lifecycle.a;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.EnumC0123Bi0;
import defpackage.InterfaceC0903Li0;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: Lo */
/* loaded from: classes2.dex */
public final class C0920Lo implements Closeable, InterfaceC0903Li0 {
    public final S91 a;
    public final C4034gp b;
    public C1696Vn c;
    public final RunnableC3467dr d;
    public LifecycleCamera e;
    public C3349dD0 f;
    public C7349u60 g;
    public C1371Ri1 h;
    public C4282i60 i;
    public C4282i60 j;
    public List k;
    public final C0852Kr0 l;
    public final C8157yM m;
    public C3954gO0 n;
    public final C1091Nt0 o;
    public boolean p;
    public final a q;
    public C4145hO0 r;
    public boolean s;
    public final AudioManager t;
    public final Executor u;

    public C0920Lo(S91 s91, C4034gp c4034gp) {
        O90.f(s91, "context");
        this.a = s91;
        this.b = c4034gp;
        CD0 cd0 = CD0.b;
        this.d = AbstractC6062nM1.a(s91);
        this.k = MN.a;
        this.l = new C0852Kr0(s91);
        this.m = new C8157yM(s91, this);
        this.o = SA1.a();
        a aVar = new a(this);
        this.q = aVar;
        Object systemService = s91.getSystemService("audio");
        O90.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.t = (AudioManager) systemService;
        Executor executorC = AbstractC3556eJ.c(s91);
        O90.e(executorC, "getMainExecutor(...)");
        this.u = executorC;
        EnumC0201Ci0 enumC0201Ci0 = EnumC0201Ci0.c;
        aVar.d("setCurrentState");
        aVar.f(enumC0201Ci0);
        aVar.a(new InterfaceC0669Ii0() { // from class: com.mrousavy.camera.core.CameraSession$1
            @Override // defpackage.InterfaceC0669Ii0
            public final void f(InterfaceC0903Li0 interfaceC0903Li0, EnumC0123Bi0 enumC0123Bi0) {
                enumC0123Bi0.a().toString();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00dd A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #0 {all -> 0x00d5, blocks: (B:155:0x00ce, B:159:0x00dd), top: B:198:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00fb A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:118:0x003a, B:165:0x00f7, B:167:0x00fb, B:168:0x00fe, B:170:0x0102, B:173:0x0116, B:174:0x0125, B:175:0x0133, B:177:0x0137, B:178:0x013e, B:180:0x0142, B:181:0x0149), top: B:206:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0102 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #4 {all -> 0x003f, blocks: (B:118:0x003a, B:165:0x00f7, B:167:0x00fb, B:168:0x00fe, B:170:0x0102, B:173:0x0116, B:174:0x0125, B:175:0x0133, B:177:0x0137, B:178:0x013e, B:180:0x0142, B:181:0x0149), top: B:206:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0137 A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:118:0x003a, B:165:0x00f7, B:167:0x00fb, B:168:0x00fe, B:170:0x0102, B:173:0x0116, B:174:0x0125, B:175:0x0133, B:177:0x0137, B:178:0x013e, B:180:0x0142, B:181:0x0149), top: B:206:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0142 A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:118:0x003a, B:165:0x00f7, B:167:0x00fb, B:168:0x00fe, B:170:0x0102, B:173:0x0116, B:174:0x0125, B:175:0x0133, B:177:0x0137, B:178:0x013e, B:180:0x0142, B:181:0x0149), top: B:206:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v21, types: [nZ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.C3271cp r12, defpackage.AbstractC1963Yy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0920Lo.a(cp, Yy):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.p = true;
        C8157yM c8157yM = this.m;
        ((DisplayManager) c8157yM.g).unregisterDisplayListener((C1574Ty0) c8157yM.h);
        ((C1652Uy0) c8157yM.i).disable();
        if (!UiThreadUtil.isOnUiThread()) {
            UiThreadUtil.runOnUiThread(new GR0(6, this));
            return;
        }
        EnumC0201Ci0 enumC0201Ci0 = EnumC0201Ci0.a;
        a aVar = this.q;
        aVar.d("setCurrentState");
        aVar.f(enumC0201Ci0);
    }

    @Override // defpackage.InterfaceC0903Li0
    public final AbstractC0357Ei0 getLifecycle() {
        return this.q;
    }

    public final void m() {
        int i;
        Rational rational;
        InterfaceC7480uo interfaceC7480uoD;
        C8157yM c8157yM = this.m;
        c8157yM.getClass();
        C0084Av0 c0084Av0 = EnumC1106Ny0.b;
        int i2 = c8157yM.a;
        c0084Av0.getClass();
        int iOrdinal = C0084Av0.B(i2).ordinal();
        int i3 = 3;
        if (iOrdinal == 0) {
            i = 0;
        } else if (iOrdinal == 1) {
            i = 1;
        } else if (iOrdinal == 2) {
            i = 2;
        } else {
            if (iOrdinal != 3) {
                throw new C7074sg();
            }
            i = 3;
        }
        C3349dD0 c3349dD0 = this.f;
        if (c3349dD0 != null && c3349dD0.B(i)) {
            c3349dD0.G();
        }
        C4282i60 c4282i60 = this.j;
        if (c4282i60 != null && c4282i60.B(i) && (interfaceC7480uoD = c4282i60.d()) != null) {
            c4282i60.o.b = c4282i60.i(interfaceC7480uoD, false);
        }
        int iOrdinal2 = c8157yM.b().ordinal();
        if (iOrdinal2 == 0) {
            i3 = 0;
        } else if (iOrdinal2 == 1) {
            i3 = 1;
        } else if (iOrdinal2 == 2) {
            i3 = 2;
        } else if (iOrdinal2 != 3) {
            throw new C7074sg();
        }
        C7349u60 c7349u60 = this.g;
        if (c7349u60 != null) {
            int iL = c7349u60.l();
            if (c7349u60.B(i3) && c7349u60.s != null) {
                int iAbs = Math.abs(AbstractC4346iR1.d(i3) - AbstractC4346iR1.d(iL));
                Rational rational2 = c7349u60.s;
                if (iAbs == 90 || iAbs == 270) {
                    if (rational2 != null) {
                        rational2 = new Rational(rational2.getDenominator(), rational2.getNumerator());
                    }
                    rational = rational2;
                } else {
                    rational = new Rational(rational2.getNumerator(), rational2.getDenominator());
                }
                c7349u60.s = rational;
            }
        }
        C1371Ri1 c1371Ri1 = this.h;
        if (c1371Ri1 != null && c1371Ri1.B(i3)) {
            c1371Ri1.P();
        }
    }
}
