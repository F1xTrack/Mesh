package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: b32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8805b32 implements Iterator {

    /* renamed from: a */
    public String f16725a;

    /* renamed from: c */
    public final String f16727c;

    /* renamed from: d */
    public final boolean f16728d;

    /* renamed from: f */
    public int f16730f;

    /* renamed from: g */
    public final /* synthetic */ C9126dX1 f16731g;

    /* renamed from: b */
    public int f16726b = 2;

    /* renamed from: e */
    public int f16729e = 0;

    public C8805b32(C0926Oi c0926Oi, String str, C9126dX1 c9126dX1) {
        this.f16731g = c9126dX1;
        c0926Oi.getClass();
        this.f16728d = c0926Oi.f8575b;
        this.f16730f = Integer.MAX_VALUE;
        this.f16727c = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int length;
        String str;
        int i;
        int i2 = this.f16726b;
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
            this.f16726b = 4;
            int i4 = this.f16729e;
            while (true) {
                length = this.f16729e;
                if (length == -1) {
                    this.f16726b = 3;
                    break;
                }
                str = this.f16727c;
                int length2 = str.length();
                Q22.m6558c(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (str.charAt(length) == this.f16731g.f26135a) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.f16729e = -1;
                    i = -1;
                } else {
                    i = length + 1;
                    this.f16729e = i;
                }
                if (i == i4) {
                    int i5 = i + 1;
                    this.f16729e = i5;
                    if (i5 > str.length()) {
                        this.f16729e = -1;
                    }
                } else {
                    if (i4 < length) {
                        str.charAt(i4);
                    }
                    if (i4 < length) {
                        str.charAt(length - 1);
                    }
                    if (!this.f16728d || i4 != length) {
                        break;
                    }
                    i4 = this.f16729e;
                }
            }
            int i6 = this.f16730f;
            if (i6 == 1) {
                length = str.length();
                this.f16729e = -1;
                if (length > i4) {
                    str.charAt(length - 1);
                }
            } else {
                this.f16730f = i6 - 1;
            }
            string = str.subSequence(i4, length).toString();
            this.f16725a = string;
            if (this.f16726b != 3) {
                this.f16726b = 1;
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
        this.f16726b = 2;
        String str = this.f16725a;
        this.f16725a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
