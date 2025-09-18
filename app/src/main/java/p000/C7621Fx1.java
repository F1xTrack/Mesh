package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Size;
import android.view.Choreographer;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.Fragment;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import ru.mes.dnevnik.R;

/* renamed from: Fx1 */
/* loaded from: classes.dex */
public final class C7621Fx1 implements InterfaceC9305ex0, InterfaceC8294Sw0, InterfaceC0392GD, InterfaceC1639a2, InterfaceC0980PZ, InterfaceC0570J2 {

    /* renamed from: b */
    public static C7621Fx1 f3491b;

    /* renamed from: c */
    public static final C7621Fx1 f3492c = new C7621Fx1();

    /* renamed from: d */
    public static Bundle f3493d;

    /* renamed from: a */
    public Object f3494a;

    public /* synthetic */ C7621Fx1(Object obj) {
        this.f3494a = obj;
    }

    /* renamed from: A */
    public static synchronized C7621Fx1 m2835A(Context context) {
        return m2836C(context.getApplicationContext());
    }

    /* renamed from: C */
    public static synchronized C7621Fx1 m2836C(Context context) {
        C7621Fx1 c7621Fx1 = f3491b;
        if (c7621Fx1 != null) {
            return c7621Fx1;
        }
        C7621Fx1 c7621Fx12 = new C7621Fx1(context, 0);
        f3491b = c7621Fx12;
        return c7621Fx12;
    }

