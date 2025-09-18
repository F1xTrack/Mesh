package p000;

import com.huawei.hms.p015rn.push.constants.LocalNotification;
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
public final class C7774Iw0 extends AbstractC11058sd1 {

    /* renamed from: b */
    public static final C7670Gw0 f5225b = new C7670Gw0(new C7774Iw0(0), 0);

    /* renamed from: a */
    public final /* synthetic */ int f5226a;

    public /* synthetic */ C7774Iw0(int i) {
        this.f5226a = i;
    }

    /* renamed from: b */
    public static void m4086b(C7890Lc0 c7890Lc0, AbstractC10671pc0 abstractC10671pc0) throws IOException {
        if (abstractC10671pc0 == null || (abstractC10671pc0 instanceof C11055sc0)) {
            c7890Lc0.m5034J();
            return;
        }
        boolean z = abstractC10671pc0 instanceof AbstractC11566wc0;
        if (z) {
            if (z) {
                c7890Lc0.m5040d0(((AbstractC11566wc0) abstractC10671pc0).m25654d());
                return;
            } else {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC10671pc0);
            }
        }
        boolean z2 = abstractC10671pc0 instanceof AbstractC9775ic0;
        if (z2) {
            c7890Lc0.m5044n();
            if (z2) {
                throw null;
            }
            throw new IllegalStateException("Not a JSON Array: " + abstractC10671pc0);
        }
        boolean z3 = abstractC10671pc0 instanceof AbstractC11311uc0;
        if (!z3) {
            throw new IllegalArgumentException("Couldn't write " + abstractC10671pc0.getClass());
        }
        c7890Lc0.m5045o();
        if (z3) {
            throw null;
        }
        throw new IllegalStateException("Not a JSON Object: " + abstractC10671pc0);
    }

    @Override // p000.AbstractC11058sd1
    /* renamed from: a */
    public final void mo246a(C7890Lc0 c7890Lc0, Object obj) throws IOException {
        switch (this.f5226a) {
            case 0:
                c7890Lc0.m5039b0((Number) obj);
                return;
            case 1:
                Number number = (Number) obj;
                if (number == null) {
                    c7890Lc0.m5034J();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                C9189e20.m17820a(dDoubleValue);
                c7890Lc0.m5037W(dDoubleValue);
                return;
            case 2:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    c7890Lc0.m5034J();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                C9189e20.m17820a(fFloatValue);
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                c7890Lc0.m5039b0(numberValueOf);
                return;
            case 3:
                c7890Lc0.m5044n();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i = 0; i < length; i++) {
                    c7890Lc0.m5038X(r6.get(i));
                }
                c7890Lc0.m5047w();
                return;
            case 4:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    c7890Lc0.m5034J();
                    return;
                } else {
                    c7890Lc0.m5038X(number2.longValue());
                    return;
                }
            case 5:
                Number numberValueOf2 = (Number) obj;
                if (numberValueOf2 == null) {
                    c7890Lc0.m5034J();
                    return;
                }
                if (!(numberValueOf2 instanceof Float)) {
                    numberValueOf2 = Float.valueOf(numberValueOf2.floatValue());
                }
                c7890Lc0.m5039b0(numberValueOf2);
                return;
            case 6:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    c7890Lc0.m5034J();
                    return;
                } else {
                    c7890Lc0.m5037W(number3.doubleValue());
                    return;
                }
            case 7:
                Character ch = (Character) obj;
                c7890Lc0.m5040d0(ch == null ? null : String.valueOf(ch));
                return;
            case 8:
                c7890Lc0.m5040d0((String) obj);
                return;
            case 9:
                c7890Lc0.m5039b0((BigDecimal) obj);
                return;
            case 10:
                c7890Lc0.m5039b0((BigInteger) obj);
                return;
            case 11:
                c7890Lc0.m5039b0((AbstractC10681ph0) obj);
                return;
            case 12:
                StringBuilder sb = (StringBuilder) obj;
                c7890Lc0.m5040d0(sb == null ? null : sb.toString());
                return;
            case 13:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                c7890Lc0.m5040d0(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 15:
                URL url = (URL) obj;
                c7890Lc0.m5040d0(url == null ? null : url.toExternalForm());
                return;
            case 16:
                URI uri = (URI) obj;
                c7890Lc0.m5040d0(uri == null ? null : uri.toASCIIString());
                return;
            case 17:
                InetAddress inetAddress = (InetAddress) obj;
                c7890Lc0.m5040d0(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 18:
                UUID uuid = (UUID) obj;
                c7890Lc0.m5040d0(uuid == null ? null : uuid.toString());
                return;
            case 19:
                c7890Lc0.m5040d0(((Currency) obj).getCurrencyCode());
                return;
            case 20:
                if (((Calendar) obj) == null) {
                    c7890Lc0.m5034J();
                    return;
                }
                c7890Lc0.m5045o();
                c7890Lc0.m5032A("year");
                c7890Lc0.m5038X(r6.get(1));
                c7890Lc0.m5032A("month");
                c7890Lc0.m5038X(r6.get(2));
                c7890Lc0.m5032A("dayOfMonth");
                c7890Lc0.m5038X(r6.get(5));
                c7890Lc0.m5032A("hourOfDay");
                c7890Lc0.m5038X(r6.get(11));
                c7890Lc0.m5032A(LocalNotification.Repeat.Type.MINUTE);
                c7890Lc0.m5038X(r6.get(12));
                c7890Lc0.m5032A("second");
                c7890Lc0.m5038X(r6.get(13));
                c7890Lc0.m5048x();
                return;
            case 21:
                Locale locale = (Locale) obj;
                c7890Lc0.m5040d0(locale == null ? null : locale.toString());
                return;
            case 22:
                m4086b(c7890Lc0, (AbstractC10671pc0) obj);
                return;
            case 23:
                BitSet bitSet = (BitSet) obj;
                c7890Lc0.m5044n();
                int length2 = bitSet.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    c7890Lc0.m5038X(bitSet.get(i2) ? 1L : 0L);
                }
                c7890Lc0.m5047w();
                return;
            case 24:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    c7890Lc0.m5034J();
                    return;
                }
                c7890Lc0.m5042h0();
                c7890Lc0.m5043m();
                c7890Lc0.f6762a.write(bool.booleanValue() ? "true" : "false");
                return;
            case 25:
                Boolean bool2 = (Boolean) obj;
                c7890Lc0.m5040d0(bool2 == null ? "null" : bool2.toString());
                return;
            case 26:
                if (((Number) obj) == null) {
                    c7890Lc0.m5034J();
                    return;
                } else {
                    c7890Lc0.m5038X(r6.byteValue());
                    return;
                }
            case 27:
                if (((Number) obj) == null) {
                    c7890Lc0.m5034J();
                    return;
                } else {
                    c7890Lc0.m5038X(r6.shortValue());
                    return;
                }
            default:
                if (((Number) obj) == null) {
                    c7890Lc0.m5034J();
                    return;
                } else {
                    c7890Lc0.m5038X(r6.intValue());
                    return;
                }
        }
    }
}
