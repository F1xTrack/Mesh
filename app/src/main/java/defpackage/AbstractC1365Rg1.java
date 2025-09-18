package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;

/* renamed from: Rg1 */
/* loaded from: classes2.dex */
public abstract class AbstractC1365Rg1 {
    public static final Set a;
    public static final HashMap b;
    public static final HashMap c;
    public static final LinkedHashSet d;

    static {
        EnumC1287Qg1[] enumC1287Qg1ArrValues = EnumC1287Qg1.values();
        ArrayList arrayList = new ArrayList(enumC1287Qg1ArrValues.length);
        for (EnumC1287Qg1 enumC1287Qg1 : enumC1287Qg1ArrValues) {
            arrayList.add(enumC1287Qg1.b);
        }
        a = AbstractC8069xu.g0(arrayList);
        EnumC1209Pg1[] enumC1209Pg1ArrValues = EnumC1209Pg1.values();
        ArrayList arrayList2 = new ArrayList(enumC1209Pg1ArrValues.length);
        for (EnumC1209Pg1 enumC1209Pg1 : enumC1209Pg1ArrValues) {
            arrayList2.add(enumC1209Pg1.a);
        }
        AbstractC8069xu.g0(arrayList2);
        b = new HashMap();
        c = new HashMap();
        AbstractC7096sn0.g(new Pair(EnumC1209Pg1.b, C1559Tt0.e("ubyteArrayOf")), new Pair(EnumC1209Pg1.c, C1559Tt0.e("ushortArrayOf")), new Pair(EnumC1209Pg1.d, C1559Tt0.e("uintArrayOf")), new Pair(EnumC1209Pg1.e, C1559Tt0.e("ulongArrayOf")));
        EnumC1287Qg1[] enumC1287Qg1ArrValues2 = EnumC1287Qg1.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC1287Qg1 enumC1287Qg12 : enumC1287Qg1ArrValues2) {
            linkedHashSet.add(enumC1287Qg12.c.i());
        }
        d = linkedHashSet;
        for (EnumC1287Qg1 enumC1287Qg13 : EnumC1287Qg1.values()) {
            HashMap map = b;
            C0074As c0074As = enumC1287Qg13.c;
            C0074As c0074As2 = enumC1287Qg13.a;
            map.put(c0074As, c0074As2);
            c.put(c0074As2, enumC1287Qg13.c);
        }
    }

    public static final boolean a(AbstractC0663Ig0 abstractC0663Ig0) {
        InterfaceC1087Ns interfaceC1087NsA;
        if (AbstractC0112Be1.l(abstractC0663Ig0) || (interfaceC1087NsA = abstractC0663Ig0.E().a()) == null) {
            return false;
        }
        CD cdI = interfaceC1087NsA.i();
        return (cdI instanceof InterfaceC8465zz0) && O90.a(((AbstractC0096Az0) ((InterfaceC8465zz0) cdI)).f, AbstractC6581q41.l) && a.contains(interfaceC1087NsA.getName());
    }
}
