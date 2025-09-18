package io.sentry.vendor.gson.stream;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* renamed from: io.sentry.vendor.gson.stream.c */
/* loaded from: classes2.dex */
public final class C6186c implements Closeable, Flushable {

    /* renamed from: i */
    public static final String[] f34696i = new String[128];

    /* renamed from: a */
    public final Writer f34697a;

    /* renamed from: b */
    public int[] f34698b;

    /* renamed from: c */
    public int f34699c;

    /* renamed from: d */
    public String f34700d;

    /* renamed from: e */
    public String f34701e;

    /* renamed from: f */
    public boolean f34702f;

    /* renamed from: g */
    public String f34703g;

    /* renamed from: h */
    public final boolean f34704h;

    static {
        for (int i = 0; i <= 31; i++) {
            f34696i[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f34696i;
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

    public C6186c(Writer writer) {
        int[] iArr = new int[32];
        this.f34698b = iArr;
        this.f34699c = 0;
        if (iArr.length == 0) {
            this.f34698b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f34698b;
        int i = this.f34699c;
        this.f34699c = i + 1;
        iArr2[i] = 6;
        this.f34701e = StringUtils.PROCESS_POSTFIX_DELIMITER;
        this.f34704h = true;
        this.f34697a = writer;
    }

    /* renamed from: A */
    public final void m21919A() throws IOException {
        if (this.f34703g != null) {
            int iM21924w = m21924w();
            if (iM21924w == 5) {
                this.f34697a.write(44);
            } else if (iM21924w != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m21922o();
            this.f34698b[this.f34699c - 1] = 4;
            m21925x(this.f34703g);
            this.f34703g = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34697a.close();
        int i = this.f34699c;
        if (i > 1 || (i == 1 && this.f34698b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f34699c = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f34699c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f34697a.flush();
    }

    /* renamed from: m */
    public final void m21920m() throws IOException {
        int iM21924w = m21924w();
        if (iM21924w == 1) {
            this.f34698b[this.f34699c - 1] = 2;
            m21922o();
            return;
        }
        Writer writer = this.f34697a;
        if (iM21924w == 2) {
            writer.append(',');
            m21922o();
        } else {
            if (iM21924w == 4) {
                writer.append((CharSequence) this.f34701e);
                this.f34698b[this.f34699c - 1] = 5;
                return;
            }
            if (iM21924w != 6) {
                if (iM21924w != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f34702f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f34698b[this.f34699c - 1] = 7;
        }
    }

    /* renamed from: n */
    public final void m21921n(int i, int i2, char c) throws IOException {
        int iM21924w = m21924w();
        if (iM21924w != i2 && iM21924w != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f34703g != null) {
            throw new IllegalStateException("Dangling name: " + this.f34703g);
        }
        this.f34699c--;
        if (iM21924w == i2) {
            m21922o();
        }
        this.f34697a.write(c);
    }

    /* renamed from: o */
    public final void m21922o() throws IOException {
        if (this.f34700d == null) {
            return;
        }
        Writer writer = this.f34697a;
        writer.write(10);
        int i = this.f34699c;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f34700d);
        }
    }

    /* renamed from: p */
    public final void m21923p() throws IOException {
        if (this.f34703g != null) {
            if (!this.f34704h) {
                this.f34703g = null;
                return;
            }
            m21919A();
        }
        m21920m();
        this.f34697a.write("null");
    }

    /* renamed from: w */
    public final int m21924w() {
        int i = this.f34699c;
        if (i != 0) {
            return this.f34698b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m21925x(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.C6186c.f34696i
            java.io.Writer r1 = r8.f34697a
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
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C6186c.m21925x(java.lang.String):void");
    }
}
