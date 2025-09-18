package p000;

import android.database.sqlite.SQLiteDatabase;
import android.icu.text.RuleBasedCollator;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.C1719a;
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
public class C8170Qm0 implements InterfaceC7045vy, InterfaceC0980PZ, InterfaceC8398Uw0, InterfaceC8294Sw0, InterfaceC0392GD, Provider, InterfaceC9383fY0, InterfaceC9709i50, InterfaceC0111Bl {

    /* renamed from: c */
    public static final C10591p00 f9778c = new C10591p00(1);

    /* renamed from: a */
    public final /* synthetic */ int f9779a;

    /* renamed from: b */
    public Object f9780b;

    public /* synthetic */ C8170Qm0(int i, Object obj) {
        this.f9779a = i;
        this.f9780b = obj;
    }

    /* renamed from: A */
    public void m6754A(int i, C0362Fk c0362Fk) {
        ((C6709qu) this.f9780b).m24107J(i, c0362Fk);
    }

    /* renamed from: B */
    public void m6755B(int i, double d) {
        C6709qu c6709qu = (C6709qu) this.f9780b;
        c6709qu.getClass();
        c6709qu.m24111N(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: C */
    public void m6756C(int i, int i2) {
        ((C6709qu) this.f9780b).m24113P(i, i2);
    }

    /* renamed from: D */
    public void m6757D(int i, int i2) {
        ((C6709qu) this.f9780b).m24109L(i, i2);
    }

    /* renamed from: E */
    public void m6758E(int i, long j) {
        ((C6709qu) this.f9780b).m24111N(i, j);
    }

    /* renamed from: F */
    public void m6759F(int i, float f) {
        C6709qu c6709qu = (C6709qu) this.f9780b;
        c6709qu.getClass();
        c6709qu.m24109L(i, Float.floatToRawIntBits(f));
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: G */
    public EnumC9453g50 mo6760G() {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) this.f9780b;
        if (ruleBasedCollator == null) {
            return EnumC9453g50.f27558e;
        }
        int strength = ruleBasedCollator.getStrength();
        return strength == 0 ? ((RuleBasedCollator) this.f9780b).isCaseLevel() ? EnumC9453g50.f27556c : EnumC9453g50.f27554a : strength == 1 ? EnumC9453g50.f27555b : EnumC9453g50.f27557d;
    }

    /* renamed from: H */
    public void m6761H(int i, Object obj, EV0 ev0) {
        C6709qu c6709qu = (C6709qu) this.f9780b;
        c6709qu.m24117T(i, 3);
        ev0.mo2320d((AbstractC0694L0) obj, c6709qu.f41240a);
        c6709qu.m24117T(i, 4);
    }

    /* renamed from: I */
    public void m6762I(int i, int i2) {
        ((C6709qu) this.f9780b).m24113P(i, i2);
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: J */
    public InterfaceC9709i50 mo6763J(boolean z) {
        if (z) {
            ((RuleBasedCollator) this.f9780b).setNumericCollation(Boolean.TRUE.booleanValue());
        }
        return this;
    }

    /* renamed from: K */
    public void m6764K(int i, long j) {
        ((C6709qu) this.f9780b).m24120W(i, j);
    }

    /* renamed from: L */
    public void m6765L(int i, Object obj, EV0 ev0) {
        C6709qu c6709qu = (C6709qu) this.f9780b;
        AbstractC0694L0 abstractC0694L0 = (AbstractC0694L0) obj;
        c6709qu.m24117T(i, 2);
        c6709qu.m24119V(abstractC0694L0.m4819b(ev0));
        ev0.mo2320d(abstractC0694L0, c6709qu.f41240a);
    }

    /* renamed from: M */
    public void m6766M(int i, int i2) {
        ((C6709qu) this.f9780b).m24109L(i, i2);
    }

    /* renamed from: N */
    public void m6767N(int i, long j) {
        ((C6709qu) this.f9780b).m24111N(i, j);
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: O */
    public InterfaceC9709i50 mo6768O(Y40 y40) {
        C8062Ok0 c8062Ok0 = (C8062Ok0) y40;
        c8062Ok0.m6128h();
        RuleBasedCollator ruleBasedCollatorM5075e = AbstractC7906Lk0.m5075e(RuleBasedCollator.getInstance(c8062Ok0.f8591a));
        this.f9780b = ruleBasedCollatorM5075e;
        ruleBasedCollatorM5075e.setDecomposition(17);
        return this;
    }

    /* renamed from: P */
    public void m6769P(int i, int i2) {
        ((C6709qu) this.f9780b).m24118U(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: Q */
    public void m6770Q(int i, long j) {
        ((C6709qu) this.f9780b).m24120W(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: R */
    public void m6771R(int i, int i2) {
        ((C6709qu) this.f9780b).m24118U(i, i2);
    }

    /* renamed from: S */
    public void m6772S(int i, long j) {
        ((C6709qu) this.f9780b).m24120W(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x0214 A[Catch: IOException -> 0x02ad, TryCatch #5 {IOException -> 0x02ad, blocks: (B:204:0x01cc, B:206:0x01d4, B:207:0x01ec, B:209:0x01f3, B:210:0x01f7, B:211:0x0214, B:213:0x0222, B:215:0x022a, B:220:0x0233, B:223:0x023a, B:225:0x0251, B:227:0x0272, B:229:0x0276, B:230:0x028e, B:231:0x02a5, B:232:0x02ac), top: B:247:0x01cc, inners: #0 }] */
    @Override // p000.InterfaceC0111Bl
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo851Z(p000.InterfaceC6843sl r21, p000.HS0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8170Qm0.mo851Z(sl, HS0):void");
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: a0 */
    public InterfaceC9709i50 mo6773a0(boolean z) {
        if (z) {
            ((RuleBasedCollator) this.f9780b).setAlternateHandlingShifted(true);
        }
        return this;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: b */
    public Object mo2840b(FE0 fe0, Object obj) {
        return mo2853p(fe0, obj);
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        switch (this.f9779a) {
            case 9:
                Class cls = (Class) this.f9780b;
                try {
                    return AbstractC7483Dg1.f2155a.mo281a(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
                }
            default:
                Constructor constructor = (Constructor) this.f9780b;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e2) {
                    NP1 np1 = OP0.f8436a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Failed to invoke constructor '" + OP0.m6063b(constructor) + "' with no args", e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to invoke constructor '" + OP0.m6063b(constructor) + "' with no args", e4.getCause());
                }
        }
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: d */
    public InterfaceC9709i50 mo6774d(EnumC9325f50 enumC9325f50) {
        int iOrdinal = enumC9325f50.ordinal();
        if (iOrdinal == 0) {
            ((RuleBasedCollator) this.f9780b).setUpperCaseFirst(true);
        } else if (iOrdinal != 1) {
            ((RuleBasedCollator) this.f9780b).setCaseFirstDefault();
        } else {
            ((RuleBasedCollator) this.f9780b).setLowerCaseFirst(true);
        }
        return this;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: e */
    public Object mo2842e(C8473Wh1 c8473Wh1, Object obj) {
        return null;
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: f */
    public InterfaceC9709i50 mo6775f(EnumC9453g50 enumC9453g50) {
        int iOrdinal = enumC9453g50.ordinal();
        if (iOrdinal == 0) {
            ((RuleBasedCollator) this.f9780b).setStrength(0);
        } else if (iOrdinal == 1) {
            ((RuleBasedCollator) this.f9780b).setStrength(1);
        } else if (iOrdinal == 2) {
            ((RuleBasedCollator) this.f9780b).setStrength(0);
            ((RuleBasedCollator) this.f9780b).setCaseLevel(true);
        } else if (iOrdinal == 3) {
            ((RuleBasedCollator) this.f9780b).setStrength(2);
        }
        return this;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: g */
    public Object mo2844g(AbstractC6654q1 abstractC6654q1, Object obj) {
        return null;
    }

    @Override // javax.inject.Provider
    public Object get() {
        InterfaceC9347fG0 interfaceC9347fG0 = (InterfaceC9347fG0) ((C8071Oo1) this.f9780b).f8630d;
        AbstractC8971cM1.m10691d(interfaceC9347fG0);
        return interfaceC9347fG0;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: h */
    public Object mo2845h(C10937rh0 c10937rh0, Object obj) {
        return null;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: i */
    public Object mo2846i(JE0 je0, Object obj) {
        return mo2853p(je0, obj);
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: j */
    public Object mo2847j(C8524Xh0 c8524Xh0, Object obj) {
        return null;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: k */
    public Object mo2848k(C1340VI c1340vi, Object obj) {
        return null;
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: l */
    public int mo6776l(String str, String str2) {
        return ((RuleBasedCollator) this.f9780b).compare(str, str2);
    }

    @Override // p000.InterfaceC9383fY0
    /* renamed from: m */
    public void mo1885m(InterfaceC9511gY0 interfaceC9511gY0) {
        C9960k30 c9960k30 = (C9960k30) this.f9780b;
        c9960k30.f36267r.mo1885m(c9960k30);
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: n */
    public Object mo2851n(C7454Cs0 c7454Cs0, Object obj) {
        return null;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: o */
    public Object mo2852o(EE0 ee0, Object obj) {
        O90.m5968f(ee0, "descriptor");
        int i = (ee0.f2559u != null ? 1 : 0) + (ee0.f2560v != null ? 1 : 0);
        boolean z = ee0.f2545g;
        AbstractC10675pe0 abstractC10675pe0 = (AbstractC10675pe0) this.f9780b;
        if (z) {
            if (i == 0) {
                return new C7322Ae0(abstractC10675pe0, ee0);
            }
            if (i == 1) {
                return new C7530Ee0(abstractC10675pe0, ee0);
            }
            if (i == 2) {
                return new C7634Ge0(abstractC10675pe0, ee0);
            }
        } else {
            if (i == 0) {
                return new C8880bf0(abstractC10675pe0, ee0);
            }
            if (i == 1) {
                return new C9525gf0(abstractC10675pe0, ee0);
            }
            if (i == 2) {
                return new C10165lf0(abstractC10675pe0, ee0);
            }
        }
        throw new C1131Rz("Unsupported property: " + ee0, 1);
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        switch (this.f9779a) {
            case 7:
                synchronized (((C4141gq) this.f9780b).f28040a) {
                    try {
                        ((C4141gq) this.f9780b).f28043d.m2048v();
                        int iM26247x = AbstractC7222ym.m26247x(((C4141gq) this.f9780b).f28048i);
                        if ((iM26247x == 3 || iM26247x == 5 || iM26247x == 6) && !(th instanceof CancellationException)) {
                            int i = ((C4141gq) this.f9780b).f28048i;
                            AbstractC7806Jm0.m4412f("CaptureSession");
                            ((C4141gq) this.f9780b).m18657k();
                        }
                    } finally {
                    }
                }
                return;
            case 27:
                AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
                JD0 jd0 = (JD0) this.f9780b;
                jd0.close();
                jd0.release();
                return;
            default:
                C9491gO0 c9491gO0 = (C9491gO0) this.f9780b;
                AbstractC9104dM1.m17550i(c9491gO0.f27770q != null, "In-progress recording shouldn't be null");
                if (c9491gO0.f27770q.f41088l) {
                    return;
                }
                Objects.toString(th);
                AbstractC7806Jm0.m4412f("Recorder");
                c9491gO0.m18497h(c9491gO0.f27721C == null ? 8 : 6, th);
                return;
        }
    }

    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        switch (this.f9779a) {
            case 7:
                break;
            case 27:
                break;
            default:
                AbstractC7806Jm0.m4412f("Recorder");
                C9491gO0 c9491gO0 = (C9491gO0) this.f9780b;
                c9491gO0.m18497h(c9491gO0.f27737S, c9491gO0.f27738T);
                break;
        }
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: p */
    public Object mo2853p(InterfaceC0036AZ interfaceC0036AZ, Object obj) {
        return new C11187te0((AbstractC10675pe0) this.f9780b, interfaceC0036AZ);
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: q */
    public Object mo2854q(AbstractC11725xs0 abstractC11725xs0, Object obj) {
        return null;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: r */
    public Object mo2855r(AbstractC7364Az0 abstractC7364Az0, Object obj) {
        return null;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: s */
    public Object mo2856s(C6707qs c6707qs, Object obj) {
        return mo2853p(c6707qs, obj);
    }

    /* renamed from: t */
    public void m6777t(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6285kC c6285kC = (C6285kC) it.next();
            O90.m5968f(c6285kC, CommonUrlParts.MODEL);
            byte[] bytes = C7512Dv0.m1927k(c6285kC.f36351b).getBytes(AbstractC7038vr.f44561a);
            O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
            arrayList2.add(new C10667pa0(c6285kC.f36350a, bytes));
        }
        F71 f71 = (F71) ((C9108dO1) this.f9780b).f26013c;
        String strM25562c = AbstractC11501w51.m25562c("\n            DELETE FROM metrics_event_table\n            WHERE _id IN (\n                SELECT _id FROM metrics_event_table\n                WHERE uuid IN (" + AbstractC7167xu.m25962H(arrayList2, null, null, null, C6228jI.f35019A, 31) + ")\n            )\n        ");
        try {
            ((SQLiteDatabase) f71.getValue()).beginTransactionNonExclusive();
            ((SQLiteDatabase) f71.getValue()).execSQL(strM25562c);
            ((SQLiteDatabase) f71.getValue()).setTransactionSuccessful();
        } finally {
        }
    }

    /* renamed from: u */
    public void m6778u(C0674Kh c0674Kh, C8071Oo1 c8071Oo1) {
        C6244jY c6244jY = (C6244jY) this.f9780b;
        if (c6244jY == null || c6244jY.m10046L()) {
            return;
        }
        C6244jY c6244jY2 = (C6244jY) this.f9780b;
        C0359Fh c0359Fh = (C0359Fh) c6244jY2.m10039B("androidx.biometric.BiometricFragment");
        if (c0359Fh == null) {
            c0359Fh = new C0359Fh();
            C1719a c1719a = new C1719a(c6244jY2);
            c1719a.mo10013c(0, c0359Fh, "androidx.biometric.BiometricFragment", 1);
            c1719a.m10015f(true);
            c6244jY2.m10088x(true);
            c6244jY2.m10040D();
        }
        AbstractActivityC1730l activity = c0359Fh.getActivity();
        if (activity == null) {
            return;
        }
        C0988Ph c0988Ph = c0359Fh.f3389b;
        c0988Ph.f9229f = c0674Kh;
        int i = c0674Kh.f6257f;
        if (i == 0) {
            i = c8071Oo1 != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i == 15 && c8071Oo1 == null) {
            c0988Ph.f9230g = IY1.m3932a();
        } else {
            c0988Ph.f9230g = c8071Oo1;
        }
        if (c0359Fh.m2741t()) {
            c0359Fh.f3389b.f9234k = c0359Fh.getString(R.string.confirm_device_credential_password);
        } else {
            c0359Fh.f3389b.f9234k = null;
        }
        if (c0359Fh.m2741t() && new C10189lr0(new C4151h(activity, 1)).m22547D(KotlinVersion.MAX_COMPONENT_VALUE) != 0) {
            c0359Fh.f3389b.f9237n = true;
            c0359Fh.m2743v();
        } else if (c0359Fh.f3389b.f9239p) {
            c0359Fh.f3388a.postDelayed(new RunnableC0296Eh(c0359Fh), 600L);
        } else {
            c0359Fh.m2747z();
        }
    }

    /* renamed from: v */
    public String m6779v(Object obj) throws IOException {
        StringWriter stringWriter = new StringWriter();
        try {
            C10415nc0 c10415nc0 = (C10415nc0) this.f9780b;
            C7786Jc0 c7786Jc0 = new C7786Jc0(stringWriter, c10415nc0.f38406a, c10415nc0.f38407b, c10415nc0.f38408c, c10415nc0.f38409d);
            c7786Jc0.m4365g(obj);
            c7786Jc0.m4367i();
            c7786Jc0.f5639b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* renamed from: w */
    public void m6780w() {
        long j;
        C7123xC c7123xC = (C7123xC) this.f9780b;
        synchronized (II1.f4885b) {
            try {
                j = II1.f4886c ? II1.f4887d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        c7123xC.f45450M = j;
        c7123xC.m25813z(true);
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: w0 */
    public void mo852w0(InterfaceC6843sl interfaceC6843sl, IOException iOException) {
        RunnableC11786yL0 runnableC11786yL0 = (RunnableC11786yL0) this.f9780b;
        RunnableC11786yL0.m26133a(runnableC11786yL0.f46199b);
        if (runnableC11786yL0.f46212o == null) {
            runnableC11786yL0.f46212o = Arguments.createMap();
        }
        if (iOException.getClass().equals(SocketTimeoutException.class)) {
            runnableC11786yL0.f46212o.putBoolean("timeout", true);
            runnableC11786yL0.m26137e("The request timed out.", null, null);
        } else {
            runnableC11786yL0.m26137e(iOException.getLocalizedMessage(), null, null);
        }
        runnableC11786yL0.m26138f();
    }

    /* renamed from: x */
    public void m6781x() {
        C9960k30 c9960k30 = (C9960k30) this.f9780b;
        int i = c9960k30.f36268s - 1;
        c9960k30.f36268s = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (E30 e30 : c9960k30.f36270u) {
            e30.m1999f();
            i2 += e30.f2401I.f10321a;
        }
        C8149Qb1[] c8149Qb1Arr = new C8149Qb1[i2];
        int i3 = 0;
        for (E30 e302 : c9960k30.f36270u) {
            e302.m1999f();
            int i4 = e302.f2401I.f10321a;
            int i5 = 0;
            while (i5 < i4) {
                e302.m1999f();
                c8149Qb1Arr[i3] = e302.f2401I.m7046a(i5);
                i5++;
                i3++;
            }
        }
        c9960k30.f36269t = new C8201Rb1(c8149Qb1Arr);
        c9960k30.f36267r.mo1876a(c9960k30);
    }

    /* renamed from: y */
    public void m6782y() {
        C11247u60 c11247u60 = (C11247u60) this.f9780b;
        synchronized (c11247u60.f43515p) {
            try {
                Integer num = (Integer) c11247u60.f43515p.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != c11247u60.m25112H()) {
                    c11247u60.m25114K();
                }
            } finally {
            }
        }
    }

    /* renamed from: z */
    public void m6783z(int i, boolean z) {
        ((C6709qu) this.f9780b).m24106I(i, z);
    }

    public C8170Qm0(C4151h c4151h, C7460Cv0 c7460Cv0) {
        this.f9779a = 3;
        this.f9780b = c4151h;
    }

    public C8170Qm0(C9108dO1 c9108dO1, C7408Bv0 c7408Bv0, C7564Ev0 c7564Ev0, C7564Ev0 c7564Ev02) {
        this.f9779a = 25;
        this.f9780b = c9108dO1;
    }

    public C8170Qm0(AbstractC10675pe0 abstractC10675pe0) {
        this.f9779a = 11;
        O90.m5968f(abstractC10675pe0, "container");
        this.f9780b = abstractC10675pe0;
    }

    public C8170Qm0(C6709qu c6709qu) {
        this.f9779a = 8;
        AbstractC11889z90.m26313a(c6709qu, "output");
        this.f9780b = c6709qu;
        c6709qu.f41240a = this;
    }

    public C8170Qm0(int i) {
        InterfaceC10829qr0 interfaceC10829qr0;
        this.f9779a = i;
        switch (i) {
            case 17:
                this.f9780b = (ExtraSupportedSurfaceCombinationsQuirk) AbstractC7067wJ.f44776a.m17864z0(ExtraSupportedSurfaceCombinationsQuirk.class);
                break;
            case 19:
                this.f9780b = null;
                break;
            case 26:
                break;
            default:
                try {
                    interfaceC10829qr0 = (InterfaceC10829qr0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC10829qr0 = f9778c;
                }
                InterfaceC10829qr0[] interfaceC10829qr0Arr = {C10591p00.f39427b, interfaceC10829qr0};
                C8118Pm0 c8118Pm0 = new C8118Pm0();
                c8118Pm0.f9277a = interfaceC10829qr0Arr;
                Charset charset = AbstractC11889z90.f46666a;
                this.f9780b = c8118Pm0;
                break;
        }
    }

    public C8170Qm0(AbstractActivityC1730l abstractActivityC1730l, Executor executor, EO1 eo1) {
        this.f9779a = 4;
        if (abstractActivityC1730l == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            C6244jY c6244jYM10034e = abstractActivityC1730l.m10034e();
            C0988Ph c0988Ph = (C0988Ph) new C10189lr0(abstractActivityC1730l).m22554L(C0988Ph.class);
            this.f9780b = c6244jYM10034e;
            c0988Ph.f9227d = executor;
            c0988Ph.f9228e = eo1;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }
}
