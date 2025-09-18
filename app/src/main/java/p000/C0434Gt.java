package p000;

import android.view.View;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.Cluster;
import com.yandex.mapkit.map.ClusterListener;
import com.yandex.mapkit.map.ClusterTapListener;
import com.yandex.mapkit.map.ClusterizedPlacemarkCollection;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.PlacemarkMapObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: Gt */
/* loaded from: classes2.dex */
public final class C0434Gt extends C7449Cp1 implements ClusterListener, ClusterTapListener {

    /* renamed from: l */
    public final ClusterizedPlacemarkCollection f3940l;

    /* renamed from: m */
    public int f3941m;

    /* renamed from: n */
    public final HashMap f3942n;

    /* renamed from: o */
    public ArrayList f3943o;

    public C0434Gt(S91 s91) {
        super(s91);
        ClusterizedPlacemarkCollection clusterizedPlacemarkCollectionAddClusterizedPlacemarkCollection = getMapWindow().getMap().getMapObjects().addClusterizedPlacemarkCollection(this);
        O90.m5967e(clusterizedPlacemarkCollectionAddClusterizedPlacemarkCollection, "addClusterizedPlacemarkCollection(...)");
        this.f3940l = clusterizedPlacemarkCollectionAddClusterizedPlacemarkCollection;
        this.f3942n = new HashMap();
        this.f3943o = new ArrayList();
    }

    @Override // p000.C7449Cp1
    /* renamed from: a */
    public final void mo1391a(View view) {
        C11338up1 c11338up1 = (C11338up1) view;
        HashMap map = this.f3942n;
        O90.m5965c(c11338up1);
        Point point = c11338up1.f43958a;
        O90.m5965c(point);
        double latitude = point.getLatitude();
        Point point2 = c11338up1.f43958a;
        O90.m5965c(point2);
        double longitude = point2.getLongitude();
        StringBuilder sb = new StringBuilder();
        sb.append(latitude);
        sb.append(longitude);
        PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) map.get(sb.toString());
        if (placemarkMapObject != null) {
            c11338up1.setRnMapObject(placemarkMapObject);
        }
    }

    @Override // p000.C7449Cp1
    /* renamed from: i */
    public final void mo1398i(int i) {
        if (getChildAt(i) instanceof C11338up1) {
            View childAt = getChildAt(i);
            O90.m5966d(childAt, "null cannot be cast to non-null type ru.vvdev.yamap.view.YamapMarker");
            C11338up1 c11338up1 = (C11338up1) childAt;
            MapObject rnMapObject = c11338up1.getRnMapObject();
            if (rnMapObject == null || !rnMapObject.isValid()) {
                return;
            }
            this.f3940l.remove(rnMapObject);
            HashMap map = this.f3942n;
            Point point = c11338up1.f43958a;
            O90.m5965c(point);
            double latitude = point.getLatitude();
            Point point2 = c11338up1.f43958a;
            O90.m5965c(point2);
            double longitude = point2.getLongitude();
            StringBuilder sb = new StringBuilder();
            sb.append(latitude);
            sb.append(longitude);
            map.remove(sb.toString());
        }
    }

    @Override // com.yandex.mapkit.map.ClusterListener
    public final void onClusterAdded(Cluster cluster) {
        O90.m5968f(cluster, "cluster");
        cluster.getAppearance().setIcon(new C0371Ft(this, String.valueOf(cluster.getSize())));
        cluster.addClusterTapListener(this);
    }

    @Override // com.yandex.mapkit.map.ClusterTapListener
    public final boolean onClusterTap(Cluster cluster) {
        O90.m5968f(cluster, "cluster");
        ArrayList arrayList = new ArrayList();
        Iterator<PlacemarkMapObject> it = cluster.getPlacemarks().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getGeometry());
        }
        m1397g(arrayList);
        return true;
    }

    public final void setClusteredMarkers(ArrayList<Object> arrayList) {
        O90.m5968f(arrayList, "points");
        ClusterizedPlacemarkCollection clusterizedPlacemarkCollection = this.f3940l;
        clusterizedPlacemarkCollection.clear();
        HashMap map = this.f3942n;
        map.clear();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            O90.m5966d(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Double>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Double> }");
            HashMap map2 = (HashMap) obj;
            Object obj2 = map2.get("lat");
            O90.m5965c(obj2);
            double dDoubleValue = ((Number) obj2).doubleValue();
            Object obj3 = map2.get("lon");
            O90.m5965c(obj3);
            arrayList2.add(new Point(dDoubleValue, ((Number) obj3).doubleValue()));
        }
        List<PlacemarkMapObject> listAddPlacemarks = clusterizedPlacemarkCollection.addPlacemarks(arrayList2, new C0371Ft(this, ""), new IconStyle());
        O90.m5967e(listAddPlacemarks, "addPlacemarks(...)");
        this.f3943o = arrayList2;
        int size2 = listAddPlacemarks.size();
        for (int i2 = 0; i2 < size2; i2++) {
            PlacemarkMapObject placemarkMapObject = listAddPlacemarks.get(i2);
            double latitude = placemarkMapObject.getGeometry().getLatitude();
            double longitude = placemarkMapObject.getGeometry().getLongitude();
            StringBuilder sb = new StringBuilder();
            sb.append(latitude);
            sb.append(longitude);
            map.put(sb.toString(), placemarkMapObject);
        }
        clusterizedPlacemarkCollection.clusterPlacemarks(50.0d, 12);
    }

    public final void setClustersColor(int i) {
        this.f3941m = i;
        ClusterizedPlacemarkCollection clusterizedPlacemarkCollection = this.f3940l;
        clusterizedPlacemarkCollection.clear();
        ArrayList arrayList = this.f3943o;
        List<PlacemarkMapObject> listAddPlacemarks = clusterizedPlacemarkCollection.addPlacemarks(arrayList, new C0371Ft(this, String.valueOf(arrayList.size())), new IconStyle());
        O90.m5967e(listAddPlacemarks, "addPlacemarks(...)");
        int size = listAddPlacemarks.size();
        for (int i2 = 0; i2 < size; i2++) {
            PlacemarkMapObject placemarkMapObject = listAddPlacemarks.get(i2);
            HashMap map = this.f3942n;
            double latitude = placemarkMapObject.getGeometry().getLatitude();
            double longitude = placemarkMapObject.getGeometry().getLongitude();
            StringBuilder sb = new StringBuilder();
            sb.append(latitude);
            sb.append(longitude);
            map.put(sb.toString(), placemarkMapObject);
            View childAt = getChildAt(i2);
            O90.m5967e(childAt, "getChildAt(...)");
            if (childAt instanceof C11338up1) {
                ((C11338up1) childAt).setRnMapObject(placemarkMapObject);
            }
        }
        clusterizedPlacemarkCollection.clusterPlacemarks(50.0d, 12);
    }
}
