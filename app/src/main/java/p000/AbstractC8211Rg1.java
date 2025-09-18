package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;

/* renamed from: Rg1 */
/* loaded from: classes2.dex */
public abstract class AbstractC8211Rg1 {

    /* renamed from: a */
    public static final Set f10374a;

    /* renamed from: b */
    public static final HashMap f10375b;

    /* renamed from: c */
    public static final HashMap f10376c;

    /* renamed from: d */
    public static final LinkedHashSet f10377d;

    static {
        EnumC8159Qg1[] enumC8159Qg1ArrValues = EnumC8159Qg1.values();
        ArrayList arrayList = new ArrayList(enumC8159Qg1ArrValues.length);
        for (EnumC8159Qg1 enumC8159Qg1 : enumC8159Qg1ArrValues) {
            arrayList.add(enumC8159Qg1.f9728b);
        }
        f10374a = AbstractC7167xu.m25987g0(arrayList);
        EnumC8107Pg1[] enumC8107Pg1ArrValues = EnumC8107Pg1.values();
        ArrayList arrayList2 = new ArrayList(enumC8107Pg1ArrValues.length);
        for (EnumC8107Pg1 enumC8107Pg1 : enumC8107Pg1ArrValues) {
            arrayList2.add(enumC8107Pg1.f9225a);
        }
        AbstractC7167xu.m25987g0(arrayList2);
        f10375b = new HashMap();
        f10376c = new HashMap();
        AbstractC11077sn0.m24779g(new Pair(EnumC8107Pg1.f9220b, C8340Tt0.m7798e("ubyteArrayOf")), new Pair(EnumC8107Pg1.f9221c, C8340Tt0.m7798e("ushortArrayOf")), new Pair(EnumC8107Pg1.f9222d, C8340Tt0.m7798e("uintArrayOf")), new Pair(EnumC8107Pg1.f9223e, C8340Tt0.m7798e("ulongArrayOf")));
        EnumC8159Qg1[] enumC8159Qg1ArrValues2 = EnumC8159Qg1.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC8159Qg1 enumC8159Qg12 : enumC8159Qg1ArrValues2) {
            linkedHashSet.add(enumC8159Qg12.f9729c.m365i());
        }
        f10377d = linkedHashSet;
        for (EnumC8159Qg1 enumC8159Qg13 : EnumC8159Qg1.values()) {
            HashMap map = f10375b;
            C0055As c0055As = enumC8159Qg13.f9729c;
            C0055As c0055As2 = enumC8159Qg13.f9727a;
            map.put(c0055As, c0055As2);
            f10376c.put(c0055As2, enumC8159Qg13.f9729c);
        }
    }

    /* renamed from: a */
    public static final boolean m7086a(AbstractC7742Ig0 abstractC7742Ig0) {
        InterfaceC0873Ns interfaceC0873NsMo1962a;
        if (AbstractC7375Be1.m794l(abstractC7742Ig0) || (interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a()) == null) {
            return false;
        }
        InterfaceC0140CD interfaceC0140CDMo423i = interfaceC0873NsMo1962a.mo423i();
        return (interfaceC0140CDMo423i instanceof InterfaceC11993zz0) && O90.m5963a(((AbstractC7364Az0) ((InterfaceC11993zz0) interfaceC0140CDMo423i)).f494f, AbstractC10732q41.f40588l) && f10374a.contains(interfaceC0873NsMo1962a.getName());
    }
}
