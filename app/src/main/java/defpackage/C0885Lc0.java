package defpackage;

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
public class C0885Lc0 implements Closeable, Flushable {
    public static final Pattern i = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] j = new String[128];
    public static final String[] k;
    public final Writer a;
    public int[] b;
    public int c;
    public final String d;
    public boolean e;
    public boolean f;
    public String g;
    public boolean h;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            j[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C0885Lc0(Writer writer) {
        int[] iArr = new int[32];
        this.b = iArr;
        this.c = 0;
        if (iArr.length == 0) {
            this.b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = 6;
        this.d = StringUtils.PROCESS_POSTFIX_DELIMITER;
        this.h = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
    }

    public void A(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.g != null) {
            throw new IllegalStateException();
        }
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.g = str;
    }

    public C0885Lc0 J() throws IOException {
        if (this.g != null) {
            if (!this.h) {
                this.g = null;
                return this;
            }
            h0();
        }
        m();
        this.a.write("null");
        return this;
    }

    public final int S() {
        int i2 = this.c;
        if (i2 != 0) {
            return this.b[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.C0885Lc0.k
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.C0885Lc0.j
        L9:
            java.io.Writer r1 = r8.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0885Lc0.U(java.lang.String):void");
    }

    public void W(double d) throws IOException {
        h0();
        if (this.e || !(Double.isNaN(d) || Double.isInfinite(d))) {
            m();
            this.a.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    public void X(long j2) throws IOException {
        h0();
        m();
        this.a.write(Long.toString(j2));
    }

    public void b0(Number number) throws IOException {
        if (number == null) {
            J();
            return;
        }
        h0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !i.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        m();
        this.a.append((CharSequence) string);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
        int i2 = this.c;
        if (i2 > 1 || (i2 == 1 && this.b[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    public void d0(String str) throws IOException {
        if (str == null) {
            J();
            return;
        }
        h0();
        m();
        U(str);
    }

    public void e0(boolean z) throws IOException {
        h0();
        m();
        this.a.write(z ? "true" : "false");
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.a.flush();
    }

    public final void h0() throws IOException {
        if (this.g != null) {
            int iS = S();
            if (iS == 5) {
                this.a.write(44);
            } else if (iS != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            D();
            this.b[this.c - 1] = 4;
            U(this.g);
            this.g = null;
        }
    }

    public final void m() throws IOException {
        int iS = S();
        if (iS == 1) {
            this.b[this.c - 1] = 2;
            D();
            return;
        }
        Writer writer = this.a;
        if (iS == 2) {
            writer.append(',');
            D();
        } else {
            if (iS == 4) {
                writer.append((CharSequence) this.d);
                this.b[this.c - 1] = 5;
                return;
            }
            if (iS != 6) {
                if (iS != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.b[this.c - 1] = 7;
        }
    }

    public void n() throws IOException {
        h0();
        m();
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            this.b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr2[i3] = 1;
        this.a.write(91);
    }

    public void o() throws IOException {
        h0();
        m();
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            this.b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr2[i3] = 3;
        this.a.write(123);
    }

    public final void p(int i2, int i3, char c) throws IOException {
        int iS = S();
        if (iS != i3 && iS != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.g != null) {
            throw new IllegalStateException("Dangling name: " + this.g);
        }
        this.c--;
        if (iS == i3) {
            D();
        }
        this.a.write(c);
    }

    public void w() throws IOException {
        p(1, 2, ']');
    }

    public void x() throws IOException {
        p(3, 5, '}');
    }

    public final void D() {
    }
}
