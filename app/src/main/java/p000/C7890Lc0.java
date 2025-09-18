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

/* renamed from: Lc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7890Lc0 implements Closeable, Flushable {

    /* renamed from: i */
    public static final Pattern f6759i = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: j */
    public static final String[] f6760j = new String[128];

    /* renamed from: k */
    public static final String[] f6761k;

    /* renamed from: a */
    public final Writer f6762a;

    /* renamed from: b */
    public int[] f6763b;

    /* renamed from: c */
    public int f6764c;

    /* renamed from: d */
    public final String f6765d;

    /* renamed from: e */
    public boolean f6766e;

    /* renamed from: f */
    public boolean f6767f;

    /* renamed from: g */
    public String f6768g;

    /* renamed from: h */
    public boolean f6769h;

    static {
        for (int i = 0; i <= 31; i++) {
            f6760j[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f6760j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f6761k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C7890Lc0(Writer writer) {
        int[] iArr = new int[32];
        this.f6763b = iArr;
        this.f6764c = 0;
        if (iArr.length == 0) {
            this.f6763b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f6763b;
        int i = this.f6764c;
        this.f6764c = i + 1;
        iArr2[i] = 6;
        this.f6765d = StringUtils.PROCESS_POSTFIX_DELIMITER;
        this.f6769h = true;
        Objects.requireNonNull(writer, "out == null");
        this.f6762a = writer;
    }

    /* renamed from: A */
    public void m5032A(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f6768g != null) {
            throw new IllegalStateException();
        }
        if (this.f6764c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f6768g = str;
    }

    /* renamed from: J */
    public C7890Lc0 m5034J() throws IOException {
        if (this.f6768g != null) {
            if (!this.f6769h) {
                this.f6768g = null;
                return this;
            }
            m5042h0();
        }
        m5043m();
        this.f6762a.write("null");
        return this;
    }

    /* renamed from: S */
    public final int m5035S() {
        int i = this.f6764c;
        if (i != 0) {
            return this.f6763b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5036U(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f6767f
            if (r0 == 0) goto L7
            java.lang.String[] r0 = p000.C7890Lc0.f6761k
            goto L9
        L7:
            java.lang.String[] r0 = p000.C7890Lc0.f6760j
        L9:
            java.io.Writer r1 = r8.f6762a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7890Lc0.m5036U(java.lang.String):void");
    }

    /* renamed from: W */
    public void m5037W(double d) throws IOException {
        m5042h0();
        if (this.f6766e || !(Double.isNaN(d) || Double.isInfinite(d))) {
            m5043m();
            this.f6762a.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    /* renamed from: X */
    public void m5038X(long j) throws IOException {
        m5042h0();
        m5043m();
        this.f6762a.write(Long.toString(j));
    }

    /* renamed from: b0 */
    public void m5039b0(Number number) throws IOException {
        if (number == null) {
            m5034J();
            return;
        }
        m5042h0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f6759i.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f6766e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        m5043m();
        this.f6762a.append((CharSequence) string);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6762a.close();
        int i = this.f6764c;
        if (i > 1 || (i == 1 && this.f6763b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f6764c = 0;
    }

    /* renamed from: d0 */
    public void m5040d0(String str) throws IOException {
        if (str == null) {
            m5034J();
            return;
        }
        m5042h0();
        m5043m();
        m5036U(str);
    }

    /* renamed from: e0 */
    public void m5041e0(boolean z) throws IOException {
        m5042h0();
        m5043m();
        this.f6762a.write(z ? "true" : "false");
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f6764c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f6762a.flush();
    }

    /* renamed from: h0 */
    public final void m5042h0() throws IOException {
        if (this.f6768g != null) {
            int iM5035S = m5035S();
            if (iM5035S == 5) {
                this.f6762a.write(44);
            } else if (iM5035S != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m5033D();
            this.f6763b[this.f6764c - 1] = 4;
            m5036U(this.f6768g);
            this.f6768g = null;
        }
    }

    /* renamed from: m */
    public final void m5043m() throws IOException {
        int iM5035S = m5035S();
        if (iM5035S == 1) {
            this.f6763b[this.f6764c - 1] = 2;
            m5033D();
            return;
        }
        Writer writer = this.f6762a;
        if (iM5035S == 2) {
            writer.append(',');
            m5033D();
        } else {
            if (iM5035S == 4) {
                writer.append((CharSequence) this.f6765d);
                this.f6763b[this.f6764c - 1] = 5;
                return;
            }
            if (iM5035S != 6) {
                if (iM5035S != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f6766e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f6763b[this.f6764c - 1] = 7;
        }
    }

    /* renamed from: n */
    public void m5044n() throws IOException {
        m5042h0();
        m5043m();
        int i = this.f6764c;
        int[] iArr = this.f6763b;
        if (i == iArr.length) {
            this.f6763b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f6763b;
        int i2 = this.f6764c;
        this.f6764c = i2 + 1;
        iArr2[i2] = 1;
        this.f6762a.write(91);
    }

    /* renamed from: o */
    public void m5045o() throws IOException {
        m5042h0();
        m5043m();
        int i = this.f6764c;
        int[] iArr = this.f6763b;
        if (i == iArr.length) {
            this.f6763b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f6763b;
        int i2 = this.f6764c;
        this.f6764c = i2 + 1;
        iArr2[i2] = 3;
        this.f6762a.write(123);
    }

    /* renamed from: p */
    public final void m5046p(int i, int i2, char c) throws IOException {
        int iM5035S = m5035S();
        if (iM5035S != i2 && iM5035S != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f6768g != null) {
            throw new IllegalStateException("Dangling name: " + this.f6768g);
        }
        this.f6764c--;
        if (iM5035S == i2) {
            m5033D();
        }
        this.f6762a.write(c);
    }

    /* renamed from: w */
    public void m5047w() throws IOException {
        m5046p(1, 2, ']');
    }

    /* renamed from: x */
    public void m5048x() throws IOException {
        m5046p(3, 5, '}');
    }

    /* renamed from: D */
    public final void m5033D() {
    }
}
