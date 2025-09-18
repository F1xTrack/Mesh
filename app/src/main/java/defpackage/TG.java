package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Map;

/* loaded from: classes.dex */
public final class TG extends C1974Zb1 {
    public static final /* synthetic */ int A = 0;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final SparseArray y;
    public final SparseBooleanArray z;

    static {
        new TG(new SG());
        AbstractC0277Dh1.L(1000);
        AbstractC0277Dh1.L(1001);
        AbstractC0277Dh1.L(1002);
        AbstractC0277Dh1.L(1003);
        AbstractC0277Dh1.L(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        AbstractC8235ym.t(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 1006, 1007, 1008, 1009);
        AbstractC8235ym.t(1010, 1011, 1012, 1013, 1014);
        AbstractC0277Dh1.L(1015);
        AbstractC0277Dh1.L(1016);
        AbstractC0277Dh1.L(1017);
        AbstractC0277Dh1.L(1018);
    }

    public TG(SG sg) {
        super(sg);
        this.r = sg.r;
        this.s = sg.s;
        this.t = sg.t;
        this.u = sg.u;
        this.v = sg.v;
        this.w = sg.w;
        this.x = sg.x;
        this.y = sg.y;
        this.z = sg.z;
    }

    @Override // defpackage.C1974Zb1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TG.class != obj.getClass()) {
            return false;
        }
        TG tg = (TG) obj;
        if (super.equals(tg) && this.r == tg.r && this.s == tg.s && this.t == tg.t && this.u == tg.u && this.v == tg.v && this.w == tg.w && this.x == tg.x) {
            SparseBooleanArray sparseBooleanArray = this.z;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = tg.z;
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i >= size) {
                        SparseArray sparseArray = this.y;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = tg.y;
                        if (sparseArray2.size() == size2) {
                            for (int i2 = 0; i2 < size2; i2++) {
                                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (iIndexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i2);
                                    Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            C1350Rb1 c1350Rb1 = (C1350Rb1) entry.getKey();
                                            if (!map2.containsKey(c1350Rb1) || !AbstractC0277Dh1.a(entry.getValue(), map2.get(c1350Rb1))) {
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

    @Override // defpackage.C1974Zb1
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.r ? 1 : 0)) * 961) + (this.s ? 1 : 0)) * 961) + (this.t ? 1 : 0)) * 28629151) + (this.u ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 961) + (this.x ? 1 : 0)) * 31;
    }
}
