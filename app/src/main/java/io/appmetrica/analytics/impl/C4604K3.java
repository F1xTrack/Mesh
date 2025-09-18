package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC11205tn0;
import p000.C6838sg;

/* renamed from: io.appmetrica.analytics.impl.K3 */
/* loaded from: classes2.dex */
public final class C4604K3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4700O3 fromModel(C4580J3 c4580j3) {
        C4700O3 c4700o3 = new C4700O3();
        c4700o3.f30545a = m19543a(c4580j3.f30330a);
        int size = c4580j3.f30331b.size();
        C4628L3[] c4628l3Arr = new C4628L3[size];
        for (int i = 0; i < size; i++) {
            c4628l3Arr[i] = m19543a((C4556I3) c4580j3.f30331b.get(i));
        }
        c4700o3.f30546b = c4628l3Arr;
        return c4700o3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4580J3 toModel(C4700O3 c4700o3) {
        C4628L3 c4628l3 = c4700o3.f30545a;
        if (c4628l3 == null) {
            c4628l3 = new C4628L3();
        }
        C4556I3 c4556i3M19542a = m19542a(c4628l3);
        C4628L3[] c4628l3Arr = c4700o3.f30546b;
        ArrayList arrayList = new ArrayList(c4628l3Arr.length);
        for (C4628L3 c4628l32 : c4628l3Arr) {
            arrayList.add(m19542a(c4628l32));
        }
        return new C4580J3(c4556i3M19542a, arrayList);
    }

    /* renamed from: a */
    public static C4628L3 m19543a(C4556I3 c4556i3) {
        C4676N3 c4676n3;
        C4628L3 c4628l3 = new C4628L3();
        Map map = c4556i3.f30267a;
        int i = 0;
        if (map != null) {
            c4676n3 = new C4676N3();
            int size = map.size();
            C4652M3[] c4652m3Arr = new C4652M3[size];
            for (int i2 = 0; i2 < size; i2++) {
                c4652m3Arr[i2] = new C4652M3();
            }
            c4676n3.f30502a = c4652m3Arr;
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C4652M3 c4652m3 = c4676n3.f30502a[i3];
                c4652m3.f30459a = str;
                c4652m3.f30460b = str2;
                i3++;
            }
        } else {
            c4676n3 = null;
        }
        c4628l3.f30416a = c4676n3;
        int iOrdinal = c4556i3.f30268b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i = 2;
                if (iOrdinal != 2) {
                    i = 3;
                    if (iOrdinal != 3) {
                        throw new C6838sg();
                    }
                }
            } else {
                i = 1;
            }
        }
        c4628l3.f30417b = i;
        return c4628l3;
    }

    /* renamed from: a */
    public static C4556I3 m19542a(C4628L3 c4628l3) {
        LinkedHashMap linkedHashMap;
        EnumC4728P7 enumC4728P7;
        C4676N3 c4676n3 = c4628l3.f30416a;
        if (c4676n3 != null) {
            C4652M3[] c4652m3Arr = c4676n3.f30502a;
            int iM24983b = AbstractC11205tn0.m24983b(c4652m3Arr.length);
            if (iM24983b < 16) {
                iM24983b = 16;
            }
            linkedHashMap = new LinkedHashMap(iM24983b);
            for (C4652M3 c4652m3 : c4652m3Arr) {
                linkedHashMap.put(c4652m3.f30459a, c4652m3.f30460b);
            }
        } else {
            linkedHashMap = null;
        }
        int i = c4628l3.f30417b;
        if (i == 0) {
            enumC4728P7 = EnumC4728P7.f30604b;
        } else if (i == 1) {
            enumC4728P7 = EnumC4728P7.f30605c;
        } else if (i == 2) {
            enumC4728P7 = EnumC4728P7.f30606d;
        } else if (i != 3) {
            enumC4728P7 = EnumC4728P7.f30604b;
        } else {
            enumC4728P7 = EnumC4728P7.f30607e;
        }
        return new C4556I3(linkedHashMap, enumC4728P7);
    }
}
