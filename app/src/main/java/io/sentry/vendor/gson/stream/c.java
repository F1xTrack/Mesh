package io.sentry.vendor.gson.stream;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c implements Closeable, Flushable {
    public static final String[] i = new String[128];
    public final Writer a;
    public int[] b;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public final boolean h;

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

    public c(Writer writer) {
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
        this.e = StringUtils.PROCESS_POSTFIX_DELIMITER;
        this.h = true;
        this.a = writer;
    }

    public final void A() throws IOException {
        if (this.g != null) {
            int iW = w();
            if (iW == 5) {
                this.a.write(44);
            } else if (iW != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            o();
            this.b[this.c - 1] = 4;
            x(this.g);
            this.g = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
        int i2 = this.c;
        if (i2 > 1 || (i2 == 1 && this.b[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.a.flush();
    }

    public final void m() throws IOException {
        int iW = w();
        if (iW == 1) {
            this.b[this.c - 1] = 2;
            o();
            return;
        }
        Writer writer = this.a;
        if (iW == 2) {
            writer.append(',');
            o();
        } else {
            if (iW == 4) {
                writer.append((CharSequence) this.e);
                this.b[this.c - 1] = 5;
                return;
            }
            if (iW != 6) {
                if (iW != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.b[this.c - 1] = 7;
        }
    }

    public final void n(int i2, int i3, char c) throws IOException {
        int iW = w();
        if (iW != i3 && iW != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.g != null) {
            throw new IllegalStateException("Dangling name: " + this.g);
        }
        this.c--;
        if (iW == i3) {
            o();
        }
        this.a.write(c);
    }

    public final void o() throws IOException {
        if (this.d == null) {
            return;
        }
        Writer writer = this.a;
        writer.write(10);
        int i2 = this.c;
        for (int i3 = 1; i3 < i2; i3++) {
            writer.write(this.d);
        }
    }

    public final void p() throws IOException {
        if (this.g != null) {
            if (!this.h) {
                this.g = null;
                return;
            }
            A();
        }
        m();
        this.a.write("null");
    }

    public final int w() {
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
    public final void x(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.c.i
            java.io.Writer r1 = r8.a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        Lf:
            if (r4 >= r3) goto L3a
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L1e
            r6 = r0[r6]
            if (r6 != 0) goto L2b
            goto L37
        L1e:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L25
            java.lang.String r6 = "\\u2028"
            goto L2b
        L25:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L37
            java.lang.String r6 = "\\u2029"
        L2b:
            if (r5 >= r4) goto L32
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L32:
            r1.write(r6)
            int r5 = r4 + 1
        L37:
            int r4 = r4 + 1
            goto Lf
        L3a:
            if (r5 >= r3) goto L40
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L40:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.c.x(java.lang.String):void");
    }
}
