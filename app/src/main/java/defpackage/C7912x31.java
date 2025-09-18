package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: x31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7912x31 implements Iterator {
    public String b;
    public final CharSequence c;
    public final C7298tr d;
    public int f;
    public final /* synthetic */ C5996n11 g;
    public int a = 2;
    public int e = 0;

    public C7912x31(C5996n11 c5996n11, VY vy, CharSequence charSequence) {
        this.g = c5996n11;
        this.d = (C7298tr) vy.c;
        this.f = vy.b;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i = this.a;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iX = AbstractC8235ym.x(i);
        if (iX == 0) {
            return true;
        }
        if (iX == 2) {
            return false;
        }
        this.a = 4;
        int i2 = this.e;
        while (true) {
            int length = this.e;
            if (length == -1) {
                this.a = 3;
                string = null;
                break;
            }
            C7107sr c7107sr = (C7107sr) this.g.b;
            CharSequence charSequence = this.c;
            int length2 = charSequence.length();
            QL1.e(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (c7107sr.a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.e = -1;
            } else {
                this.e = length + 1;
            }
            int i3 = this.e;
            if (i3 == i2) {
                int i4 = i3 + 1;
                this.e = i4;
                if (i4 > charSequence.length()) {
                    this.e = -1;
                }
            } else {
                C7298tr c7298tr = this.d;
                if (i2 < length) {
                    charSequence.charAt(i2);
                    c7298tr.getClass();
                }
                if (length > i2) {
                    charSequence.charAt(length - 1);
                    c7298tr.getClass();
                }
                int i5 = this.f;
                if (i5 == 1) {
                    length = charSequence.length();
                    this.e = -1;
                    if (length > i2) {
                        charSequence.charAt(length - 1);
                        c7298tr.getClass();
                    }
                } else {
                    this.f = i5 - 1;
                }
                string = charSequence.subSequence(i2, length).toString();
            }
        }
        this.b = string;
        if (this.a == 3) {
            return false;
        }
        this.a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
