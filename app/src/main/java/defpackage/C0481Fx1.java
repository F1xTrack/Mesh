package defpackage;

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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
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
public final class C0481Fx1 implements InterfaceC3677ex0, InterfaceC1490Sw0, GD, InterfaceC2056a2, PZ, J2 {
    public static C0481Fx1 b;
    public static final C0481Fx1 c = new C0481Fx1();
    public static Bundle d;
    public Object a;

    public /* synthetic */ C0481Fx1(Object obj) {
        this.a = obj;
    }

    public static synchronized C0481Fx1 A(Context context) {
        return C(context.getApplicationContext());
    }

    public static synchronized C0481Fx1 C(Context context) {
        C0481Fx1 c0481Fx1 = b;
        if (c0481Fx1 != null) {
            return c0481Fx1;
        }
        C0481Fx1 c0481Fx12 = new C0481Fx1(context, 0);
        b = c0481Fx12;
        return c0481Fx12;
    }

    public static C4192he v(C0964Md c0964Md) throws C7730w60 {
        C4192he c4192he = c0964Md.a;
        InterfaceC3903g70 interfaceC3903g70 = (InterfaceC3903g70) c4192he.a;
        Rect rect = c4192he.e;
        try {
            byte[] bArrC = AbstractC5237j22.c(interfaceC3903g70, rect, c0964Md.b, c4192he.f);
            try {
                C5499kQ c5499kQ = new C5499kQ(new C7979xQ(new ByteArrayInputStream(bArrC)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                Matrix matrix = c4192he.g;
                RectF rectF = AbstractC7255tc1.a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                return new C4192he(bArrC, c5499kQ, 256, size, rect2, c4192he.f, matrix2, c4192he.h);
            } catch (IOException e) {
                throw new C7730w60("Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (C8113y70 e2) {
            throw new C7730w60("Failed to encode the image to JPEG.", e2);
        }
    }

    public synchronized void B() {
        Y41 y41 = (Y41) this.a;
        ReentrantLock reentrantLock = y41.a;
        reentrantLock.lock();
        try {
            y41.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.InterfaceC2056a2
    public boolean a(View view) {
        EL el = (EL) this.a;
        el.getClass();
        if (!EL.l(view) || el.g(view) == 2) {
            return false;
        }
        el.b(view);
        return true;
    }

    @Override // defpackage.GD
    public Object b(FE0 fe0, Object obj) {
        z(fe0, (StringBuilder) obj, "getter");
        return C1518Tf1.a;
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        Type type = (Type) this.a;
        if (!(type instanceof ParameterizedType)) {
            throw new C6682qc0("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new C6682qc0("Invalid EnumMap type: " + type.toString());
    }

    public Object d(Object obj) throws Exception {
        C4192he c4192heV;
        C0964Md c0964Md = (C0964Md) obj;
        C4192he c4192he = c0964Md.a;
        try {
            int i = c4192he.c;
            Object obj2 = c4192he.a;
            if (i == 35) {
                c4192heV = v(c0964Md);
            } else {
                if (i != 256 && i != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + i);
                }
                c4192heV = u(c0964Md, i);
            }
            ((InterfaceC3903g70) obj2).close();
            return c4192heV;
        } catch (Throwable th) {
            ((InterfaceC3903g70) c4192he.a).close();
            throw th;
        }
    }

    @Override // defpackage.GD
    public Object e(C1758Wh1 c1758Wh1, Object obj) {
        ((C5857mI) this.a).e0(c1758Wh1, true, (StringBuilder) obj, true);
        return C1518Tf1.a;
    }

    public void f(Path path) {
        ArrayList arrayList = (ArrayList) this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3428dd1 c3428dd1 = (C3428dd1) arrayList.get(size);
            C6987sD c6987sD = AbstractC0667Ih1.a;
            if (c3428dd1 != null && !c3428dd1.a) {
                AbstractC0667Ih1.a(path, c3428dd1.d.k() / 100.0f, c3428dd1.e.k() / 100.0f, c3428dd1.f.k() / 360.0f);
            }
        }
    }

    @Override // defpackage.GD
    public Object g(AbstractC6567q1 abstractC6567q1, Object obj) {
        ((C5857mI) this.a).a0(abstractC6567q1, (StringBuilder) obj, true);
        return C1518Tf1.a;
    }

    @Override // defpackage.GD
    public Object h(C6887rh0 c6887rh0, Object obj) {
        O90.f(c6887rh0, "descriptor");
        ((StringBuilder) obj).append(c6887rh0.getName());
        return C1518Tf1.a;
    }

    @Override // defpackage.GD
    public Object i(JE0 je0, Object obj) {
        z(je0, (StringBuilder) obj, "setter");
        return C1518Tf1.a;
    }

    @Override // defpackage.GD
    public Object j(C1835Xh0 c1835Xh0, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C5857mI c5857mI = (C5857mI) this.a;
        c5857mI.getClass();
        c5857mI.S(c1835Xh0.e, "package", sb);
        if (c5857mI.a.n()) {
            sb.append(" in context of ");
            c5857mI.O(c1835Xh0.d, sb, false);
        }
        return C1518Tf1.a;
    }

    @Override // defpackage.GD
    public Object k(VI vi, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C5857mI c5857mI = (C5857mI) this.a;
        c5857mI.getClass();
        c5857mI.y(sb, vi, null);
        C7575vI c7575vI = vi.g;
        O90.e(c7575vI, "getVisibility(...)");
        c5857mI.g0(c7575vI, sb);
        c5857mI.J(vi, sb);
        sb.append(c5857mI.H("typealias"));
        sb.append(" ");
        c5857mI.O(vi, sb, true);
        c5857mI.c0(vi.o(), sb, false);
        c5857mI.z(vi, sb);
        sb.append(" = ");
        sb.append(c5857mI.X(vi.A1()));
        return C1518Tf1.a;
    }

    public SharedPreferences l() {
        if (((SharedPreferences) this.a) == null) {
            this.a = CO1.a.getSharedPreferences("io.invertase.firebase", 0);
        }
        return (SharedPreferences) this.a;
    }

    public Boolean m() {
        Bundle bundle = (Bundle) this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // defpackage.GD
    public Object n(C0231Cs0 c0231Cs0, Object obj) {
        ((C5857mI) this.a).O(c0231Cs0, (StringBuilder) obj, true);
        return C1518Tf1.a;
    }

    @Override // defpackage.GD
    public Object o(EE0 ee0, Object obj) {
        O90.f(ee0, "descriptor");
        C5857mI.n((C5857mI) this.a, ee0, (StringBuilder) obj);
        return C1518Tf1.a;
    }

    @Override // defpackage.J2
    public void onActivityResult(Object obj) {
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        o oVar = (o) this.a;
        C3983gY c3983gY = (C3983gY) oVar.C.pollFirst();
        if (c3983gY == null) {
            return;
        }
        Fragment fragmentC = oVar.c.c(c3983gY.a);
        if (fragmentC == null) {
            return;
        }
        fragmentC.onRequestPermissionsResult(c3983gY.b, strArr, iArr);
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        ((C7020sO) this.a).b(0, "Unable to acquire InputBuffer.", th);
    }

    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        C7736w80 c7736w80 = (C7736w80) obj;
        C7020sO c7020sO = (C7020sO) this.a;
        c7020sO.q.getClass();
        long jH = C5806m12.h();
        if (c7736w80.f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        AbstractC3377dM1.e(jH >= 0);
        c7736w80.g = jH;
        if (c7736w80.f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        c7736w80.h = true;
        c7736w80.b();
        AbstractC1500Sz1.a(AbstractC1500Sz1.l(c7736w80.d), new C3866fw1(13, this), c7020sO.h);
    }

    @Override // defpackage.GD
    public /* bridge */ /* synthetic */ Object p(AZ az, Object obj) {
        y(az, (StringBuilder) obj);
        return C1518Tf1.a;
    }

    @Override // defpackage.GD
    public Object q(AbstractC8064xs0 abstractC8064xs0, Object obj) {
        C6729qs c6729qsV;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        C5857mI c5857mI = (C5857mI) this.a;
        c5857mI.getClass();
        boolean z = abstractC8064xs0.l() == EnumC0152Bs.d;
        if (!c5857mI.r()) {
            c5857mI.y(sb, abstractC8064xs0, null);
            List listS0 = abstractC8064xs0.S0();
            O90.e(listS0, "getContextReceivers(...)");
            c5857mI.B(sb, listS0);
            if (!z) {
                C7575vI visibility = abstractC8064xs0.getVisibility();
                O90.e(visibility, "getVisibility(...)");
                c5857mI.g0(visibility, sb);
            }
            if ((abstractC8064xs0.l() != EnumC0152Bs.b || abstractC8064xs0.f() != EnumC6348os0.e) && (!abstractC8064xs0.l().a() || abstractC8064xs0.f() != EnumC6348os0.b)) {
                EnumC6348os0 enumC6348os0F = abstractC8064xs0.f();
                O90.e(enumC6348os0F, "getModality(...)");
                c5857mI.K(enumC6348os0F, sb, C5857mI.v(abstractC8064xs0));
            }
            c5857mI.J(abstractC8064xs0, sb);
            c5857mI.M(sb, c5857mI.q().contains(EnumC6048nI.h) && abstractC8064xs0.N(), "inner");
            c5857mI.M(sb, c5857mI.q().contains(EnumC6048nI.j) && abstractC8064xs0.X0(), "data");
            c5857mI.M(sb, c5857mI.q().contains(EnumC6048nI.k) && abstractC8064xs0.isInline(), "inline");
            c5857mI.M(sb, c5857mI.q().contains(EnumC6048nI.q) && abstractC8064xs0.K(), "value");
            c5857mI.M(sb, c5857mI.q().contains(EnumC6048nI.p) && abstractC8064xs0.A(), "fun");
            if (abstractC8064xs0 instanceof InterfaceC0499Gd1) {
                str = "typealias";
            } else if (abstractC8064xs0.w()) {
                str = "companion object";
            } else {
                int iOrdinal = abstractC8064xs0.l().ordinal();
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
                        throw new C7074sg();
                    }
                    str = "object";
                }
            }
            sb.append(c5857mI.H(str));
        }
        boolean zL = AbstractC7002sI.l(abstractC8064xs0);
        C6621qI c6621qI = c5857mI.a;
        if (zL) {
            if (((Boolean) c6621qI.G.getValue(c6621qI, C6621qI.X[31])).booleanValue()) {
                if (c5857mI.r()) {
                    sb.append("companion object");
                }
                C5857mI.W(sb);
                CD cdI = abstractC8064xs0.i();
                if (cdI != null) {
                    sb.append("of ");
                    C1559Tt0 name = cdI.getName();
                    O90.e(name, "getName(...)");
                    sb.append(c5857mI.N(name, false));
                }
            }
            if (c5857mI.u() || !O90.a(abstractC8064xs0.getName(), AbstractC5431k31.b)) {
                if (!c5857mI.r()) {
                    C5857mI.W(sb);
                }
                C1559Tt0 name2 = abstractC8064xs0.getName();
                O90.e(name2, "getName(...)");
                sb.append(c5857mI.N(name2, true));
            }
        } else {
            if (!c5857mI.r()) {
                C5857mI.W(sb);
            }
            c5857mI.O(abstractC8064xs0, sb, true);
        }
        if (!z) {
            List listO = abstractC8064xs0.o();
            O90.e(listO, "getDeclaredTypeParameters(...)");
            c5857mI.c0(listO, sb, false);
            c5857mI.z(abstractC8064xs0, sb);
            if (!abstractC8064xs0.l().a()) {
                if (((Boolean) c6621qI.i.getValue(c6621qI, C6621qI.X[7])).booleanValue() && (c6729qsV = abstractC8064xs0.V()) != null) {
                    sb.append(" ");
                    c5857mI.y(sb, c6729qsV, null);
                    C6729qs c6729qs = c6729qsV;
                    C7575vI visibility2 = c6729qs.getVisibility();
                    O90.e(visibility2, "getVisibility(...)");
                    c5857mI.g0(visibility2, sb);
                    sb.append(c5857mI.H("constructor"));
                    List listF0 = c6729qs.f0();
                    O90.e(listF0, "getValueParameters(...)");
                    c5857mI.f0(listF0, c6729qsV.F(), sb);
                }
            }
            if (!((Boolean) c6621qI.x.getValue(c6621qI, C6621qI.X[22])).booleanValue() && !AbstractC8408zg0.E(abstractC8064xs0.m())) {
                Collection collectionB = abstractC8064xs0.v().b();
                O90.e(collectionB, "getSupertypes(...)");
                if (!collectionB.isEmpty() && (collectionB.size() != 1 || !AbstractC8408zg0.x((AbstractC0663Ig0) collectionB.iterator().next()))) {
                    C5857mI.W(sb);
                    sb.append(": ");
                    AbstractC8069xu.G(collectionB, sb, ", ", null, null, new C5666lI(c5857mI, 1), 60);
                }
            }
            c5857mI.h0(sb, listO);
        }
        return C1518Tf1.a;
    }

    @Override // defpackage.GD
    public Object r(AbstractC0096Az0 abstractC0096Az0, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C5857mI c5857mI = (C5857mI) this.a;
        c5857mI.getClass();
        c5857mI.S(abstractC0096Az0.f, "package-fragment", sb);
        if (c5857mI.a.n()) {
            sb.append(" in ");
            c5857mI.O(abstractC0096Az0.i(), sb, false);
        }
        return C1518Tf1.a;
    }

    @Override // defpackage.InterfaceC3677ex0
    public void r0(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C0431Fh c0431Fh = (C0431Fh) this.a;
            if (c0431Fh.u()) {
                c0431Fh.y(c0431Fh.getString(R.string.fingerprint_not_recognized));
            }
            C1210Ph c1210Ph = c0431Fh.b;
            if (c1210Ph.n) {
                Executor executorC1054Nh = c1210Ph.d;
                if (executorC1054Nh == null) {
                    executorC1054Nh = new ExecutorC1054Nh(0);
                }
                executorC1054Nh.execute(new RunnableC8220yh(c0431Fh, 0));
            }
            C1210Ph c1210Ph2 = c0431Fh.b;
            if (c1210Ph2.u == null) {
                c1210Ph2.u = new C0390Et0();
            }
            C1210Ph.i(c1210Ph2.u, Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0048  */
    @Override // defpackage.GD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object s(defpackage.C6729qs r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0481Fx1.s(qs, java.lang.Object):java.lang.Object");
    }

    public void t(C1666Vd c1666Vd, Thread thread, Throwable th) {
        C5833mA c5833mA = (C5833mA) this.a;
        synchronized (c5833mA) {
            Objects.toString(th);
            thread.getName();
            try {
                AbstractC0511Gh1.a(((ZA) ((C6846rT1) c5833mA.e).b).b(new CallableC5451kA(c5833mA, System.currentTimeMillis(), th, thread, c1666Vd)));
            } catch (TimeoutException | Exception unused) {
            }
        }
    }

    public C4192he u(C0964Md c0964Md, int i) {
        byte[] bArrCopyOfRange;
        byte b2;
        C4192he c4192he = c0964Md.a;
        InterfaceC3903g70 interfaceC3903g70 = (InterfaceC3903g70) c4192he.a;
        int i2 = 0;
        if (((IncorrectJpegMetadataQuirk) ((C1562Tu0) this.a).b) == null) {
            ByteBuffer byteBufferC = interfaceC3903g70.u()[0].C();
            bArrCopyOfRange = new byte[byteBufferC.capacity()];
            byteBufferC.rewind();
            byteBufferC.get(bArrCopyOfRange);
        } else {
            ByteBuffer byteBufferC2 = interfaceC3903g70.u()[0].C();
            int iCapacity = byteBufferC2.capacity();
            byte[] bArr = new byte[iCapacity];
            byteBufferC2.rewind();
            byteBufferC2.get(bArr);
            int i3 = 2;
            for (int i4 = 2; i4 + 4 <= iCapacity && (b2 = bArr[i4]) == -1; i4 += (((bArr[i4 + 2] & 255) << 8) | (bArr[i4 + 3] & 255)) + 2) {
                if (b2 == -1 && bArr[i4 + 1] == -38) {
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
            bArrCopyOfRange = i2 != -1 ? Arrays.copyOfRange(bArr, i2, byteBufferC2.limit()) : bArr;
        }
        byte[] bArr2 = bArrCopyOfRange;
        C5499kQ c5499kQ = c4192he.b;
        Objects.requireNonNull(c5499kQ);
        return new C4192he(bArr2, c5499kQ, i, c4192he.d, c4192he.e, c4192he.f, c4192he.g, c4192he.h);
    }

    public void w(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap map2 = (HashMap) this.a;
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
                        C8317zC c8317zC = C8317zC.b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i < zArr.length) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        map2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        C8317zC c8317zC2 = C8317zC.b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i < bArr.length) {
                            bArr2[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                        map2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        C8317zC c8317zC3 = C8317zC.b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i < iArr.length) {
                            numArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        map2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        C8317zC c8317zC4 = C8317zC.b;
                        Long[] lArr = new Long[jArr.length];
                        while (i < jArr.length) {
                            lArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        map2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        C8317zC c8317zC5 = C8317zC.b;
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
                        C8317zC c8317zC6 = C8317zC.b;
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

    public InterfaceC7492us x(C3957gP0 c3957gP0) {
        O90.f(c3957gP0, "javaClass");
        KX kxC = c3957gP0.c();
        EnumC1292Qi0[] enumC1292Qi0Arr = EnumC1292Qi0.a;
        Class<?> declaringClass = c3957gP0.a.getDeclaringClass();
        C3957gP0 c3957gP02 = declaringClass != null ? new C3957gP0(declaringClass) : null;
        if (c3957gP02 != null) {
            InterfaceC7492us interfaceC7492usX = x(c3957gP02);
            InterfaceC5578kq0 interfaceC5578kq0I0 = interfaceC7492usX != null ? interfaceC7492usX.I0() : null;
            InterfaceC1087Ns interfaceC1087NsC = interfaceC5578kq0I0 != null ? interfaceC5578kq0I0.c(c3957gP0.e(), EnumC8453zv0.h) : null;
            if (interfaceC1087NsC instanceof InterfaceC7492us) {
                return (InterfaceC7492us) interfaceC1087NsC;
            }
            return null;
        }
        KX kxE = kxC.e();
        O90.e(kxE, "parent(...)");
        C0432Fh0 c0432Fh0 = (C0432Fh0) AbstractC8069xu.C(((C0510Gh0) this.a).a(kxE));
        if (c0432Fh0 == null) {
            return null;
        }
        C0900Lh0 c0900Lh0 = c0432Fh0.k.d;
        c0900Lh0.getClass();
        return c0900Lh0.v(c3957gP0.e(), c3957gP0);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(defpackage.AZ r11, java.lang.StringBuilder r12) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0481Fx1.y(AZ, java.lang.StringBuilder):void");
    }

    public void z(InterfaceC8324zE0 interfaceC8324zE0, StringBuilder sb, String str) {
        C5857mI c5857mI = (C5857mI) this.a;
        C6621qI c6621qI = c5857mI.a;
        int iOrdinal = ((BE0) c6621qI.H.getValue(c6621qI, C6621qI.X[32])).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            y(interfaceC8324zE0, sb);
        } else {
            c5857mI.J(interfaceC8324zE0, sb);
            sb.append(str.concat(" for "));
            CE0 ce0Y1 = ((AE0) interfaceC8324zE0).y1();
            O90.e(ce0Y1, "getCorrespondingProperty(...)");
            C5857mI.n(c5857mI, ce0Y1, sb);
        }
    }

    public C0481Fx1(Context context, int i) {
        switch (i) {
            case 24:
                O90.f(context, "context");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                this.a = bundle == null ? Bundle.EMPTY : bundle;
                break;
            default:
                Y41 y41A = Y41.a(context);
                this.a = y41A;
                y41A.b();
                y41A.c();
                break;
        }
    }

    public C0481Fx1(int i) {
        Object objW;
        switch (i) {
            case 7:
                C0468Ft0 c0468Ft0B = C0468Ft0.b();
                this.a = c0468Ft0B;
                Object objW2 = null;
                try {
                    objW = c0468Ft0B.w(C81.S0);
                } catch (IllegalArgumentException unused) {
                    objW = null;
                }
                Class cls = (Class) objW;
                if (cls != null && !cls.equals(C8054xp.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                C0572Hc c0572Hc = C81.S0;
                C0468Ft0 c0468Ft0 = (C0468Ft0) this.a;
                c0468Ft0.e(c0572Hc, C8054xp.class);
                try {
                    objW2 = c0468Ft0.w(C81.R0);
                } catch (IllegalArgumentException unused2) {
                }
                if (objW2 == null) {
                    c0468Ft0.e(C81.R0, C8054xp.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 9:
                this.a = new ArrayList();
                return;
            case 13:
                this.a = new HashMap();
                return;
            case 25:
                this.a = (ExtraCroppingQuirk) AbstractC7768wJ.a.z0(ExtraCroppingQuirk.class);
                return;
            default:
                Choreographer choreographer = Choreographer.getInstance();
                O90.e(choreographer, "getInstance(...)");
                this.a = choreographer;
                return;
        }
    }

    public C0481Fx1(Application application) {
        this.a = application;
        if (d == null) {
            try {
                d = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                d = new Bundle();
            }
        }
    }
}
