package p000;

import java.io.IOException;

/* renamed from: y10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11744y10 implements Appendable {

    /* renamed from: a */
    public final Appendable f46027a;

    /* renamed from: b */
    public boolean f46028b = true;

    public C11744y10(Appendable appendable) {
        this.f46027a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        boolean z = this.f46028b;
        Appendable appendable = this.f46027a;
        if (z) {
            this.f46028b = false;
            appendable.append("  ");
        }
        this.f46028b = c == '\n';
        appendable.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.f46028b;
        Appendable appendable = this.f46027a;
        boolean z2 = false;
        if (z) {
            this.f46028b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.f46028b = z2;
        appendable.append(charSequence, i, i2);
        return this;
    }
}
