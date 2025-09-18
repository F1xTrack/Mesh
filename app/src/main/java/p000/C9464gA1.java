package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: gA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9464gA1 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f27596a;

    /* renamed from: b */
    public int f27597b = 0;

    /* renamed from: c */
    public final /* synthetic */ Object f27598c;

    public /* synthetic */ C9464gA1(int i, Object obj) {
        this.f27596a = i;
        this.f27598c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f27596a) {
            case 0:
                if (this.f27597b < ((C8509Wz1) this.f27598c).f13472a.length()) {
                }
                break;
            case 1:
                if (this.f27597b < ((C8509Wz1) this.f27598c).f13472a.length()) {
                }
                break;
            default:
                if (this.f27597b < ((C11228ty1) this.f27598c).m25039r()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f27596a) {
            case 0:
                int i = this.f27597b;
                C8509Wz1 c8509Wz1 = (C8509Wz1) this.f27598c;
                if (i >= c8509Wz1.f13472a.length()) {
                    throw new NoSuchElementException();
                }
                String str = c8509Wz1.f13472a;
                int i2 = this.f27597b;
                this.f27597b = i2 + 1;
                return new C8509Wz1(String.valueOf(str.charAt(i2)));
            case 1:
                if (this.f27597b >= ((C8509Wz1) this.f27598c).f13472a.length()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f27597b;
                this.f27597b = i3 + 1;
                return new C8509Wz1(String.valueOf(i3));
            default:
                int i4 = this.f27597b;
                C11228ty1 c11228ty1 = (C11228ty1) this.f27598c;
                if (i4 >= c11228ty1.m25039r()) {
                    throw new NoSuchElementException(AbstractC11153tN0.m24909u(this.f27597b, "Out of bounds index: "));
                }
                int i5 = this.f27597b;
                this.f27597b = i5 + 1;
                return c11228ty1.m25037i(i5);
        }
    }
}
