package p000;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: y21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11748y21 extends AbstractSet {

    /* renamed from: c */
    public static final /* synthetic */ int f46047c = 0;

    /* renamed from: a */
    public Object f46048a;

    /* renamed from: b */
    public int f46049b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.AbstractCollection, java.util.AbstractSet, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object[] objArr;
        int i = this.f46049b;
        if (i == 0) {
            this.f46048a = obj;
        } else if (i == 1) {
            if (O90.m5963a(this.f46048a, obj)) {
                return false;
            }
            this.f46048a = new Object[]{this.f46048a, obj};
        } else if (i < 5) {
            Object obj2 = this.f46048a;
            O90.m5966d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj2;
            if (AbstractC0576J8.m4178e(objArr2, obj)) {
                return false;
            }
            int i2 = this.f46049b;
            if (i2 == 4) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
                O90.m5968f(objArrCopyOf, "elements");
                ?? linkedHashSet = new LinkedHashSet(AbstractC11205tn0.m24983b(objArrCopyOf.length));
                AbstractC0576J8.m4171B(objArrCopyOf, linkedHashSet);
                linkedHashSet.add(obj);
                objArr = linkedHashSet;
            } else {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, i2 + 1);
                O90.m5967e(objArrCopyOf2, "copyOf(...)");
                objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                objArr = objArrCopyOf2;
            }
            this.f46048a = objArr;
        } else {
            Object obj3 = this.f46048a;
            O90.m5966d(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!AbstractC10036ke1.m22228c(obj3).add(obj)) {
                return false;
            }
        }
        this.f46049b++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f46048a = null;
        this.f46049b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f46049b;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return O90.m5963a(this.f46048a, obj);
        }
        if (i < 5) {
            Object obj2 = this.f46048a;
            O90.m5966d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return AbstractC0576J8.m4178e((Object[]) obj2, obj);
        }
        Object obj3 = this.f46048a;
        O90.m5966d(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f46049b;
        if (i == 0) {
            return Collections.emptySet().iterator();
        }
        if (i == 1) {
            return new C9691hy0(1, this.f46048a);
        }
        if (i < 5) {
            Object obj = this.f46048a;
            O90.m5966d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new C11621x21((Object[]) obj);
        }
        Object obj2 = this.f46048a;
        O90.m5966d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return AbstractC10036ke1.m22228c(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f46049b;
    }
}
