package p000;

import java.util.Objects;

/* renamed from: nF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10370nF1 extends KD1 {

    /* renamed from: c */
    public final transient Object[] f38219c;

    /* renamed from: d */
    public final transient int f38220d;

    /* renamed from: e */
    public final transient int f38221e = 1;

    public C10370nF1(int i, Object[] objArr) {
        this.f38219c = objArr;
        this.f38220d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Q12.m6549c(i, this.f38221e);
        Object obj = this.f38219c[i + i + this.f38220d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38221e;
    }
}
