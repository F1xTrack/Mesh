package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: kZ */
/* loaded from: classes.dex */
public final class C6308kZ extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 4;
    }
}
