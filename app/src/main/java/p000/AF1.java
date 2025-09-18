package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class AF1 extends HB1 implements RandomAccess, FF1 {

    /* renamed from: b */
    public final List f143b;

    static {
        new AF1();
    }

    public AF1(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.f143b = arrayList;
    }

    @Override // p000.FF1
    /* renamed from: U */
    public final void mo136U(C11769yC1 c11769yC1) {
        zza();
        this.f143b.add(c11769yC1);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zza();
        this.f143b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.HB1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zza();
        if (collection instanceof FF1) {
            collection = ((FF1) collection).mo140m();
        }
        boolean zAddAll = this.f143b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p000.YE1
    /* renamed from: c */
    public final YE1 mo137c(int i) {
        List list = this.f143b;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new AF1(arrayList);
    }

    @Override // p000.HB1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.f143b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d */
    public final String get(int i) {
        String str;
        List list = this.f143b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C11769yC1)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC9090dF1.f25904a);
            C9604hG1 c9604hG1 = AbstractC8711aK1.f15465a;
            int length = bArr.length;
            AbstractC8711aK1.f15465a.getClass();
            if (C9604hG1.m18792c(bArr, 0, length)) {
                list.set(i, str2);
            }
            return str2;
        }
        C11769yC1 c11769yC1 = (C11769yC1) obj;
        Charset charset = AbstractC9090dF1.f25904a;
        if (c11769yC1.mo23955h() == 0) {
            str = "";
        } else {
            str = new String(c11769yC1.f46140b, 0, c11769yC1.mo23955h(), charset);
        }
        int iMo23955h = c11769yC1.mo23955h();
        AbstractC8711aK1.f15465a.getClass();
        if (C9604hG1.m18792c(c11769yC1.f46140b, 0, iMo23955h)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // p000.FF1
    /* renamed from: l */
    public final Object mo139l(int i) {
        return this.f143b.get(i);
    }

    @Override // p000.FF1
    /* renamed from: m */
    public final List mo140m() {
        return Collections.unmodifiableList(this.f143b);
    }

    @Override // p000.HB1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        Object objRemove = this.f143b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C11769yC1)) {
            return new String((byte[]) objRemove, AbstractC9090dF1.f25904a);
        }
        C11769yC1 c11769yC1 = (C11769yC1) objRemove;
        Charset charset = AbstractC9090dF1.f25904a;
        if (c11769yC1.mo23955h() == 0) {
            return "";
        }
        return new String(c11769yC1.f46140b, 0, c11769yC1.mo23955h(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        Object obj2 = this.f143b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C11769yC1)) {
            return new String((byte[]) obj2, AbstractC9090dF1.f25904a);
        }
        C11769yC1 c11769yC1 = (C11769yC1) obj2;
        Charset charset = AbstractC9090dF1.f25904a;
        if (c11769yC1.mo23955h() == 0) {
            return "";
        }
        return new String(c11769yC1.f46140b, 0, c11769yC1.mo23955h(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f143b.size();
    }

    @Override // p000.FF1
    public final FF1 zze() {
        return this.f4162a ? new ZI1(this) : this;
    }

    public AF1(ArrayList arrayList) {
        super(true);
        this.f143b = arrayList;
    }

    public AF1() {
        super(false);
        this.f143b = Collections.emptyList();
    }

    @Override // p000.HB1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f143b.size(), collection);
    }
}
