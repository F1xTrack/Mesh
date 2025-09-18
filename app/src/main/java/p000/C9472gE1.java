package p000;

import java.util.NoSuchElementException;

/* renamed from: gE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9472gE1 extends AbstractC10168lg1 {

    /* renamed from: b */
    public int f27627b;

    /* renamed from: c */
    public final int f27628c;

    /* renamed from: d */
    public final /* synthetic */ JE1 f27629d;

    public C9472gE1(JE1 je1) {
        super(5);
        this.f27629d = je1;
        this.f27627b = 0;
        this.f27628c = je1.mo3006i();
    }

    @Override // p000.AbstractC10168lg1
    /* renamed from: a */
    public final byte mo2124a() {
        int i = this.f27627b;
        if (i >= this.f27628c) {
            throw new NoSuchElementException();
        }
        this.f27627b = i + 1;
        return this.f27629d.mo3005d(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27627b < this.f27628c;
    }
}
