package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.icu.text.RuleBasedCollator;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.fragment.app.a;
import androidx.fragment.app.l;
import com.facebook.react.bridge.Arguments;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.KotlinVersion;
import ru.mes.dnevnik.R;

/* renamed from: Qm0 */
/* loaded from: classes.dex */
public class C1304Qm0 implements InterfaceC7701vy, PZ, InterfaceC1646Uw0, InterfaceC1490Sw0, GD, Provider, InterfaceC3793fY0, InterfaceC4279i50, InterfaceC0131Bl {
    public static final C6373p00 c = new C6373p00(1);
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C1304Qm0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void A(int i, C0440Fk c0440Fk) {
        ((C6735qu) this.b).J(i, c0440Fk);
    }

    public void B(int i, double d) {
        C6735qu c6735qu = (C6735qu) this.b;
        c6735qu.getClass();
        c6735qu.N(i, Double.doubleToRawLongBits(d));
    }

    public void C(int i, int i2) {
        ((C6735qu) this.b).P(i, i2);
    }

    public void D(int i, int i2) {
        ((C6735qu) this.b).L(i, i2);
    }

    public void E(int i, long j) {
        ((C6735qu) this.b).N(i, j);
    }

    public void F(int i, float f) {
        C6735qu c6735qu = (C6735qu) this.b;
        c6735qu.getClass();
        c6735qu.L(i, Float.floatToRawIntBits(f));
    }

