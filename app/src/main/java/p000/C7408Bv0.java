package p000;

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
public final class C7408Bv0 implements InterfaceC0750Lv, C21, RemoteCall, InterfaceC9968k61, InterfaceC1801bh, InterfaceC1560Yn, InterfaceC8398Uw0, InterfaceC8939c61, InterfaceC1104RY, InterfaceC6949uR, W21, InterfaceC8088Ox0, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static C7408Bv0 f1077b;

    /* renamed from: c */
    public static final C7408Bv0 f1078c = new C7408Bv0(1);

    /* renamed from: d */
    public static final C7408Bv0 f1079d = new C7408Bv0(2);

    /* renamed from: e */
    public static final C7408Bv0 f1080e = new C7408Bv0(3);

    /* renamed from: f */
    public static final C7408Bv0 f1081f = new C7408Bv0(4);

    /* renamed from: g */
    public static final C7408Bv0 f1082g = new C7408Bv0(5);

    /* renamed from: h */
    public static final /* synthetic */ C7408Bv0 f1083h = new C7408Bv0(6);

    /* renamed from: i */
    public static final /* synthetic */ C7408Bv0 f1084i = new C7408Bv0(7);

    /* renamed from: a */
    public final /* synthetic */ int f1085a;

    public /* synthetic */ C7408Bv0(int i) {
        this.f1085a = i;
    }

    /* renamed from: k */
    public static synchronized C7408Bv0 m902k() {
        try {
            if (f1077b == null) {
                f1077b = new C7408Bv0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1077b;
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: L */
    public InterfaceFutureC7800Jj0 mo904L(float f) {
        return F70.f3069c;
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: P */
    public Rect mo905P() {
        return new Rect();
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: P0 */
    public /* synthetic */ void mo906P0() {
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: T */
    public /* synthetic */ void mo908T(InterfaceC11119t60 interfaceC11119t60) {
    }

    @Override // p000.InterfaceC6949uR
    /* renamed from: a */
    public int mo909a() {
        return 0;
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: a0 */
    public InterfaceFutureC7800Jj0 mo910a0(ArrayList arrayList, int i, int i2) {
        return AbstractC8301Sz1.m7484g(Collections.emptyList());
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) ((C11900zE1) obj).getService();
        BinderC11517wD1 binderC11517wD1 = new BinderC11517wD1(null, (S81) obj2);
        C8863bW1 c8863bW1 = (C8863bW1) interfaceC9254eX1;
        Parcel parcelZza = c8863bW1.zza();
        LC1.m4926d(parcelZza, binderC11517wD1);
        c8863bW1.zzc(67, parcelZza);
    }

    @Override // p000.InterfaceC8939c61
    /* renamed from: b */
    public boolean mo911b(C6686qX c6686qX) {
        String str = c6686qX.f40974m;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        return new ArrayDeque();
    }

    @Override // p000.InterfaceC6949uR
    /* renamed from: e */
    public Range mo915e() {
        return new Range(0, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:65:0x000f  */
    @Override // p000.InterfaceC8939c61
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.InterfaceC9200e61 mo916f(p000.C6686qX r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7408Bv0.mo916f(qX):e61");
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        Object objMo4071h = c8128Pr0.mo4071h(new C11011sG0(InterfaceC8214Ri0.class, Executor.class));
        O90.m5967e(objMo4071h, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return N02.m5507e((Executor) objMo4071h);
    }

    @Override // p000.InterfaceC8939c61
    /* renamed from: h */
    public int mo917h(C6686qX c6686qX) {
        String str = c6686qX.f40974m;
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
        throw new IllegalArgumentException(AbstractC7222ym.m26245v("Unsupported MIME type: ", str));
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: h0 */
    public InterfaceFutureC7800Jj0 mo918h0(boolean z) {
        return F70.f3069c;
    }

    /* renamed from: i */
    public C0513I8 m919i(List list, InterfaceC7402Bs0 interfaceC7402Bs0, EnumC11005sD0 enumC11005sD0) {
        List listM25982b0 = AbstractC7167xu.m25982b0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM25982b0.iterator();
        while (it.hasNext()) {
            AbstractC0249Dx abstractC0249DxM920j = m920j(it.next(), null);
            if (abstractC0249DxM920j != null) {
                arrayList.add(abstractC0249DxM920j);
            }
        }
        return interfaceC7402Bs0 != null ? new C7791Je1(arrayList, interfaceC7402Bs0.mo897h().m26508q(enumC11005sD0)) : new C0513I8(arrayList, new C7236z(10, enumC11005sD0));
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
    /* renamed from: j */
    public AbstractC0249Dx m920j(Object obj, InterfaceC7402Bs0 interfaceC7402Bs0) {
        if (obj instanceof Byte) {
            return new C0614Jk(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C11360v01(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C9589h90(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C7596Fl0(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            ch.getClass();
            return new C6975ur(ch);
        }
        if (obj instanceof Float) {
            return new C0612Ji(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C0612Ji(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new C0612Ji(bool);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            O90.m5968f(str, "value");
            return new C11246u51(str);
        }
        boolean z = obj instanceof byte[];
        ?? M26274e = C0779MN.f7117a;
        int i = 0;
        if (z) {
            byte[] bArr = (byte[]) obj;
            O90.m5968f(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    M26274e = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i < length2) {
                        M26274e.add(Byte.valueOf(bArr[i]));
                        i++;
                    }
                } else {
                    M26274e = AbstractC7230yu.m26274e(Byte.valueOf(bArr[0]));
                }
            }
            return m919i(M26274e, interfaceC7402Bs0, EnumC11005sD0.f42307h);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            O90.m5968f(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    M26274e = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i < length4) {
                        M26274e.add(Short.valueOf(sArr[i]));
                        i++;
                    }
                } else {
                    M26274e = AbstractC7230yu.m26274e(Short.valueOf(sArr[0]));
                }
            }
            return m919i(M26274e, interfaceC7402Bs0, EnumC11005sD0.f42308i);
        }
        if (obj instanceof int[]) {
            return m919i(AbstractC0576J8.m4172C((int[]) obj), interfaceC7402Bs0, EnumC11005sD0.f42309j);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            O90.m5968f(jArr, "<this>");
            int length5 = jArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    M26274e = new ArrayList(jArr.length);
                    int length6 = jArr.length;
                    while (i < length6) {
                        M26274e.add(Long.valueOf(jArr[i]));
                        i++;
                    }
                } else {
                    M26274e = AbstractC7230yu.m26274e(Long.valueOf(jArr[0]));
                }
            }
            return m919i(M26274e, interfaceC7402Bs0, EnumC11005sD0.f42311l);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            O90.m5968f(cArr, "<this>");
            int length7 = cArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    M26274e = new ArrayList(cArr.length);
                    int length8 = cArr.length;
                    while (i < length8) {
                        M26274e.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                } else {
                    M26274e = AbstractC7230yu.m26274e(Character.valueOf(cArr[0]));
                }
            }
            return m919i(M26274e, interfaceC7402Bs0, EnumC11005sD0.f42306g);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            O90.m5968f(fArr, "<this>");
            int length9 = fArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    M26274e = new ArrayList(fArr.length);
                    int length10 = fArr.length;
                    while (i < length10) {
                        M26274e.add(Float.valueOf(fArr[i]));
                        i++;
                    }
                } else {
                    M26274e = AbstractC7230yu.m26274e(Float.valueOf(fArr[0]));
                }
            }
            return m919i(M26274e, interfaceC7402Bs0, EnumC11005sD0.f42310k);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            O90.m5968f(dArr, "<this>");
            int length11 = dArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    M26274e = new ArrayList(dArr.length);
                    int length12 = dArr.length;
                    while (i < length12) {
                        M26274e.add(Double.valueOf(dArr[i]));
                        i++;
                    }
                } else {
                    M26274e = AbstractC7230yu.m26274e(Double.valueOf(dArr[0]));
                }
            }
            return m919i(M26274e, interfaceC7402Bs0, EnumC11005sD0.f42312m);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new C7358Aw0(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        O90.m5968f(zArr, "<this>");
        int length13 = zArr.length;
        if (length13 != 0) {
            if (length13 != 1) {
                M26274e = new ArrayList(zArr.length);
                int length14 = zArr.length;
                while (i < length14) {
                    M26274e.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
            } else {
                M26274e = AbstractC7230yu.m26274e(Boolean.valueOf(zArr[0]));
            }
        }
        return m919i(M26274e, interfaceC7402Bs0, EnumC11005sD0.f42305f);
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: j0 */
    public InterfaceFutureC7800Jj0 mo921j0(C0974PT c0974pt) {
        return AbstractC8301Sz1.m7484g(new C0474HW(false));
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: l0 */
    public InterfaceFutureC7800Jj0 mo922l0(int i, int i2) {
        return AbstractC8301Sz1.m7484g(new C1497Xn());
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: n0 */
    public InterfaceC6854sw mo923n0() {
        return null;
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: r0 */
    public InterfaceFutureC7800Jj0 mo924r0(int i) {
        return AbstractC8301Sz1.m7484g(0);
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: t */
    public /* synthetic */ void mo925t() {
    }

    @Override // p000.InterfaceC9968k61
    public Task then(Object obj) {
        switch (this.f1085a) {
            case 7:
                Bundle bundle = (Bundle) obj;
                int i = QT0.f9633h;
                return (bundle == null || !bundle.containsKey("google.messenger")) ? AbstractC9376fU1.m18244e(bundle) : AbstractC9376fU1.m18244e(null);
            default:
                return AbstractC9376fU1.m18244e(Boolean.TRUE);
        }
    }

    public String toString() {
        switch (this.f1085a) {
            case 21:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f1085a) {
            case 26:
                RX1.f10264b.get();
                Boolean bool = (Boolean) WX1.f13249a.m8754a();
                bool.getClass();
                return bool;
            case 27:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11876i0.m8754a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11835C.m8754a();
                l.getClass();
                return l;
            default:
                PW1.f9104b.get();
                Long l2 = (Long) UW1.f11837E.m8754a();
                l2.getClass();
                return l2;
        }
    }

    public C7408Bv0(C1068Qy c1068Qy) {
        this.f1085a = 24;
    }

    public C7408Bv0(C7512Dv0 c7512Dv0, C7512Dv0 c7512Dv02) {
        this.f1085a = 16;
    }

    public C7408Bv0(Context context) {
        this.f1085a = 23;
        context.getApplicationContext();
    }

    public C7408Bv0() {
        this.f1085a = 17;
        N70 n70 = P70.f8867b;
        C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
    }

    @Override // p000.InterfaceC1801bh
    /* renamed from: d */
    public void mo914d() {
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: z0 */
    public void mo926z0() {
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: E */
    public void mo903E(InterfaceC6854sw interfaceC6854sw) {
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: R */
    public void mo907R(int i) {
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: b0 */
    public void mo912b0(C11303uY0 c11303uY0) {
    }

    @Override // p000.InterfaceC8088Ox0
    public void onComplete(Throwable th) {
    }
}
