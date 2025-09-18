package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: Kc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7838Kc0 implements Closeable, Flushable {

    /* renamed from: h */
    public static final Pattern f6226h = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: i */
    public static final String[] f6227i = new String[128];

    /* renamed from: a */
    public final Writer f6228a;

    /* renamed from: b */
    public int[] f6229b;

    /* renamed from: c */
    public int f6230c;

    /* renamed from: d */
    public final String f6231d;

    /* renamed from: e */
    public boolean f6232e;

    /* renamed from: f */
    public String f6233f;

    /* renamed from: g */
    public boolean f6234g;

    static {
        for (int i = 0; i <= 31; i++) {
            f6227i[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f6227i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C7838Kc0(Writer writer) {
        int[] iArr = new int[32];
        this.f6229b = iArr;
        this.f6230c = 0;
        if (iArr.length == 0) {
            this.f6229b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f6229b;
        int i = this.f6230c;
        this.f6230c = i + 1;
        iArr2[i] = 6;
        this.f6231d = StringUtils.PROCESS_POSTFIX_DELIMITER;
        this.f6234g = true;
        Objects.requireNonNull(writer, "out == null");
        this.f6228a = writer;
    }

    /* renamed from: A */
    public void m4678A(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f6233f != null) {
            throw new IllegalStateException();
        }
        if (this.f6230c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f6233f = str;
    }

    /* renamed from: J */
    public C7838Kc0 m4680J() throws IOException {
        if (this.f6233f != null) {
            if (!this.f6234g) {
                this.f6233f = null;
                return this;
            }
            m4688h0();
        }
        m4689m();
        this.f6228a.write("null");
        return this;
    }

    /* renamed from: S */
    public final int m4681S() {
        int i = this.f6230c;
        if (i != 0) {
            return this.f6229b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4682U(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            java.io.Writer r0 = r7.f6228a
            r1 = 34
            r0.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L3a
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1e
            java.lang.String[] r6 = p000.C7838Kc0.f6227i
            r5 = r6[r5]
            if (r5 != 0) goto L2b
            goto L37
        L1e:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L25
            java.lang.String r5 = "\\u2028"
            goto L2b
        L25:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L37
            java.lang.String r5 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L32
            int r6 = r3 - r4
            r0.write(r8, r4, r6)
        L32:
            r0.write(r5)
            int r4 = r3 + 1
        L37:
            int r3 = r3 + 1
            goto Ld
        L3a:
            if (r4 >= r2) goto L40
            int r2 = r2 - r4
            r0.write(r8, r4, r2)
        L40:
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7838Kc0.m4682U(java.lang.String):void");
    }

    /* renamed from: W */
    public void m4683W(double d) throws IOException {
        m4688h0();
        if (this.f6232e || !(Double.isNaN(d) || Double.isInfinite(d))) {
            m4689m();
            this.f6228a.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    /* renamed from: X */
    public void m4684X(long j) throws IOException {
        m4688h0();
        m4689m();
        this.f6228a.write(Long.toString(j));
    }

    /* renamed from: b0 */
    public void m4685b0(Number number) throws IOException {
        if (number == null) {
            m4680J();
            return;
        }
        m4688h0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f6226h.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f6232e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        m4689m();
        this.f6228a.append((CharSequence) string);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6228a.close();
        int i = this.f6230c;
        if (i > 1 || (i == 1 && this.f6229b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f6230c = 0;
    }

    /* renamed from: d0 */
    public void m4686d0(String str) throws IOException {
        if (str == null) {
            m4680J();
            return;
        }
        m4688h0();
        m4689m();
        m4682U(str);
    }

    /* renamed from: e0 */
    public void m4687e0(boolean z) throws IOException {
        m4688h0();
        m4689m();
        this.f6228a.write(z ? "true" : "false");
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f6230c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f6228a.flush();
    }

    /* renamed from: h0 */
    public final void m4688h0() throws IOException {
        if (this.f6233f != null) {
            int iM4681S = m4681S();
            if (iM4681S == 5) {
                this.f6228a.write(44);
            } else if (iM4681S != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m4679D();
            this.f6229b[this.f6230c - 1] = 4;
            m4682U(this.f6233f);
            this.f6233f = null;
        }
    }

    /* renamed from: m */
    public final void m4689m() throws IOException {
        int iM4681S = m4681S();
        if (iM4681S == 1) {
            this.f6229b[this.f6230c - 1] = 2;
            m4679D();
            return;
        }
        Writer writer = this.f6228a;
        if (iM4681S == 2) {
            writer.append(',');
            m4679D();
        } else {
            if (iM4681S == 4) {
                writer.append((CharSequence) this.f6231d);
                this.f6229b[this.f6230c - 1] = 5;
                return;
            }
            if (iM4681S != 6) {
                if (iM4681S != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f6232e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f6229b[this.f6230c - 1] = 7;
        }
    }

    /* renamed from: n */
    public void m4690n() throws IOException {
        m4688h0();
        m4689m();
        int i = this.f6230c;
        int[] iArr = this.f6229b;
        if (i == iArr.length) {
            this.f6229b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f6229b;
        int i2 = this.f6230c;
        this.f6230c = i2 + 1;
        iArr2[i2] = 1;
        this.f6228a.write(91);
    }

    /* renamed from: o */
    public void m4691o() throws IOException {
        m4688h0();
        m4689m();
        int i = this.f6230c;
        int[] iArr = this.f6229b;
        if (i == iArr.length) {
            this.f6229b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f6229b;
        int i2 = this.f6230c;
        this.f6230c = i2 + 1;
        iArr2[i2] = 3;
        this.f6228a.write(123);
    }

    /* renamed from: p */
    public final void m4692p(int i, int i2, char c) throws IOException {
        int iM4681S = m4681S();
        if (iM4681S != i2 && iM4681S != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f6233f != null) {
            throw new IllegalStateException("Dangling name: " + this.f6233f);
        }
        this.f6230c--;
        if (iM4681S == i2) {
            m4679D();
        }
        this.f6228a.write(c);
    }

    /* renamed from: w */
    public void m4693w() throws IOException {
        m4692p(1, 2, ']');
    }

    /* renamed from: x */
    public void m4694x() throws IOException {
        m4692p(3, 5, '}');
    }

    /* renamed from: D */
    public final void m4679D() {
    }
}
