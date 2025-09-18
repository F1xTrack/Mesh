package p000;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: Hw0 */
/* loaded from: classes2.dex */
public final class C7722Hw0 extends AbstractC10930rd1 {

    /* renamed from: b */
    public static final C7618Fw0 f4608b = new C7618Fw0(0, new C7722Hw0(0));

    /* renamed from: a */
    public final /* synthetic */ int f4609a;

    public /* synthetic */ C7722Hw0(int i) {
        this.f4609a = i;
    }

    /* renamed from: c */
    public static AbstractC10543oc0 m3653c(C11820yc0 c11820yc0, int i) {
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 5) {
            return new C11439vc0(c11820yc0.m26190n0());
        }
        if (iM26247x == 6) {
            return new C11439vc0(new C10553oh0(c11820yc0.m26190n0()));
        }
        if (iM26247x == 7) {
            return new C11439vc0(Boolean.valueOf(c11820yc0.m26180W()));
        }
        if (iM26247x != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0852NX.m5771t(i)));
        }
        c11820yc0.m26186i0();
        return C10927rc0.f41756a;
    }

    /* renamed from: d */
    public static void m3654d(C7838Kc0 c7838Kc0, AbstractC10543oc0 abstractC10543oc0) throws IOException {
        if (abstractC10543oc0 == null || (abstractC10543oc0 instanceof C10927rc0)) {
            c7838Kc0.m4680J();
            return;
        }
        boolean z = abstractC10543oc0 instanceof C11439vc0;
        if (z) {
            if (!z) {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC10543oc0);
            }
            C11439vc0 c11439vc0 = (C11439vc0) abstractC10543oc0;
            Serializable serializable = c11439vc0.f44448a;
            if (serializable instanceof Number) {
                c7838Kc0.m4685b0(c11439vc0.m25457b());
                return;
            } else if (serializable instanceof Boolean) {
                c7838Kc0.m4687e0(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c11439vc0.m25458d()));
                return;
            } else {
                c7838Kc0.m4686d0(c11439vc0.m25458d());
                return;
            }
        }
        boolean z2 = abstractC10543oc0 instanceof C9647hc0;
        if (z2) {
            c7838Kc0.m4690n();
            if (!z2) {
                throw new IllegalStateException("Not a JSON Array: " + abstractC10543oc0);
            }
            Iterator it = ((C9647hc0) abstractC10543oc0).f28481a.iterator();
            while (it.hasNext()) {
                m3654d(c7838Kc0, (AbstractC10543oc0) it.next());
            }
            c7838Kc0.m4693w();
            return;
        }
        boolean z3 = abstractC10543oc0 instanceof C11183tc0;
        if (!z3) {
            throw new IllegalArgumentException("Couldn't write " + abstractC10543oc0.getClass());
        }
        c7838Kc0.m4691o();
        if (!z3) {
            throw new IllegalStateException("Not a JSON Object: " + abstractC10543oc0);
        }
        Iterator it2 = ((C9789ij0) ((C11183tc0) abstractC10543oc0).f43172a.entrySet()).iterator();
        while (((AbstractC10045kj0) it2).hasNext()) {
            C10173lj0 c10173lj0M22248a = ((C9533gj0) it2).m22248a();
            c7838Kc0.m4678A((String) c10173lj0M22248a.getKey());
            m3654d(c7838Kc0, (AbstractC10543oc0) c10173lj0M22248a.getValue());
        }
        c7838Kc0.m4694x();
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: a */
    public final Object mo480a(C11820yc0 c11820yc0) {
        boolean zM26180W;
        AbstractC10543oc0 c9647hc0;
        AbstractC10543oc0 c9647hc02;
        switch (this.f4609a) {
            case 0:
                int iM26194p0 = c11820yc0.m26194p0();
                int iM26247x = AbstractC7222ym.m26247x(iM26194p0);
                if (iM26247x == 5 || iM26247x == 6) {
                    return new C10553oh0(c11820yc0.m26190n0());
                }
                if (iM26247x == 8) {
                    c11820yc0.m26186i0();
                    return null;
                }
                throw new C10799qc0("Expecting number, got: " + AbstractC0852NX.m5771t(iM26194p0) + "; at path " + c11820yc0.m26176D(false));
            case 1:
                if (c11820yc0.m26194p0() != 9) {
                    return Double.valueOf(c11820yc0.m26181X());
                }
                c11820yc0.m26186i0();
                return null;
            case 2:
                if (c11820yc0.m26194p0() != 9) {
                    return Float.valueOf((float) c11820yc0.m26181X());
                }
                c11820yc0.m26186i0();
                return null;
            case 3:
                ArrayList arrayList = new ArrayList();
                c11820yc0.m26187m();
                while (c11820yc0.m26177J()) {
                    try {
                        arrayList.add(Integer.valueOf(c11820yc0.m26182b0()));
                    } catch (NumberFormatException e) {
                        throw new C10799qc0(e);
                    }
                }
                c11820yc0.m26201w();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            case 4:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 5:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                try {
                    return Long.valueOf(c11820yc0.m26183d0());
                } catch (NumberFormatException e2) {
                    throw new C10799qc0(e2);
                }
            case 6:
                if (c11820yc0.m26194p0() != 9) {
                    return Float.valueOf((float) c11820yc0.m26181X());
                }
                c11820yc0.m26186i0();
                return null;
            case 7:
                if (c11820yc0.m26194p0() != 9) {
                    return Double.valueOf(c11820yc0.m26181X());
                }
                c11820yc0.m26186i0();
                return null;
            case 8:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                String strM26190n0 = c11820yc0.m26190n0();
                if (strM26190n0.length() == 1) {
                    return Character.valueOf(strM26190n0.charAt(0));
                }
                StringBuilder sbM26240q = AbstractC7222ym.m26240q("Expecting character, got: ", strM26190n0, "; at ");
                sbM26240q.append(c11820yc0.m26176D(true));
                throw new C10799qc0(sbM26240q.toString());
            case 9:
                int iM26194p02 = c11820yc0.m26194p0();
                if (iM26194p02 != 9) {
                    return iM26194p02 == 8 ? Boolean.toString(c11820yc0.m26180W()) : c11820yc0.m26190n0();
                }
                c11820yc0.m26186i0();
                return null;
            case 10:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                String strM26190n02 = c11820yc0.m26190n0();
                try {
                    return new BigDecimal(strM26190n02);
                } catch (NumberFormatException e3) {
                    StringBuilder sbM26240q2 = AbstractC7222ym.m26240q("Failed parsing '", strM26190n02, "' as BigDecimal; at path ");
                    sbM26240q2.append(c11820yc0.m26176D(true));
                    throw new C10799qc0(sbM26240q2.toString(), e3);
                }
            case 11:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                String strM26190n03 = c11820yc0.m26190n0();
                try {
                    return new BigInteger(strM26190n03);
                } catch (NumberFormatException e4) {
                    StringBuilder sbM26240q3 = AbstractC7222ym.m26240q("Failed parsing '", strM26190n03, "' as BigInteger; at path ");
                    sbM26240q3.append(c11820yc0.m26176D(true));
                    throw new C10799qc0(sbM26240q3.toString(), e4);
                }
            case 12:
                if (c11820yc0.m26194p0() != 9) {
                    return new C10553oh0(c11820yc0.m26190n0());
                }
                c11820yc0.m26186i0();
                return null;
            case 13:
                if (c11820yc0.m26194p0() != 9) {
                    return new StringBuilder(c11820yc0.m26190n0());
                }
                c11820yc0.m26186i0();
                return null;
            case 14:
                if (c11820yc0.m26194p0() != 9) {
                    return new StringBuffer(c11820yc0.m26190n0());
                }
                c11820yc0.m26186i0();
                return null;
            case 15:
                BitSet bitSet = new BitSet();
                c11820yc0.m26187m();
                int iM26194p03 = c11820yc0.m26194p0();
                int i2 = 0;
                while (iM26194p03 != 2) {
                    int iM26247x2 = AbstractC7222ym.m26247x(iM26194p03);
                    if (iM26247x2 == 5 || iM26247x2 == 6) {
                        int iM26182b0 = c11820yc0.m26182b0();
                        if (iM26182b0 == 0) {
                            zM26180W = false;
                        } else {
                            if (iM26182b0 != 1) {
                                StringBuilder sbM26237n = AbstractC7222ym.m26237n(iM26182b0, "Invalid bitset value ", ", expected 0 or 1; at path ");
                                sbM26237n.append(c11820yc0.m26176D(true));
                                throw new C10799qc0(sbM26237n.toString());
                            }
                            zM26180W = true;
                        }
                    } else {
                        if (iM26247x2 != 7) {
                            throw new C10799qc0("Invalid bitset value type: " + AbstractC0852NX.m5771t(iM26194p03) + "; at path " + c11820yc0.m26176D(false));
                        }
                        zM26180W = c11820yc0.m26180W();
                    }
                    if (zM26180W) {
                        bitSet.set(i2);
                    }
                    i2++;
                    iM26194p03 = c11820yc0.m26194p0();
                }
                c11820yc0.m26201w();
                return bitSet;
            case 16:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                String strM26190n04 = c11820yc0.m26190n0();
                if ("null".equals(strM26190n04)) {
                    return null;
                }
                return new URL(strM26190n04);
            case 17:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                try {
                    String strM26190n05 = c11820yc0.m26190n0();
                    if ("null".equals(strM26190n05)) {
                        return null;
                    }
                    return new URI(strM26190n05);
                } catch (URISyntaxException e5) {
                    throw new C10799qc0(e5);
                }
            case 18:
                if (c11820yc0.m26194p0() != 9) {
                    return InetAddress.getByName(c11820yc0.m26190n0());
                }
                c11820yc0.m26186i0();
                return null;
            case 19:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                String strM26190n06 = c11820yc0.m26190n0();
                try {
                    return UUID.fromString(strM26190n06);
                } catch (IllegalArgumentException e6) {
                    StringBuilder sbM26240q4 = AbstractC7222ym.m26240q("Failed parsing '", strM26190n06, "' as UUID; at path ");
                    sbM26240q4.append(c11820yc0.m26176D(true));
                    throw new C10799qc0(sbM26240q4.toString(), e6);
                }
            case 20:
                String strM26190n07 = c11820yc0.m26190n0();
                try {
                    return Currency.getInstance(strM26190n07);
                } catch (IllegalArgumentException e7) {
                    StringBuilder sbM26240q5 = AbstractC7222ym.m26240q("Failed parsing '", strM26190n07, "' as Currency; at path ");
                    sbM26240q5.append(c11820yc0.m26176D(true));
                    throw new C10799qc0(sbM26240q5.toString(), e7);
                }
            case 21:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                c11820yc0.m26189n();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (c11820yc0.m26194p0() != 4) {
                    String strM26184e0 = c11820yc0.m26184e0();
                    int iM26182b02 = c11820yc0.m26182b0();
                    if ("year".equals(strM26184e0)) {
                        i3 = iM26182b02;
                    } else if ("month".equals(strM26184e0)) {
                        i4 = iM26182b02;
                    } else if ("dayOfMonth".equals(strM26184e0)) {
                        i5 = iM26182b02;
                    } else if ("hourOfDay".equals(strM26184e0)) {
                        i6 = iM26182b02;
                    } else if (LocalNotification.Repeat.Type.MINUTE.equals(strM26184e0)) {
                        i7 = iM26182b02;
                    } else if ("second".equals(strM26184e0)) {
                        i8 = iM26182b02;
                    }
                }
                c11820yc0.m26203x();
                return new GregorianCalendar(i3, i4, i5, i6, i7, i8);
            case 22:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c11820yc0.m26190n0(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 23:
                int iM26194p04 = c11820yc0.m26194p0();
                int iM26247x3 = AbstractC7222ym.m26247x(iM26194p04);
                if (iM26247x3 == 0) {
                    c11820yc0.m26187m();
                    c9647hc0 = new C9647hc0();
                } else if (iM26247x3 != 2) {
                    c9647hc0 = null;
                } else {
                    c11820yc0.m26189n();
                    c9647hc0 = new C11183tc0();
                }
                if (c9647hc0 == null) {
                    return m3653c(c11820yc0, iM26194p04);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (c11820yc0.m26177J()) {
                        String strM26184e02 = c9647hc0 instanceof C11183tc0 ? c11820yc0.m26184e0() : null;
                        int iM26194p05 = c11820yc0.m26194p0();
                        int iM26247x4 = AbstractC7222ym.m26247x(iM26194p05);
                        if (iM26247x4 == 0) {
                            c11820yc0.m26187m();
                            c9647hc02 = new C9647hc0();
                        } else if (iM26247x4 != 2) {
                            c9647hc02 = null;
                        } else {
                            c11820yc0.m26189n();
                            c9647hc02 = new C11183tc0();
                        }
                        boolean z = c9647hc02 != null;
                        if (c9647hc02 == null) {
                            c9647hc02 = m3653c(c11820yc0, iM26194p05);
                        }
                        if (c9647hc0 instanceof C9647hc0) {
                            ((C9647hc0) c9647hc0).f28481a.add(c9647hc02);
                        } else {
                            ((C11183tc0) c9647hc0).f43172a.put(strM26184e02, c9647hc02);
                        }
                        if (z) {
                            arrayDeque.addLast(c9647hc0);
                            c9647hc0 = c9647hc02;
                        }
                    } else {
                        if (c9647hc0 instanceof C9647hc0) {
                            c11820yc0.m26201w();
                        } else {
                            c11820yc0.m26203x();
                        }
                        if (arrayDeque.isEmpty()) {
                            return c9647hc0;
                        }
                        c9647hc0 = (AbstractC10543oc0) arrayDeque.removeLast();
                    }
                }
            case 24:
                int iM26194p06 = c11820yc0.m26194p0();
                if (iM26194p06 != 9) {
                    return iM26194p06 == 6 ? Boolean.valueOf(Boolean.parseBoolean(c11820yc0.m26190n0())) : Boolean.valueOf(c11820yc0.m26180W());
                }
                c11820yc0.m26186i0();
                return null;
            case 25:
                if (c11820yc0.m26194p0() != 9) {
                    return Boolean.valueOf(c11820yc0.m26190n0());
                }
                c11820yc0.m26186i0();
                return null;
            case 26:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                try {
                    int iM26182b03 = c11820yc0.m26182b0();
                    if (iM26182b03 <= 255 && iM26182b03 >= -128) {
                        return Byte.valueOf((byte) iM26182b03);
                    }
                    StringBuilder sbM26237n2 = AbstractC7222ym.m26237n(iM26182b03, "Lossy conversion from ", " to byte; at path ");
                    sbM26237n2.append(c11820yc0.m26176D(true));
                    throw new C10799qc0(sbM26237n2.toString());
                } catch (NumberFormatException e8) {
                    throw new C10799qc0(e8);
                }
            case 27:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                try {
                    int iM26182b04 = c11820yc0.m26182b0();
                    if (iM26182b04 <= 65535 && iM26182b04 >= -32768) {
                        return Short.valueOf((short) iM26182b04);
                    }
                    StringBuilder sbM26237n3 = AbstractC7222ym.m26237n(iM26182b04, "Lossy conversion from ", " to short; at path ");
                    sbM26237n3.append(c11820yc0.m26176D(true));
                    throw new C10799qc0(sbM26237n3.toString());
                } catch (NumberFormatException e9) {
                    throw new C10799qc0(e9);
                }
            default:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                try {
                    return Integer.valueOf(c11820yc0.m26182b0());
                } catch (NumberFormatException e10) {
                    throw new C10799qc0(e10);
                }
        }
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: b */
    public final void mo481b(C7838Kc0 c7838Kc0, Object obj) throws IOException {
        switch (this.f4609a) {
            case 0:
                c7838Kc0.m4685b0((Number) obj);
                return;
            case 1:
                Number number = (Number) obj;
                if (number == null) {
                    c7838Kc0.m4680J();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                C1753aw.m10382c(dDoubleValue);
                c7838Kc0.m4683W(dDoubleValue);
                return;
            case 2:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    c7838Kc0.m4680J();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                C1753aw.m10382c(fFloatValue);
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                c7838Kc0.m4685b0(numberValueOf);
                return;
            case 3:
                c7838Kc0.m4690n();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i = 0; i < length; i++) {
                    c7838Kc0.m4684X(r6.get(i));
                }
                c7838Kc0.m4693w();
                return;
            case 4:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 5:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    c7838Kc0.m4680J();
                    return;
                } else {
                    c7838Kc0.m4684X(number2.longValue());
                    return;
                }
            case 6:
                Number numberValueOf2 = (Number) obj;
                if (numberValueOf2 == null) {
                    c7838Kc0.m4680J();
                    return;
                }
                if (!(numberValueOf2 instanceof Float)) {
                    numberValueOf2 = Float.valueOf(numberValueOf2.floatValue());
                }
                c7838Kc0.m4685b0(numberValueOf2);
                return;
            case 7:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    c7838Kc0.m4680J();
                    return;
                } else {
                    c7838Kc0.m4683W(number3.doubleValue());
                    return;
                }
            case 8:
                Character ch = (Character) obj;
                c7838Kc0.m4686d0(ch == null ? null : String.valueOf(ch));
                return;
            case 9:
                c7838Kc0.m4686d0((String) obj);
                return;
            case 10:
                c7838Kc0.m4685b0((BigDecimal) obj);
                return;
            case 11:
                c7838Kc0.m4685b0((BigInteger) obj);
                return;
            case 12:
                c7838Kc0.m4685b0((C10553oh0) obj);
                return;
            case 13:
                StringBuilder sb = (StringBuilder) obj;
                c7838Kc0.m4686d0(sb == null ? null : sb.toString());
                return;
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                c7838Kc0.m4686d0(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 15:
                BitSet bitSet = (BitSet) obj;
                c7838Kc0.m4690n();
                int length2 = bitSet.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    c7838Kc0.m4684X(bitSet.get(i2) ? 1L : 0L);
                }
                c7838Kc0.m4693w();
                return;
            case 16:
                URL url = (URL) obj;
                c7838Kc0.m4686d0(url == null ? null : url.toExternalForm());
                return;
            case 17:
                URI uri = (URI) obj;
                c7838Kc0.m4686d0(uri == null ? null : uri.toASCIIString());
                return;
            case 18:
                InetAddress inetAddress = (InetAddress) obj;
                c7838Kc0.m4686d0(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 19:
                UUID uuid = (UUID) obj;
                c7838Kc0.m4686d0(uuid == null ? null : uuid.toString());
                return;
            case 20:
                c7838Kc0.m4686d0(((Currency) obj).getCurrencyCode());
                return;
            case 21:
                if (((Calendar) obj) == null) {
                    c7838Kc0.m4680J();
                    return;
                }
                c7838Kc0.m4691o();
                c7838Kc0.m4678A("year");
                c7838Kc0.m4684X(r6.get(1));
                c7838Kc0.m4678A("month");
                c7838Kc0.m4684X(r6.get(2));
                c7838Kc0.m4678A("dayOfMonth");
                c7838Kc0.m4684X(r6.get(5));
                c7838Kc0.m4678A("hourOfDay");
                c7838Kc0.m4684X(r6.get(11));
                c7838Kc0.m4678A(LocalNotification.Repeat.Type.MINUTE);
                c7838Kc0.m4684X(r6.get(12));
                c7838Kc0.m4678A("second");
                c7838Kc0.m4684X(r6.get(13));
                c7838Kc0.m4694x();
                return;
            case 22:
                Locale locale = (Locale) obj;
                c7838Kc0.m4686d0(locale == null ? null : locale.toString());
                return;
            case 23:
                m3654d(c7838Kc0, (AbstractC10543oc0) obj);
                return;
            case 24:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    c7838Kc0.m4680J();
                    return;
                }
                c7838Kc0.m4688h0();
                c7838Kc0.m4689m();
                c7838Kc0.f6228a.write(bool.booleanValue() ? "true" : "false");
                return;
            case 25:
                Boolean bool2 = (Boolean) obj;
                c7838Kc0.m4686d0(bool2 == null ? "null" : bool2.toString());
                return;
            case 26:
                if (((Number) obj) == null) {
                    c7838Kc0.m4680J();
                    return;
                } else {
                    c7838Kc0.m4684X(r6.byteValue());
                    return;
                }
            case 27:
                if (((Number) obj) == null) {
                    c7838Kc0.m4680J();
                    return;
                } else {
                    c7838Kc0.m4684X(r6.shortValue());
                    return;
                }
            default:
                if (((Number) obj) == null) {
                    c7838Kc0.m4680J();
                    return;
                } else {
                    c7838Kc0.m4684X(r6.intValue());
                    return;
                }
        }
    }
}
