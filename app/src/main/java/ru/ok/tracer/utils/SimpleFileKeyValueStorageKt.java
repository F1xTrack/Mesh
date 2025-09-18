package ru.ok.tracer.utils;

import defpackage.AbstractC7096sn0;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aR\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u00022\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0082\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"K", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlin/Function1;", "", "LTf1;", "block", "update", "(Ljava/util/concurrent/atomic/AtomicReference;LnZ;)V", "tracer-commons_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SimpleFileKeyValueStorageKt {
    private static final <K, V> void update(AtomicReference<Map<K, V>> atomicReference, InterfaceC6099nZ interfaceC6099nZ) {
        while (true) {
            Map<K, V> map = atomicReference.get();
            O90.e(map, "oldOne");
            LinkedHashMap linkedHashMapQ = AbstractC7096sn0.q(map);
            interfaceC6099nZ.invoke(linkedHashMapQ);
            while (!atomicReference.compareAndSet(map, linkedHashMapQ)) {
                if (atomicReference.get() != map) {
                    break;
                }
            }
            return;
        }
    }
}