    @Override // defpackage.InterfaceC4279i50
    public EnumC3897g50 G() {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) this.b;
        if (ruleBasedCollator == null) {
            return EnumC3897g50.e;
        }
        int strength = ruleBasedCollator.getStrength();
        return strength == 0 ? ((RuleBasedCollator) this.b).isCaseLevel() ? EnumC3897g50.c : EnumC3897g50.a : strength == 1 ? EnumC3897g50.b : EnumC3897g50.d;
    }

    public void H(int i, Object obj, EV0 ev0) {
        C6735qu c6735qu = (C6735qu) this.b;
        c6735qu.T(i, 3);
        ev0.d((L0) obj, c6735qu.a);
        c6735qu.T(i, 4);
    }

    public void I(int i, int i2) {
        ((C6735qu) this.b).P(i, i2);
    }

    @Override // defpackage.InterfaceC4279i50
    public InterfaceC4279i50 J(boolean z) {
        if (z) {
            ((RuleBasedCollator) this.b).setNumericCollation(Boolean.TRUE.booleanValue());
        }
        return this;
    }

    public void K(int i, long j) {
        ((C6735qu) this.b).W(i, j);
    }

    public void L(int i, Object obj, EV0 ev0) {
        C6735qu c6735qu = (C6735qu) this.b;
        L0 l0 = (L0) obj;
        c6735qu.T(i, 2);
        c6735qu.V(l0.b(ev0));
        ev0.d(l0, c6735qu.a);
    }

    public void M(int i, int i2) {
        ((C6735qu) this.b).L(i, i2);
    }

    public void N(int i, long j) {
        ((C6735qu) this.b).N(i, j);
    }

    @Override // defpackage.InterfaceC4279i50
    public InterfaceC4279i50 O(Y40 y40) {
        C1142Ok0 c1142Ok0 = (C1142Ok0) y40;
        c1142Ok0.h();
        RuleBasedCollator ruleBasedCollatorE = AbstractC0909Lk0.e(RuleBasedCollator.getInstance(c1142Ok0.a));
        this.b = ruleBasedCollatorE;
        ruleBasedCollatorE.setDecomposition(17);
        return this;
    }

    public void P(int i, int i2) {
        ((C6735qu) this.b).U(i, (i2 >> 31) ^ (i2 << 1));
    }

    public void Q(int i, long j) {
        ((C6735qu) this.b).W(i, (j >> 63) ^ (j << 1));
    }

    public void R(int i, int i2) {
        ((C6735qu) this.b).U(i, i2);
    }

    public void S(int i, long j) {
        ((C6735qu) this.b).W(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x0214 A[Catch: IOException -> 0x02ad, TryCatch #5 {IOException -> 0x02ad, blocks: (B:204:0x01cc, B:206:0x01d4, B:207:0x01ec, B:209:0x01f3, B:210:0x01f7, B:211:0x0214, B:213:0x0222, B:215:0x022a, B:220:0x0233, B:223:0x023a, B:225:0x0251, B:227:0x0272, B:229:0x0276, B:230:0x028e, B:231:0x02a5, B:232:0x02ac), top: B:247:0x01cc, inners: #0 }] */
    @Override // defpackage.InterfaceC0131Bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Z(defpackage.InterfaceC7089sl r21, defpackage.HS0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1304Qm0.Z(sl, HS0):void");
    }

    @Override // defpackage.InterfaceC4279i50
    public InterfaceC4279i50 a0(boolean z) {
        if (z) {
            ((RuleBasedCollator) this.b).setAlternateHandlingShifted(true);
        }
        return this;
    }

    @Override // defpackage.GD
    public Object b(FE0 fe0, Object obj) {
        return p(fe0, obj);
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        switch (this.a) {
            case 9:
                Class cls = (Class) this.b;
                try {
                    return AbstractC0274Dg1.a.a(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
                }
            default:
                Constructor constructor = (Constructor) this.b;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e2) {
                    NP1 np1 = OP0.a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Failed to invoke constructor '" + OP0.b(constructor) + "' with no args", e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to invoke constructor '" + OP0.b(constructor) + "' with no args", e4.getCause());
                }
        }
    }

    @Override // defpackage.InterfaceC4279i50
    public InterfaceC4279i50 d(EnumC3706f50 enumC3706f50) {
        int iOrdinal = enumC3706f50.ordinal();
        if (iOrdinal == 0) {
            ((RuleBasedCollator) this.b).setUpperCaseFirst(true);
        } else if (iOrdinal != 1) {
            ((RuleBasedCollator) this.b).setCaseFirstDefault();
        } else {
            ((RuleBasedCollator) this.b).setLowerCaseFirst(true);
        }
        return this;
    }

    @Override // defpackage.GD
    public Object e(C1758Wh1 c1758Wh1, Object obj) {
        return null;
    }

    @Override // defpackage.InterfaceC4279i50
    public InterfaceC4279i50 f(EnumC3897g50 enumC3897g50) {
        int iOrdinal = enumC3897g50.ordinal();
        if (iOrdinal == 0) {
            ((RuleBasedCollator) this.b).setStrength(0);
        } else if (iOrdinal == 1) {
            ((RuleBasedCollator) this.b).setStrength(1);
        } else if (iOrdinal == 2) {
            ((RuleBasedCollator) this.b).setStrength(0);
            ((RuleBasedCollator) this.b).setCaseLevel(true);
        } else if (iOrdinal == 3) {
            ((RuleBasedCollator) this.b).setStrength(2);
        }
        return this;
    }

    @Override // defpackage.GD
    public Object g(AbstractC6567q1 abstractC6567q1, Object obj) {
        return null;
    }

    @Override // javax.inject.Provider
    public Object get() {
        InterfaceC3739fG0 interfaceC3739fG0 = (InterfaceC3739fG0) ((C1155Oo1) this.b).d;
        AbstractC2501cM1.d(interfaceC3739fG0);
        return interfaceC3739fG0;
    }

    @Override // defpackage.GD
    public Object h(C6887rh0 c6887rh0, Object obj) {
        return null;
    }

    @Override // defpackage.GD
    public Object i(JE0 je0, Object obj) {
        return p(je0, obj);
    }

    @Override // defpackage.GD
    public Object j(C1835Xh0 c1835Xh0, Object obj) {
        return null;
    }

    @Override // defpackage.GD
    public Object k(VI vi, Object obj) {
        return null;
    }

    @Override // defpackage.InterfaceC4279i50
    public int l(String str, String str2) {
        return ((RuleBasedCollator) this.b).compare(str, str2);
    }

    @Override // defpackage.InterfaceC3793fY0
    public void m(InterfaceC3984gY0 interfaceC3984gY0) {
        C5430k30 c5430k30 = (C5430k30) this.b;
        c5430k30.r.m(c5430k30);
    }

    @Override // defpackage.GD
    public Object n(C0231Cs0 c0231Cs0, Object obj) {
        return null;
    }

    @Override // defpackage.GD
    public Object o(EE0 ee0, Object obj) {
        O90.f(ee0, "descriptor");
        int i = (ee0.u != null ? 1 : 0) + (ee0.v != null ? 1 : 0);
        boolean z = ee0.g;
        AbstractC6497pe0 abstractC6497pe0 = (AbstractC6497pe0) this.b;
        if (z) {
            if (i == 0) {
                return new C0033Ae0(abstractC6497pe0, ee0);
            }
            if (i == 1) {
                return new C0345Ee0(abstractC6497pe0, ee0);
            }
            if (i == 2) {
                return new C0501Ge0(abstractC6497pe0, ee0);
            }
        } else {
            if (i == 0) {
                return new C2367bf0(abstractC6497pe0, ee0);
            }
            if (i == 1) {
                return new C4005gf0(abstractC6497pe0, ee0);
            }
            if (i == 2) {
                return new C5736lf0(abstractC6497pe0, ee0);
            }
        }
        throw new C1420Rz("Unsupported property: " + ee0, 1);
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 7:
                synchronized (((C4037gq) this.b).a) {
                    try {
                        ((C4037gq) this.b).d.v();
                        int iX = AbstractC8235ym.x(((C4037gq) this.b).i);
                        if ((iX == 3 || iX == 5 || iX == 6) && !(th instanceof CancellationException)) {
                            int i = ((C4037gq) this.b).i;
                            AbstractC0759Jm0.f("CaptureSession");
                            ((C4037gq) this.b).k();
                        }
                    } finally {
                    }
                }
                return;
            case 27:
                AbstractC0759Jm0.f("ProcessingCaptureSession");
                JD0 jd0 = (JD0) this.b;
                jd0.close();
                jd0.release();
                return;
            default:
                C3954gO0 c3954gO0 = (C3954gO0) this.b;
                AbstractC3377dM1.i(c3954gO0.q != null, "In-progress recording shouldn't be null");
                if (c3954gO0.q.l) {
                    return;
                }
                Objects.toString(th);
                AbstractC0759Jm0.f("Recorder");
                c3954gO0.h(c3954gO0.C == null ? 8 : 6, th);
                return;
        }
    }

    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 7:
                break;
            case 27:
                break;
            default:
                AbstractC0759Jm0.f("Recorder");
                C3954gO0 c3954gO0 = (C3954gO0) this.b;
                c3954gO0.h(c3954gO0.S, c3954gO0.T);
                break;
        }
    }

    @Override // defpackage.GD
    public Object p(AZ az, Object obj) {
        return new C7260te0((AbstractC6497pe0) this.b, az);
    }

    @Override // defpackage.GD
    public Object q(AbstractC8064xs0 abstractC8064xs0, Object obj) {
        return null;
    }

    @Override // defpackage.GD
    public Object r(AbstractC0096Az0 abstractC0096Az0, Object obj) {
        return null;
    }

    @Override // defpackage.GD
    public Object s(C6729qs c6729qs, Object obj) {
        return p(c6729qs, obj);
    }

    public void t(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5457kC c5457kC = (C5457kC) it.next();
            O90.f(c5457kC, CommonUrlParts.MODEL);
            byte[] bytes = C0318Dv0.k(c5457kC.b).getBytes(AbstractC7680vr.a);
            O90.e(bytes, "this as java.lang.String).getBytes(charset)");
            arrayList2.add(new C6485pa0(c5457kC.a, bytes));
        }
        F71 f71 = (F71) ((C3383dO1) this.b).c;
        String strC = AbstractC7728w51.c("\n            DELETE FROM metrics_event_table\n            WHERE _id IN (\n                SELECT _id FROM metrics_event_table\n                WHERE uuid IN (" + AbstractC8069xu.H(arrayList2, null, null, null, C5284jI.A, 31) + ")\n            )\n        ");
        try {
            ((SQLiteDatabase) f71.getValue()).beginTransactionNonExclusive();
            ((SQLiteDatabase) f71.getValue()).execSQL(strC);
            ((SQLiteDatabase) f71.getValue()).setTransactionSuccessful();
        } finally {
        }
    }

    public void u(C0821Kh c0821Kh, C1155Oo1 c1155Oo1) {
        C5332jY c5332jY = (C5332jY) this.b;
        if (c5332jY == null || c5332jY.L()) {
            return;
        }
        C5332jY c5332jY2 = (C5332jY) this.b;
        C0431Fh c0431Fh = (C0431Fh) c5332jY2.B("androidx.biometric.BiometricFragment");
        if (c0431Fh == null) {
            c0431Fh = new C0431Fh();
            a aVar = new a(c5332jY2);
            aVar.c(0, c0431Fh, "androidx.biometric.BiometricFragment", 1);
            aVar.f(true);
            c5332jY2.x(true);
            c5332jY2.D();
        }
        l activity = c0431Fh.getActivity();
        if (activity == null) {
            return;
        }
        C1210Ph c1210Ph = c0431Fh.b;
        c1210Ph.f = c0821Kh;
        int i = c0821Kh.f;
        if (i == 0) {
            i = c1155Oo1 != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i == 15 && c1155Oo1 == null) {
            c1210Ph.g = IY1.a();
        } else {
            c1210Ph.g = c1155Oo1;
        }
        if (c0431Fh.t()) {
            c0431Fh.b.k = c0431Fh.getString(R.string.confirm_device_credential_password);
        } else {
            c0431Fh.b.k = null;
        }
        if (c0431Fh.t() && new C5772lr0(new C4067h(activity, 1)).D(KotlinVersion.MAX_COMPONENT_VALUE) != 0) {
            c0431Fh.b.n = true;
            c0431Fh.v();
        } else if (c0431Fh.b.p) {
            c0431Fh.a.postDelayed(new RunnableC0353Eh(c0431Fh), 600L);
        } else {
            c0431Fh.z();
        }
    }

    public String v(Object obj) throws IOException {
        StringWriter stringWriter = new StringWriter();
        try {
            C6109nc0 c6109nc0 = (C6109nc0) this.b;
            C0729Jc0 c0729Jc0 = new C0729Jc0(stringWriter, c6109nc0.a, c6109nc0.b, c6109nc0.c, c6109nc0.d);
            c0729Jc0.g(obj);
            c0729Jc0.i();
            c0729Jc0.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public void w() {
        long j;
        C7937xC c7937xC = (C7937xC) this.b;
        synchronized (II1.b) {
            try {
                j = II1.c ? II1.d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        c7937xC.M = j;
        c7937xC.z(true);
    }

    @Override // defpackage.InterfaceC0131Bl
    public void w0(InterfaceC7089sl interfaceC7089sl, IOException iOException) {
        RunnableC8155yL0 runnableC8155yL0 = (RunnableC8155yL0) this.b;
        RunnableC8155yL0.a(runnableC8155yL0.b);
        if (runnableC8155yL0.o == null) {
            runnableC8155yL0.o = Arguments.createMap();
        }
        if (iOException.getClass().equals(SocketTimeoutException.class)) {
            runnableC8155yL0.o.putBoolean("timeout", true);
            runnableC8155yL0.e("The request timed out.", null, null);
        } else {
            runnableC8155yL0.e(iOException.getLocalizedMessage(), null, null);
        }
        runnableC8155yL0.f();
    }

    public void x() {
        C5430k30 c5430k30 = (C5430k30) this.b;
        int i = c5430k30.s - 1;
        c5430k30.s = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (E30 e30 : c5430k30.u) {
            e30.f();
            i2 += e30.I.a;
        }
        C1272Qb1[] c1272Qb1Arr = new C1272Qb1[i2];
        int i3 = 0;
        for (E30 e302 : c5430k30.u) {
            e302.f();
            int i4 = e302.I.a;
            int i5 = 0;
            while (i5 < i4) {
                e302.f();
                c1272Qb1Arr[i3] = e302.I.a(i5);
                i5++;
                i3++;
            }
        }
        c5430k30.t = new C1350Rb1(c1272Qb1Arr);
        c5430k30.r.a(c5430k30);
    }

    public void y() {
        C7349u60 c7349u60 = (C7349u60) this.b;
        synchronized (c7349u60.p) {
            try {
                Integer num = (Integer) c7349u60.p.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != c7349u60.H()) {
                    c7349u60.K();
                }
            } finally {
            }
        }
    }

    public void z(int i, boolean z) {
        ((C6735qu) this.b).I(i, z);
    }

    public C1304Qm0(C4067h c4067h, C0240Cv0 c0240Cv0) {
        this.a = 3;
        this.b = c4067h;
    }

    public C1304Qm0(C3383dO1 c3383dO1, C0162Bv0 c0162Bv0, C0396Ev0 c0396Ev0, C0396Ev0 c0396Ev02) {
        this.a = 25;
        this.b = c3383dO1;
    }

    public C1304Qm0(AbstractC6497pe0 abstractC6497pe0) {
        this.a = 11;
        O90.f(abstractC6497pe0, "container");
        this.b = abstractC6497pe0;
    }

    public C1304Qm0(C6735qu c6735qu) {
        this.a = 8;
        AbstractC8309z90.a(c6735qu, "output");
        this.b = c6735qu;
        c6735qu.a = this;
    }

    public C1304Qm0(int i) {
        InterfaceC6727qr0 interfaceC6727qr0;
        this.a = i;
        switch (i) {
            case 17:
                this.b = (ExtraSupportedSurfaceCombinationsQuirk) AbstractC7768wJ.a.z0(ExtraSupportedSurfaceCombinationsQuirk.class);
                break;
            case 19:
                this.b = null;
                break;
            case 26:
                break;
            default:
                try {
                    interfaceC6727qr0 = (InterfaceC6727qr0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC6727qr0 = c;
                }
                InterfaceC6727qr0[] interfaceC6727qr0Arr = {C6373p00.b, interfaceC6727qr0};
                C1226Pm0 c1226Pm0 = new C1226Pm0();
                c1226Pm0.a = interfaceC6727qr0Arr;
                Charset charset = AbstractC8309z90.a;
                this.b = c1226Pm0;
                break;
        }
    }

    public C1304Qm0(l lVar, Executor executor, EO1 eo1) {
        this.a = 4;
        if (lVar == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            C5332jY c5332jYE = lVar.e();
            C1210Ph c1210Ph = (C1210Ph) new C5772lr0(lVar).L(C1210Ph.class);
            this.b = c5332jYE;
            c1210Ph.d = executor;
            c1210Ph.e = eo1;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }
}
