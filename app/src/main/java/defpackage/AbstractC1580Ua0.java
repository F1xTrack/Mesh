package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: Ua0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1580Ua0 {
    public static final Object a = AbstractC7096sn0.h(new Pair("PACKAGE", EnumSet.noneOf(EnumC0585Hg0.class)), new Pair("TYPE", EnumSet.of(EnumC0585Hg0.o, EnumC0585Hg0.A)), new Pair("ANNOTATION_TYPE", EnumSet.of(EnumC0585Hg0.p)), new Pair("TYPE_PARAMETER", EnumSet.of(EnumC0585Hg0.q)), new Pair("FIELD", EnumSet.of(EnumC0585Hg0.s)), new Pair("LOCAL_VARIABLE", EnumSet.of(EnumC0585Hg0.t)), new Pair("PARAMETER", EnumSet.of(EnumC0585Hg0.u)), new Pair("CONSTRUCTOR", EnumSet.of(EnumC0585Hg0.v)), new Pair("METHOD", EnumSet.of(EnumC0585Hg0.w, EnumC0585Hg0.x, EnumC0585Hg0.y)), new Pair("TYPE_USE", EnumSet.of(EnumC0585Hg0.z)));
    public static final Object b = AbstractC7096sn0.h(new Pair("RUNTIME", EnumC0507Gg0.a), new Pair("CLASS", EnumC0507Gg0.b), new Pair("SOURCE", EnumC0507Gg0.c));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static I8 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C5688lP0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) a.get(C1559Tt0.e(((C5688lP0) it.next()).b.name()).b());
            if (iterable == null) {
                iterable = SN.a;
            }
            AbstractC0314Du.m(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(arrayList2));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new TO(C0074As.j(AbstractC6390p41.u), C1559Tt0.e(((EnumC0585Hg0) it2.next()).name())));
        }
        return new I8(arrayList3, C5284jI.G);
    }
}
