package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;
import p000.Q70;

/* loaded from: classes.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        Q70 q70 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q70.add(arrayList.get(i).freeze());
        }
        return q70;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        Q70 q70 = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            q70.add(it.next().freeze());
        }
        return q70;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        Q70 q70 = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            q70.add(e.freeze());
        }
        return q70;
    }
}
