package com.horcrux.svg;

import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.VirtualViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import p000.AI0;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.AbstractC11153tN0;
import p000.AbstractC3929dS;
import p000.AbstractC6620pU;
import p000.AbstractC7222ym;
import p000.B91;
import p000.BI0;
import p000.C0596JS;
import p000.C0659KS;
import p000.C0721LS;
import p000.C0784MS;
import p000.C0847NS;
import p000.C10779qS0;
import p000.C11383vA0;
import p000.C11780yI0;
import p000.C11931zU0;
import p000.C6340l4;
import p000.C6876tH;
import p000.C91;
import p000.DI0;
import p000.EI0;
import p000.EnumC6683qU;
import p000.EnumC6746rU;
import p000.EnumC6826sU;
import p000.EnumC6889tU;
import p000.FI0;
import p000.GI0;
import p000.GM1;
import p000.HI0;
import p000.InterfaceC10119lI0;
import p000.InterfaceC10247mI0;
import p000.InterfaceC10375nI0;
import p000.InterfaceC10503oI0;
import p000.InterfaceC10631pI0;
import p000.InterfaceC10759qI0;
import p000.InterfaceC10887rI0;
import p000.InterfaceC11015sI0;
import p000.InterfaceC11143tI0;
import p000.InterfaceC11271uI0;
import p000.InterfaceC11399vI0;
import p000.InterfaceC11526wI0;
import p000.InterfaceC11653xI0;
import p000.InterfaceC11907zI0;
import p000.InterfaceC9871jM0;
import p000.InterfaceC9991kI0;
import p000.JI0;
import p000.KI0;
import p000.LI0;
import p000.MI0;
import p000.NI0;
import p000.YQ0;

/* loaded from: classes.dex */
class RenderableViewManager<T extends RenderableView> extends VirtualViewManager<T> {

    public static class CircleViewManager extends RenderableViewManager<C1985a> implements InterfaceC9991kI0 {
        public static final String REACT_CLASS = "RNSVGCircle";

