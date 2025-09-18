package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: Iw0 */
/* loaded from: classes.dex */
public final class C0711Iw0 extends AbstractC7067sd1 {
    public static final C0555Gw0 b = new C0555Gw0(new C0711Iw0(0), 0);
    public final /* synthetic */ int a;

    public /* synthetic */ C0711Iw0(int i) {
        this.a = i;
    }

    public static void b(C0885Lc0 c0885Lc0, AbstractC6491pc0 abstractC6491pc0) throws IOException {
        if (abstractC6491pc0 == null || (abstractC6491pc0 instanceof C7063sc0)) {
            c0885Lc0.J();
            return;
        }
        boolean z = abstractC6491pc0 instanceof AbstractC7826wc0;
        if (z) {
            if (z) {
                c0885Lc0.d0(((AbstractC7826wc0) abstractC6491pc0).d());
                return;
            } else {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC6491pc0);
            }
        }
        boolean z2 = abstractC6491pc0 instanceof AbstractC4378ic0;
        if (z2) {
            c0885Lc0.n();
            if (z2) {
                throw null;
            }
            throw new IllegalStateException("Not a JSON Array: " + abstractC6491pc0);
        }
        boolean z3 = abstractC6491pc0 instanceof AbstractC7445uc0;
        if (!z3) {
            throw new IllegalArgumentException("Couldn't write " + abstractC6491pc0.getClass());
        }
        c0885Lc0.o();
        if (z3) {
            throw null;
        }
        throw new IllegalStateException("Not a JSON Object: " + abstractC6491pc0);
    }

    @Override // defpackage.AbstractC7067sd1
    public final void a(C0885Lc0 c0885Lc0, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                c0885Lc0.b0((Number) obj);
                return;
            case 1:
                Number number = (Number) obj;
                if (number == null) {
                    c0885Lc0.J();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                C3504e20.a(dDoubleValue);
                c0885Lc0.W(dDoubleValue);
                return;
            case 2:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    c0885Lc0.J();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                C3504e20.a(fFloatValue);
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                c0885Lc0.b0(numberValueOf);
                return;
            case 3:
                c0885Lc0.n();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i = 0; i < length; i++) {
                    c0885Lc0.X(r6.get(i));
                }
                c0885Lc0.w();
                return;
            case 4:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    c0885Lc0.J();
                    return;
                } else {
                    c0885Lc0.X(number2.longValue());
                    return;
                }
            case 5:
                Number numberValueOf2 = (Number) obj;
                if (numberValueOf2 == null) {
                    c0885Lc0.J();
                    return;
                }
                if (!(numberValueOf2 instanceof Float)) {
                    numberValueOf2 = Float.valueOf(numberValueOf2.floatValue());
                }
                c0885Lc0.b0(numberValueOf2);
                return;
            case 6:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    c0885Lc0.J();
                    return;
                } else {
                    c0885Lc0.W(number3.doubleValue());
                    return;
                }
            case 7:
                Character ch = (Character) obj;
                c0885Lc0.d0(ch == null ? null : String.valueOf(ch));
                return;
            case 8:
                c0885Lc0.d0((String) obj);
                return;
            case 9:
                c0885Lc0.b0((BigDecimal) obj);
                return;
            case 10:
                c0885Lc0.b0((BigInteger) obj);
                return;
            case 11:
                c0885Lc0.b0((AbstractC6506ph0) obj);
                return;
            case 12:
                StringBuilder sb = (StringBuilder) obj;
                c0885Lc0.d0(sb == null ? null : sb.toString());
                return;
            case 13:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                c0885Lc0.d0(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 15:
                URL url = (URL) obj;
                c0885Lc0.d0(url == null ? null : url.toExternalForm());
                return;
            case 16:
                URI uri = (URI) obj;
                c0885Lc0.d0(uri == null ? null : uri.toASCIIString());
                return;
            case 17:
                InetAddress inetAddress = (InetAddress) obj;
                c0885Lc0.d0(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 18:
                UUID uuid = (UUID) obj;
                c0885Lc0.d0(uuid == null ? null : uuid.toString());
                return;
            case 19:
                c0885Lc0.d0(((Currency) obj).getCurrencyCode());
                return;
            case 20:
                if (((Calendar) obj) == null) {
                    c0885Lc0.J();
                    return;
                }
                c0885Lc0.o();
                c0885Lc0.A("year");
                c0885Lc0.X(r6.get(1));
                c0885Lc0.A("month");
                c0885Lc0.X(r6.get(2));
                c0885Lc0.A("dayOfMonth");
                c0885Lc0.X(r6.get(5));
                c0885Lc0.A("hourOfDay");
                c0885Lc0.X(r6.get(11));
                c0885Lc0.A(LocalNotification.Repeat.Type.MINUTE);
                c0885Lc0.X(r6.get(12));
                c0885Lc0.A("second");
                c0885Lc0.X(r6.get(13));
                c0885Lc0.x();
                return;
            case 21:
                Locale locale = (Locale) obj;
                c0885Lc0.d0(locale == null ? null : locale.toString());
                return;
            case 22:
                b(c0885Lc0, (AbstractC6491pc0) obj);
                return;
            case 23:
                BitSet bitSet = (BitSet) obj;
                c0885Lc0.n();
                int length2 = bitSet.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    c0885Lc0.X(bitSet.get(i2) ? 1L : 0L);
                }
                c0885Lc0.w();
                return;
            case 24:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    c0885Lc0.J();
                    return;
                }
                c0885Lc0.h0();
                c0885Lc0.m();
                c0885Lc0.a.write(bool.booleanValue() ? "true" : "false");
                return;
            case 25:
                Boolean bool2 = (Boolean) obj;
                c0885Lc0.d0(bool2 == null ? "null" : bool2.toString());
                return;
            case 26:
                if (((Number) obj) == null) {
                    c0885Lc0.J();
                    return;
                } else {
                    c0885Lc0.X(r6.byteValue());
                    return;
                }
            case 27:
                if (((Number) obj) == null) {
                    c0885Lc0.J();
                    return;
                } else {
                    c0885Lc0.X(r6.shortValue());
                    return;
                }
            default:
                if (((Number) obj) == null) {
                    c0885Lc0.J();
                    return;
                } else {
                    c0885Lc0.X(r6.intValue());
                    return;
                }
        }
    }
}
