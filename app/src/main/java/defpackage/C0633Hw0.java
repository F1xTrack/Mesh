package defpackage;

import com.huawei.hms.rn.push.constants.LocalNotification;
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
public final class C0633Hw0 extends AbstractC6876rd1 {
    public static final C0477Fw0 b = new C0477Fw0(0, new C0633Hw0(0));
    public final /* synthetic */ int a;

    public /* synthetic */ C0633Hw0(int i) {
        this.a = i;
    }

    public static AbstractC6300oc0 c(C8206yc0 c8206yc0, int i) {
        int iX = AbstractC8235ym.x(i);
        if (iX == 5) {
            return new C7636vc0(c8206yc0.n0());
        }
        if (iX == 6) {
            return new C7636vc0(new C6315oh0(c8206yc0.n0()));
        }
        if (iX == 7) {
            return new C7636vc0(Boolean.valueOf(c8206yc0.W()));
        }
        if (iX != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(NX.t(i)));
        }
        c8206yc0.i0();
        return C6872rc0.a;
    }

    public static void d(C0807Kc0 c0807Kc0, AbstractC6300oc0 abstractC6300oc0) throws IOException {
        if (abstractC6300oc0 == null || (abstractC6300oc0 instanceof C6872rc0)) {
            c0807Kc0.J();
            return;
        }
        boolean z = abstractC6300oc0 instanceof C7636vc0;
        if (z) {
            if (!z) {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC6300oc0);
            }
            C7636vc0 c7636vc0 = (C7636vc0) abstractC6300oc0;
            Serializable serializable = c7636vc0.a;
            if (serializable instanceof Number) {
                c0807Kc0.b0(c7636vc0.b());
                return;
            } else if (serializable instanceof Boolean) {
                c0807Kc0.e0(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c7636vc0.d()));
                return;
            } else {
                c0807Kc0.d0(c7636vc0.d());
                return;
            }
        }
        boolean z2 = abstractC6300oc0 instanceof C4187hc0;
        if (z2) {
            c0807Kc0.n();
            if (!z2) {
                throw new IllegalStateException("Not a JSON Array: " + abstractC6300oc0);
            }
            Iterator it = ((C4187hc0) abstractC6300oc0).a.iterator();
            while (it.hasNext()) {
                d(c0807Kc0, (AbstractC6300oc0) it.next());
            }
            c0807Kc0.w();
            return;
        }
        boolean z3 = abstractC6300oc0 instanceof C7254tc0;
        if (!z3) {
            throw new IllegalArgumentException("Couldn't write " + abstractC6300oc0.getClass());
        }
        c0807Kc0.o();
        if (!z3) {
            throw new IllegalStateException("Not a JSON Object: " + abstractC6300oc0);
        }
        Iterator it2 = ((C4398ij0) ((C7254tc0) abstractC6300oc0).a.entrySet()).iterator();
        while (((AbstractC5557kj0) it2).hasNext()) {
            C5748lj0 c5748lj0A = ((C4017gj0) it2).a();
            c0807Kc0.A((String) c5748lj0A.getKey());
            d(c0807Kc0, (AbstractC6300oc0) c5748lj0A.getValue());
        }
        c0807Kc0.x();
    }

    @Override // defpackage.AbstractC6876rd1
    public final Object a(C8206yc0 c8206yc0) {
        boolean zW;
        AbstractC6300oc0 c4187hc0;
        AbstractC6300oc0 c4187hc02;
        switch (this.a) {
            case 0:
                int iP0 = c8206yc0.p0();
                int iX = AbstractC8235ym.x(iP0);
                if (iX == 5 || iX == 6) {
                    return new C6315oh0(c8206yc0.n0());
                }
                if (iX == 8) {
                    c8206yc0.i0();
                    return null;
                }
                throw new C6682qc0("Expecting number, got: " + NX.t(iP0) + "; at path " + c8206yc0.D(false));
            case 1:
                if (c8206yc0.p0() != 9) {
                    return Double.valueOf(c8206yc0.X());
                }
                c8206yc0.i0();
                return null;
            case 2:
                if (c8206yc0.p0() != 9) {
                    return Float.valueOf((float) c8206yc0.X());
                }
                c8206yc0.i0();
                return null;
            case 3:
                ArrayList arrayList = new ArrayList();
                c8206yc0.m();
                while (c8206yc0.J()) {
                    try {
                        arrayList.add(Integer.valueOf(c8206yc0.b0()));
                    } catch (NumberFormatException e) {
                        throw new C6682qc0(e);
                    }
                }
                c8206yc0.w();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            case 4:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 5:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                try {
                    return Long.valueOf(c8206yc0.d0());
                } catch (NumberFormatException e2) {
                    throw new C6682qc0(e2);
                }
            case 6:
                if (c8206yc0.p0() != 9) {
                    return Float.valueOf((float) c8206yc0.X());
                }
                c8206yc0.i0();
                return null;
            case 7:
                if (c8206yc0.p0() != 9) {
                    return Double.valueOf(c8206yc0.X());
                }
                c8206yc0.i0();
                return null;
            case 8:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                String strN0 = c8206yc0.n0();
                if (strN0.length() == 1) {
                    return Character.valueOf(strN0.charAt(0));
                }
                StringBuilder sbQ = AbstractC8235ym.q("Expecting character, got: ", strN0, "; at ");
                sbQ.append(c8206yc0.D(true));
                throw new C6682qc0(sbQ.toString());
            case 9:
                int iP02 = c8206yc0.p0();
                if (iP02 != 9) {
                    return iP02 == 8 ? Boolean.toString(c8206yc0.W()) : c8206yc0.n0();
                }
                c8206yc0.i0();
                return null;
            case 10:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                String strN02 = c8206yc0.n0();
                try {
                    return new BigDecimal(strN02);
                } catch (NumberFormatException e3) {
                    StringBuilder sbQ2 = AbstractC8235ym.q("Failed parsing '", strN02, "' as BigDecimal; at path ");
                    sbQ2.append(c8206yc0.D(true));
                    throw new C6682qc0(sbQ2.toString(), e3);
                }
            case 11:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                String strN03 = c8206yc0.n0();
                try {
                    return new BigInteger(strN03);
                } catch (NumberFormatException e4) {
                    StringBuilder sbQ3 = AbstractC8235ym.q("Failed parsing '", strN03, "' as BigInteger; at path ");
                    sbQ3.append(c8206yc0.D(true));
                    throw new C6682qc0(sbQ3.toString(), e4);
                }
            case 12:
                if (c8206yc0.p0() != 9) {
                    return new C6315oh0(c8206yc0.n0());
                }
                c8206yc0.i0();
                return null;
            case 13:
                if (c8206yc0.p0() != 9) {
                    return new StringBuilder(c8206yc0.n0());
                }
                c8206yc0.i0();
                return null;
            case 14:
                if (c8206yc0.p0() != 9) {
                    return new StringBuffer(c8206yc0.n0());
                }
                c8206yc0.i0();
                return null;
            case 15:
                BitSet bitSet = new BitSet();
                c8206yc0.m();
                int iP03 = c8206yc0.p0();
                int i2 = 0;
                while (iP03 != 2) {
                    int iX2 = AbstractC8235ym.x(iP03);
                    if (iX2 == 5 || iX2 == 6) {
                        int iB0 = c8206yc0.b0();
                        if (iB0 == 0) {
                            zW = false;
                        } else {
                            if (iB0 != 1) {
                                StringBuilder sbN = AbstractC8235ym.n(iB0, "Invalid bitset value ", ", expected 0 or 1; at path ");
                                sbN.append(c8206yc0.D(true));
                                throw new C6682qc0(sbN.toString());
                            }
                            zW = true;
                        }
                    } else {
                        if (iX2 != 7) {
                            throw new C6682qc0("Invalid bitset value type: " + NX.t(iP03) + "; at path " + c8206yc0.D(false));
                        }
                        zW = c8206yc0.W();
                    }
                    if (zW) {
                        bitSet.set(i2);
                    }
                    i2++;
                    iP03 = c8206yc0.p0();
                }
                c8206yc0.w();
                return bitSet;
            case 16:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                String strN04 = c8206yc0.n0();
                if ("null".equals(strN04)) {
                    return null;
                }
                return new URL(strN04);
            case 17:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                try {
                    String strN05 = c8206yc0.n0();
                    if ("null".equals(strN05)) {
                        return null;
                    }
                    return new URI(strN05);
                } catch (URISyntaxException e5) {
                    throw new C6682qc0(e5);
                }
            case 18:
                if (c8206yc0.p0() != 9) {
                    return InetAddress.getByName(c8206yc0.n0());
                }
                c8206yc0.i0();
                return null;
            case 19:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                String strN06 = c8206yc0.n0();
                try {
                    return UUID.fromString(strN06);
                } catch (IllegalArgumentException e6) {
                    StringBuilder sbQ4 = AbstractC8235ym.q("Failed parsing '", strN06, "' as UUID; at path ");
                    sbQ4.append(c8206yc0.D(true));
                    throw new C6682qc0(sbQ4.toString(), e6);
                }
            case 20:
                String strN07 = c8206yc0.n0();
                try {
                    return Currency.getInstance(strN07);
                } catch (IllegalArgumentException e7) {
                    StringBuilder sbQ5 = AbstractC8235ym.q("Failed parsing '", strN07, "' as Currency; at path ");
                    sbQ5.append(c8206yc0.D(true));
                    throw new C6682qc0(sbQ5.toString(), e7);
                }
            case 21:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                c8206yc0.n();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (c8206yc0.p0() != 4) {
                    String strE0 = c8206yc0.e0();
                    int iB02 = c8206yc0.b0();
                    if ("year".equals(strE0)) {
                        i3 = iB02;
                    } else if ("month".equals(strE0)) {
                        i4 = iB02;
                    } else if ("dayOfMonth".equals(strE0)) {
                        i5 = iB02;
                    } else if ("hourOfDay".equals(strE0)) {
                        i6 = iB02;
                    } else if (LocalNotification.Repeat.Type.MINUTE.equals(strE0)) {
                        i7 = iB02;
                    } else if ("second".equals(strE0)) {
                        i8 = iB02;
                    }
                }
                c8206yc0.x();
                return new GregorianCalendar(i3, i4, i5, i6, i7, i8);
            case 22:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c8206yc0.n0(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 23:
                int iP04 = c8206yc0.p0();
                int iX3 = AbstractC8235ym.x(iP04);
                if (iX3 == 0) {
                    c8206yc0.m();
                    c4187hc0 = new C4187hc0();
                } else if (iX3 != 2) {
                    c4187hc0 = null;
                } else {
                    c8206yc0.n();
                    c4187hc0 = new C7254tc0();
                }
                if (c4187hc0 == null) {
                    return c(c8206yc0, iP04);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (c8206yc0.J()) {
                        String strE02 = c4187hc0 instanceof C7254tc0 ? c8206yc0.e0() : null;
                        int iP05 = c8206yc0.p0();
                        int iX4 = AbstractC8235ym.x(iP05);
                        if (iX4 == 0) {
                            c8206yc0.m();
                            c4187hc02 = new C4187hc0();
                        } else if (iX4 != 2) {
                            c4187hc02 = null;
                        } else {
                            c8206yc0.n();
                            c4187hc02 = new C7254tc0();
                        }
                        boolean z = c4187hc02 != null;
                        if (c4187hc02 == null) {
                            c4187hc02 = c(c8206yc0, iP05);
                        }
                        if (c4187hc0 instanceof C4187hc0) {
                            ((C4187hc0) c4187hc0).a.add(c4187hc02);
                        } else {
                            ((C7254tc0) c4187hc0).a.put(strE02, c4187hc02);
                        }
                        if (z) {
                            arrayDeque.addLast(c4187hc0);
                            c4187hc0 = c4187hc02;
                        }
                    } else {
                        if (c4187hc0 instanceof C4187hc0) {
                            c8206yc0.w();
                        } else {
                            c8206yc0.x();
                        }
                        if (arrayDeque.isEmpty()) {
                            return c4187hc0;
                        }
                        c4187hc0 = (AbstractC6300oc0) arrayDeque.removeLast();
                    }
                }
            case 24:
                int iP06 = c8206yc0.p0();
                if (iP06 != 9) {
                    return iP06 == 6 ? Boolean.valueOf(Boolean.parseBoolean(c8206yc0.n0())) : Boolean.valueOf(c8206yc0.W());
                }
                c8206yc0.i0();
                return null;
            case 25:
                if (c8206yc0.p0() != 9) {
                    return Boolean.valueOf(c8206yc0.n0());
                }
                c8206yc0.i0();
                return null;
            case 26:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                try {
                    int iB03 = c8206yc0.b0();
                    if (iB03 <= 255 && iB03 >= -128) {
                        return Byte.valueOf((byte) iB03);
                    }
                    StringBuilder sbN2 = AbstractC8235ym.n(iB03, "Lossy conversion from ", " to byte; at path ");
                    sbN2.append(c8206yc0.D(true));
                    throw new C6682qc0(sbN2.toString());
                } catch (NumberFormatException e8) {
                    throw new C6682qc0(e8);
                }
            case 27:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                try {
                    int iB04 = c8206yc0.b0();
                    if (iB04 <= 65535 && iB04 >= -32768) {
                        return Short.valueOf((short) iB04);
                    }
                    StringBuilder sbN3 = AbstractC8235ym.n(iB04, "Lossy conversion from ", " to short; at path ");
                    sbN3.append(c8206yc0.D(true));
                    throw new C6682qc0(sbN3.toString());
                } catch (NumberFormatException e9) {
                    throw new C6682qc0(e9);
                }
            default:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                try {
                    return Integer.valueOf(c8206yc0.b0());
                } catch (NumberFormatException e10) {
                    throw new C6682qc0(e10);
                }
        }
    }

    @Override // defpackage.AbstractC6876rd1
    public final void b(C0807Kc0 c0807Kc0, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                c0807Kc0.b0((Number) obj);
                return;
            case 1:
                Number number = (Number) obj;
                if (number == null) {
                    c0807Kc0.J();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                C2226aw.c(dDoubleValue);
                c0807Kc0.W(dDoubleValue);
                return;
            case 2:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    c0807Kc0.J();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                C2226aw.c(fFloatValue);
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                c0807Kc0.b0(numberValueOf);
                return;
            case 3:
                c0807Kc0.n();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i = 0; i < length; i++) {
                    c0807Kc0.X(r6.get(i));
                }
                c0807Kc0.w();
                return;
            case 4:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 5:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    c0807Kc0.J();
                    return;
                } else {
                    c0807Kc0.X(number2.longValue());
                    return;
                }
            case 6:
                Number numberValueOf2 = (Number) obj;
                if (numberValueOf2 == null) {
                    c0807Kc0.J();
                    return;
                }
                if (!(numberValueOf2 instanceof Float)) {
                    numberValueOf2 = Float.valueOf(numberValueOf2.floatValue());
                }
                c0807Kc0.b0(numberValueOf2);
                return;
            case 7:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    c0807Kc0.J();
                    return;
                } else {
                    c0807Kc0.W(number3.doubleValue());
                    return;
                }
            case 8:
                Character ch = (Character) obj;
                c0807Kc0.d0(ch == null ? null : String.valueOf(ch));
                return;
            case 9:
                c0807Kc0.d0((String) obj);
                return;
            case 10:
                c0807Kc0.b0((BigDecimal) obj);
                return;
            case 11:
                c0807Kc0.b0((BigInteger) obj);
                return;
            case 12:
                c0807Kc0.b0((C6315oh0) obj);
                return;
            case 13:
                StringBuilder sb = (StringBuilder) obj;
                c0807Kc0.d0(sb == null ? null : sb.toString());
                return;
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                c0807Kc0.d0(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 15:
                BitSet bitSet = (BitSet) obj;
                c0807Kc0.n();
                int length2 = bitSet.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    c0807Kc0.X(bitSet.get(i2) ? 1L : 0L);
                }
                c0807Kc0.w();
                return;
            case 16:
                URL url = (URL) obj;
                c0807Kc0.d0(url == null ? null : url.toExternalForm());
                return;
            case 17:
                URI uri = (URI) obj;
                c0807Kc0.d0(uri == null ? null : uri.toASCIIString());
                return;
            case 18:
                InetAddress inetAddress = (InetAddress) obj;
                c0807Kc0.d0(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 19:
                UUID uuid = (UUID) obj;
                c0807Kc0.d0(uuid == null ? null : uuid.toString());
                return;
            case 20:
                c0807Kc0.d0(((Currency) obj).getCurrencyCode());
                return;
            case 21:
                if (((Calendar) obj) == null) {
                    c0807Kc0.J();
                    return;
                }
                c0807Kc0.o();
                c0807Kc0.A("year");
                c0807Kc0.X(r6.get(1));
                c0807Kc0.A("month");
                c0807Kc0.X(r6.get(2));
                c0807Kc0.A("dayOfMonth");
                c0807Kc0.X(r6.get(5));
                c0807Kc0.A("hourOfDay");
                c0807Kc0.X(r6.get(11));
                c0807Kc0.A(LocalNotification.Repeat.Type.MINUTE);
                c0807Kc0.X(r6.get(12));
                c0807Kc0.A("second");
                c0807Kc0.X(r6.get(13));
                c0807Kc0.x();
                return;
            case 22:
                Locale locale = (Locale) obj;
                c0807Kc0.d0(locale == null ? null : locale.toString());
                return;
            case 23:
                d(c0807Kc0, (AbstractC6300oc0) obj);
                return;
            case 24:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    c0807Kc0.J();
                    return;
                }
                c0807Kc0.h0();
                c0807Kc0.m();
                c0807Kc0.a.write(bool.booleanValue() ? "true" : "false");
                return;
            case 25:
                Boolean bool2 = (Boolean) obj;
                c0807Kc0.d0(bool2 == null ? "null" : bool2.toString());
                return;
            case 26:
                if (((Number) obj) == null) {
                    c0807Kc0.J();
                    return;
                } else {
                    c0807Kc0.X(r6.byteValue());
                    return;
                }
            case 27:
                if (((Number) obj) == null) {
                    c0807Kc0.J();
                    return;
                } else {
                    c0807Kc0.X(r6.shortValue());
                    return;
                }
            default:
                if (((Number) obj) == null) {
                    c0807Kc0.J();
                    return;
                } else {
                    c0807Kc0.X(r6.intValue());
                    return;
                }
        }
    }
}
