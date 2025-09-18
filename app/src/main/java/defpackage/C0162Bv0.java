package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Range;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: Bv0 */
/* loaded from: classes.dex */
public final class C0162Bv0 implements InterfaceC0940Lv, C21, RemoteCall, InterfaceC5441k61, InterfaceC2372bh, InterfaceC1930Yn, InterfaceC1646Uw0, InterfaceC2453c61, RY, InterfaceC7411uR, W21, InterfaceC1181Ox0, InterfaceC6053nJ1 {
    public static C0162Bv0 b;
    public static final C0162Bv0 c = new C0162Bv0(1);
    public static final C0162Bv0 d = new C0162Bv0(2);
    public static final C0162Bv0 e = new C0162Bv0(3);
    public static final C0162Bv0 f = new C0162Bv0(4);
    public static final C0162Bv0 g = new C0162Bv0(5);
    public static final /* synthetic */ C0162Bv0 h = new C0162Bv0(6);
    public static final /* synthetic */ C0162Bv0 i = new C0162Bv0(7);
    public final /* synthetic */ int a;

    public /* synthetic */ C0162Bv0(int i2) {
        this.a = i2;
    }

    public static synchronized C0162Bv0 k() {
        try {
            if (b == null) {
                b = new C0162Bv0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    @Override // defpackage.InterfaceC1930Yn
    public InterfaceFutureC0750Jj0 L(float f2) {
        return F70.c;
    }

    @Override // defpackage.InterfaceC1930Yn
    public Rect P() {
        return new Rect();
    }

    @Override // defpackage.InterfaceC1930Yn
    public /* synthetic */ void P0() {
    }

    @Override // defpackage.InterfaceC1930Yn
    public /* synthetic */ void T(InterfaceC7158t60 interfaceC7158t60) {
    }

    @Override // defpackage.InterfaceC7411uR
    public int a() {
        return 0;
    }

    @Override // defpackage.InterfaceC1930Yn
    public InterfaceFutureC0750Jj0 a0(ArrayList arrayList, int i2, int i3) {
        return AbstractC1500Sz1.g(Collections.emptyList());
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) ((C8325zE1) obj).getService();
        BinderC7752wD1 binderC7752wD1 = new BinderC7752wD1(null, (S81) obj2);
        C2341bW1 c2341bW1 = (C2341bW1) interfaceC3600eX1;
        Parcel parcelZza = c2341bW1.zza();
        LC1.d(parcelZza, binderC7752wD1);
        c2341bW1.zzc(67, parcelZza);
    }

    @Override // defpackage.InterfaceC2453c61
    public boolean b(C6666qX c6666qX) {
        String str = c6666qX.m;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        return new ArrayDeque();
    }

    @Override // defpackage.InterfaceC7411uR
    public Range e() {
        return new Range(0, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:65:0x000f  */
    @Override // defpackage.InterfaceC2453c61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.InterfaceC3519e61 f(defpackage.C6666qX r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0162Bv0.f(qX):e61");
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        Object objH = c1241Pr0.h(new C6997sG0(InterfaceC1370Ri0.class, Executor.class));
        O90.e(objH, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return N02.e((Executor) objH);
    }

    @Override // defpackage.InterfaceC2453c61
    public int h(C6666qX c6666qX) {
        String str = c6666qX.m;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(AbstractC8235ym.v("Unsupported MIME type: ", str));
    }

    @Override // defpackage.InterfaceC1930Yn
    public InterfaceFutureC0750Jj0 h0(boolean z) {
        return F70.c;
    }

    public I8 i(List list, InterfaceC0153Bs0 interfaceC0153Bs0, EnumC6988sD0 enumC6988sD0) {
        List listB0 = AbstractC8069xu.b0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listB0.iterator();
        while (it.hasNext()) {
            AbstractC0323Dx abstractC0323DxJ = j(it.next(), null);
            if (abstractC0323DxJ != null) {
                arrayList.add(abstractC0323DxJ);
            }
        }
        return interfaceC0153Bs0 != null ? new C0736Je1(arrayList, interfaceC0153Bs0.h().q(enumC6988sD0)) : new I8(arrayList, new C8277z(10, enumC6988sD0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [MN] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Bv0] */
    public AbstractC0323Dx j(Object obj, InterfaceC0153Bs0 interfaceC0153Bs0) {
        if (obj instanceof Byte) {
            return new C0752Jk(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C7519v01(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C4100h90(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C0444Fl0(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            ch.getClass();
            return new C7489ur(ch);
        }
        if (obj instanceof Float) {
            return new C0746Ji(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C0746Ji(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new C0746Ji(bool);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            O90.f(str, "value");
            return new C7347u51(str);
        }
        boolean z = obj instanceof byte[];
        ?? E = MN.a;
        int i2 = 0;
        if (z) {
            byte[] bArr = (byte[]) obj;
            O90.f(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    E = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i2 < length2) {
                        E.add(Byte.valueOf(bArr[i2]));
                        i2++;
                    }
                } else {
                    E = AbstractC8259yu.e(Byte.valueOf(bArr[0]));
                }
            }
            return i(E, interfaceC0153Bs0, EnumC6988sD0.h);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            O90.f(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    E = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i2 < length4) {
                        E.add(Short.valueOf(sArr[i2]));
                        i2++;
                    }
                } else {
                    E = AbstractC8259yu.e(Short.valueOf(sArr[0]));
                }
            }
            return i(E, interfaceC0153Bs0, EnumC6988sD0.i);
        }
        if (obj instanceof int[]) {
            return i(J8.C((int[]) obj), interfaceC0153Bs0, EnumC6988sD0.j);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            O90.f(jArr, "<this>");
            int length5 = jArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    E = new ArrayList(jArr.length);
                    int length6 = jArr.length;
                    while (i2 < length6) {
                        E.add(Long.valueOf(jArr[i2]));
                        i2++;
                    }
                } else {
                    E = AbstractC8259yu.e(Long.valueOf(jArr[0]));
                }
            }
            return i(E, interfaceC0153Bs0, EnumC6988sD0.l);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            O90.f(cArr, "<this>");
            int length7 = cArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    E = new ArrayList(cArr.length);
                    int length8 = cArr.length;
                    while (i2 < length8) {
                        E.add(Character.valueOf(cArr[i2]));
                        i2++;
                    }
                } else {
                    E = AbstractC8259yu.e(Character.valueOf(cArr[0]));
                }
            }
            return i(E, interfaceC0153Bs0, EnumC6988sD0.g);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            O90.f(fArr, "<this>");
            int length9 = fArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    E = new ArrayList(fArr.length);
                    int length10 = fArr.length;
                    while (i2 < length10) {
                        E.add(Float.valueOf(fArr[i2]));
                        i2++;
                    }
                } else {
                    E = AbstractC8259yu.e(Float.valueOf(fArr[0]));
                }
            }
            return i(E, interfaceC0153Bs0, EnumC6988sD0.k);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            O90.f(dArr, "<this>");
            int length11 = dArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    E = new ArrayList(dArr.length);
                    int length12 = dArr.length;
                    while (i2 < length12) {
                        E.add(Double.valueOf(dArr[i2]));
                        i2++;
                    }
                } else {
                    E = AbstractC8259yu.e(Double.valueOf(dArr[0]));
                }
            }
            return i(E, interfaceC0153Bs0, EnumC6988sD0.m);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new C0087Aw0(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        O90.f(zArr, "<this>");
        int length13 = zArr.length;
        if (length13 != 0) {
            if (length13 != 1) {
                E = new ArrayList(zArr.length);
                int length14 = zArr.length;
                while (i2 < length14) {
                    E.add(Boolean.valueOf(zArr[i2]));
                    i2++;
                }
            } else {
                E = AbstractC8259yu.e(Boolean.valueOf(zArr[0]));
            }
        }
        return i(E, interfaceC0153Bs0, EnumC6988sD0.f);
    }

    @Override // defpackage.InterfaceC1930Yn
    public InterfaceFutureC0750Jj0 j0(PT pt) {
        return AbstractC1500Sz1.g(new HW(false));
    }

    @Override // defpackage.InterfaceC1930Yn
    public InterfaceFutureC0750Jj0 l0(int i2, int i3) {
        return AbstractC1500Sz1.g(new C1852Xn());
    }

    @Override // defpackage.InterfaceC1930Yn
    public InterfaceC7122sw n0() {
        return null;
    }

    @Override // defpackage.InterfaceC1930Yn
    public InterfaceFutureC0750Jj0 r0(int i2) {
        return AbstractC1500Sz1.g(0);
    }

    @Override // defpackage.InterfaceC1930Yn
    public /* synthetic */ void t() {
    }

    @Override // defpackage.InterfaceC5441k61
    public Task then(Object obj) {
        switch (this.a) {
            case 7:
                Bundle bundle = (Bundle) obj;
                int i2 = QT0.h;
                return (bundle == null || !bundle.containsKey("google.messenger")) ? AbstractC3782fU1.e(bundle) : AbstractC3782fU1.e(null);
            default:
                return AbstractC3782fU1.e(Boolean.TRUE);
        }
    }

    public String toString() {
        switch (this.a) {
            case 21:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 26:
                RX1.b.get();
                Boolean bool = (Boolean) WX1.a.a();
                bool.getClass();
                return bool;
            case 27:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.i0.a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l = (Long) UW1.C.a();
                l.getClass();
                return l;
            default:
                PW1.b.get();
                Long l2 = (Long) UW1.E.a();
                l2.getClass();
                return l2;
        }
    }

    public C0162Bv0(C1339Qy c1339Qy) {
        this.a = 24;
    }

    public C0162Bv0(C0318Dv0 c0318Dv0, C0318Dv0 c0318Dv02) {
        this.a = 16;
    }

    public C0162Bv0(Context context) {
        this.a = 23;
        context.getApplicationContext();
    }

    public C0162Bv0() {
        this.a = 17;
        N70 n70 = P70.b;
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
    }

    @Override // defpackage.InterfaceC2372bh
    public void d() {
    }

    @Override // defpackage.InterfaceC1930Yn
    public void z0() {
    }

    @Override // defpackage.InterfaceC1930Yn
    public void E(InterfaceC7122sw interfaceC7122sw) {
    }

    @Override // defpackage.InterfaceC1930Yn
    public void R(int i2) {
    }

    @Override // defpackage.InterfaceC1930Yn
    public void b0(C7433uY0 c7433uY0) {
    }

    @Override // defpackage.InterfaceC1181Ox0
    public void onComplete(Throwable th) {
    }
}
