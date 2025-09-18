package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import java.util.List;

/* loaded from: classes2.dex */
public interface PolylineMapObject extends MapObject {
    Arrow addArrow(PolylinePosition polylinePosition, float f, int i);

    List<Arrow> arrows();

    float getArcApproximationStep();

    float getDashLength();

    float getDashOffset();

    float getGapLength();

    Polyline getGeometry();

    float getGradientLength();

    int getOutlineColor();

    float getOutlineWidth();

    int getPaletteColor(int i);

    int getStrokeColor(int i);

    float getStrokeWidth();

    float getTurnRadius();

    void hide(Subpolyline subpolyline);

    void hide(List<Subpolyline> list);

    boolean isInnerOutlineEnabled();

    void select(int i, Subpolyline subpolyline);

    void setArcApproximationStep(float f);

    void setDashLength(float f);

    void setDashOffset(float f);

    void setGapLength(float f);

    void setGeometry(Polyline polyline);

    void setGradientLength(float f);

    void setInnerOutlineEnabled(boolean z);

    void setOutlineColor(int i);

    void setOutlineWidth(float f);

    void setPaletteColor(int i, int i2);

    void setStrokeColor(int i);

    void setStrokeColors(List<Integer> list);

    void setStrokeColors(List<Integer> list, List<Double> list2);

    void setStrokeWidth(float f);

    void setTurnRadius(float f);
}
