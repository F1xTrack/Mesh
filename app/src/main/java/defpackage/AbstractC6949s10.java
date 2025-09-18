package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: s10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6949s10 {
    public static final C6153nr a = new C6153nr();

    public static ArrayList a(Object... objArr) {
        int length = objArr.length;
        AbstractC3588eT1.b(length, "arraySize");
        ArrayList arrayList = new ArrayList(AbstractC6955s22.f(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static AbstractList b(List list, InterfaceC6290oZ interfaceC6290oZ) {
        return list instanceof RandomAccess ? new C1763Wj0(list, interfaceC6290oZ) : new C1841Xj0(list, interfaceC6290oZ);
    }
}
