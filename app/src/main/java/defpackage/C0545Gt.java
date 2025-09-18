package defpackage;

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

/* renamed from: Gt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0545Gt extends C0223Cp1 implements ClusterListener, ClusterTapListener {
    public final ClusterizedPlacemarkCollection l;
    public int m;
    public final HashMap n;
    public ArrayList o;

    public C0545Gt(S91 s91) {
        super(s91);
        ClusterizedPlacemarkCollection clusterizedPlacemarkCollectionAddClusterizedPlacemarkCollection = getMapWindow().getMap().getMapObjects().addClusterizedPlacemarkCollection(this);
        O90.e(clusterizedPlacemarkCollectionAddClusterizedPlacemarkCollection, "addClusterizedPlacemarkCollection(...)");
        this.l = clusterizedPlacemarkCollectionAddClusterizedPlacemarkCollection;
        this.n = new HashMap();
        this.o = new ArrayList();
    }

    @Override // defpackage.C0223Cp1
    public final void a(View view) {
        C7485up1 c7485up1 = (C7485up1) view;
        HashMap map = this.n;
        O90.c(c7485up1);
        Point point = c7485up1.a;
        O90.c(point);
        double latitude = point.getLatitude();
        Point point2 = c7485up1.a;
        O90.c(point2);
        double longitude = point2.getLongitude();
        StringBuilder sb = new StringBuilder();
        sb.append(latitude);
        sb.append(longitude);
        PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) map.get(sb.toString());
        if (placemarkMapObject != null) {
            c7485up1.setRnMapObject(placemarkMapObject);
        }
    }

    @Override // defpackage.C0223Cp1
    public final void i(int i) {
        if (getChildAt(i) instanceof C7485up1) {
            View childAt = getChildAt(i);
            O90.d(childAt, "null cannot be cast to non-null type ru.vvdev.yamap.view.YamapMarker");
            C7485up1 c7485up1 = (C7485up1) childAt;
            MapObject rnMapObject = c7485up1.getRnMapObject();
            if (rnMapObject == null || !rnMapObject.isValid()) {
                return;
            }
            this.l.remove(rnMapObject);
            HashMap map = this.n;
            Point point = c7485up1.a;
            O90.c(point);
            double latitude = point.getLatitude();
            Point point2 = c7485up1.a;
            O90.c(point2);
            double longitude = point2.getLongitude();
            StringBuilder sb = new StringBuilder();
            sb.append(latitude);
            sb.append(longitude);
            map.remove(sb.toString());
        }
    }

    @Override // com.yandex.mapkit.map.ClusterListener
    public final void onClusterAdded(Cluster cluster) {
        O90.f(cluster, "cluster");
        cluster.getAppearance().setIcon(new C0467Ft(this, String.valueOf(cluster.getSize())));
        cluster.addClusterTapListener(this);
    }

    @Override // com.yandex.mapkit.map.ClusterTapListener
    public final boolean onClusterTap(Cluster cluster) {
        O90.f(cluster, "cluster");
        ArrayList arrayList = new ArrayList();
        Iterator<PlacemarkMapObject> it = cluster.getPlacemarks().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getGeometry());
        }
        g(arrayList);
        return true;
    }

    public final void setClusteredMarkers(ArrayList<Object> arrayList) {
        O90.f(arrayList, "points");
        ClusterizedPlacemarkCollection clusterizedPlacemarkCollection = this.l;
        clusterizedPlacemarkCollection.clear();
        HashMap map = this.n;
        map.clear();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            O90.d(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Double>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Double> }");
            HashMap map2 = (HashMap) obj;
            Object obj2 = map2.get("lat");
            O90.c(obj2);
            double dDoubleValue = ((Number) obj2).doubleValue();
            Object obj3 = map2.get("lon");
            O90.c(obj3);
            arrayList2.add(new Point(dDoubleValue, ((Number) obj3).doubleValue()));
        }
        List<PlacemarkMapObject> listAddPlacemarks = clusterizedPlacemarkCollection.addPlacemarks(arrayList2, new C0467Ft(this, ""), new IconStyle());
        O90.e(listAddPlacemarks, "addPlacemarks(...)");
        this.o = arrayList2;
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
        this.m = i;
        ClusterizedPlacemarkCollection clusterizedPlacemarkCollection = this.l;
        clusterizedPlacemarkCollection.clear();
        ArrayList arrayList = this.o;
        List<PlacemarkMapObject> listAddPlacemarks = clusterizedPlacemarkCollection.addPlacemarks(arrayList, new C0467Ft(this, String.valueOf(arrayList.size())), new IconStyle());
        O90.e(listAddPlacemarks, "addPlacemarks(...)");
        int size = listAddPlacemarks.size();
        for (int i2 = 0; i2 < size; i2++) {
            PlacemarkMapObject placemarkMapObject = listAddPlacemarks.get(i2);
            HashMap map = this.n;
            double latitude = placemarkMapObject.getGeometry().getLatitude();
            double longitude = placemarkMapObject.getGeometry().getLongitude();
            StringBuilder sb = new StringBuilder();
            sb.append(latitude);
            sb.append(longitude);
            map.put(sb.toString(), placemarkMapObject);
            View childAt = getChildAt(i2);
            O90.e(childAt, "getChildAt(...)");
            if (childAt instanceof C7485up1) {
                ((C7485up1) childAt).setRnMapObject(placemarkMapObject);
            }
        }
        clusterizedPlacemarkCollection.clusterPlacemarks(50.0d, 12);
    }
}
