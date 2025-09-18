package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.map.Arrow;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes2.dex */
public class PolylineMapObjectBinding extends MapObjectBinding implements PolylineMapObject {
    public PolylineMapObjectBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native Arrow addArrow(PolylinePosition polylinePosition, float f, int i);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native List<Arrow> arrows();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getArcApproximationStep();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getDashLength();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getDashOffset();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getGapLength();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native Polyline getGeometry();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getGradientLength();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native int getOutlineColor();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getOutlineWidth();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native int getPaletteColor(int i);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native int getStrokeColor(int i);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getStrokeWidth();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getTurnRadius();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void hide(Subpolyline subpolyline);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void hide(List<Subpolyline> list);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native boolean isInnerOutlineEnabled();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void select(int i, Subpolyline subpolyline);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setArcApproximationStep(float f);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setDashLength(float f);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setDashOffset(float f);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setGapLength(float f);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setGeometry(Polyline polyline);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setGradientLength(float f);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setInnerOutlineEnabled(boolean z);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setOutlineColor(int i);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setOutlineWidth(float f);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setPaletteColor(int i, int i2);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setStrokeColor(int i);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setStrokeColors(List<Integer> list);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setStrokeColors(List<Integer> list, List<Double> list2);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setStrokeWidth(float f);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setTurnRadius(float f);
}
