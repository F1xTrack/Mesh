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

/* renamed from: Kc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0807Kc0 implements Closeable, Flushable {
    public static final Pattern h = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] i = new String[128];
    public final Writer a;
    public int[] b;
    public int c;
    public final String d;
    public boolean e;
    public String f;
    public boolean g;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            i[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = i;
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

    public C0807Kc0(Writer writer) {
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
        this.g = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
    }

    public void A(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f != null) {
            throw new IllegalStateException();
        }
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f = str;
    }

    public C0807Kc0 J() throws IOException {
        if (this.f != null) {
            if (!this.g) {
                this.f = null;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            java.io.Writer r0 = r7.a
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
            java.lang.String[] r6 = defpackage.C0807Kc0.i
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0807Kc0.U(java.lang.String):void");
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

    public void X(long j) throws IOException {
        h0();
        m();
        this.a.write(Long.toString(j));
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
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !h.matcher(string).matches()) {
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
        if (this.f != null) {
            int iS = S();
            if (iS == 5) {
                this.a.write(44);
            } else if (iS != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            D();
            this.b[this.c - 1] = 4;
            U(this.f);
            this.f = null;
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
        if (this.f != null) {
            throw new IllegalStateException("Dangling name: " + this.f);
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
