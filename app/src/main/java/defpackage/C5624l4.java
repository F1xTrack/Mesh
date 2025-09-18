package defpackage;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: l4 */
/* loaded from: classes.dex */
public final class C5624l4 extends U0 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5624l4(InterfaceC0973Mg interfaceC0973Mg, int i) {
        super(5, interfaceC0973Mg);
        this.c = i;
    }

    private final void A1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "floodColor":
                ((InterfaceC6622qI0) interfaceC0973Mg).setFloodColor(view, new DynamicFromObject(obj));
                break;
            case "height":
                ((InterfaceC6622qI0) interfaceC0973Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "floodOpacity":
                ((InterfaceC6622qI0) interfaceC0973Mg).setFloodOpacity(view, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "result":
                ((InterfaceC6622qI0) interfaceC0973Mg).setResult(view, obj == null ? null : (String) obj);
                break;
            case "x":
                ((InterfaceC6622qI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC6622qI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "width":
                ((InterfaceC6622qI0) interfaceC0973Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    private final void B1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "height":
                ((InterfaceC6812rI0) interfaceC0973Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC6812rI0) interfaceC0973Mg).setResult(view, obj != null ? (String) obj : null);
                break;
            case "x":
                ((InterfaceC6812rI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC6812rI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "in1":
                ((InterfaceC6812rI0) interfaceC0973Mg).setIn1(view, obj != null ? (String) obj : null);
                break;
            case "width":
                ((InterfaceC6812rI0) interfaceC0973Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            case "edgeMode":
                ((InterfaceC6812rI0) interfaceC0973Mg).setEdgeMode(view, (String) obj);
                break;
            case "stdDeviationX":
                ((InterfaceC6812rI0) interfaceC0973Mg).setStdDeviationX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "stdDeviationY":
                ((InterfaceC6812rI0) interfaceC0973Mg).setStdDeviationY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    private final void C1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "height":
                ((InterfaceC7003sI0) interfaceC0973Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC7003sI0) interfaceC0973Mg).setResult(view, obj == null ? null : (String) obj);
                break;
            case "x":
                ((InterfaceC7003sI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC7003sI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "nodes":
                ((InterfaceC7003sI0) interfaceC0973Mg).setNodes(view, (ReadableArray) obj);
                break;
            case "width":
                ((InterfaceC7003sI0) interfaceC0973Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    private final void D1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "height":
                ((InterfaceC7194tI0) interfaceC0973Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC7194tI0) interfaceC0973Mg).setResult(view, obj != null ? (String) obj : null);
                break;
            case "x":
                ((InterfaceC7194tI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC7194tI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "dx":
                ((InterfaceC7194tI0) interfaceC0973Mg).setDx(view, new DynamicFromObject(obj));
                break;
            case "dy":
                ((InterfaceC7194tI0) interfaceC0973Mg).setDy(view, new DynamicFromObject(obj));
                break;
            case "in1":
                ((InterfaceC7194tI0) interfaceC0973Mg).setIn1(view, obj != null ? (String) obj : null);
                break;
            case "width":
                ((InterfaceC7194tI0) interfaceC0973Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    private final void E1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "primitiveUnits":
                ((InterfaceC7385uI0) interfaceC0973Mg).setPrimitiveUnits(view, (String) obj);
                break;
            case "height":
                ((InterfaceC7385uI0) interfaceC0973Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "filterUnits":
                ((InterfaceC7385uI0) interfaceC0973Mg).setFilterUnits(view, (String) obj);
                break;
            case "x":
                ((InterfaceC7385uI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC7385uI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "name":
                ((InterfaceC7385uI0) interfaceC0973Mg).setName(view, obj == null ? null : (String) obj);
                break;
            case "width":
                ((InterfaceC7385uI0) interfaceC0973Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    private final void F1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "filter":
                ((InterfaceC7576vI0) interfaceC0973Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0973Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "height":
                ((InterfaceC7576vI0) interfaceC0973Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((InterfaceC7576vI0) interfaceC0973Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((InterfaceC7576vI0) interfaceC0973Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC7576vI0) interfaceC0973Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC7576vI0) interfaceC0973Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((InterfaceC7576vI0) interfaceC0973Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((InterfaceC7576vI0) interfaceC0973Mg).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((InterfaceC7576vI0) interfaceC0973Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((InterfaceC7576vI0) interfaceC0973Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((InterfaceC7576vI0) interfaceC0973Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((InterfaceC7576vI0) interfaceC0973Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((InterfaceC7576vI0) interfaceC0973Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((InterfaceC7576vI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC7576vI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((InterfaceC7576vI0) interfaceC0973Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((InterfaceC7576vI0) interfaceC0973Mg).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((InterfaceC7576vI0) interfaceC0973Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC7576vI0) interfaceC0973Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((InterfaceC7576vI0) interfaceC0973Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((InterfaceC7576vI0) interfaceC0973Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((InterfaceC7576vI0) interfaceC0973Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "width":
                ((InterfaceC7576vI0) interfaceC0973Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            case "markerStart":
                ((InterfaceC7576vI0) interfaceC0973Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "fontSize":
                ((InterfaceC7576vI0) interfaceC0973Mg).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((InterfaceC7576vI0) interfaceC0973Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((InterfaceC7576vI0) interfaceC0973Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC7576vI0) interfaceC0973Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((InterfaceC7576vI0) interfaceC0973Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC7576vI0) interfaceC0973Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((InterfaceC7576vI0) interfaceC0973Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((InterfaceC7576vI0) interfaceC0973Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((InterfaceC7576vI0) interfaceC0973Mg).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    private final void G1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "filter":
                ((InterfaceC7766wI0) interfaceC0973Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0973Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((InterfaceC7766wI0) interfaceC0973Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((InterfaceC7766wI0) interfaceC0973Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC7766wI0) interfaceC0973Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC7766wI0) interfaceC0973Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((InterfaceC7766wI0) interfaceC0973Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((InterfaceC7766wI0) interfaceC0973Mg).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((InterfaceC7766wI0) interfaceC0973Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((InterfaceC7766wI0) interfaceC0973Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((InterfaceC7766wI0) interfaceC0973Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((InterfaceC7766wI0) interfaceC0973Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((InterfaceC7766wI0) interfaceC0973Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fill":
                ((InterfaceC7766wI0) interfaceC0973Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((InterfaceC7766wI0) interfaceC0973Mg).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((InterfaceC7766wI0) interfaceC0973Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC7766wI0) interfaceC0973Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((InterfaceC7766wI0) interfaceC0973Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((InterfaceC7766wI0) interfaceC0973Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((InterfaceC7766wI0) interfaceC0973Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((InterfaceC7766wI0) interfaceC0973Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "fontSize":
                ((InterfaceC7766wI0) interfaceC0973Mg).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((InterfaceC7766wI0) interfaceC0973Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((InterfaceC7766wI0) interfaceC0973Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC7766wI0) interfaceC0973Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((InterfaceC7766wI0) interfaceC0973Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC7766wI0) interfaceC0973Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((InterfaceC7766wI0) interfaceC0973Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((InterfaceC7766wI0) interfaceC0973Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((InterfaceC7766wI0) interfaceC0973Mg).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    private final void H1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "filter":
                ((InterfaceC7956xI0) interfaceC0973Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0973Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "height":
                ((InterfaceC7956xI0) interfaceC0973Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((InterfaceC7956xI0) interfaceC0973Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((InterfaceC7956xI0) interfaceC0973Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC7956xI0) interfaceC0973Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC7956xI0) interfaceC0973Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((InterfaceC7956xI0) interfaceC0973Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((InterfaceC7956xI0) interfaceC0973Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((InterfaceC7956xI0) interfaceC0973Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((InterfaceC7956xI0) interfaceC0973Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((InterfaceC7956xI0) interfaceC0973Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((InterfaceC7956xI0) interfaceC0973Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((InterfaceC7956xI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC7956xI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "src":
                ((InterfaceC7956xI0) interfaceC0973Mg).setSrc(view, (ReadableMap) obj);
                break;
            case "fill":
                ((InterfaceC7956xI0) interfaceC0973Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((InterfaceC7956xI0) interfaceC0973Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC7956xI0) interfaceC0973Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((InterfaceC7956xI0) interfaceC0973Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((InterfaceC7956xI0) interfaceC0973Mg).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((InterfaceC7956xI0) interfaceC0973Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((InterfaceC7956xI0) interfaceC0973Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "width":
                ((InterfaceC7956xI0) interfaceC0973Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            case "markerStart":
                ((InterfaceC7956xI0) interfaceC0973Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((InterfaceC7956xI0) interfaceC0973Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((InterfaceC7956xI0) interfaceC0973Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC7956xI0) interfaceC0973Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((InterfaceC7956xI0) interfaceC0973Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC7956xI0) interfaceC0973Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((InterfaceC7956xI0) interfaceC0973Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((InterfaceC7956xI0) interfaceC0973Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "meetOrSlice":
                ((InterfaceC7956xI0) interfaceC0973Mg).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeWidth":
                ((InterfaceC7956xI0) interfaceC0973Mg).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    private final void w1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "filter":
                ((InterfaceC5667lI0) interfaceC0973Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0973Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((InterfaceC5667lI0) interfaceC0973Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((InterfaceC5667lI0) interfaceC0973Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC5667lI0) interfaceC0973Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC5667lI0) interfaceC0973Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((InterfaceC5667lI0) interfaceC0973Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((InterfaceC5667lI0) interfaceC0973Mg).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((InterfaceC5667lI0) interfaceC0973Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((InterfaceC5667lI0) interfaceC0973Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((InterfaceC5667lI0) interfaceC0973Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((InterfaceC5667lI0) interfaceC0973Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((InterfaceC5667lI0) interfaceC0973Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fill":
                ((InterfaceC5667lI0) interfaceC0973Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((InterfaceC5667lI0) interfaceC0973Mg).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((InterfaceC5667lI0) interfaceC0973Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC5667lI0) interfaceC0973Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((InterfaceC5667lI0) interfaceC0973Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((InterfaceC5667lI0) interfaceC0973Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((InterfaceC5667lI0) interfaceC0973Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((InterfaceC5667lI0) interfaceC0973Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "fontSize":
                ((InterfaceC5667lI0) interfaceC0973Mg).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((InterfaceC5667lI0) interfaceC0973Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((InterfaceC5667lI0) interfaceC0973Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC5667lI0) interfaceC0973Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((InterfaceC5667lI0) interfaceC0973Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC5667lI0) interfaceC0973Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((InterfaceC5667lI0) interfaceC0973Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((InterfaceC5667lI0) interfaceC0973Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((InterfaceC5667lI0) interfaceC0973Mg).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    private final void x1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "filter":
                ((InterfaceC6049nI0) interfaceC0973Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0973Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((InterfaceC6049nI0) interfaceC0973Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((InterfaceC6049nI0) interfaceC0973Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC6049nI0) interfaceC0973Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC6049nI0) interfaceC0973Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((InterfaceC6049nI0) interfaceC0973Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((InterfaceC6049nI0) interfaceC0973Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((InterfaceC6049nI0) interfaceC0973Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((InterfaceC6049nI0) interfaceC0973Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((InterfaceC6049nI0) interfaceC0973Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((InterfaceC6049nI0) interfaceC0973Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "cx":
                ((InterfaceC6049nI0) interfaceC0973Mg).setCx(view, new DynamicFromObject(obj));
                break;
            case "cy":
                ((InterfaceC6049nI0) interfaceC0973Mg).setCy(view, new DynamicFromObject(obj));
                break;
            case "rx":
                ((InterfaceC6049nI0) interfaceC0973Mg).setRx(view, new DynamicFromObject(obj));
                break;
            case "ry":
                ((InterfaceC6049nI0) interfaceC0973Mg).setRy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((InterfaceC6049nI0) interfaceC0973Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((InterfaceC6049nI0) interfaceC0973Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC6049nI0) interfaceC0973Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((InterfaceC6049nI0) interfaceC0973Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((InterfaceC6049nI0) interfaceC0973Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((InterfaceC6049nI0) interfaceC0973Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((InterfaceC6049nI0) interfaceC0973Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((InterfaceC6049nI0) interfaceC0973Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((InterfaceC6049nI0) interfaceC0973Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC6049nI0) interfaceC0973Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((InterfaceC6049nI0) interfaceC0973Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC6049nI0) interfaceC0973Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((InterfaceC6049nI0) interfaceC0973Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((InterfaceC6049nI0) interfaceC0973Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((InterfaceC6049nI0) interfaceC0973Mg).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    private final void y1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "height":
                ((InterfaceC6240oI0) interfaceC0973Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC6240oI0) interfaceC0973Mg).setResult(view, obj != null ? (String) obj : null);
                break;
            case "x":
                ((InterfaceC6240oI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC6240oI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "in1":
                ((InterfaceC6240oI0) interfaceC0973Mg).setIn1(view, obj != null ? (String) obj : null);
                break;
            case "in2":
                ((InterfaceC6240oI0) interfaceC0973Mg).setIn2(view, obj != null ? (String) obj : null);
                break;
            case "mode":
                ((InterfaceC6240oI0) interfaceC0973Mg).setMode(view, (String) obj);
                break;
            case "width":
                ((InterfaceC6240oI0) interfaceC0973Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    private final void z1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "height":
                ((InterfaceC6431pI0) interfaceC0973Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC6431pI0) interfaceC0973Mg).setResult(view, obj != null ? (String) obj : null);
                break;
            case "values":
                ((InterfaceC6431pI0) interfaceC0973Mg).setValues(view, (ReadableArray) obj);
                break;
            case "x":
                ((InterfaceC6431pI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC6431pI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "in1":
                ((InterfaceC6431pI0) interfaceC0973Mg).setIn1(view, obj != null ? (String) obj : null);
                break;
            case "type":
                ((InterfaceC6431pI0) interfaceC0973Mg).setType(view, (String) obj);
                break;
            case "width":
                ((InterfaceC6431pI0) interfaceC0973Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    @Override // defpackage.U0, defpackage.InterfaceC0364Ek1
    public void I(View view, String str, ReadableArray readableArray) {
        InterfaceC0973Mg interfaceC0973Mg;
        Object obj = this.b;
        switch (this.c) {
            case 0:
                str.getClass();
                InterfaceC0973Mg interfaceC0973Mg2 = (InterfaceC0973Mg) obj;
                if (!str.equals("closeDrawer")) {
                    if (str.equals("openDrawer")) {
                        ((InterfaceC5815m4) interfaceC0973Mg2).openDrawer(view);
                        break;
                    }
                } else {
                    ((InterfaceC5815m4) interfaceC0973Mg2).closeDrawer(view);
                    break;
                }
                break;
            case 2:
                str.getClass();
                if (str.equals("setNativeRefreshing")) {
                    ((E4) ((InterfaceC0973Mg) obj)).setNativeRefreshing(view, readableArray.getBoolean(0));
                    break;
                }
                break;
            case 3:
                str.getClass();
                if (str.equals("setNativeValue")) {
                    ((F4) ((InterfaceC0973Mg) obj)).setNativeValue(view, readableArray.getBoolean(0));
                    break;
                }
                break;
            case 7:
                str.getClass();
                if (str.equals("setNativePage")) {
                    ((ZH0) ((BaseViewManager) ((InterfaceC0973Mg) obj))).setNativePage(view, readableArray.getInt(0));
                    break;
                }
                break;
            case 15:
                str.getClass();
                interfaceC0973Mg = (InterfaceC0973Mg) obj;
                switch (str) {
                    case "cancelSearch":
                        ((InterfaceC5285jI0) ((BaseViewManager) interfaceC0973Mg)).cancelSearch(view);
                        break;
                    case "clearText":
                        ((InterfaceC5285jI0) ((BaseViewManager) interfaceC0973Mg)).clearText(view);
                        break;
                    case "toggleCancelButton":
                        ((InterfaceC5285jI0) ((BaseViewManager) interfaceC0973Mg)).toggleCancelButton(view, readableArray.getBoolean(0));
                        break;
                    case "blur":
                        ((InterfaceC5285jI0) ((BaseViewManager) interfaceC0973Mg)).blur(view);
                        break;
                    case "focus":
                        ((InterfaceC5285jI0) ((BaseViewManager) interfaceC0973Mg)).focus(view);
                        break;
                    case "setText":
                        ((InterfaceC5285jI0) ((BaseViewManager) interfaceC0973Mg)).setText(view, readableArray.getString(0));
                        break;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1726:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:2071:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:2415:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:2835:0x10e1  */
    /* JADX WARN: Removed duplicated region for block: B:2922:0x1231  */
    /* JADX WARN: Removed duplicated region for block: B:2996:0x1341  */
    /* JADX WARN: Removed duplicated region for block: B:3062:0x1456  */
    /* JADX WARN: Removed duplicated region for block: B:3109:0x1506  */
    /* JADX WARN: Removed duplicated region for block: B:3173:0x15da  */
    @Override // defpackage.U0, defpackage.InterfaceC0364Ek1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void T0(android.view.View r27, java.lang.String r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 6970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5624l4.T0(android.view.View, java.lang.String, java.lang.Object):void");
    }
}
