package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: YE */
/* loaded from: classes.dex */
public final class C1525YE implements InterfaceC0187Cy {

    /* renamed from: c */
    public static final C1525YE f14204c = new C1525YE(Collections.emptyMap());

    /* renamed from: a */
    public int f14205a;

    /* renamed from: b */
    public final Map f14206b;

    public C1525YE(Map map) {
        this.f14206b = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    public static boolean m9240b(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final C1525YE m9241a(C9108dO1 c9108dO1) {
        byte[] bytes;
        Map map = this.f14206b;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList((ArrayList) c9108dO1.f26013c));
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            map2.remove(listUnmodifiableList.get(i));
        }
        HashMap map3 = new HashMap((HashMap) c9108dO1.f26012b);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(map3).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bytes = ((String) value2).getBytes(AbstractC7227yr.f46511c);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value2;
            }
            map2.put(str, bytes);
        }
        return m9240b(map, map2) ? this : new C1525YE(map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1525YE.class != obj.getClass()) {
            return false;
        }
        return m9240b(this.f14206b, ((C1525YE) obj).f14206b);
    }

    public final int hashCode() {
        if (this.f14205a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f14206b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f14205a = iHashCode;
        }
        return this.f14205a;
    }
}
