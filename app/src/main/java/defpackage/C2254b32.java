package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: b32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2254b32 implements Iterator {
    public String a;
    public final String c;
    public final boolean d;
    public int f;
    public final /* synthetic */ C3410dX1 g;
    public int b = 2;
    public int e = 0;

    public C2254b32(C1135Oi c1135Oi, String str, C3410dX1 c3410dX1) {
        this.g = c3410dX1;
        c1135Oi.getClass();
        this.d = c1135Oi.b;
        this.f = Integer.MAX_VALUE;
        this.c = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int length;
        String str;
        int i;
        int i2 = this.b;
        if (i2 == 4) {
            throw new IllegalStateException();
        }
        int i3 = i2 - 1;
        String string = null;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.b = 4;
            int i4 = this.e;
            while (true) {
                length = this.e;
                if (length == -1) {
                    this.b = 3;
                    break;
                }
                str = this.c;
                int length2 = str.length();
                Q22.c(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (str.charAt(length) == this.g.a) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.e = -1;
                    i = -1;
                } else {
                    i = length + 1;
                    this.e = i;
                }
                if (i == i4) {
                    int i5 = i + 1;
                    this.e = i5;
                    if (i5 > str.length()) {
                        this.e = -1;
                    }
                } else {
                    if (i4 < length) {
                        str.charAt(i4);
                    }
                    if (i4 < length) {
                        str.charAt(length - 1);
                    }
                    if (!this.d || i4 != length) {
                        break;
                    }
                    i4 = this.e;
                }
            }
            int i6 = this.f;
            if (i6 == 1) {
                length = str.length();
                this.e = -1;
                if (length > i4) {
                    str.charAt(length - 1);
                }
            } else {
                this.f = i6 - 1;
            }
            string = str.subSequence(i4, length).toString();
            this.a = string;
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 2;
        String str = this.a;
        this.a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
