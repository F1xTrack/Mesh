package com.huawei.hms.common.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p000.Q70;

/* loaded from: classes.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        return freezeIterable(arrayList);
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        Q70 q70 = (ArrayList<T>) new ArrayList();
        if (iterable == null) {
            return q70;
        }
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            q70.add(it.next().freeze());
        }
        return q70;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        return freezeIterable(Arrays.asList(eArr));
    }
}
