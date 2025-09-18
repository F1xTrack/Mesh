package defpackage;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: r51, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6774r51 extends Writer implements Serializable {
    public final StringBuilder a;

    public C6774r51() {
        this.a = new StringBuilder();
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        this.a.append(c);
        return this;
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.a.append(str);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.a.append(cArr, i, i2);
        }
    }

    public C6774r51(int i) {
        this.a = new StringBuilder(4);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
