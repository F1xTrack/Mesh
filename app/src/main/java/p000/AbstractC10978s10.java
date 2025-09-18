package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: s10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10978s10 {

    /* renamed from: a */
    public static final C6515nr f42201a = new C6515nr();

    /* renamed from: a */
    public static ArrayList m24576a(Object... objArr) {
        int length = objArr.length;
        AbstractC9246eT1.m17997b(length, "arraySize");
        ArrayList arrayList = new ArrayList(AbstractC10983s22.m24584f(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* renamed from: b */
    public static AbstractList m24577b(List list, InterfaceC6560oZ interfaceC6560oZ) {
        return list instanceof RandomAccess ? new C8476Wj0(list, interfaceC6560oZ) : new C8528Xj0(list, interfaceC6560oZ);
    }
}
