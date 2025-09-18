package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: x31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11624x31 implements Iterator {

    /* renamed from: b */
    public String f45339b;

    /* renamed from: c */
    public final CharSequence f45340c;

    /* renamed from: d */
    public final C6912tr f45341d;

    /* renamed from: f */
    public int f45343f;

    /* renamed from: g */
    public final /* synthetic */ C10339n11 f45344g;

    /* renamed from: a */
    public int f45338a = 2;

    /* renamed from: e */
    public int f45342e = 0;

    public C11624x31(C10339n11 c10339n11, C1356VY c1356vy, CharSequence charSequence) {
        this.f45344g = c10339n11;
        this.f45341d = (C6912tr) c1356vy.f12612c;
        this.f45343f = c1356vy.f12611b;
        this.f45340c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i = this.f45338a;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 0) {
            return true;
        }
        if (iM26247x == 2) {
            return false;
        }
        this.f45338a = 4;
        int i2 = this.f45342e;
        while (true) {
            int length = this.f45342e;
            if (length == -1) {
                this.f45338a = 3;
                string = null;
                break;
            }
            C6849sr c6849sr = (C6849sr) this.f45344g.f38046b;
            CharSequence charSequence = this.f45340c;
            int length2 = charSequence.length();
            QL1.m6669e(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (c6849sr.mo24490a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f45342e = -1;
            } else {
                this.f45342e = length + 1;
            }
            int i3 = this.f45342e;
            if (i3 == i2) {
                int i4 = i3 + 1;
                this.f45342e = i4;
                if (i4 > charSequence.length()) {
                    this.f45342e = -1;
                }
            } else {
                C6912tr c6912tr = this.f45341d;
                if (i2 < length) {
                    charSequence.charAt(i2);
                    c6912tr.getClass();
                }
                if (length > i2) {
                    charSequence.charAt(length - 1);
                    c6912tr.getClass();
                }
                int i5 = this.f45343f;
                if (i5 == 1) {
                    length = charSequence.length();
                    this.f45342e = -1;
                    if (length > i2) {
                        charSequence.charAt(length - 1);
                        c6912tr.getClass();
                    }
                } else {
                    this.f45343f = i5 - 1;
                }
                string = charSequence.subSequence(i2, length).toString();
            }
        }
        this.f45339b = string;
        if (this.f45338a == 3) {
            return false;
        }
        this.f45338a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f45338a = 2;
        String str = this.f45339b;
        this.f45339b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