        public CircleViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGCircle);
            this.mDelegate = new C6340l4(this, 16);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((CircleViewManager) view, str);
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((CircleViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((CircleViewManager) view, num);
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((CircleViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((CircleViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((CircleViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((CircleViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((CircleViewManager) view, str);
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((CircleViewManager) view, str);
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((CircleViewManager) view, str);
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((CircleViewManager) view, str);
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((CircleViewManager) view, str);
        }

        @Override // p000.InterfaceC9991kI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((CircleViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((CircleViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((CircleViewManager) view, f);
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((CircleViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((CircleViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((CircleViewManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((CircleViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((CircleViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((CircleViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((CircleViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((CircleViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((CircleViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((CircleViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((CircleViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((CircleViewManager) view, i);
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "cx")
        public void setCx(C1985a c1985a, Dynamic dynamic) {
            c1985a.getClass();
            c1985a.f18581a = C11931zU0.m26443b(dynamic);
            c1985a.invalidate();
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "cy")
        public void setCy(C1985a c1985a, Dynamic dynamic) {
            c1985a.getClass();
            c1985a.f18582b = C11931zU0.m26443b(dynamic);
            c1985a.invalidate();
        }

        @Override // p000.InterfaceC9991kI0
        @InterfaceC9871jM0(name = "r")
        public void setR(C1985a c1985a, Dynamic dynamic) {
            c1985a.getClass();
            c1985a.f18583c = C11931zU0.m26443b(dynamic);
            c1985a.invalidate();
        }
    }

    public static class ClipPathViewManager extends GroupViewManagerAbstract<C1987b> implements InterfaceC10119lI0 {
        public static final String REACT_CLASS = "RNSVGClipPath";

        public ClipPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGClipPath);
            this.mDelegate = new C6340l4(this, 17);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((ClipPathViewManager) view, str);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((ClipPathViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((ClipPathViewManager) view, num);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((ClipPathViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((ClipPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((ClipPathViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((ClipPathViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((ClipPathViewManager) view, str);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((ClipPathViewManager) view, dynamic);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((ClipPathViewManager) view, dynamic);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((ClipPathViewManager) view, dynamic);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((ClipPathViewManager) view, str);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((ClipPathViewManager) view, str);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((ClipPathViewManager) view, str);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((ClipPathViewManager) view, str);
        }

        @Override // p000.InterfaceC10119lI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((ClipPathViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((ClipPathViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((ClipPathViewManager) view, f);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((ClipPathViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((ClipPathViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((ClipPathViewManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((ClipPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((ClipPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((ClipPathViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((ClipPathViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((ClipPathViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((ClipPathViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((ClipPathViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((ClipPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10119lI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((ClipPathViewManager) view, i);
        }
    }

    public static class DefsViewManager extends VirtualViewManager<C6876tH> implements InterfaceC10247mI0 {
        public static final String REACT_CLASS = "RNSVGDefs";

        public DefsViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGDefs);
            this.mDelegate = new C6340l4(this, 18);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC10247mI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((DefsViewManager) view, str);
        }

        @Override // p000.InterfaceC10247mI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((DefsViewManager) view, i);
        }

        @Override // p000.InterfaceC10247mI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((DefsViewManager) view, str);
        }

        @Override // p000.InterfaceC10247mI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((DefsViewManager) view, str);
        }

        @Override // p000.InterfaceC10247mI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((DefsViewManager) view, str);
        }

        @Override // p000.InterfaceC10247mI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((DefsViewManager) view, str);
        }

        @Override // p000.InterfaceC10247mI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((DefsViewManager) view, str);
        }

        @Override // p000.InterfaceC10247mI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((DefsViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC10247mI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((DefsViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((DefsViewManager) view, f);
        }

        @Override // p000.InterfaceC10247mI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((DefsViewManager) view, str);
        }

        @Override // p000.InterfaceC10247mI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((DefsViewManager) view, z);
        }
    }

    public static class EllipseViewManager extends RenderableViewManager<C1989c> implements InterfaceC10375nI0 {
        public static final String REACT_CLASS = "RNSVGEllipse";

        public EllipseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGEllipse);
            this.mDelegate = new C6340l4(this, 19);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((EllipseViewManager) view, str);
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((EllipseViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((EllipseViewManager) view, num);
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((EllipseViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((EllipseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((EllipseViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((EllipseViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((EllipseViewManager) view, str);
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((EllipseViewManager) view, str);
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((EllipseViewManager) view, str);
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((EllipseViewManager) view, str);
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((EllipseViewManager) view, str);
        }

        @Override // p000.InterfaceC10375nI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((EllipseViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((EllipseViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((EllipseViewManager) view, f);
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((EllipseViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((EllipseViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((EllipseViewManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((EllipseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((EllipseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((EllipseViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((EllipseViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((EllipseViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((EllipseViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((EllipseViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((EllipseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((EllipseViewManager) view, i);
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "cx")
        public void setCx(C1989c c1989c, Dynamic dynamic) {
            c1989c.getClass();
            c1989c.f18586a = C11931zU0.m26443b(dynamic);
            c1989c.invalidate();
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "cy")
        public void setCy(C1989c c1989c, Dynamic dynamic) {
            c1989c.getClass();
            c1989c.f18587b = C11931zU0.m26443b(dynamic);
            c1989c.invalidate();
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "rx")
        public void setRx(C1989c c1989c, Dynamic dynamic) {
            c1989c.getClass();
            c1989c.f18588c = C11931zU0.m26443b(dynamic);
            c1989c.invalidate();
        }

        @Override // p000.InterfaceC10375nI0
        @InterfaceC9871jM0(name = "ry")
        public void setRy(C1989c c1989c, Dynamic dynamic) {
            c1989c.getClass();
            c1989c.f18589d = C11931zU0.m26443b(dynamic);
            c1989c.invalidate();
        }
    }

    public static class FeBlendManager extends FilterPrimitiveManager<C0596JS> implements InterfaceC10503oI0 {
        public static final String REACT_CLASS = "RNSVGFeBlend";

        public FeBlendManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeBlend);
            this.mDelegate = new C6340l4(this, 20);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC10503oI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FeBlendManager) view, dynamic);
        }

        @Override // p000.InterfaceC10503oI0
        @InterfaceC9871jM0(name = "in1")
        public void setIn1(C0596JS c0596js, String str) {
            c0596js.f5521c = str;
            c0596js.invalidate();
        }

        @Override // p000.InterfaceC10503oI0
        @InterfaceC9871jM0(name = "in2")
        public void setIn2(C0596JS c0596js, String str) {
            c0596js.f5522d = str;
            c0596js.invalidate();
        }

        @Override // p000.InterfaceC10503oI0
        @InterfaceC9871jM0(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FeBlendManager) view, str);
        }

        @Override // p000.InterfaceC10503oI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FeBlendManager) view, dynamic);
        }

        @Override // p000.InterfaceC10503oI0
        @InterfaceC9871jM0(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FeBlendManager) view, dynamic);
        }

        @Override // p000.InterfaceC10503oI0
        @InterfaceC9871jM0(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FeBlendManager) view, dynamic);
        }

        @Override // p000.InterfaceC10503oI0
        @InterfaceC9871jM0(name = "mode")
        public void setMode(C0596JS c0596js, String str) {
            c0596js.getClass();
            HashMap map = EnumC6746rU.f41682c;
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException(AbstractC7222ym.m26245v("Unknown String Value: ", str));
            }
            c0596js.f5523e = (EnumC6746rU) map.get(str);
            c0596js.invalidate();
        }
    }

    public static class FeColorMatrixManager extends FilterPrimitiveManager<C0659KS> implements InterfaceC10631pI0 {
        public static final String REACT_CLASS = "RNSVGFeColorMatrix";

        public FeColorMatrixManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeColorMatrix);
            this.mDelegate = new C6340l4(this, 21);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC10631pI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FeColorMatrixManager) view, dynamic);
        }

        @Override // p000.InterfaceC10631pI0
        @InterfaceC9871jM0(name = "in1")
        public void setIn1(C0659KS c0659ks, String str) {
            c0659ks.f6112c = str;
            c0659ks.invalidate();
        }

        @Override // p000.InterfaceC10631pI0
        @InterfaceC9871jM0(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FeColorMatrixManager) view, str);
        }

        @Override // p000.InterfaceC10631pI0
        @InterfaceC9871jM0(name = "values")
        public void setValues(C0659KS c0659ks, ReadableArray readableArray) {
            c0659ks.f6114e = readableArray;
            c0659ks.invalidate();
        }

        @Override // p000.InterfaceC10631pI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FeColorMatrixManager) view, dynamic);
        }

        @Override // p000.InterfaceC10631pI0
        @InterfaceC9871jM0(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FeColorMatrixManager) view, dynamic);
        }

        @Override // p000.InterfaceC10631pI0
        @InterfaceC9871jM0(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FeColorMatrixManager) view, dynamic);
        }

        @Override // p000.InterfaceC10631pI0
        @InterfaceC9871jM0(name = "type")
        public void setType(C0659KS c0659ks, String str) {
            c0659ks.getClass();
            HashMap map = EnumC6826sU.f42454b;
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException(AbstractC7222ym.m26245v("Unknown String Value: ", str));
            }
            c0659ks.f6113d = (EnumC6826sU) map.get(str);
            c0659ks.invalidate();
        }
    }

    public static class FeFloodManager extends FilterPrimitiveManager<C1990d> implements InterfaceC10759qI0 {
        public static final String REACT_CLASS = "RNSVGFeFlood";

        public FeFloodManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeFlood);
            this.mDelegate = new C6340l4(this, 22);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC10759qI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "floodOpacity")
        public void setFloodOpacity(C1990d c1990d, float f) {
            c1990d.f18592d = f;
            c1990d.invalidate();
        }

        @Override // p000.InterfaceC10759qI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FeFloodManager) view, dynamic);
        }

        @Override // p000.InterfaceC10759qI0
        @InterfaceC9871jM0(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FeFloodManager) view, str);
        }

        @Override // p000.InterfaceC10759qI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FeFloodManager) view, dynamic);
        }

        @Override // p000.InterfaceC10759qI0
        @InterfaceC9871jM0(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FeFloodManager) view, dynamic);
        }

        @Override // p000.InterfaceC10759qI0
        @InterfaceC9871jM0(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FeFloodManager) view, dynamic);
        }

        @Override // p000.InterfaceC10759qI0
        @InterfaceC9871jM0(name = "floodColor")
        public void setFloodColor(C1990d c1990d, Dynamic dynamic) throws NumberFormatException {
            int i = 0;
            if (dynamic != null) {
                c1990d.getClass();
                if (!dynamic.isNull()) {
                    if (dynamic.getType().equals(ReadableType.Map)) {
                        c1990d.m11364n(dynamic.asMap());
                        return;
                    }
                    ReadableType type = dynamic.getType();
                    if (type.equals(ReadableType.Number)) {
                        c1990d.f18591c = JavaOnlyArray.m10961of(0, Integer.valueOf(dynamic.asInt()));
                    } else if (type.equals(ReadableType.Array)) {
                        c1990d.f18591c = dynamic.asArray();
                    } else {
                        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                        javaOnlyArray.pushInt(0);
                        Matcher matcher = C1990d.f18590e.matcher(dynamic.asString());
                        while (matcher.find()) {
                            double d = Double.parseDouble(matcher.group());
                            int i2 = i + 1;
                            if (i < 3) {
                                d /= 255.0d;
                            }
                            javaOnlyArray.pushDouble(d);
                            i = i2;
                        }
                        c1990d.f18591c = javaOnlyArray;
                    }
                    c1990d.invalidate();
                    return;
                }
            }
            c1990d.f18591c = null;
            c1990d.invalidate();
        }

        public void setFloodColor(C1990d c1990d, ReadableMap readableMap) {
            c1990d.m11364n(readableMap);
        }
    }

    public static class FeGaussianBlurManager extends FilterPrimitiveManager<C0721LS> implements InterfaceC10887rI0 {
        public static final String REACT_CLASS = "RNSVGFeGaussianBlur";

        public FeGaussianBlurManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeGaussianBlur);
            this.mDelegate = new C6340l4(this, 23);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC10887rI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FeGaussianBlurManager) view, dynamic);
        }

        @Override // p000.InterfaceC10887rI0
        @InterfaceC9871jM0(name = "in1")
        public void setIn1(C0721LS c0721ls, String str) {
            c0721ls.f6631c = str;
            c0721ls.invalidate();
        }

        @Override // p000.InterfaceC10887rI0
        @InterfaceC9871jM0(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FeGaussianBlurManager) view, str);
        }

        @Override // p000.InterfaceC10887rI0
        @InterfaceC9871jM0(name = "stdDeviationX")
        public void setStdDeviationX(C0721LS c0721ls, float f) {
            c0721ls.f6632d = f;
            c0721ls.invalidate();
        }

        @Override // p000.InterfaceC10887rI0
        @InterfaceC9871jM0(name = "stdDeviationY")
        public void setStdDeviationY(C0721LS c0721ls, float f) {
            c0721ls.f6633e = f;
            c0721ls.invalidate();
        }

        @Override // p000.InterfaceC10887rI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FeGaussianBlurManager) view, dynamic);
        }

        @Override // p000.InterfaceC10887rI0
        @InterfaceC9871jM0(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FeGaussianBlurManager) view, dynamic);
        }

        @Override // p000.InterfaceC10887rI0
        @InterfaceC9871jM0(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FeGaussianBlurManager) view, dynamic);
        }

        @Override // p000.InterfaceC10887rI0
        @InterfaceC9871jM0(name = "values")
        public void setEdgeMode(C0721LS c0721ls, String str) {
            c0721ls.getClass();
            HashMap map = EnumC6683qU.f40891b;
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException(AbstractC7222ym.m26245v("Unknown 'edgeMode' Value: ", str));
            }
            c0721ls.invalidate();
        }
    }

    public static class FeMergeManager extends FilterPrimitiveManager<C0784MS> implements InterfaceC11015sI0 {
        public static final String REACT_CLASS = "RNSVGFeMerge";

        public FeMergeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeMerge);
            this.mDelegate = new C6340l4(this, 24);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC11015sI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FeMergeManager) view, dynamic);
        }

        @Override // p000.InterfaceC11015sI0
        @InterfaceC9871jM0(name = "nodes")
        public void setNodes(C0784MS c0784ms, ReadableArray readableArray) {
            c0784ms.f7169c = readableArray;
            c0784ms.invalidate();
        }

        @Override // p000.InterfaceC11015sI0
        @InterfaceC9871jM0(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FeMergeManager) view, str);
        }

        @Override // p000.InterfaceC11015sI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FeMergeManager) view, dynamic);
        }

        @Override // p000.InterfaceC11015sI0
        @InterfaceC9871jM0(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FeMergeManager) view, dynamic);
        }

