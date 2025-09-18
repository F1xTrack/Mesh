package p000;

import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.util.Rational;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.lifecycle.C1742a;
import com.facebook.react.bridge.UiThreadUtil;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.Executor;
import p000.EnumC7382Bi0;
import p000.InterfaceC7902Li0;

/* renamed from: Lo */
/* loaded from: classes2.dex */
public final class C0743Lo implements Closeable, InterfaceC7902Li0 {

    /* renamed from: a */
    public final S91 f6856a;

    /* renamed from: b */
    public final C4140gp f6857b;

    /* renamed from: c */
    public C1371Vn f6858c;

    /* renamed from: d */
    public final RunnableC3953dr f6859d;

    /* renamed from: e */
    public LifecycleCamera f6860e;

    /* renamed from: f */
    public C9085dD0 f6861f;

    /* renamed from: g */
    public C11247u60 f6862g;

    /* renamed from: h */
    public C8215Ri1 f6863h;

    /* renamed from: i */
    public C9711i60 f6864i;

    /* renamed from: j */
    public C9711i60 f6865j;

    /* renamed from: k */
    public List f6866k;

    /* renamed from: l */
    public final C7868Kr0 f6867l;

    /* renamed from: m */
    public final C7196yM f6868m;

    /* renamed from: n */
    public C9491gO0 f6869n;

    /* renamed from: o */
    public final C8028Nt0 f6870o;

    /* renamed from: p */
    public boolean f6871p;

    /* renamed from: q */
    public final C1742a f6872q;

    /* renamed from: r */
    public C9619hO0 f6873r;

    /* renamed from: s */
    public boolean f6874s;

    /* renamed from: t */
    public final AudioManager f6875t;

    /* renamed from: u */
    public final Executor f6876u;

    public C0743Lo(S91 s91, C4140gp c4140gp) {
        O90.m5968f(s91, "context");
        this.f6856a = s91;
        this.f6857b = c4140gp;
        CD0 cd0 = CD0.f1253b;
        this.f6859d = AbstractC10384nM1.m23132a(s91);
        this.f6866k = C0779MN.f7117a;
        this.f6867l = new C7868Kr0(s91);
        this.f6868m = new C7196yM(s91, this);
        this.f6870o = SA1.m7187a();
        C1742a c1742a = new C1742a(this);
        this.f6872q = c1742a;
        Object systemService = s91.getSystemService("audio");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f6875t = (AudioManager) systemService;
        Executor executorM17901c = AbstractC3982eJ.m17901c(s91);
        O90.m5967e(executorM17901c, "getMainExecutor(...)");
        this.f6876u = executorM17901c;
        EnumC7434Ci0 enumC7434Ci0 = EnumC7434Ci0.f1588c;
        c1742a.m10125d("setCurrentState");
        c1742a.m10127f(enumC7434Ci0);
        c1742a.mo2368a(new InterfaceC7746Ii0() { // from class: com.mrousavy.camera.core.CameraSession$1
            @Override // p000.InterfaceC7746Ii0
            /* renamed from: f */
            public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
                enumC7382Bi0.m812a().toString();
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5107a(p000.C3889cp r12, p000.AbstractC1571Yy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0743Lo.m5107a(cp, Yy):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6871p = true;
        C7196yM c7196yM = this.f6868m;
        ((DisplayManager) c7196yM.f46227g).unregisterDisplayListener((C8350Ty0) c7196yM.f46228h);
        ((C8402Uy0) c7196yM.f46229i).disable();
        if (!UiThreadUtil.isOnUiThread()) {
            UiThreadUtil.runOnUiThread(new GR0(6, this));
            return;
        }
        EnumC7434Ci0 enumC7434Ci0 = EnumC7434Ci0.f1586a;
        C1742a c1742a = this.f6872q;
        c1742a.m10125d("setCurrentState");
        c1742a.m10127f(enumC7434Ci0);
    }

    @Override // p000.InterfaceC7902Li0
    public final AbstractC7538Ei0 getLifecycle() {
        return this.f6872q;
    }

    /* renamed from: m */
    public final void m5108m() {
        int i;
        Rational rational;
        InterfaceC6972uo interfaceC6972uoM18274d;
        C7196yM c7196yM = this.f6868m;
        c7196yM.getClass();
        C7356Av0 c7356Av0 = EnumC8038Ny0.f8146b;
        int i2 = c7196yM.f46221a;
        c7356Av0.getClass();
        int iOrdinal = C7356Av0.m373B(i2).ordinal();
        int i3 = 3;
        if (iOrdinal == 0) {
            i = 0;
        } else if (iOrdinal == 1) {
            i = 1;
        } else if (iOrdinal == 2) {
            i = 2;
        } else {
            if (iOrdinal != 3) {
                throw new C6838sg();
            }
            i = 3;
        }
        C9085dD0 c9085dD0 = this.f6861f;
        if (c9085dD0 != null && c9085dD0.m18268B(i)) {
            c9085dD0.m17505G();
        }
        C9711i60 c9711i60 = this.f6865j;
        if (c9711i60 != null && c9711i60.m18268B(i) && (interfaceC6972uoM18274d = c9711i60.m18274d()) != null) {
            c9711i60.f28820o.f36893b = c9711i60.m18278i(interfaceC6972uoM18274d, false);
        }
        int iOrdinal2 = c7196yM.m26141b().ordinal();
        if (iOrdinal2 == 0) {
            i3 = 0;
        } else if (iOrdinal2 == 1) {
            i3 = 1;
        } else if (iOrdinal2 == 2) {
            i3 = 2;
        } else if (iOrdinal2 != 3) {
            throw new C6838sg();
        }
        C11247u60 c11247u60 = this.f6862g;
        if (c11247u60 != null) {
            int iM18280l = c11247u60.m18280l();
            if (c11247u60.m18268B(i3) && c11247u60.f43518s != null) {
                int iAbs = Math.abs(AbstractC9754iR1.m19040d(i3) - AbstractC9754iR1.m19040d(iM18280l));
                Rational rational2 = c11247u60.f43518s;
                if (iAbs == 90 || iAbs == 270) {
                    if (rational2 != null) {
                        rational2 = new Rational(rational2.getDenominator(), rational2.getNumerator());
                    }
                    rational = rational2;
                } else {
                    rational = new Rational(rational2.getNumerator(), rational2.getDenominator());
                }
                c11247u60.f43518s = rational;
            }
        }
        C8215Ri1 c8215Ri1 = this.f6863h;
        if (c8215Ri1 != null && c8215Ri1.m18268B(i3)) {
            c8215Ri1.m7100P();
        }
    }
}
