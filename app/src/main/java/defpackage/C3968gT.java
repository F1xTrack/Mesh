package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: gT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3968gT {
    public static final C3968gT c = new C3968gT(0);
    public final C6000n21 a = new C6000n21(16);
    public boolean b;

    public C3968gT() {
    }

    public static int c(EnumC6337oo1 enumC6337oo1, Object obj) throws UnsupportedEncodingException {
        switch (enumC6337oo1.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return J9.j(((Long) obj).longValue());
            case 3:
                return J9.j(((Long) obj).longValue());
            case 4:
                return J9.f(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return J9.i(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((K0) obj).b();
            case 10:
                return J9.h((K0) obj);
            case 11:
                if (obj instanceof AbstractC0596Hk) {
                    AbstractC0596Hk abstractC0596Hk = (AbstractC0596Hk) obj;
                    return abstractC0596Hk.size() + J9.i(abstractC0596Hk.size());
                }
                byte[] bArr = (byte[]) obj;
                return J9.i(bArr.length) + bArr.length;
            case 12:
                return J9.i(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC6976s90 ? J9.f(((InterfaceC6976s90) obj).a()) : J9.f(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return J9.i((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return J9.j((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(C7899x00 c7899x00, Object obj) {
        EnumC6337oo1 enumC6337oo1 = c7899x00.b;
        boolean z = c7899x00.c;
        int i = c7899x00.a;
        if (!z) {
            int iK = J9.k(i);
            if (enumC6337oo1 == EnumC6337oo1.e) {
                iK *= 2;
            }
            return c(enumC6337oo1, obj) + iK;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iK2 = J9.k(i);
            if (enumC6337oo1 == EnumC6337oo1.e) {
                iK2 *= 2;
            }
            iC += c(enumC6337oo1, obj2) + iK2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        C7899x00 c7899x00 = (C7899x00) entry.getKey();
        if (c7899x00.b.a != EnumC6909ro1.j) {
            return true;
        }
        if (!c7899x00.c) {
            Object value = entry.getValue();
            if (value instanceof K0) {
                return ((K0) value).e();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((K0) it.next()).e()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(C5780lu c5780lu, EnumC6337oo1 enumC6337oo1) {
        switch (enumC6337oo1.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c5780lu.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c5780lu.i()));
            case 2:
                return Long.valueOf(c5780lu.l());
            case 3:
                return Long.valueOf(c5780lu.l());
            case 4:
                return Integer.valueOf(c5780lu.k());
            case 5:
                return Long.valueOf(c5780lu.j());
            case 6:
                return Integer.valueOf(c5780lu.i());
            case 7:
                return Boolean.valueOf(c5780lu.l() != 0);
            case 8:
                int iK = c5780lu.k();
                int i = c5780lu.b;
                int i2 = c5780lu.d;
                if (iK > i - i2 || iK <= 0) {
                    return iK == 0 ? "" : new String(c5780lu.h(iK), "UTF-8");
                }
                String str = new String(c5780lu.a, i2, iK, "UTF-8");
                c5780lu.d += iK;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c5780lu.e();
            case 12:
                return Integer.valueOf(c5780lu.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(c5780lu.i());
            case 15:
                return Long.valueOf(c5780lu.j());
            case 16:
                int iK2 = c5780lu.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = c5780lu.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(defpackage.EnumC6337oo1 r2, java.lang.Object r3) {
        /*
            r3.getClass()
            ro1 r2 = r2.a
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L36;
                case 1: goto L33;
                case 2: goto L30;
                case 3: goto L2d;
                case 4: goto L2a;
                case 5: goto L27;
                case 6: goto L1e;
                case 7: goto L12;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L38
        Lf:
            boolean r1 = r3 instanceof defpackage.K0
            goto L38
        L12:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof defpackage.InterfaceC6976s90
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            r1 = r0
            goto L38
        L1e:
            boolean r2 = r3 instanceof defpackage.AbstractC0596Hk
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1b
            goto L1c
        L27:
            boolean r1 = r3 instanceof java.lang.String
            goto L38
        L2a:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L38
        L2d:
            boolean r1 = r3 instanceof java.lang.Double
            goto L38
        L30:
            boolean r1 = r3 instanceof java.lang.Float
            goto L38
        L33:
            boolean r1 = r3 instanceof java.lang.Long
            goto L38
        L36:
            boolean r1 = r3 instanceof java.lang.Integer
        L38:
            if (r1 == 0) goto L3b
            return
        L3b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3968gT.j(oo1, java.lang.Object):void");
    }

    public static void k(J9 j9, EnumC6337oo1 enumC6337oo1, Object obj) {
        switch (enumC6337oo1.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                j9.getClass();
                j9.E(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                j9.getClass();
                j9.D(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                j9.G(((Long) obj).longValue());
                break;
            case 3:
                j9.G(((Long) obj).longValue());
                break;
            case 4:
                j9.x(((Integer) obj).intValue());
                break;
            case 5:
                j9.E(((Long) obj).longValue());
                break;
            case 6:
                j9.D(((Integer) obj).intValue());
                break;
            case 7:
                j9.A(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                j9.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                j9.F(bytes.length);
                j9.C(bytes);
                break;
            case 9:
                j9.getClass();
                ((K0) obj).f(j9);
                break;
            case 10:
                j9.z((K0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0596Hk)) {
                    byte[] bArr = (byte[]) obj;
                    j9.getClass();
                    j9.F(bArr.length);
                    j9.C(bArr);
                    break;
                } else {
                    AbstractC0596Hk abstractC0596Hk = (AbstractC0596Hk) obj;
                    j9.getClass();
                    j9.F(abstractC0596Hk.size());
                    j9.B(abstractC0596Hk);
                    break;
                }
            case 12:
                j9.F(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC6976s90)) {
                    j9.x(((Integer) obj).intValue());
                    break;
                } else {
                    j9.x(((InterfaceC6976s90) obj).a());
                    break;
                }
            case 14:
                j9.D(((Integer) obj).intValue());
                break;
            case 15:
                j9.E(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                j9.F((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                j9.G((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(C7899x00 c7899x00, Object obj) {
        List arrayList;
        if (!c7899x00.c) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(c7899x00.b, obj);
        C6000n21 c6000n21 = this.a;
        Object obj2 = c6000n21.get(c7899x00);
        if (obj2 == null) {
            arrayList = new ArrayList();
            c6000n21.put(c7899x00, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C3968gT clone() {
        C6000n21 c6000n21;
        C3968gT c3968gT = new C3968gT();
        int i = 0;
        while (true) {
            c6000n21 = this.a;
            if (i >= c6000n21.b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c6000n21.b.get(i);
            c3968gT.i((C7899x00) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : c6000n21.c()) {
            c3968gT.i((C7899x00) entry2.getKey(), entry2.getValue());
        }
        return c3968gT;
    }

    public final void f() {
        if (this.b) {
            return;
        }
        C6000n21 c6000n21 = this.a;
        if (!c6000n21.d) {
            for (int i = 0; i < c6000n21.b.size(); i++) {
                Map.Entry entry = (Map.Entry) c6000n21.b.get(i);
                if (((C7899x00) entry.getKey()).c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c6000n21.c()) {
                if (((C7899x00) entry2.getKey()).c) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c6000n21.d) {
            c6000n21.c = c6000n21.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c6000n21.c);
            c6000n21.d = true;
        }
        this.b = true;
    }

    public final void g(Map.Entry entry) {
        C7899x00 c7899x00 = (C7899x00) entry.getKey();
        Object value = entry.getValue();
        boolean z = c7899x00.c;
        C6000n21 c6000n21 = this.a;
        if (z) {
            Object arrayList = c6000n21.get(c7899x00);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            c6000n21.put(c7899x00, arrayList);
            return;
        }
        if (c7899x00.b.a != EnumC6909ro1.j) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c6000n21.put(c7899x00, value);
            return;
        }
        Object obj2 = c6000n21.get(c7899x00);
        if (obj2 != null) {
            c6000n21.put(c7899x00, ((K0) obj2).d().j((A00) ((K0) value)).h());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c6000n21.put(c7899x00, value);
    }

    public final void i(C7899x00 c7899x00, Object obj) {
        boolean z = c7899x00.c;
        EnumC6337oo1 enumC6337oo1 = c7899x00.b;
        if (!z) {
            j(enumC6337oo1, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(enumC6337oo1, it.next());
            }
            obj = arrayList;
        }
        this.a.put(c7899x00, obj);
    }

    public C3968gT(int i) {
        f();
    }
}
