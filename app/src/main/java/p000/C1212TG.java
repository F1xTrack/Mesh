package p000;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Map;

/* renamed from: TG */
/* loaded from: classes.dex */
public final class C1212TG extends C8617Zb1 {

    /* renamed from: A */
    public static final /* synthetic */ int f11262A = 0;

    /* renamed from: r */
    public final boolean f11263r;

    /* renamed from: s */
    public final boolean f11264s;

    /* renamed from: t */
    public final boolean f11265t;

    /* renamed from: u */
    public final boolean f11266u;

    /* renamed from: v */
    public final boolean f11267v;

    /* renamed from: w */
    public final boolean f11268w;

    /* renamed from: x */
    public final boolean f11269x;

    /* renamed from: y */
    public final SparseArray f11270y;

    /* renamed from: z */
    public final SparseBooleanArray f11271z;

    static {
        new C1212TG(new C1149SG());
        AbstractC7485Dh1.m1797L(1000);
        AbstractC7485Dh1.m1797L(1001);
        AbstractC7485Dh1.m1797L(1002);
        AbstractC7485Dh1.m1797L(1003);
        AbstractC7485Dh1.m1797L(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        AbstractC7222ym.m26243t(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 1006, 1007, 1008, 1009);
        AbstractC7222ym.m26243t(1010, 1011, 1012, 1013, 1014);
        AbstractC7485Dh1.m1797L(1015);
        AbstractC7485Dh1.m1797L(1016);
        AbstractC7485Dh1.m1797L(1017);
        AbstractC7485Dh1.m1797L(1018);
    }

    public C1212TG(C1149SG c1149sg) {
        super(c1149sg);
        this.f11263r = c1149sg.f10660r;
        this.f11264s = c1149sg.f10661s;
        this.f11265t = c1149sg.f10662t;
        this.f11266u = c1149sg.f10663u;
        this.f11267v = c1149sg.f10664v;
        this.f11268w = c1149sg.f10665w;
        this.f11269x = c1149sg.f10666x;
        this.f11270y = c1149sg.f10667y;
        this.f11271z = c1149sg.f10668z;
    }

    @Override // p000.C8617Zb1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1212TG.class != obj.getClass()) {
            return false;
        }
        C1212TG c1212tg = (C1212TG) obj;
        if (super.equals(c1212tg) && this.f11263r == c1212tg.f11263r && this.f11264s == c1212tg.f11264s && this.f11265t == c1212tg.f11265t && this.f11266u == c1212tg.f11266u && this.f11267v == c1212tg.f11267v && this.f11268w == c1212tg.f11268w && this.f11269x == c1212tg.f11269x) {
            SparseBooleanArray sparseBooleanArray = this.f11271z;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = c1212tg.f11271z;
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i >= size) {
                        SparseArray sparseArray = this.f11270y;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = c1212tg.f11270y;
                        if (sparseArray2.size() == size2) {
                            for (int i2 = 0; i2 < size2; i2++) {
                                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (iIndexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i2);
                                    Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            C8201Rb1 c8201Rb1 = (C8201Rb1) entry.getKey();
                                            if (!map2.containsKey(c8201Rb1) || !AbstractC7485Dh1.m1812a(entry.getValue(), map2.get(c8201Rb1))) {
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    } else {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.C8617Zb1
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f11263r ? 1 : 0)) * 961) + (this.f11264s ? 1 : 0)) * 961) + (this.f11265t ? 1 : 0)) * 28629151) + (this.f11266u ? 1 : 0)) * 31) + (this.f11267v ? 1 : 0)) * 31) + (this.f11268w ? 1 : 0)) * 961) + (this.f11269x ? 1 : 0)) * 31;
    }
}
