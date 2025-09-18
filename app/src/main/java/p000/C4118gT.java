package p000;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: gT */
/* loaded from: classes2.dex */
public final class C4118gT {

    /* renamed from: c */
    public static final C4118gT f27807c = new C4118gT(0);

    /* renamed from: a */
    public final C10342n21 f27808a = new C10342n21(16);

    /* renamed from: b */
    public boolean f27809b;

    public C4118gT() {
    }

    /* renamed from: c */
    public static int m18560c(EnumC10568oo1 enumC10568oo1, Object obj) throws UnsupportedEncodingException {
        switch (enumC10568oo1.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return C0577J9.m4210j(((Long) obj).longValue());
            case 3:
                return C0577J9.m4210j(((Long) obj).longValue());
            case 4:
                return C0577J9.m4206f(((Integer) obj).intValue());
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
                    return C0577J9.m4209i(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((AbstractC0631K0) obj).mo128b();
            case 10:
                return C0577J9.m4208h((AbstractC0631K0) obj);
            case 11:
                if (obj instanceof AbstractC0488Hk) {
                    AbstractC0488Hk abstractC0488Hk = (AbstractC0488Hk) obj;
                    return abstractC0488Hk.size() + C0577J9.m4209i(abstractC0488Hk.size());
                }
                byte[] bArr = (byte[]) obj;
                return C0577J9.m4209i(bArr.length) + bArr.length;
            case 12:
                return C0577J9.m4209i(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC10997s90 ? C0577J9.m4206f(((InterfaceC10997s90) obj).mo2106a()) : C0577J9.m4206f(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return C0577J9.m4209i((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return C0577J9.m4210j((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: d */
    public static int m18561d(C11614x00 c11614x00, Object obj) {
        EnumC10568oo1 enumC10568oo1 = c11614x00.f45252b;
        boolean z = c11614x00.f45253c;
        int i = c11614x00.f45251a;
        if (!z) {
            int iM4211k = C0577J9.m4211k(i);
            if (enumC10568oo1 == EnumC10568oo1.f39277e) {
                iM4211k *= 2;
            }
            return m18560c(enumC10568oo1, obj) + iM4211k;
        }
        int iM18560c = 0;
        for (Object obj2 : (List) obj) {
            int iM4211k2 = C0577J9.m4211k(i);
            if (enumC10568oo1 == EnumC10568oo1.f39277e) {
                iM4211k2 *= 2;
            }
            iM18560c += m18560c(enumC10568oo1, obj2) + iM4211k2;
        }
        return iM18560c;
    }

    /* renamed from: e */
    public static boolean m18562e(Map.Entry entry) {
        C11614x00 c11614x00 = (C11614x00) entry.getKey();
        if (c11614x00.f45252b.f39281a != EnumC10952ro1.f41916j) {
            return true;
        }
        if (!c11614x00.f45253c) {
            Object value = entry.getValue();
            if (value instanceof AbstractC0631K0) {
                return ((AbstractC0631K0) value).mo131e();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((AbstractC0631K0) it.next()).mo131e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static Object m18563h(C6392lu c6392lu, EnumC10568oo1 enumC10568oo1) {
        switch (enumC10568oo1.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c6392lu.m22582j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c6392lu.m22581i()));
            case 2:
                return Long.valueOf(c6392lu.m22584l());
            case 3:
                return Long.valueOf(c6392lu.m22584l());
            case 4:
                return Integer.valueOf(c6392lu.m22583k());
            case 5:
                return Long.valueOf(c6392lu.m22582j());
            case 6:
                return Integer.valueOf(c6392lu.m22581i());
            case 7:
                return Boolean.valueOf(c6392lu.m22584l() != 0);
            case 8:
                int iM22583k = c6392lu.m22583k();
                int i = c6392lu.f37343b;
                int i2 = c6392lu.f37345d;
                if (iM22583k > i - i2 || iM22583k <= 0) {
                    return iM22583k == 0 ? "" : new String(c6392lu.m22580h(iM22583k), "UTF-8");
                }
                String str = new String(c6392lu.f37342a, i2, iM22583k, "UTF-8");
                c6392lu.f37345d += iM22583k;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c6392lu.m22577e();
            case 12:
                return Integer.valueOf(c6392lu.m22583k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(c6392lu.m22581i());
            case 15:
                return Long.valueOf(c6392lu.m22582j());
            case 16:
                int iM22583k2 = c6392lu.m22583k();
                return Integer.valueOf((-(iM22583k2 & 1)) ^ (iM22583k2 >>> 1));
            case 17:
                long jM22584l = c6392lu.m22584l();
                return Long.valueOf((-(jM22584l & 1)) ^ (jM22584l >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m18564j(p000.EnumC10568oo1 r2, java.lang.Object r3) {
        /*
            r3.getClass()
            ro1 r2 = r2.f39281a
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
            boolean r1 = r3 instanceof p000.AbstractC0631K0
            goto L38
        L12:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof p000.InterfaceC10997s90
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            r1 = r0
            goto L38
        L1e:
            boolean r2 = r3 instanceof p000.AbstractC0488Hk
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C4118gT.m18564j(oo1, java.lang.Object):void");
    }

    /* renamed from: k */
    public static void m18565k(C0577J9 c0577j9, EnumC10568oo1 enumC10568oo1, Object obj) {
        switch (enumC10568oo1.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                c0577j9.getClass();
                c0577j9.m4217E(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                c0577j9.getClass();
                c0577j9.m4216D(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                c0577j9.m4219G(((Long) obj).longValue());
                break;
            case 3:
                c0577j9.m4219G(((Long) obj).longValue());
                break;
            case 4:
                c0577j9.m4234x(((Integer) obj).intValue());
                break;
            case 5:
                c0577j9.m4217E(((Long) obj).longValue());
                break;
            case 6:
                c0577j9.m4216D(((Integer) obj).intValue());
                break;
            case 7:
                c0577j9.m4213A(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                c0577j9.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                c0577j9.m4218F(bytes.length);
                c0577j9.m4215C(bytes);
                break;
            case 9:
                c0577j9.getClass();
                ((AbstractC0631K0) obj).mo132f(c0577j9);
                break;
            case 10:
                c0577j9.m4236z((AbstractC0631K0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0488Hk)) {
                    byte[] bArr = (byte[]) obj;
                    c0577j9.getClass();
                    c0577j9.m4218F(bArr.length);
                    c0577j9.m4215C(bArr);
                    break;
                } else {
                    AbstractC0488Hk abstractC0488Hk = (AbstractC0488Hk) obj;
                    c0577j9.getClass();
                    c0577j9.m4218F(abstractC0488Hk.size());
                    c0577j9.m4214B(abstractC0488Hk);
                    break;
                }
            case 12:
                c0577j9.m4218F(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC10997s90)) {
                    c0577j9.m4234x(((Integer) obj).intValue());
                    break;
                } else {
                    c0577j9.m4234x(((InterfaceC10997s90) obj).mo2106a());
                    break;
                }
            case 14:
                c0577j9.m4216D(((Integer) obj).intValue());
                break;
            case 15:
                c0577j9.m4217E(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0577j9.m4218F((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0577j9.m4219G((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* renamed from: a */
    public final void m18566a(C11614x00 c11614x00, Object obj) {
        List arrayList;
        if (!c11614x00.f45253c) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m18564j(c11614x00.f45252b, obj);
        C10342n21 c10342n21 = this.f27808a;
        Object obj2 = c10342n21.get(c11614x00);
        if (obj2 == null) {
            arrayList = new ArrayList();
            c10342n21.put(c11614x00, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4118gT clone() {
        C10342n21 c10342n21;
        C4118gT c4118gT = new C4118gT();
        int i = 0;
        while (true) {
            c10342n21 = this.f27808a;
            if (i >= c10342n21.f38058b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c10342n21.f38058b.get(i);
            c4118gT.m18570i((C11614x00) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : c10342n21.m23063c()) {
            c4118gT.m18570i((C11614x00) entry2.getKey(), entry2.getValue());
        }
        return c4118gT;
    }

    /* renamed from: f */
    public final void m18568f() {
        if (this.f27809b) {
            return;
        }
        C10342n21 c10342n21 = this.f27808a;
        if (!c10342n21.f38060d) {
            for (int i = 0; i < c10342n21.f38058b.size(); i++) {
                Map.Entry entry = (Map.Entry) c10342n21.f38058b.get(i);
                if (((C11614x00) entry.getKey()).f45253c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c10342n21.m23063c()) {
                if (((C11614x00) entry2.getKey()).f45253c) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c10342n21.f38060d) {
            c10342n21.f38059c = c10342n21.f38059c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c10342n21.f38059c);
            c10342n21.f38060d = true;
        }
        this.f27809b = true;
    }

    /* renamed from: g */
    public final void m18569g(Map.Entry entry) {
        C11614x00 c11614x00 = (C11614x00) entry.getKey();
        Object value = entry.getValue();
        boolean z = c11614x00.f45253c;
        C10342n21 c10342n21 = this.f27808a;
        if (z) {
            Object arrayList = c10342n21.get(c11614x00);
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
            c10342n21.put(c11614x00, arrayList);
            return;
        }
        if (c11614x00.f45252b.f39281a != EnumC10952ro1.f41916j) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c10342n21.put(c11614x00, value);
            return;
        }
        Object obj2 = c10342n21.get(c11614x00);
        if (obj2 != null) {
            c10342n21.put(c11614x00, ((AbstractC0631K0) obj2).mo130d().mo568j((A00) ((AbstractC0631K0) value)).mo566h());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c10342n21.put(c11614x00, value);
    }

    /* renamed from: i */
    public final void m18570i(C11614x00 c11614x00, Object obj) {
        boolean z = c11614x00.f45253c;
        EnumC10568oo1 enumC10568oo1 = c11614x00.f45252b;
        if (!z) {
            m18564j(enumC10568oo1, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m18564j(enumC10568oo1, it.next());
            }
            obj = arrayList;
        }
        this.f27808a.put(c11614x00, obj);
    }

    public C4118gT(int i) {
        m18568f();
    }
}