    /* renamed from: v */
    public static C4192he m2837v(C0795Md c0795Md) throws C11502w60 {
        C4192he c4192he = c0795Md.f7274a;
        InterfaceC9457g70 interfaceC9457g70 = (InterfaceC9457g70) c4192he.f28488a;
        Rect rect = c4192he.f28492e;
        try {
            byte[] bArrM21968c = AbstractC9831j22.m21968c(interfaceC9457g70, rect, c0795Md.f7275b, c4192he.f28493f);
            try {
                C6299kQ c6299kQ = new C6299kQ(new C7137xQ(new ByteArrayInputStream(bArrM21968c)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                Matrix matrix = c4192he.f28494g;
                RectF rectF = AbstractC11184tc1.f43173a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                return new C4192he(bArrM21968c, c6299kQ, 256, size, rect2, c4192he.f28493f, matrix2, c4192he.f28495h);
            } catch (IOException e) {
                throw new C11502w60("Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (C11758y70 e2) {
            throw new C11502w60("Failed to encode the image to JPEG.", e2);
        }
    }

    /* renamed from: B */
    public synchronized void m2838B() {
        Y41 y41 = (Y41) this.f3494a;
        ReentrantLock reentrantLock = y41.f14142a;
        reentrantLock.lock();
        try {
            y41.f14143b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.InterfaceC1639a2
    /* renamed from: a */
    public boolean mo2839a(View view) {
        AbstractC0274EL abstractC0274EL = (AbstractC0274EL) this.f3494a;
        abstractC0274EL.getClass();
        if (!AbstractC0274EL.m2146l(view) || abstractC0274EL.m2154g(view) == 2) {
            return false;
        }
        abstractC0274EL.m2149b(view);
        return true;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: b */
    public Object mo2840b(FE0 fe0, Object obj) {
        m2862z(fe0, (StringBuilder) obj, "getter");
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        Type type = (Type) this.f3494a;
        if (!(type instanceof ParameterizedType)) {
            throw new C10799qc0("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new C10799qc0("Invalid EnumMap type: " + type.toString());
    }

    /* renamed from: d */
    public Object m2841d(Object obj) throws Exception {
        C4192he c4192heM2837v;
        C0795Md c0795Md = (C0795Md) obj;
        C4192he c4192he = c0795Md.f7274a;
        try {
            int i = c4192he.f28490c;
            Object obj2 = c4192he.f28488a;
            if (i == 35) {
                c4192heM2837v = m2837v(c0795Md);
            } else {
                if (i != 256 && i != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + i);
                }
                c4192heM2837v = m2858u(c0795Md, i);
            }
            ((InterfaceC9457g70) obj2).close();
            return c4192heM2837v;
        } catch (Throwable th) {
            ((InterfaceC9457g70) c4192he.f28488a).close();
            throw th;
        }
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: e */
    public Object mo2842e(C8473Wh1 c8473Wh1, Object obj) {
        ((C6417mI) this.f3494a).m22748e0(c8473Wh1, true, (StringBuilder) obj, true);
        return C8313Tf1.f11463a;
    }

    /* renamed from: f */
    public void m2843f(Path path) {
        ArrayList arrayList = (ArrayList) this.f3494a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C9138dd1 c9138dd1 = (C9138dd1) arrayList.get(size);
            C6809sD c6809sD = AbstractC7745Ih1.f5085a;
            if (c9138dd1 != null && !c9138dd1.f26170a) {
                AbstractC7745Ih1.m3972a(path, c9138dd1.f26173d.m23152k() / 100.0f, c9138dd1.f26174e.m23152k() / 100.0f, c9138dd1.f26175f.m23152k() / 360.0f);
            }
        }
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: g */
    public Object mo2844g(AbstractC6654q1 abstractC6654q1, Object obj) {
        ((C6417mI) this.f3494a).m22740a0(abstractC6654q1, (StringBuilder) obj, true);
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: h */
    public Object mo2845h(C10937rh0 c10937rh0, Object obj) {
        O90.m5968f(c10937rh0, "descriptor");
        ((StringBuilder) obj).append(c10937rh0.getName());
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: i */
    public Object mo2846i(JE0 je0, Object obj) {
        m2862z(je0, (StringBuilder) obj, "setter");
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: j */
    public Object mo2847j(C8524Xh0 c8524Xh0, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C6417mI c6417mI = (C6417mI) this.f3494a;
        c6417mI.getClass();
        c6417mI.m22732S(c8524Xh0.f13923e, "package", sb);
        if (c6417mI.f37620a.m23964n()) {
            sb.append(" in context of ");
            c6417mI.m22728O(c8524Xh0.f13922d, sb, false);
        }
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: k */
    public Object mo2848k(C1340VI c1340vi, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C6417mI c6417mI = (C6417mI) this.f3494a;
        c6417mI.getClass();
        c6417mI.m22769y(sb, c1340vi, null);
        C7003vI c7003vI = c1340vi.f12495g;
        O90.m5967e(c7003vI, "getVisibility(...)");
        c6417mI.m22752g0(c7003vI, sb);
        c6417mI.m22723J(c1340vi, sb);
        sb.append(c6417mI.m22721H("typealias"));
        sb.append(" ");
        c6417mI.m22728O(c1340vi, sb, true);
        c6417mI.m22744c0(c1340vi.mo1438o(), sb, false);
        c6417mI.m22770z(c1340vi, sb);
        sb.append(" = ");
        sb.append(c6417mI.m22736X(c1340vi.m8390A1()));
        return C8313Tf1.f11463a;
    }

    /* renamed from: l */
    public SharedPreferences m2849l() {
        if (((SharedPreferences) this.f3494a) == null) {
            this.f3494a = CO1.f1354a.getSharedPreferences("io.invertase.firebase", 0);
        }
        return (SharedPreferences) this.f3494a;
    }

    /* renamed from: m */
    public Boolean m2850m() {
        Bundle bundle = (Bundle) this.f3494a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: n */
    public Object mo2851n(C7454Cs0 c7454Cs0, Object obj) {
        ((C6417mI) this.f3494a).m22728O(c7454Cs0, (StringBuilder) obj, true);
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: o */
    public Object mo2852o(EE0 ee0, Object obj) {
        O90.m5968f(ee0, "descriptor");
        C6417mI.m22712n((C6417mI) this.f3494a, ee0, (StringBuilder) obj);
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC0570J2
    public void onActivityResult(Object obj) {
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f3494a;
        C4123gY c4123gY = (C4123gY) abstractC1733o.f16202C.pollFirst();
        if (c4123gY == null) {
            return;
        }
        Fragment fragmentM10109c = abstractC1733o.f16215c.m10109c(c4123gY.f27831a);
        if (fragmentM10109c == null) {
            return;
        }
        fragmentM10109c.onRequestPermissionsResult(c4123gY.f27832b, strArr, iArr);
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        ((C6820sO) this.f3494a).m24718b(0, "Unable to acquire InputBuffer.", th);
    }

    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        C11506w80 c11506w80 = (C11506w80) obj;
        C6820sO c6820sO = (C6820sO) this.f3494a;
        c6820sO.f42407q.getClass();
        long jM22629h = C10212m12.m22629h();
        if (c11506w80.f44689f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        AbstractC9104dM1.m17546e(jM22629h >= 0);
        c11506w80.f44690g = jM22629h;
        if (c11506w80.f44689f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        c11506w80.f44691h = true;
        c11506w80.m25565b();
        AbstractC8301Sz1.m7478a(AbstractC8301Sz1.m7489l(c11506w80.f44687d), new C9432fw1(13, this), c6820sO.f42398h);
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: p */
    public /* bridge */ /* synthetic */ Object mo2853p(InterfaceC0036AZ interfaceC0036AZ, Object obj) {
        m2861y(interfaceC0036AZ, (StringBuilder) obj);
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: q */
    public Object mo2854q(AbstractC11725xs0 abstractC11725xs0, Object obj) {
        C6707qs c6707qsMo1432V;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        C6417mI c6417mI = (C6417mI) this.f3494a;
        c6417mI.getClass();
        boolean z = abstractC11725xs0.mo1436l() == EnumC0118Bs.f1063d;
        if (!c6417mI.m22763r()) {
            c6417mI.m22769y(sb, abstractC11725xs0, null);
            List listMo1488S0 = abstractC11725xs0.mo1488S0();
            O90.m5967e(listMo1488S0, "getContextReceivers(...)");
            c6417mI.m22715B(sb, listMo1488S0);
            if (!z) {
                C7003vI visibility = abstractC11725xs0.getVisibility();
                O90.m5967e(visibility, "getVisibility(...)");
                c6417mI.m22752g0(visibility, sb);
            }
            if ((abstractC11725xs0.mo1436l() != EnumC0118Bs.f1061b || abstractC11725xs0.mo115f() != EnumC10575os0.f39326e) && (!abstractC11725xs0.mo1436l().m893a() || abstractC11725xs0.mo115f() != EnumC10575os0.f39323b)) {
                EnumC10575os0 enumC10575os0Mo115f = abstractC11725xs0.mo115f();
                O90.m5967e(enumC10575os0Mo115f, "getModality(...)");
                c6417mI.m22724K(enumC10575os0Mo115f, sb, C6417mI.m22713v(abstractC11725xs0));
            }
            c6417mI.m22723J(abstractC11725xs0, sb);
            c6417mI.m22726M(sb, c6417mI.m22762q().contains(EnumC6480nI.f38246h) && abstractC11725xs0.mo1431N(), "inner");
            c6417mI.m22726M(sb, c6417mI.m22762q().contains(EnumC6480nI.f38248j) && abstractC11725xs0.mo1434X0(), "data");
            c6417mI.m22726M(sb, c6417mI.m22762q().contains(EnumC6480nI.f38249k) && abstractC11725xs0.isInline(), "inline");
            c6417mI.m22726M(sb, c6417mI.m22762q().contains(EnumC6480nI.f38255q) && abstractC11725xs0.mo1430K(), "value");
            c6417mI.m22726M(sb, c6417mI.m22762q().contains(EnumC6480nI.f38254p) && abstractC11725xs0.mo1427A(), "fun");
            if (abstractC11725xs0 instanceof InterfaceC7633Gd1) {
                str = "typealias";
            } else if (abstractC11725xs0.mo1440w()) {
                str = "companion object";
            } else {
                int iOrdinal = abstractC11725xs0.mo1436l().ordinal();
                if (iOrdinal == 0) {
                    str = "class";
                } else if (iOrdinal == 1) {
                    str = "interface";
                } else if (iOrdinal == 2) {
                    str = "enum class";
                } else if (iOrdinal == 3) {
                    str = "enum entry";
                } else if (iOrdinal == 4) {
                    str = "annotation class";
                } else {
                    if (iOrdinal != 5) {
                        throw new C6838sg();
                    }
                    str = "object";
                }
            }
            sb.append(c6417mI.m22721H(str));
        }
        boolean zM24700l = AbstractC6814sI.m24700l(abstractC11725xs0);
        C6671qI c6671qI = c6417mI.f37620a;
        if (zM24700l) {
            if (((Boolean) c6671qI.f40726G.getValue(c6671qI, C6671qI.f40719X[31])).booleanValue()) {
                if (c6417mI.m22763r()) {
                    sb.append("companion object");
                }
                C6417mI.m22710W(sb);
                InterfaceC0140CD interfaceC0140CDMo423i = abstractC11725xs0.mo423i();
                if (interfaceC0140CDMo423i != null) {
                    sb.append("of ");
                    C8340Tt0 name = interfaceC0140CDMo423i.getName();
                    O90.m5967e(name, "getName(...)");
                    sb.append(c6417mI.m22727N(name, false));
                }
            }
            if (c6417mI.m22766u() || !O90.m5963a(abstractC11725xs0.getName(), AbstractC9961k31.f36275b)) {
                if (!c6417mI.m22763r()) {
                    C6417mI.m22710W(sb);
                }
                C8340Tt0 name2 = abstractC11725xs0.getName();
                O90.m5967e(name2, "getName(...)");
                sb.append(c6417mI.m22727N(name2, true));
            }
        } else {
            if (!c6417mI.m22763r()) {
                C6417mI.m22710W(sb);
            }
            c6417mI.m22728O(abstractC11725xs0, sb, true);
        }
        if (!z) {
            List listMo1438o = abstractC11725xs0.mo1438o();
            O90.m5967e(listMo1438o, "getDeclaredTypeParameters(...)");
            c6417mI.m22744c0(listMo1438o, sb, false);
            c6417mI.m22770z(abstractC11725xs0, sb);
            if (!abstractC11725xs0.mo1436l().m893a()) {
                if (((Boolean) c6671qI.f40751i.getValue(c6671qI, C6671qI.f40719X[7])).booleanValue() && (c6707qsMo1432V = abstractC11725xs0.mo1432V()) != null) {
                    sb.append(" ");
                    c6417mI.m22769y(sb, c6707qsMo1432V, null);
                    C6707qs c6707qs = c6707qsMo1432V;
                    C7003vI visibility2 = c6707qs.getVisibility();
                    O90.m5967e(visibility2, "getVisibility(...)");
                    c6417mI.m22752g0(visibility2, sb);
                    sb.append(c6417mI.m22721H("constructor"));
                    List listMo1221f0 = c6707qs.mo1221f0();
                    O90.m5967e(listMo1221f0, "getValueParameters(...)");
                    c6417mI.m22750f0(listMo1221f0, c6707qsMo1432V.mo107F(), sb);
                }
            }
            if (!((Boolean) c6671qI.f40766x.getValue(c6671qI, C6671qI.f40719X[22])).booleanValue() && !AbstractC11955zg0.m26486E(abstractC11725xs0.mo1492m())) {
                Collection collectionMo5276b = abstractC11725xs0.mo1439v().mo5276b();
                O90.m5967e(collectionMo5276b, "getSupertypes(...)");
                if (!collectionMo5276b.isEmpty() && (collectionMo5276b.size() != 1 || !AbstractC11955zg0.m26494x((AbstractC7742Ig0) collectionMo5276b.iterator().next()))) {
                    C6417mI.m22710W(sb);
                    sb.append(": ");
                    AbstractC7167xu.m25961G(collectionMo5276b, sb, ", ", null, null, new C6354lI(c6417mI, 1), 60);
                }
            }
            c6417mI.m22754h0(sb, listMo1438o);
        }
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC0392GD
    /* renamed from: r */
    public Object mo2855r(AbstractC7364Az0 abstractC7364Az0, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C6417mI c6417mI = (C6417mI) this.f3494a;
        c6417mI.getClass();
        c6417mI.m22732S(abstractC7364Az0.f494f, "package-fragment", sb);
        if (c6417mI.f37620a.m23964n()) {
            sb.append(" in ");
            c6417mI.m22728O(abstractC7364Az0.mo423i(), sb, false);
        }
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC9305ex0
    /* renamed from: r0 */
    public void mo505r0(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C0359Fh c0359Fh = (C0359Fh) this.f3494a;
            if (c0359Fh.m2742u()) {
                c0359Fh.m2746y(c0359Fh.getString(R.string.fingerprint_not_recognized));
            }
            C0988Ph c0988Ph = c0359Fh.f3389b;
            if (c0988Ph.f9237n) {
                Executor executorC0862Nh = c0988Ph.f9227d;
                if (executorC0862Nh == null) {
                    executorC0862Nh = new ExecutorC0862Nh(0);
                }
                executorC0862Nh.execute(new RunnableC7217yh(c0359Fh, 0));
            }
            C0988Ph c0988Ph2 = c0359Fh.f3389b;
            if (c0988Ph2.f9244u == null) {
                c0988Ph2.f9244u = new C7560Et0();
            }
            C0988Ph.m6411i(c0988Ph2.f9244u, Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0048  */
    @Override // p000.InterfaceC0392GD
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo2856s(p000.C6707qs r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7621Fx1.mo2856s(qs, java.lang.Object):java.lang.Object");
    }

    /* renamed from: t */
    public void m2857t(C1361Vd c1361Vd, Thread thread, Throwable th) {
        C6409mA c6409mA = (C6409mA) this.f3494a;
        synchronized (c6409mA) {
            Objects.toString(th);
            thread.getName();
            try {
                AbstractC7641Gh1.m3125a(((ExecutorC1584ZA) ((C10910rT1) c6409mA.f37531e).f41678b).m9503b(new CallableC6283kA(c6409mA, System.currentTimeMillis(), th, thread, c1361Vd)));
            } catch (TimeoutException | Exception unused) {
            }
        }
    }

    /* renamed from: u */
    public C4192he m2858u(C0795Md c0795Md, int i) {
        byte[] bArrCopyOfRange;
        byte b;
        C4192he c4192he = c0795Md.f7274a;
        InterfaceC9457g70 interfaceC9457g70 = (InterfaceC9457g70) c4192he.f28488a;
        int i2 = 0;
        if (((IncorrectJpegMetadataQuirk) ((C8342Tu0) this.f3494a).f11590b) == null) {
            ByteBuffer byteBufferM2886C = interfaceC9457g70.mo18406u()[0].m2886C();
            bArrCopyOfRange = new byte[byteBufferM2886C.capacity()];
            byteBufferM2886C.rewind();
            byteBufferM2886C.get(bArrCopyOfRange);
        } else {
            ByteBuffer byteBufferM2886C2 = interfaceC9457g70.mo18406u()[0].m2886C();
            int iCapacity = byteBufferM2886C2.capacity();
            byte[] bArr = new byte[iCapacity];
            byteBufferM2886C2.rewind();
            byteBufferM2886C2.get(bArr);
            int i3 = 2;
            for (int i4 = 2; i4 + 4 <= iCapacity && (b = bArr[i4]) == -1; i4 += (((bArr[i4 + 2] & 255) << 8) | (bArr[i4 + 3] & 255)) + 2) {
                if (b == -1 && bArr[i4 + 1] == -38) {
                    break;
                }
            }
            while (true) {
                int i5 = i3 + 1;
                if (i5 > iCapacity) {
                    i2 = -1;
                    break;
                }
                if (bArr[i3] == -1 && bArr[i5] == -40) {
                    i2 = i3;
                    break;
                }
                i3 = i5;
            }
            bArrCopyOfRange = i2 != -1 ? Arrays.copyOfRange(bArr, i2, byteBufferM2886C2.limit()) : bArr;
        }
        byte[] bArr2 = bArrCopyOfRange;
        C6299kQ c6299kQ = c4192he.f28489b;
        Objects.requireNonNull(c6299kQ);
        return new C4192he(bArr2, c6299kQ, i, c4192he.f28491d, c4192he.f28492e, c4192he.f28493f, c4192he.f28494g, c4192he.f28495h);
    }

    /* renamed from: w */
    public void m2859w(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap map2 = (HashMap) this.f3494a;
            if (value == null) {
                map2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map2.put(str, value);
                } else {
                    int i = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        C7249zC c7249zC = C7249zC.f46721b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i < zArr.length) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        map2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        C7249zC c7249zC2 = C7249zC.f46721b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i < bArr.length) {
                            bArr2[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                        map2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        C7249zC c7249zC3 = C7249zC.f46721b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i < iArr.length) {
                            numArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        map2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        C7249zC c7249zC4 = C7249zC.f46721b;
                        Long[] lArr = new Long[jArr.length];
                        while (i < jArr.length) {
                            lArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        map2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        C7249zC c7249zC5 = C7249zC.f46721b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i < fArr.length) {
                            fArr2[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                        map2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        C7249zC c7249zC6 = C7249zC.f46721b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i < dArr.length) {
                            dArr2[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                        map2.put(str, dArr2);
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public InterfaceC6976us m2860x(C9493gP0 c9493gP0) {
        O90.m5968f(c9493gP0, "javaClass");
        C0664KX c0664kxM18513c = c9493gP0.m18513c();
        EnumC8162Qi0[] enumC8162Qi0Arr = EnumC8162Qi0.f9750a;
        Class<?> declaringClass = c9493gP0.f27782a.getDeclaringClass();
        C9493gP0 c9493gP02 = declaringClass != null ? new C9493gP0(declaringClass) : null;
        if (c9493gP02 != null) {
            InterfaceC6976us interfaceC6976usM2860x = m2860x(c9493gP02);
            InterfaceC10059kq0 interfaceC10059kq0Mo1486I0 = interfaceC6976usM2860x != null ? interfaceC6976usM2860x.mo1486I0() : null;
            InterfaceC0873Ns interfaceC0873NsMo1770c = interfaceC10059kq0Mo1486I0 != null ? interfaceC10059kq0Mo1486I0.mo1770c(c9493gP0.m18515e(), EnumC11985zv0.f47101h) : null;
            if (interfaceC0873NsMo1770c instanceof InterfaceC6976us) {
                return (InterfaceC6976us) interfaceC0873NsMo1770c;
            }
            return null;
        }
        C0664KX c0664kxM4657e = c0664kxM18513c.m4657e();
        O90.m5967e(c0664kxM4657e, "parent(...)");
        C7588Fh0 c7588Fh0 = (C7588Fh0) AbstractC7167xu.m25957C(((C7640Gh0) this.f3494a).mo939a(c0664kxM4657e));
        if (c7588Fh0 == null) {
            return null;
        }
        C7900Lh0 c7900Lh0 = c7588Fh0.f3394k.f41779d;
        c7900Lh0.getClass();
        return c7900Lh0.m5061v(c9493gP0.m18515e(), c9493gP0);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ba  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2861y(p000.InterfaceC0036AZ r11, java.lang.StringBuilder r12) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7621Fx1.m2861y(AZ, java.lang.StringBuilder):void");
    }

    /* renamed from: z */
    public void m2862z(InterfaceC11899zE0 interfaceC11899zE0, StringBuilder sb, String str) {
        C6417mI c6417mI = (C6417mI) this.f3494a;
        C6671qI c6671qI = c6417mI.f37620a;
        int iOrdinal = ((BE0) c6671qI.f40727H.getValue(c6671qI, C6671qI.f40719X[32])).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            m2861y(interfaceC11899zE0, sb);
        } else {
            c6417mI.m22723J(interfaceC11899zE0, sb);
            sb.append(str.concat(" for "));
            CE0 ce0M123y1 = ((AE0) interfaceC11899zE0).m123y1();
            O90.m5967e(ce0M123y1, "getCorrespondingProperty(...)");
            C6417mI.m22712n(c6417mI, ce0M123y1, sb);
        }
    }

    public C7621Fx1(Context context, int i) {
        switch (i) {
            case 24:
                O90.m5968f(context, "context");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                this.f3494a = bundle == null ? Bundle.EMPTY : bundle;
                break;
            default:
                Y41 y41M9209a = Y41.m9209a(context);
                this.f3494a = y41M9209a;
                y41M9209a.m9211b();
                y41M9209a.m9212c();
                break;
        }
    }

    public C7621Fx1(int i) {
        Object objMo4794w;
        switch (i) {
            case 7:
                C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
                this.f3494a = c7612Ft0M2812b;
                Object objMo4794w2 = null;
                try {
                    objMo4794w = c7612Ft0M2812b.mo4794w(C81.f1226S0);
                } catch (IllegalArgumentException unused) {
                    objMo4794w = null;
                }
                Class cls = (Class) objMo4794w;
                if (cls != null && !cls.equals(C7162xp.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                C0480Hc c0480Hc = C81.f1226S0;
                C7612Ft0 c7612Ft0 = (C7612Ft0) this.f3494a;
                c7612Ft0.m2815e(c0480Hc, C7162xp.class);
                try {
                    objMo4794w2 = c7612Ft0.mo4794w(C81.f1225R0);
                } catch (IllegalArgumentException unused2) {
                }
                if (objMo4794w2 == null) {
                    c7612Ft0.m2815e(C81.f1225R0, C7162xp.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 9:
                this.f3494a = new ArrayList();
                return;
            case 13:
                this.f3494a = new HashMap();
                return;
            case 25:
                this.f3494a = (ExtraCroppingQuirk) AbstractC7067wJ.f44776a.m17864z0(ExtraCroppingQuirk.class);
                return;
            default:
                Choreographer choreographer = Choreographer.getInstance();
                O90.m5967e(choreographer, "getInstance(...)");
                this.f3494a = choreographer;
                return;
        }
    }

    public C7621Fx1(Application application) {
        this.f3494a = application;
        if (f3493d == null) {
            try {
                f3493d = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                f3493d = new Bundle();
            }
        }
    }
}
