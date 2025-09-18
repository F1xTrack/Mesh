package p000;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: Ua0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8354Ua0 {

    /* renamed from: a */
    public static final Object f11920a = AbstractC11077sn0.m24780h(new Pair("PACKAGE", EnumSet.noneOf(EnumC7690Hg0.class)), new Pair("TYPE", EnumSet.of(EnumC7690Hg0.f4422o, EnumC7690Hg0.f4399A)), new Pair("ANNOTATION_TYPE", EnumSet.of(EnumC7690Hg0.f4423p)), new Pair("TYPE_PARAMETER", EnumSet.of(EnumC7690Hg0.f4424q)), new Pair("FIELD", EnumSet.of(EnumC7690Hg0.f4426s)), new Pair("LOCAL_VARIABLE", EnumSet.of(EnumC7690Hg0.f4427t)), new Pair("PARAMETER", EnumSet.of(EnumC7690Hg0.f4428u)), new Pair("CONSTRUCTOR", EnumSet.of(EnumC7690Hg0.f4429v)), new Pair("METHOD", EnumSet.of(EnumC7690Hg0.f4430w, EnumC7690Hg0.f4431x, EnumC7690Hg0.f4432y)), new Pair("TYPE_USE", EnumSet.of(EnumC7690Hg0.f4433z)));

    /* renamed from: b */
    public static final Object f11921b = AbstractC11077sn0.m24780h(new Pair("RUNTIME", EnumC7638Gg0.f3846a), new Pair("CLASS", EnumC7638Gg0.f3847b), new Pair("SOURCE", EnumC7638Gg0.f3848c));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* renamed from: a */
    public static C0513I8 m8083a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C10133lP0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f11920a.get(C8340Tt0.m7798e(((C10133lP0) it.next()).f37043b.name()).m7801b());
            if (iterable == null) {
                iterable = C1156SN.f10705a;
            }
            AbstractC0246Du.m1920m(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(arrayList2));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new C1220TO(C0055As.m358j(AbstractC10604p41.f39823u), C8340Tt0.m7798e(((EnumC7690Hg0) it2.next()).name())));
        }
        return new C0513I8(arrayList3, C6228jI.f35025G);
    }
}
