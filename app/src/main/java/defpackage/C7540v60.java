package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: v60 */
/* loaded from: classes.dex */
public final class C7540v60 implements InterfaceC5361jh1, Y60, InterfaceC3608ea0 {
    public static final C0572Hc b;
    public static final C0572Hc c;
    public static final C0572Hc d;
    public static final C0572Hc e;
    public static final C0572Hc f;
    public static final C0572Hc g;
    public static final C0572Hc h;
    public static final C0572Hc i;
    public static final C0572Hc j;
    public static final C0572Hc k;
    public static final C0572Hc l;
    public static final C0572Hc m;
    public final C0873Ky0 a;

    static {
        Class cls = Integer.TYPE;
        b = new C0572Hc("camerax.core.imageCapture.captureMode", cls, null);
        c = new C0572Hc("camerax.core.imageCapture.flashMode", cls, null);
        d = new C0572Hc("camerax.core.imageCapture.captureBundle", C1546Tp.class, null);
        e = new C0572Hc("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        f = new C0572Hc("camerax.core.imageCapture.outputFormat", Integer.class, null);
        g = new C0572Hc("camerax.core.imageCapture.imageReaderProxyProvider", InterfaceC5443k70.class, null);
        h = new C0572Hc("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        i = new C0572Hc("camerax.core.imageCapture.flashType", cls, null);
        j = new C0572Hc("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
        k = new C0572Hc("camerax.core.imageCapture.screenFlash", InterfaceC7158t60.class, null);
        l = new C0572Hc("camerax.core.useCase.postviewResolutionSelector", C3775fS0.class, null);
        m = new C0572Hc("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public C7540v60(C0873Ky0 c0873Ky0) {
        this.a = c0873Ky0;
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ Set A(C0572Hc c0572Hc) {
        return AbstractC7209tN0.d(this, c0572Hc);
    }

    @Override // defpackage.InterfaceC5361jh1
    public final /* synthetic */ boolean C() {
        return F91.k(this);
    }

    @Override // defpackage.Y60
    public final /* synthetic */ ArrayList D() {
        return X60.b(this);
    }

    @Override // defpackage.Y60
    public final C3775fS0 E() {
        int i2 = X60.a;
        return (C3775fS0) q(Y60.I0, null);
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ Object F(C0572Hc c0572Hc, EnumC6931rw enumC6931rw) {
        return AbstractC7209tN0.k(this, c0572Hc, enumC6931rw);
    }

    @Override // defpackage.InterfaceC5361jh1
    public final /* synthetic */ C8194yY0 H() {
        return F91.d(this);
    }

    @Override // defpackage.C81
    public final /* synthetic */ String K(String str) {
        return AbstractC7209tN0.f(this, str);
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ void L(InterfaceC6741qw interfaceC6741qw) {
        AbstractC7209tN0.b(this, interfaceC6741qw);
    }

    @Override // defpackage.Y60
    public final Size M() {
        int i2 = X60.a;
        return (Size) q(Y60.F0, null);
    }

    @Override // defpackage.InterfaceC7122sw
    public final boolean Q(C0572Hc c0572Hc) {
        return ((C0873Ky0) getConfig()).Q(c0572Hc);
    }

    @Override // defpackage.Y60
    public final Size S() {
        int i2 = X60.a;
        return (Size) q(Y60.E0, null);
    }

    @Override // defpackage.InterfaceC5361jh1
    public final /* synthetic */ EnumC5743lh1 T() {
        return F91.b(this);
    }

    @Override // defpackage.InterfaceC5361jh1
    public final /* synthetic */ int U() {
        return F91.j(this);
    }

    @Override // defpackage.M60
    public final /* synthetic */ int Y() {
        return NX.b(this);
    }

    @Override // defpackage.InterfaceC5361jh1
    public final /* synthetic */ Range Z(Range range) {
        return F91.i(this, range);
    }

    @Override // defpackage.C81
    public final /* synthetic */ String b0() {
        return AbstractC7209tN0.e(this);
    }

    @Override // defpackage.Y60
    public final boolean c0() {
        int i2 = X60.a;
        return Q(Y60.A0);
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ EnumC6931rw d0(C0572Hc c0572Hc) {
        return AbstractC7209tN0.c(this, c0572Hc);
    }

    @Override // defpackage.Y60
    public final /* synthetic */ int e0() {
        return X60.e(this);
    }

    @Override // defpackage.InterfaceC5361jh1
    public final /* synthetic */ int g0() {
        return F91.e(this);
    }

    @Override // defpackage.InterfaceC7400uN0
    public final InterfaceC7122sw getConfig() {
        return this.a;
    }

    @Override // defpackage.M60
    public final /* synthetic */ CM k() {
        return NX.a(this);
    }

    @Override // defpackage.Y60
    public final Size l0() {
        int i2 = X60.a;
        return (Size) q(Y60.G0, null);
    }

    @Override // defpackage.InterfaceC5361jh1
    public final /* synthetic */ boolean m0() {
        return F91.m(this);
    }

    @Override // defpackage.Y60
    public final /* synthetic */ List n() {
        return X60.d(this);
    }

    @Override // defpackage.Y60
    public final /* synthetic */ int n0(int i2) {
        return X60.f(this, i2);
    }

    @Override // defpackage.Y60
    public final C3775fS0 o() {
        int i2 = X60.a;
        return (C3775fS0) w(Y60.I0);
    }

    @Override // defpackage.M60
    public final int p() {
        return ((Integer) AbstractC7209tN0.i(this, M60.x0)).intValue();
    }

    @Override // defpackage.Y60
    public final /* synthetic */ int p0() {
        return X60.a(this);
    }

    @Override // defpackage.InterfaceC7122sw
    public final Object q(C0572Hc c0572Hc, Object obj) {
        return ((C0873Ky0) getConfig()).q(c0572Hc, obj);
    }

    @Override // defpackage.Y60
    public final /* synthetic */ int r() {
        return X60.c(this);
    }

    @Override // defpackage.InterfaceC5361jh1
    public final /* synthetic */ C4203hh1 s() {
        return F91.h(this);
    }

    @Override // defpackage.M60
    public final boolean t() {
        return Q(M60.z0);
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ Set u() {
        return AbstractC7209tN0.g(this);
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ Object w(C0572Hc c0572Hc) {
        return AbstractC7209tN0.i(this, c0572Hc);
    }

    @Override // defpackage.InterfaceC5361jh1
    public final /* synthetic */ C8194yY0 x() {
        return F91.c(this);
    }

    @Override // defpackage.InterfaceC5361jh1
    public final /* synthetic */ int y() {
        return F91.g(this);
    }

    @Override // defpackage.InterfaceC5361jh1
    public final /* synthetic */ C5377jn z() {
        return F91.f(this);
    }
}