        @Override // p000.InterfaceC11015sI0
        @InterfaceC9871jM0(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FeMergeManager) view, dynamic);
        }
    }

    public static class FeOffsetManager extends FilterPrimitiveManager<C0847NS> implements InterfaceC11143tI0 {
        public static final String REACT_CLASS = "RNSVGFeOffset";

        public FeOffsetManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeOffset);
            this.mDelegate = new C6340l4(this, 25);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC11143tI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FeOffsetManager) view, dynamic);
        }

        @Override // p000.InterfaceC11143tI0
        @InterfaceC9871jM0(name = "in1")
        public void setIn1(C0847NS c0847ns, String str) {
            c0847ns.f7789c = str;
            c0847ns.invalidate();
        }

        @Override // p000.InterfaceC11143tI0
        @InterfaceC9871jM0(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FeOffsetManager) view, str);
        }

        @Override // p000.InterfaceC11143tI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FeOffsetManager) view, dynamic);
        }

        @Override // p000.InterfaceC11143tI0
        @InterfaceC9871jM0(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FeOffsetManager) view, dynamic);
        }

        @Override // p000.InterfaceC11143tI0
        @InterfaceC9871jM0(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FeOffsetManager) view, dynamic);
        }

        @Override // p000.InterfaceC11143tI0
        @InterfaceC9871jM0(name = "dx")
        public void setDx(C0847NS c0847ns, Dynamic dynamic) {
            c0847ns.getClass();
            c0847ns.f7790d = C11931zU0.m26443b(dynamic);
            c0847ns.invalidate();
        }

        @Override // p000.InterfaceC11143tI0
        @InterfaceC9871jM0(name = "dy")
        public void setDy(C0847NS c0847ns, Dynamic dynamic) {
            c0847ns.getClass();
            c0847ns.f7791e = C11931zU0.m26443b(dynamic);
            c0847ns.invalidate();
        }
    }

    public static class FilterManager extends VirtualViewManager<C1991e> implements InterfaceC11271uI0 {
        public static final String REACT_CLASS = "RNSVGFilter";

        public FilterManager() {
            super(VirtualViewManager.SVGClass.RNSVGFilter);
            this.mDelegate = new C6340l4(this, 26);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC11271uI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public void setHeight(C1991e c1991e, Dynamic dynamic) {
            c1991e.f18596d.setHeight(dynamic);
            c1991e.invalidate();
        }

        @Override // p000.InterfaceC11271uI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((FilterManager) view, str);
        }

        @Override // p000.InterfaceC11271uI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public void setWidth(C1991e c1991e, Dynamic dynamic) {
            c1991e.f18596d.setWidth(dynamic);
            c1991e.invalidate();
        }

        @Override // p000.InterfaceC11271uI0
        @InterfaceC9871jM0(name = "x")
        public void setX(C1991e c1991e, Dynamic dynamic) {
            c1991e.f18596d.setX(dynamic);
            c1991e.invalidate();
        }

        @Override // p000.InterfaceC11271uI0
        @InterfaceC9871jM0(name = "y")
        public void setY(C1991e c1991e, Dynamic dynamic) {
            c1991e.f18596d.setY(dynamic);
            c1991e.invalidate();
        }

        @Override // p000.InterfaceC11271uI0
        @InterfaceC9871jM0(name = "filterUnits")
        public void setFilterUnits(C1991e c1991e, String str) {
            c1991e.getClass();
            c1991e.f18594b = EnumC6889tU.m24936a(str);
            c1991e.invalidate();
        }

        @Override // p000.InterfaceC11271uI0
        @InterfaceC9871jM0(name = "primitiveUnits")
        public void setPrimitiveUnits(C1991e c1991e, String str) {
            c1991e.getClass();
            c1991e.f18595c = EnumC6889tU.m24936a(str);
            c1991e.invalidate();
        }
    }

    public static class FilterPrimitiveManager<T extends AbstractC6620pU> extends VirtualViewManager<T> {
        public FilterPrimitiveManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public void setHeight(T t, Dynamic dynamic) {
            t.f40112b.setHeight(dynamic);
            t.invalidate();
        }

        @InterfaceC9871jM0(name = "result")
        public void setResult(T t, String str) {
            t.f40111a = str;
            t.invalidate();
        }

        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public void setWidth(T t, Dynamic dynamic) {
            t.f40112b.setWidth(dynamic);
            t.invalidate();
        }

        @InterfaceC9871jM0(name = "x")
        public void setX(T t, Dynamic dynamic) {
            t.f40112b.setX(dynamic);
            t.invalidate();
        }

        @InterfaceC9871jM0(name = "y")
        public void setY(T t, Dynamic dynamic) {
            t.f40112b.setY(dynamic);
            t.invalidate();
        }
    }

    public static class ForeignObjectManager extends GroupViewManagerAbstract<C1992f> implements InterfaceC11399vI0 {
        public static final String REACT_CLASS = "RNSVGForeignObject";

        public ForeignObjectManager() {
            super(VirtualViewManager.SVGClass.RNSVGForeignObject);
            this.mDelegate = new C6340l4(this, 27);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((ForeignObjectManager) view, str);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((ForeignObjectManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((ForeignObjectManager) view, num);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((ForeignObjectManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((ForeignObjectManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((ForeignObjectManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((ForeignObjectManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((ForeignObjectManager) view, str);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((ForeignObjectManager) view, dynamic);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((ForeignObjectManager) view, dynamic);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((ForeignObjectManager) view, dynamic);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((ForeignObjectManager) view, str);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((ForeignObjectManager) view, str);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((ForeignObjectManager) view, str);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((ForeignObjectManager) view, str);
        }

        @Override // p000.InterfaceC11399vI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((ForeignObjectManager) view, readableArray);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((ForeignObjectManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((ForeignObjectManager) view, f);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((ForeignObjectManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((ForeignObjectManager) view, readableArray);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((ForeignObjectManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((ForeignObjectManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((ForeignObjectManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((ForeignObjectManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((ForeignObjectManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((ForeignObjectManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((ForeignObjectManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((ForeignObjectManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((ForeignObjectManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((ForeignObjectManager) view, i);
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public void setHeight(C1992f c1992f, Dynamic dynamic) {
            c1992f.getClass();
            c1992f.f18600i = C11931zU0.m26443b(dynamic);
            c1992f.invalidate();
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public void setWidth(C1992f c1992f, Dynamic dynamic) {
            c1992f.getClass();
            c1992f.f18599h = C11931zU0.m26443b(dynamic);
            c1992f.invalidate();
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "x")
        public void setX(C1992f c1992f, Dynamic dynamic) {
            c1992f.getClass();
            c1992f.f18597f = C11931zU0.m26443b(dynamic);
            c1992f.invalidate();
        }

        @Override // p000.InterfaceC11399vI0
        @InterfaceC9871jM0(name = "y")
        public void setY(C1992f c1992f, Dynamic dynamic) {
            c1992f.getClass();
            c1992f.f18598g = C11931zU0.m26443b(dynamic);
            c1992f.invalidate();
        }
    }

    public static class GroupViewManager extends GroupViewManagerAbstract<C1993g> implements InterfaceC11526wI0 {
        public static final String REACT_CLASS = "RNSVGGroup";

        public GroupViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGGroup);
            this.mDelegate = new C6340l4(this, 28);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((GroupViewManager) view, str);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((GroupViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((GroupViewManager) view, num);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((GroupViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((GroupViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((GroupViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((GroupViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((GroupViewManager) view, str);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((GroupViewManager) view, dynamic);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((GroupViewManager) view, dynamic);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((GroupViewManager) view, dynamic);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((GroupViewManager) view, str);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((GroupViewManager) view, str);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((GroupViewManager) view, str);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((GroupViewManager) view, str);
        }

        @Override // p000.InterfaceC11526wI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((GroupViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((GroupViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((GroupViewManager) view, f);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((GroupViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((GroupViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((GroupViewManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((GroupViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((GroupViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((GroupViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((GroupViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((GroupViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((GroupViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((GroupViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((GroupViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11526wI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((GroupViewManager) view, i);
        }
    }

    public static class GroupViewManagerAbstract<U extends C1993g> extends RenderableViewManager<U> {
        public GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @InterfaceC9871jM0(name = "font")
        public void setFont(U u, Dynamic dynamic) {
            u.getClass();
            if (dynamic.getType() == ReadableType.Map) {
                u.f18602a = dynamic.asMap();
            } else {
                u.f18602a = null;
            }
            u.invalidate();
        }

        @InterfaceC9871jM0(name = "fontSize")
        public void setFontSize(U u, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = YQ0.f14297a[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble("fontSize", dynamic.asDouble());
            } else if (i != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontSize", dynamic.asString());
            }
            u.f18602a = javaOnlyMap;
            u.invalidate();
        }

        @InterfaceC9871jM0(name = "fontWeight")
        public void setFontWeight(U u, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = YQ0.f14297a[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble("fontWeight", dynamic.asDouble());
            } else if (i != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontWeight", dynamic.asString());
            }
            u.f18602a = javaOnlyMap;
            u.invalidate();
        }
    }

    public static class ImageViewManager extends RenderableViewManager<C1995i> implements InterfaceC11653xI0 {
        public static final String REACT_CLASS = "RNSVGImage";

        public ImageViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGImage);
            this.mDelegate = new C6340l4(this, 29);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            HashMap map = new HashMap();
            map.put(SvgLoadEvent.EVENT_NAME, AbstractC10889rJ0.m24256c("registrationName", "onLoad"));
            return map;
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "align")
        public void setAlign(C1995i c1995i, String str) {
            c1995i.f18615h = str;
            c1995i.invalidate();
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((ImageViewManager) view, str);
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((ImageViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((ImageViewManager) view, num);
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((ImageViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((ImageViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((ImageViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((ImageViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((ImageViewManager) view, str);
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((ImageViewManager) view, str);
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((ImageViewManager) view, str);
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((ImageViewManager) view, str);
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((ImageViewManager) view, str);
        }

        @Override // p000.InterfaceC11653xI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((ImageViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "meetOrSlice")
        public void setMeetOrSlice(C1995i c1995i, int i) {
            c1995i.f18616i = i;
            c1995i.invalidate();
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((ImageViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((ImageViewManager) view, f);
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((ImageViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((ImageViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((ImageViewManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((ImageViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((ImageViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((ImageViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((ImageViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((ImageViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((ImageViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((ImageViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((ImageViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((ImageViewManager) view, i);
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public void setHeight(C1995i c1995i, Dynamic dynamic) {
            c1995i.getClass();
            c1995i.f18611d = C11931zU0.m26443b(dynamic);
            c1995i.invalidate();
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(customType = "ImageSource", name = "src")
        public void setSrc(C1995i c1995i, ReadableMap readableMap) {
            c1995i.getClass();
            if (readableMap != null) {
                String string = readableMap.getString("uri");
                c1995i.f18612e = string;
                if (string == null || string.isEmpty()) {
                    return;
                }
                if (readableMap.hasKey(Snapshot.WIDTH) && readableMap.hasKey(Snapshot.HEIGHT)) {
                    c1995i.f18613f = readableMap.getInt(Snapshot.WIDTH);
                    c1995i.f18614g = readableMap.getInt(Snapshot.HEIGHT);
                } else {
                    c1995i.f18613f = 0;
                    c1995i.f18614g = 0;
                }
                if (Uri.parse(c1995i.f18612e).getScheme() == null) {
                    C10779qS0.f40878b.m24001c(c1995i.mContext, c1995i.f18612e);
                }
            }
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public void setWidth(C1995i c1995i, Dynamic dynamic) {
            c1995i.getClass();
            c1995i.f18610c = C11931zU0.m26443b(dynamic);
            c1995i.invalidate();
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "x")
        public void setX(C1995i c1995i, Dynamic dynamic) {
            c1995i.getClass();
            c1995i.f18608a = C11931zU0.m26443b(dynamic);
            c1995i.invalidate();
        }

        @Override // p000.InterfaceC11653xI0
        @InterfaceC9871jM0(name = "y")
        public void setY(C1995i c1995i, Dynamic dynamic) {
            c1995i.getClass();
            c1995i.f18609b = C11931zU0.m26443b(dynamic);
            c1995i.invalidate();
        }
    }

    public static class LineViewManager extends RenderableViewManager<C1996j> implements InterfaceC11907zI0 {
        public static final String REACT_CLASS = "RNSVGLine";

        public LineViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGLine);
            this.mDelegate = new C11780yI0(this, 0);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((LineViewManager) view, str);
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((LineViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((LineViewManager) view, num);
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((LineViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((LineViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((LineViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((LineViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((LineViewManager) view, str);
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((LineViewManager) view, str);
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((LineViewManager) view, str);
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((LineViewManager) view, str);
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((LineViewManager) view, str);
        }

        @Override // p000.InterfaceC11907zI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((LineViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((LineViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((LineViewManager) view, f);
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((LineViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((LineViewManager) view, readableArray);
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((LineViewManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((LineViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((LineViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((LineViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((LineViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((LineViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((LineViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((LineViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((LineViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((LineViewManager) view, i);
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "x1")
        public void setX1(C1996j c1996j, Dynamic dynamic) {
            c1996j.getClass();
            c1996j.f18618a = C11931zU0.m26443b(dynamic);
            c1996j.invalidate();
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "x2")
        public void setX2(C1996j c1996j, Dynamic dynamic) {
            c1996j.getClass();
            c1996j.f18620c = C11931zU0.m26443b(dynamic);
            c1996j.invalidate();
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "y1")
        public void setY1(C1996j c1996j, Dynamic dynamic) {
            c1996j.getClass();
            c1996j.f18619b = C11931zU0.m26443b(dynamic);
            c1996j.invalidate();
        }

        @Override // p000.InterfaceC11907zI0
        @InterfaceC9871jM0(name = "y2")
        public void setY2(C1996j c1996j, Dynamic dynamic) {
            c1996j.getClass();
            c1996j.f18621d = C11931zU0.m26443b(dynamic);
            c1996j.invalidate();
        }
    }

    public static class LinearGradientManager extends VirtualViewManager<C1997k> implements AI0 {
        public static final String REACT_CLASS = "RNSVGLinearGradient";

        public LinearGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGLinearGradient);
            this.mDelegate = new C11780yI0(this, 1);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((LinearGradientManager) view, str);
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((LinearGradientManager) view, i);
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((LinearGradientManager) view, str);
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "gradient")
        public void setGradient(C1997k c1997k, ReadableArray readableArray) {
            c1997k.f18627e = readableArray;
            c1997k.invalidate();
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "gradientTransform")
        public void setGradientTransform(C1997k c1997k, ReadableArray readableArray) {
            if (readableArray != null) {
                float[] fArr = C1997k.f18622h;
                int iM3053f = GM1.m3053f(readableArray, fArr, c1997k.mScale);
                if (iM3053f == 6) {
                    if (c1997k.f18629g == null) {
                        c1997k.f18629g = new Matrix();
                    }
                    c1997k.f18629g.setValues(fArr);
                } else if (iM3053f != -1) {
                    AbstractC3929dS.m17683p("ReactNative");
                }
            } else {
                c1997k.f18629g = null;
            }
            c1997k.invalidate();
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "gradientUnits")
        public void setGradientUnits(C1997k c1997k, int i) {
            if (i == 0) {
                c1997k.f18628f = 1;
            } else if (i == 1) {
                c1997k.f18628f = 2;
            }
            c1997k.invalidate();
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((LinearGradientManager) view, str);
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((LinearGradientManager) view, str);
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((LinearGradientManager) view, str);
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((LinearGradientManager) view, str);
        }

        @Override // p000.AI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((LinearGradientManager) view, readableArray);
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((LinearGradientManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((LinearGradientManager) view, f);
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((LinearGradientManager) view, str);
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((LinearGradientManager) view, z);
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "x1")
        public void setX1(C1997k c1997k, Dynamic dynamic) {
            c1997k.getClass();
            c1997k.f18623a = C11931zU0.m26443b(dynamic);
            c1997k.invalidate();
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "x2")
        public void setX2(C1997k c1997k, Dynamic dynamic) {
            c1997k.getClass();
            c1997k.f18625c = C11931zU0.m26443b(dynamic);
            c1997k.invalidate();
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "y1")
        public void setY1(C1997k c1997k, Dynamic dynamic) {
            c1997k.getClass();
            c1997k.f18624b = C11931zU0.m26443b(dynamic);
            c1997k.invalidate();
        }

        @Override // p000.AI0
        @InterfaceC9871jM0(name = "y2")
        public void setY2(C1997k c1997k, Dynamic dynamic) {
            c1997k.getClass();
            c1997k.f18626d = C11931zU0.m26443b(dynamic);
            c1997k.invalidate();
        }
    }

    public static class MarkerManager extends GroupViewManagerAbstract<C1998l> implements BI0 {
        public static final String REACT_CLASS = "RNSVGMarker";

        public MarkerManager() {
            super(VirtualViewManager.SVGClass.RNSVGMarker);
            this.mDelegate = new C11780yI0(this, 2);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "align")
        public void setAlign(C1998l c1998l, String str) {
            c1998l.f18640p = str;
            c1998l.invalidate();
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((MarkerManager) view, str);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((MarkerManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((MarkerManager) view, num);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((MarkerManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((MarkerManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((MarkerManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((MarkerManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((MarkerManager) view, str);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((MarkerManager) view, dynamic);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((MarkerManager) view, dynamic);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((MarkerManager) view, dynamic);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((MarkerManager) view, str);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((MarkerManager) view, str);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((MarkerManager) view, str);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "markerUnits")
        public void setMarkerUnits(C1998l c1998l, String str) {
            c1998l.f18634j = str;
            c1998l.invalidate();
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((MarkerManager) view, str);
        }

        @Override // p000.BI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((MarkerManager) view, readableArray);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "meetOrSlice")
        public void setMeetOrSlice(C1998l c1998l, int i) {
            c1998l.f18641q = i;
            c1998l.invalidate();
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "minX")
        public void setMinX(C1998l c1998l, float f) {
            c1998l.f18636l = f;
            c1998l.invalidate();
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "minY")
        public void setMinY(C1998l c1998l, float f) {
            c1998l.f18637m = f;
            c1998l.invalidate();
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((MarkerManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((MarkerManager) view, f);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "orient")
        public void setOrient(C1998l c1998l, String str) {
            c1998l.f18635k = str;
            c1998l.invalidate();
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((MarkerManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((MarkerManager) view, readableArray);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((MarkerManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((MarkerManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((MarkerManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((MarkerManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((MarkerManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((MarkerManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((MarkerManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((MarkerManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((MarkerManager) view, dynamic);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "vbHeight")
        public void setVbHeight(C1998l c1998l, float f) {
            c1998l.f18639o = f;
            c1998l.invalidate();
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "vbWidth")
        public void setVbWidth(C1998l c1998l, float f) {
            c1998l.f18638n = f;
            c1998l.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.BI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((MarkerManager) view, i);
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "markerHeight")
        public void setMarkerHeight(C1998l c1998l, Dynamic dynamic) {
            c1998l.getClass();
            c1998l.f18633i = C11931zU0.m26443b(dynamic);
            c1998l.invalidate();
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "markerWidth")
        public void setMarkerWidth(C1998l c1998l, Dynamic dynamic) {
            c1998l.getClass();
            c1998l.f18632h = C11931zU0.m26443b(dynamic);
            c1998l.invalidate();
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "refX")
        public void setRefX(C1998l c1998l, Dynamic dynamic) {
            c1998l.getClass();
            c1998l.f18630f = C11931zU0.m26443b(dynamic);
            c1998l.invalidate();
        }

        @Override // p000.BI0
        @InterfaceC9871jM0(name = "refY")
        public void setRefY(C1998l c1998l, Dynamic dynamic) {
            c1998l.getClass();
            c1998l.f18631g = C11931zU0.m26443b(dynamic);
            c1998l.invalidate();
        }
    }

    public static class MaskManager extends GroupViewManagerAbstract<C1999m> implements DI0 {
        public static final String REACT_CLASS = "RNSVGMask";

        public MaskManager() {
            super(VirtualViewManager.SVGClass.RNSVGMask);
            this.mDelegate = new C11780yI0(this, 3);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((MaskManager) view, str);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((MaskManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((MaskManager) view, num);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((MaskManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((MaskManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((MaskManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((MaskManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((MaskManager) view, str);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((MaskManager) view, dynamic);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((MaskManager) view, dynamic);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((MaskManager) view, dynamic);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((MaskManager) view, str);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((MaskManager) view, str);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((MaskManager) view, str);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((MaskManager) view, str);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "maskContentUnits")
        public void setMaskContentUnits(C1999m c1999m, int i) {
            c1999m.invalidate();
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "maskType")
        public void setMaskType(C1999m c1999m, int i) {
            if (i == 0) {
                c1999m.f18648k = 1;
            } else if (i == 1) {
                c1999m.f18648k = 2;
            }
            c1999m.invalidate();
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "maskUnits")
        public void setMaskUnits(C1999m c1999m, int i) {
            if (i == 0) {
                c1999m.f18647j = 1;
            } else if (i == 1) {
                c1999m.f18647j = 2;
            }
            c1999m.invalidate();
        }

        @Override // p000.DI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((MaskManager) view, readableArray);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((MaskManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((MaskManager) view, f);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((MaskManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((MaskManager) view, readableArray);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((MaskManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((MaskManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((MaskManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((MaskManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((MaskManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((MaskManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((MaskManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((MaskManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((MaskManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.DI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((MaskManager) view, i);
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public void setHeight(C1999m c1999m, Dynamic dynamic) {
            c1999m.getClass();
            c1999m.f18646i = C11931zU0.m26443b(dynamic);
            c1999m.invalidate();
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public void setWidth(C1999m c1999m, Dynamic dynamic) {
            c1999m.getClass();
            c1999m.f18645h = C11931zU0.m26443b(dynamic);
            c1999m.invalidate();
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "x")
        public void setX(C1999m c1999m, Dynamic dynamic) {
            c1999m.getClass();
            c1999m.f18643f = C11931zU0.m26443b(dynamic);
            c1999m.invalidate();
        }

        @Override // p000.DI0
        @InterfaceC9871jM0(name = "y")
        public void setY(C1999m c1999m, Dynamic dynamic) {
            c1999m.getClass();
            c1999m.f18644g = C11931zU0.m26443b(dynamic);
            c1999m.invalidate();
        }
    }

    public static class PathViewManager extends RenderableViewManager<C11383vA0> implements EI0 {
        public static final String REACT_CLASS = "RNSVGPath";

        public PathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGPath);
            this.mDelegate = new C11780yI0(this, 4);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.EI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((PathViewManager) view, str);
        }

        @Override // p000.EI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((PathViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((PathViewManager) view, num);
        }

        @Override // p000.EI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((PathViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((PathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((PathViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((PathViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((PathViewManager) view, str);
        }

        @Override // p000.EI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((PathViewManager) view, str);
        }

        @Override // p000.EI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((PathViewManager) view, str);
        }

        @Override // p000.EI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((PathViewManager) view, str);
        }

        @Override // p000.EI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((PathViewManager) view, str);
        }

        @Override // p000.EI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((PathViewManager) view, readableArray);
        }

        @Override // p000.EI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((PathViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((PathViewManager) view, f);
        }

        @Override // p000.EI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((PathViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((PathViewManager) view, readableArray);
        }

        @Override // p000.EI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((PathViewManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((PathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((PathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((PathViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((PathViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((PathViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((PathViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((PathViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((PathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.EI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((PathViewManager) view, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0217  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0246  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x026a  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x02b1  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x02bd  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x02c7  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x02e7  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0308  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x00f1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x030d A[SYNTHETIC] */
        @Override // p000.EI0
        @p000.InterfaceC9871jM0(name = ru.p031ok.tracer.base.ucum.UcumUtils.UCUM_DAYS)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void setD(p000.C11383vA0 r33, java.lang.String r34) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 1004
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.RenderableViewManager.PathViewManager.setD(vA0, java.lang.String):void");
        }
    }

    public static class PatternManager extends GroupViewManagerAbstract<C2000n> implements FI0 {
        public static final String REACT_CLASS = "RNSVGPattern";

        public PatternManager() {
            super(VirtualViewManager.SVGClass.RNSVGPattern);
            this.mDelegate = new C11780yI0(this, 5);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "align")
        public void setAlign(C2000n c2000n, String str) {
            c2000n.f18660p = str;
            c2000n.invalidate();
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((PatternManager) view, str);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((PatternManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((PatternManager) view, num);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((PatternManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((PatternManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((PatternManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((PatternManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((PatternManager) view, str);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((PatternManager) view, dynamic);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((PatternManager) view, dynamic);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((PatternManager) view, dynamic);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((PatternManager) view, str);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((PatternManager) view, str);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((PatternManager) view, str);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((PatternManager) view, str);
        }

        @Override // p000.FI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((PatternManager) view, readableArray);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "meetOrSlice")
        public void setMeetOrSlice(C2000n c2000n, int i) {
            c2000n.f18661q = i;
            c2000n.invalidate();
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "minX")
        public void setMinX(C2000n c2000n, float f) {
            c2000n.f18656l = f;
            c2000n.invalidate();
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "minY")
        public void setMinY(C2000n c2000n, float f) {
            c2000n.f18657m = f;
            c2000n.invalidate();
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((PatternManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((PatternManager) view, f);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "patternContentUnits")
        public void setPatternContentUnits(C2000n c2000n, int i) {
            if (i == 0) {
                c2000n.f18655k = 1;
            } else if (i == 1) {
                c2000n.f18655k = 2;
            }
            c2000n.invalidate();
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "patternTransform")
        public void setPatternTransform(C2000n c2000n, ReadableArray readableArray) {
            if (readableArray != null) {
                float[] fArr = C2000n.f18649s;
                int iM3053f = GM1.m3053f(readableArray, fArr, c2000n.mScale);
                if (iM3053f == 6) {
                    if (c2000n.f18662r == null) {
                        c2000n.f18662r = new Matrix();
                    }
                    c2000n.f18662r.setValues(fArr);
                } else if (iM3053f != -1) {
                    AbstractC3929dS.m17683p("ReactNative");
                }
            } else {
                c2000n.f18662r = null;
            }
            c2000n.invalidate();
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "patternUnits")
        public void setPatternUnits(C2000n c2000n, int i) {
            if (i == 0) {
                c2000n.f18654j = 1;
            } else if (i == 1) {
                c2000n.f18654j = 2;
            }
            c2000n.invalidate();
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((PatternManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((PatternManager) view, readableArray);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((PatternManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((PatternManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((PatternManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((PatternManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((PatternManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((PatternManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((PatternManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((PatternManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((PatternManager) view, dynamic);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "vbHeight")
        public void setVbHeight(C2000n c2000n, float f) {
            c2000n.f18659o = f;
            c2000n.invalidate();
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "vbWidth")
        public void setVbWidth(C2000n c2000n, float f) {
            c2000n.f18658n = f;
            c2000n.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.FI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((PatternManager) view, i);
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public void setHeight(C2000n c2000n, Dynamic dynamic) {
            c2000n.getClass();
            c2000n.f18653i = C11931zU0.m26443b(dynamic);
            c2000n.invalidate();
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public void setWidth(C2000n c2000n, Dynamic dynamic) {
            c2000n.getClass();
            c2000n.f18652h = C11931zU0.m26443b(dynamic);
            c2000n.invalidate();
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "x")
        public void setX(C2000n c2000n, Dynamic dynamic) {
            c2000n.getClass();
            c2000n.f18650f = C11931zU0.m26443b(dynamic);
            c2000n.invalidate();
        }

        @Override // p000.FI0
        @InterfaceC9871jM0(name = "y")
        public void setY(C2000n c2000n, Dynamic dynamic) {
            c2000n.getClass();
            c2000n.f18651g = C11931zU0.m26443b(dynamic);
            c2000n.invalidate();
        }
    }

    public static class RadialGradientManager extends VirtualViewManager<C2001o> implements GI0 {
        public static final String REACT_CLASS = "RNSVGRadialGradient";

        public RadialGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
            this.mDelegate = new C11780yI0(this, 6);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((RadialGradientManager) view, str);
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((RadialGradientManager) view, i);
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((RadialGradientManager) view, str);
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "gradient")
        public void setGradient(C2001o c2001o, ReadableArray readableArray) {
            c2001o.f18670g = readableArray;
            c2001o.invalidate();
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "gradientTransform")
        public void setGradientTransform(C2001o c2001o, ReadableArray readableArray) {
            if (readableArray != null) {
                float[] fArr = C2001o.f18663j;
                int iM3053f = GM1.m3053f(readableArray, fArr, c2001o.mScale);
                if (iM3053f == 6) {
                    if (c2001o.f18672i == null) {
                        c2001o.f18672i = new Matrix();
                    }
                    c2001o.f18672i.setValues(fArr);
                } else if (iM3053f != -1) {
                    AbstractC3929dS.m17683p("ReactNative");
                }
            } else {
                c2001o.f18672i = null;
            }
            c2001o.invalidate();
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "gradientUnits")
        public void setGradientUnits(C2001o c2001o, int i) {
            if (i == 0) {
                c2001o.f18671h = 1;
            } else if (i == 1) {
                c2001o.f18671h = 2;
            }
            c2001o.invalidate();
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((RadialGradientManager) view, str);
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((RadialGradientManager) view, str);
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((RadialGradientManager) view, str);
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((RadialGradientManager) view, str);
        }

        @Override // p000.GI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((RadialGradientManager) view, readableArray);
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((RadialGradientManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((RadialGradientManager) view, f);
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((RadialGradientManager) view, str);
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((RadialGradientManager) view, z);
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "cx")
        public void setCx(C2001o c2001o, Dynamic dynamic) {
            c2001o.getClass();
            c2001o.f18668e = C11931zU0.m26443b(dynamic);
            c2001o.invalidate();
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "cy")
        public void setCy(C2001o c2001o, Dynamic dynamic) {
            c2001o.getClass();
            c2001o.f18669f = C11931zU0.m26443b(dynamic);
            c2001o.invalidate();
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "fx")
        public void setFx(C2001o c2001o, Dynamic dynamic) {
            c2001o.getClass();
            c2001o.f18664a = C11931zU0.m26443b(dynamic);
            c2001o.invalidate();
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "fy")
        public void setFy(C2001o c2001o, Dynamic dynamic) {
            c2001o.getClass();
            c2001o.f18665b = C11931zU0.m26443b(dynamic);
            c2001o.invalidate();
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "rx")
        public void setRx(C2001o c2001o, Dynamic dynamic) {
            c2001o.getClass();
            c2001o.f18666c = C11931zU0.m26443b(dynamic);
            c2001o.invalidate();
        }

        @Override // p000.GI0
        @InterfaceC9871jM0(name = "ry")
        public void setRy(C2001o c2001o, Dynamic dynamic) {
            c2001o.getClass();
            c2001o.f18667d = C11931zU0.m26443b(dynamic);
            c2001o.invalidate();
        }
    }

    public static class RectViewManager extends RenderableViewManager<C2002p> implements HI0 {
        public static final String REACT_CLASS = "RNSVGRect";

        public RectViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGRect);
            this.mDelegate = new C11780yI0(this, 7);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((RectViewManager) view, str);
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((RectViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RectViewManager) view, num);
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((RectViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((RectViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RectViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RectViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RectViewManager) view, str);
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((RectViewManager) view, str);
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((RectViewManager) view, str);
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((RectViewManager) view, str);
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((RectViewManager) view, str);
        }

        @Override // p000.HI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((RectViewManager) view, readableArray);
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((RectViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((RectViewManager) view, f);
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((RectViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RectViewManager) view, readableArray);
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((RectViewManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((RectViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RectViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RectViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RectViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RectViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RectViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RectViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RectViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RectViewManager) view, i);
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public void setHeight(C2002p c2002p, Dynamic dynamic) {
            c2002p.getClass();
            c2002p.f18676d = C11931zU0.m26443b(dynamic);
            c2002p.invalidate();
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "rx")
        public void setRx(C2002p c2002p, Dynamic dynamic) {
            c2002p.getClass();
            c2002p.f18677e = C11931zU0.m26443b(dynamic);
            c2002p.invalidate();
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "ry")
        public void setRy(C2002p c2002p, Dynamic dynamic) {
            c2002p.getClass();
            c2002p.f18678f = C11931zU0.m26443b(dynamic);
            c2002p.invalidate();
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public void setWidth(C2002p c2002p, Dynamic dynamic) {
            c2002p.getClass();
            c2002p.f18675c = C11931zU0.m26443b(dynamic);
            c2002p.invalidate();
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "x")
        public void setX(C2002p c2002p, Dynamic dynamic) {
            c2002p.getClass();
            c2002p.f18673a = C11931zU0.m26443b(dynamic);
            c2002p.invalidate();
        }

        @Override // p000.HI0
        @InterfaceC9871jM0(name = "y")
        public void setY(C2002p c2002p, Dynamic dynamic) {
            c2002p.getClass();
            c2002p.f18674b = C11931zU0.m26443b(dynamic);
            c2002p.invalidate();
        }
    }

    public static class SymbolManager extends GroupViewManagerAbstract<C1981W> implements JI0 {
        public static final String REACT_CLASS = "RNSVGSymbol";

        public SymbolManager() {
            super(VirtualViewManager.SVGClass.RNSVGSymbol);
            this.mDelegate = new C11780yI0(this, 9);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "align")
        public void setAlign(C1981W c1981w, String str) {
            c1981w.f18557j = str;
            c1981w.invalidate();
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((SymbolManager) view, str);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((SymbolManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((SymbolManager) view, num);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((SymbolManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((SymbolManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((SymbolManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((SymbolManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((SymbolManager) view, str);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((SymbolManager) view, dynamic);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((SymbolManager) view, dynamic);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((SymbolManager) view, dynamic);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((SymbolManager) view, str);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((SymbolManager) view, str);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((SymbolManager) view, str);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((SymbolManager) view, str);
        }

        @Override // p000.JI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((SymbolManager) view, readableArray);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "meetOrSlice")
        public void setMeetOrSlice(C1981W c1981w, int i) {
            c1981w.f18558k = i;
            c1981w.invalidate();
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "minX")
        public void setMinX(C1981W c1981w, float f) {
            c1981w.f18553f = f;
            c1981w.invalidate();
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "minY")
        public void setMinY(C1981W c1981w, float f) {
            c1981w.f18554g = f;
            c1981w.invalidate();
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((SymbolManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((SymbolManager) view, f);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((SymbolManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((SymbolManager) view, readableArray);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((SymbolManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((SymbolManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((SymbolManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((SymbolManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((SymbolManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((SymbolManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((SymbolManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((SymbolManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((SymbolManager) view, dynamic);
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "vbHeight")
        public void setVbHeight(C1981W c1981w, float f) {
            c1981w.f18556i = f;
            c1981w.invalidate();
        }

        @Override // p000.JI0
        @InterfaceC9871jM0(name = "vbWidth")
        public void setVbWidth(C1981W c1981w, float f) {
            c1981w.f18555h = f;
            c1981w.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.JI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((SymbolManager) view, i);
        }
    }

    public static class TextPathViewManager extends TextViewManagerAbstract<B91> implements MI0 {
        public static final String REACT_CLASS = "RNSVGTextPath";

        public TextPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTextPath);
            this.mDelegate = new C11780yI0(this, 12);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.MI0
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((TextPathViewManager) view, str);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((TextPathViewManager) view, dynamic);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((TextPathViewManager) view, str);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((TextPathViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((TextPathViewManager) view, num);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((TextPathViewManager) view, str);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((TextPathViewManager) view, dynamic);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((TextPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((TextPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((TextPathViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((TextPathViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((TextPathViewManager) view, str);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((TextPathViewManager) view, dynamic);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((TextPathViewManager) view, dynamic);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((TextPathViewManager) view, dynamic);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "href")
        public void setHref(B91 b91, String str) {
            b91.f608q = str;
            b91.invalidate();
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((TextPathViewManager) view, dynamic);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((TextPathViewManager) view, str);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((TextPathViewManager) view, str);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((TextPathViewManager) view, str);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((TextPathViewManager) view, str);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((TextPathViewManager) view, str);
        }

        @Override // p000.MI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((TextPathViewManager) view, readableArray);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((TextPathViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((TextPathViewManager) view, f);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((TextPathViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((TextPathViewManager) view, readableArray);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((TextPathViewManager) view, z);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((TextPathViewManager) view, dynamic);
        }

        @InterfaceC9871jM0(name = "midLine")
        public void setSharp(B91 b91, String str) {
            b91.getClass();
            b91.f610s = AbstractC11153tN0.m24887E(str);
            b91.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((TextPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((TextPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((TextPathViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((TextPathViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((TextPathViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((TextPathViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((TextPathViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((TextPathViewManager) view, dynamic);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((TextPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.MI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((TextPathViewManager) view, i);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((TextPathViewManager) view, dynamic);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((TextPathViewManager) view, dynamic);
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((TextPathViewManager) view, dynamic);
        }

        @Override // p000.MI0
        public void setMidLine(B91 b91, String str) {
            b91.getClass();
            b91.f610s = AbstractC11153tN0.m24887E(str);
            b91.invalidate();
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "side")
        public void setSide(B91 b91, String str) {
            int i;
            b91.getClass();
            if (str == null) {
                throw new NullPointerException("Name is null");
            }
            if (str.equals("left")) {
                i = 1;
            } else {
                if (!str.equals("right")) {
                    throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextPathSide.".concat(str));
                }
                i = 2;
            }
            b91.f609r = i;
            b91.invalidate();
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "spacing")
        public void setSpacing(B91 b91, String str) {
            b91.getClass();
            if (str == null) {
                throw new NullPointerException("Name is null");
            }
            if (!str.equals("auto") && !str.equals("exact")) {
                throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextPathSpacing.".concat(str));
            }
            b91.invalidate();
        }

        @Override // p000.MI0
        @InterfaceC9871jM0(name = "startOffset")
        public void setStartOffset(B91 b91, Dynamic dynamic) {
            b91.getClass();
            b91.f611t = C11931zU0.m26443b(dynamic);
            b91.invalidate();
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract
        @InterfaceC9871jM0(name = "method")
        public void setMethod(B91 b91, String str) {
            b91.mo533u(str);
        }

        public TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new C11780yI0(this, 12);
        }
    }

    public static class TextViewManagerAbstract<K extends C1983Y> extends GroupViewManagerAbstract<K> {
        public TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        public void setAlignmentBaseline(K k, String str) {
            k.mo533u(str);
        }

        @InterfaceC9871jM0(name = "baselineShift")
        public void setBaselineShift(K k, Dynamic dynamic) {
            k.getClass();
            k.f18567h = C11931zU0.m26444c(dynamic);
            k.invalidate();
        }

        @InterfaceC9871jM0(name = "dx")
        public void setDx(K k, Dynamic dynamic) {
            k.getClass();
            k.f18573n = C11931zU0.m26442a(dynamic);
            k.invalidate();
        }

        @InterfaceC9871jM0(name = "dy")
        public void setDy(K k, Dynamic dynamic) {
            k.getClass();
            k.f18574o = C11931zU0.m26442a(dynamic);
            k.invalidate();
        }

        @InterfaceC9871jM0(name = "inlineSize")
        public void setInlineSize(K k, Dynamic dynamic) {
            k.getClass();
            k.f18565f = C11931zU0.m26443b(dynamic);
            k.invalidate();
        }

        @InterfaceC9871jM0(name = "lengthAdjust")
        public void setLengthAdjust(K k, String str) {
            int i;
            k.getClass();
            if (str == null) {
                throw new NullPointerException("Name is null");
            }
            if (str.equals("spacing")) {
                i = 1;
            } else {
                if (!str.equals("spacingAndGlyphs")) {
                    throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextLengthAdjust.".concat(str));
                }
                i = 2;
            }
            k.f18568i = i;
            k.invalidate();
        }

        @InterfaceC9871jM0(name = "alignmentBaseline")
        public void setMethod(K k, String str) {
            k.mo533u(str);
        }

        @InterfaceC9871jM0(name = "rotate")
        public void setRotate(K k, Dynamic dynamic) {
            k.getClass();
            k.f18572m = C11931zU0.m26442a(dynamic);
            k.invalidate();
        }

        @InterfaceC9871jM0(name = "textLength")
        public void setTextLength(K k, Dynamic dynamic) {
            k.getClass();
            k.f18566g = C11931zU0.m26443b(dynamic);
            k.invalidate();
        }

        @InterfaceC9871jM0(name = "verticalAlign")
        public void setVerticalAlign(K k, Dynamic dynamic) {
            k.getClass();
            String strM26444c = C11931zU0.m26444c(dynamic);
            if (strM26444c != null) {
                String strTrim = strM26444c.trim();
                int iLastIndexOf = strTrim.lastIndexOf(32);
                try {
                    k.f18569j = C91.m999a(strTrim.substring(iLastIndexOf));
                } catch (IllegalArgumentException unused) {
                    k.f18569j = C91.baseline;
                }
                try {
                    k.f18567h = strTrim.substring(0, iLastIndexOf);
                } catch (IndexOutOfBoundsException unused2) {
                    k.f18567h = null;
                }
            } else {
                k.f18569j = C91.baseline;
                k.f18567h = null;
            }
            k.invalidate();
        }

        @InterfaceC9871jM0(name = "x")
        public void setX(K k, Dynamic dynamic) {
            k.getClass();
            k.f18570k = C11931zU0.m26442a(dynamic);
            k.invalidate();
        }

        @InterfaceC9871jM0(name = "y")
        public void setY(K k, Dynamic dynamic) {
            k.getClass();
            k.f18571l = C11931zU0.m26442a(dynamic);
            k.invalidate();
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract
        @InterfaceC9871jM0(name = "font")
        public void setFont(K k, Dynamic dynamic) {
            k.getClass();
            if (dynamic.getType() == ReadableType.Map) {
                k.f18602a = dynamic.asMap();
            } else {
                k.f18602a = null;
            }
            k.invalidate();
        }
    }

    public static class UseViewManager extends RenderableViewManager<C1984Z> implements NI0 {
        public static final String REACT_CLASS = "RNSVGUse";

        public UseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGUse);
            this.mDelegate = new C11780yI0(this, 13);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((UseViewManager) view, str);
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((UseViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((UseViewManager) view, num);
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((UseViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((UseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((UseViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((UseViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((UseViewManager) view, str);
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "href")
        public void setHref(C1984Z c1984z, String str) {
            c1984z.f18576a = str;
            c1984z.invalidate();
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((UseViewManager) view, str);
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((UseViewManager) view, str);
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((UseViewManager) view, str);
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((UseViewManager) view, str);
        }

        @Override // p000.NI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((UseViewManager) view, readableArray);
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((UseViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((UseViewManager) view, f);
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((UseViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((UseViewManager) view, readableArray);
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((UseViewManager) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((UseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((UseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((UseViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((UseViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((UseViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((UseViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((UseViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((UseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.NI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((UseViewManager) view, i);
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = Snapshot.HEIGHT)
        public void setHeight(C1984Z c1984z, Dynamic dynamic) {
            c1984z.getClass();
            c1984z.f18580e = C11931zU0.m26443b(dynamic);
            c1984z.invalidate();
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = Snapshot.WIDTH)
        public void setWidth(C1984Z c1984z, Dynamic dynamic) {
            c1984z.getClass();
            c1984z.f18579d = C11931zU0.m26443b(dynamic);
            c1984z.invalidate();
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "x")
        public void setX(C1984Z c1984z, Dynamic dynamic) {
            c1984z.getClass();
            c1984z.f18577b = C11931zU0.m26443b(dynamic);
            c1984z.invalidate();
        }

        @Override // p000.NI0
        @InterfaceC9871jM0(name = "y")
        public void setY(C1984Z c1984z, Dynamic dynamic) {
            c1984z.getClass();
            c1984z.f18578c = C11931zU0.m26443b(dynamic);
            c1984z.invalidate();
        }
    }

    public RenderableViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
    public void setColor(T t, Integer num) {
        t.setCurrentColor(num);
    }

    @InterfaceC9871jM0(name = "fill")
    public void setFill(T t, Dynamic dynamic) throws NumberFormatException {
        t.setFill(dynamic);
    }

    @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(T t, float f) {
        t.setFillOpacity(f);
    }

    @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
    public void setFillRule(T t, int i) {
        t.setFillRule(i);
    }

    @InterfaceC9871jM0(name = "filter")
    public void setFilter(T t, String str) {
        t.setFilter(str);
    }

    @InterfaceC9871jM0(name = "propList")
    public void setPropList(T t, ReadableArray readableArray) {
        t.setPropList(readableArray);
    }

    @InterfaceC9871jM0(name = "stroke")
    public void setStroke(T t, Dynamic dynamic) throws NumberFormatException {
        t.setStroke(dynamic);
    }

    @InterfaceC9871jM0(name = "strokeDasharray")
    public void setStrokeDasharray(T t, Dynamic dynamic) {
        t.setStrokeDasharray(dynamic);
    }

    @InterfaceC9871jM0(name = "strokeDashoffset")
    public void setStrokeDashoffset(T t, float f) {
        t.setStrokeDashoffset(f);
    }

    @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(T t, int i) {
        t.setStrokeLinecap(i);
    }

    @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(T t, int i) {
        t.setStrokeLinejoin(i);
    }

    @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(T t, float f) {
        t.setStrokeMiterlimit(f);
    }

    @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(T t, float f) {
        t.setStrokeOpacity(f);
    }

    @InterfaceC9871jM0(name = "strokeWidth")
    public void setStrokeWidth(T t, Dynamic dynamic) {
        t.setStrokeWidth(dynamic);
    }

    @InterfaceC9871jM0(name = "vectorEffect")
    public void setVectorEffect(T t, int i) {
        t.setVectorEffect(i);
    }

    public void setFill(T t, ReadableMap readableMap) {
        t.setFill(readableMap);
    }

    public void setStroke(T t, ReadableMap readableMap) {
        t.setStroke(readableMap);
    }

    public static class TSpanViewManager extends TextViewManagerAbstract<C1982X> implements KI0 {
        public static final String REACT_CLASS = "RNSVGTSpan";

        public TSpanViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTSpan);
            this.mDelegate = new C11780yI0(this, 10);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.KI0
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((TSpanViewManager) view, str);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((TSpanViewManager) view, dynamic);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((TSpanViewManager) view, str);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((TSpanViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((TSpanViewManager) view, num);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = RemoteMessageConst.Notification.CONTENT)
        public void setContent(C1982X c1982x, String str) {
            c1982x.f18560r = str;
            c1982x.invalidate();
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((TSpanViewManager) view, str);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((TSpanViewManager) view, dynamic);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((TSpanViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((TSpanViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((TSpanViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((TSpanViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((TSpanViewManager) view, str);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((TSpanViewManager) view, dynamic);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((TSpanViewManager) view, dynamic);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((TSpanViewManager) view, dynamic);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((TSpanViewManager) view, dynamic);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((TSpanViewManager) view, str);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((TSpanViewManager) view, str);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((TSpanViewManager) view, str);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((TSpanViewManager) view, str);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((TSpanViewManager) view, str);
        }

        @Override // p000.KI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((TSpanViewManager) view, readableArray);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((TSpanViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((TSpanViewManager) view, f);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((TSpanViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((TSpanViewManager) view, readableArray);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((TSpanViewManager) view, z);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((TSpanViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((TSpanViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((TSpanViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((TSpanViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((TSpanViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((TSpanViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((TSpanViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((TSpanViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((TSpanViewManager) view, dynamic);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((TSpanViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.KI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((TSpanViewManager) view, i);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((TSpanViewManager) view, dynamic);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((TSpanViewManager) view, dynamic);
        }

        @Override // p000.KI0
        @InterfaceC9871jM0(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((TSpanViewManager) view, dynamic);
        }

        public TSpanViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new C11780yI0(this, 10);
        }
    }

    public static class TextViewManager extends TextViewManagerAbstract<C1983Y> implements LI0 {
        public static final String REACT_CLASS = "RNSVGText";

        public TextViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGText);
            this.mDelegate = new C11780yI0(this, 11);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            AbstractC0852NX.m5754c(this, view);
        }

        @Override // p000.LI0
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((TextViewManager) view, str);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((TextViewManager) view, dynamic);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((TextViewManager) view, str);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((TextViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((TextViewManager) view, num);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((TextViewManager) view, str);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((TextViewManager) view, dynamic);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((TextViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) throws NumberFormatException {
            super.setFill((TextViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((TextViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((TextViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((TextViewManager) view, str);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((TextViewManager) view, dynamic);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((TextViewManager) view, dynamic);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((TextViewManager) view, dynamic);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((TextViewManager) view, dynamic);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((TextViewManager) view, str);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((TextViewManager) view, str);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((TextViewManager) view, str);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((TextViewManager) view, str);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((TextViewManager) view, str);
        }

        @Override // p000.LI0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((TextViewManager) view, readableArray);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((TextViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((TextViewManager) view, f);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((TextViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((TextViewManager) view, readableArray);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((TextViewManager) view, z);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((TextViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) throws NumberFormatException {
            super.setStroke((TextViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((TextViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((TextViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((TextViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((TextViewManager) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((TextViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((TextViewManager) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((TextViewManager) view, dynamic);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((TextViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.LI0
        @InterfaceC9871jM0(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((TextViewManager) view, i);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((TextViewManager) view, dynamic);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((TextViewManager) view, dynamic);
        }

        @Override // p000.LI0
        @InterfaceC9871jM0(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((TextViewManager) view, dynamic);
        }

        public TextViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new C11780yI0(this, 11);
        }
    }
}
