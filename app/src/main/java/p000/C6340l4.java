package p000;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: l4 */
/* loaded from: classes.dex */
public final class C6340l4 extends AbstractC1259U0 {

    /* renamed from: c */
    public final /* synthetic */ int f36857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6340l4(InterfaceC0798Mg interfaceC0798Mg, int i) {
        super(5, interfaceC0798Mg);
        this.f36857c = i;
    }

    /* renamed from: A1 */
    private final void m22343A1(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "floodColor":
                ((InterfaceC10759qI0) interfaceC0798Mg).setFloodColor(view, new DynamicFromObject(obj));
                break;
            case "height":
                ((InterfaceC10759qI0) interfaceC0798Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "floodOpacity":
                ((InterfaceC10759qI0) interfaceC0798Mg).setFloodOpacity(view, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "result":
                ((InterfaceC10759qI0) interfaceC0798Mg).setResult(view, obj == null ? null : (String) obj);
                break;
            case "x":
                ((InterfaceC10759qI0) interfaceC0798Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC10759qI0) interfaceC0798Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "width":
                ((InterfaceC10759qI0) interfaceC0798Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }

    /* renamed from: B1 */
    private final void m22344B1(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "height":
                ((InterfaceC10887rI0) interfaceC0798Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC10887rI0) interfaceC0798Mg).setResult(view, obj != null ? (String) obj : null);
                break;
            case "x":
                ((InterfaceC10887rI0) interfaceC0798Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC10887rI0) interfaceC0798Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "in1":
                ((InterfaceC10887rI0) interfaceC0798Mg).setIn1(view, obj != null ? (String) obj : null);
                break;
            case "width":
                ((InterfaceC10887rI0) interfaceC0798Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            case "edgeMode":
                ((InterfaceC10887rI0) interfaceC0798Mg).setEdgeMode(view, (String) obj);
                break;
            case "stdDeviationX":
                ((InterfaceC10887rI0) interfaceC0798Mg).setStdDeviationX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "stdDeviationY":
                ((InterfaceC10887rI0) interfaceC0798Mg).setStdDeviationY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }

    /* renamed from: C1 */
    private final void m22345C1(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "height":
                ((InterfaceC11015sI0) interfaceC0798Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC11015sI0) interfaceC0798Mg).setResult(view, obj == null ? null : (String) obj);
                break;
            case "x":
                ((InterfaceC11015sI0) interfaceC0798Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC11015sI0) interfaceC0798Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "nodes":
                ((InterfaceC11015sI0) interfaceC0798Mg).setNodes(view, (ReadableArray) obj);
                break;
            case "width":
                ((InterfaceC11015sI0) interfaceC0798Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }

    /* renamed from: D1 */
    private final void m22346D1(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "height":
                ((InterfaceC11143tI0) interfaceC0798Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC11143tI0) interfaceC0798Mg).setResult(view, obj != null ? (String) obj : null);
                break;
            case "x":
                ((InterfaceC11143tI0) interfaceC0798Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC11143tI0) interfaceC0798Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "dx":
                ((InterfaceC11143tI0) interfaceC0798Mg).setDx(view, new DynamicFromObject(obj));
                break;
            case "dy":
                ((InterfaceC11143tI0) interfaceC0798Mg).setDy(view, new DynamicFromObject(obj));
                break;
            case "in1":
                ((InterfaceC11143tI0) interfaceC0798Mg).setIn1(view, obj != null ? (String) obj : null);
                break;
            case "width":
                ((InterfaceC11143tI0) interfaceC0798Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }

    /* renamed from: E1 */
    private final void m22347E1(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "primitiveUnits":
                ((InterfaceC11271uI0) interfaceC0798Mg).setPrimitiveUnits(view, (String) obj);
                break;
            case "height":
                ((InterfaceC11271uI0) interfaceC0798Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "filterUnits":
                ((InterfaceC11271uI0) interfaceC0798Mg).setFilterUnits(view, (String) obj);
                break;
            case "x":
                ((InterfaceC11271uI0) interfaceC0798Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC11271uI0) interfaceC0798Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "name":
                ((InterfaceC11271uI0) interfaceC0798Mg).setName(view, obj == null ? null : (String) obj);
                break;
            case "width":
                ((InterfaceC11271uI0) interfaceC0798Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }

    /* renamed from: F1 */
    private final void m22348F1(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "filter":
                ((InterfaceC11399vI0) interfaceC0798Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0798Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "height":
                ((InterfaceC11399vI0) interfaceC0798Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((InterfaceC11399vI0) interfaceC0798Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((InterfaceC11399vI0) interfaceC0798Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC11399vI0) interfaceC0798Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC11399vI0) interfaceC0798Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((InterfaceC11399vI0) interfaceC0798Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((InterfaceC11399vI0) interfaceC0798Mg).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((InterfaceC11399vI0) interfaceC0798Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((InterfaceC11399vI0) interfaceC0798Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((InterfaceC11399vI0) interfaceC0798Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((InterfaceC11399vI0) interfaceC0798Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((InterfaceC11399vI0) interfaceC0798Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((InterfaceC11399vI0) interfaceC0798Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC11399vI0) interfaceC0798Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((InterfaceC11399vI0) interfaceC0798Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((InterfaceC11399vI0) interfaceC0798Mg).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((InterfaceC11399vI0) interfaceC0798Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC11399vI0) interfaceC0798Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((InterfaceC11399vI0) interfaceC0798Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((InterfaceC11399vI0) interfaceC0798Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((InterfaceC11399vI0) interfaceC0798Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "width":
                ((InterfaceC11399vI0) interfaceC0798Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            case "markerStart":
                ((InterfaceC11399vI0) interfaceC0798Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "fontSize":
                ((InterfaceC11399vI0) interfaceC0798Mg).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((InterfaceC11399vI0) interfaceC0798Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((InterfaceC11399vI0) interfaceC0798Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC11399vI0) interfaceC0798Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((InterfaceC11399vI0) interfaceC0798Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC11399vI0) interfaceC0798Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((InterfaceC11399vI0) interfaceC0798Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((InterfaceC11399vI0) interfaceC0798Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((InterfaceC11399vI0) interfaceC0798Mg).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }

    /* renamed from: G1 */
    private final void m22349G1(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "filter":
                ((InterfaceC11526wI0) interfaceC0798Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0798Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((InterfaceC11526wI0) interfaceC0798Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((InterfaceC11526wI0) interfaceC0798Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC11526wI0) interfaceC0798Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC11526wI0) interfaceC0798Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((InterfaceC11526wI0) interfaceC0798Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((InterfaceC11526wI0) interfaceC0798Mg).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((InterfaceC11526wI0) interfaceC0798Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((InterfaceC11526wI0) interfaceC0798Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((InterfaceC11526wI0) interfaceC0798Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((InterfaceC11526wI0) interfaceC0798Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((InterfaceC11526wI0) interfaceC0798Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fill":
                ((InterfaceC11526wI0) interfaceC0798Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((InterfaceC11526wI0) interfaceC0798Mg).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((InterfaceC11526wI0) interfaceC0798Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC11526wI0) interfaceC0798Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((InterfaceC11526wI0) interfaceC0798Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((InterfaceC11526wI0) interfaceC0798Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((InterfaceC11526wI0) interfaceC0798Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((InterfaceC11526wI0) interfaceC0798Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "fontSize":
                ((InterfaceC11526wI0) interfaceC0798Mg).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((InterfaceC11526wI0) interfaceC0798Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((InterfaceC11526wI0) interfaceC0798Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC11526wI0) interfaceC0798Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((InterfaceC11526wI0) interfaceC0798Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC11526wI0) interfaceC0798Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((InterfaceC11526wI0) interfaceC0798Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((InterfaceC11526wI0) interfaceC0798Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((InterfaceC11526wI0) interfaceC0798Mg).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }

    /* renamed from: H1 */
    private final void m22350H1(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "filter":
                ((InterfaceC11653xI0) interfaceC0798Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0798Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "height":
                ((InterfaceC11653xI0) interfaceC0798Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((InterfaceC11653xI0) interfaceC0798Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((InterfaceC11653xI0) interfaceC0798Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC11653xI0) interfaceC0798Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC11653xI0) interfaceC0798Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((InterfaceC11653xI0) interfaceC0798Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((InterfaceC11653xI0) interfaceC0798Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((InterfaceC11653xI0) interfaceC0798Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((InterfaceC11653xI0) interfaceC0798Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((InterfaceC11653xI0) interfaceC0798Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((InterfaceC11653xI0) interfaceC0798Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((InterfaceC11653xI0) interfaceC0798Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC11653xI0) interfaceC0798Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "src":
                ((InterfaceC11653xI0) interfaceC0798Mg).setSrc(view, (ReadableMap) obj);
                break;
            case "fill":
                ((InterfaceC11653xI0) interfaceC0798Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((InterfaceC11653xI0) interfaceC0798Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC11653xI0) interfaceC0798Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((InterfaceC11653xI0) interfaceC0798Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((InterfaceC11653xI0) interfaceC0798Mg).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((InterfaceC11653xI0) interfaceC0798Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((InterfaceC11653xI0) interfaceC0798Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "width":
                ((InterfaceC11653xI0) interfaceC0798Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            case "markerStart":
                ((InterfaceC11653xI0) interfaceC0798Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((InterfaceC11653xI0) interfaceC0798Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((InterfaceC11653xI0) interfaceC0798Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC11653xI0) interfaceC0798Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((InterfaceC11653xI0) interfaceC0798Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC11653xI0) interfaceC0798Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((InterfaceC11653xI0) interfaceC0798Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((InterfaceC11653xI0) interfaceC0798Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "meetOrSlice":
                ((InterfaceC11653xI0) interfaceC0798Mg).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeWidth":
                ((InterfaceC11653xI0) interfaceC0798Mg).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }

    /* renamed from: w1 */
    private final void m22351w1(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "filter":
                ((InterfaceC10119lI0) interfaceC0798Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0798Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((InterfaceC10119lI0) interfaceC0798Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((InterfaceC10119lI0) interfaceC0798Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC10119lI0) interfaceC0798Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC10119lI0) interfaceC0798Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((InterfaceC10119lI0) interfaceC0798Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((InterfaceC10119lI0) interfaceC0798Mg).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((InterfaceC10119lI0) interfaceC0798Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((InterfaceC10119lI0) interfaceC0798Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((InterfaceC10119lI0) interfaceC0798Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((InterfaceC10119lI0) interfaceC0798Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((InterfaceC10119lI0) interfaceC0798Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fill":
                ((InterfaceC10119lI0) interfaceC0798Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((InterfaceC10119lI0) interfaceC0798Mg).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((InterfaceC10119lI0) interfaceC0798Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC10119lI0) interfaceC0798Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((InterfaceC10119lI0) interfaceC0798Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((InterfaceC10119lI0) interfaceC0798Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((InterfaceC10119lI0) interfaceC0798Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((InterfaceC10119lI0) interfaceC0798Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "fontSize":
                ((InterfaceC10119lI0) interfaceC0798Mg).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((InterfaceC10119lI0) interfaceC0798Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((InterfaceC10119lI0) interfaceC0798Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC10119lI0) interfaceC0798Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((InterfaceC10119lI0) interfaceC0798Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC10119lI0) interfaceC0798Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((InterfaceC10119lI0) interfaceC0798Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((InterfaceC10119lI0) interfaceC0798Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((InterfaceC10119lI0) interfaceC0798Mg).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }

    /* renamed from: x1 */
    private final void m22352x1(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "filter":
                ((InterfaceC10375nI0) interfaceC0798Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0798Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((InterfaceC10375nI0) interfaceC0798Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((InterfaceC10375nI0) interfaceC0798Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC10375nI0) interfaceC0798Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC10375nI0) interfaceC0798Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((InterfaceC10375nI0) interfaceC0798Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((InterfaceC10375nI0) interfaceC0798Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((InterfaceC10375nI0) interfaceC0798Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((InterfaceC10375nI0) interfaceC0798Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((InterfaceC10375nI0) interfaceC0798Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((InterfaceC10375nI0) interfaceC0798Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "cx":
                ((InterfaceC10375nI0) interfaceC0798Mg).setCx(view, new DynamicFromObject(obj));
                break;
            case "cy":
                ((InterfaceC10375nI0) interfaceC0798Mg).setCy(view, new DynamicFromObject(obj));
                break;
            case "rx":
                ((InterfaceC10375nI0) interfaceC0798Mg).setRx(view, new DynamicFromObject(obj));
                break;
            case "ry":
                ((InterfaceC10375nI0) interfaceC0798Mg).setRy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((InterfaceC10375nI0) interfaceC0798Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((InterfaceC10375nI0) interfaceC0798Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC10375nI0) interfaceC0798Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((InterfaceC10375nI0) interfaceC0798Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((InterfaceC10375nI0) interfaceC0798Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((InterfaceC10375nI0) interfaceC0798Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((InterfaceC10375nI0) interfaceC0798Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((InterfaceC10375nI0) interfaceC0798Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((InterfaceC10375nI0) interfaceC0798Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC10375nI0) interfaceC0798Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((InterfaceC10375nI0) interfaceC0798Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC10375nI0) interfaceC0798Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((InterfaceC10375nI0) interfaceC0798Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((InterfaceC10375nI0) interfaceC0798Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((InterfaceC10375nI0) interfaceC0798Mg).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }

    /* renamed from: y1 */
    private final void m22353y1(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "height":
                ((InterfaceC10503oI0) interfaceC0798Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC10503oI0) interfaceC0798Mg).setResult(view, obj != null ? (String) obj : null);
                break;
            case "x":
                ((InterfaceC10503oI0) interfaceC0798Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC10503oI0) interfaceC0798Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "in1":
                ((InterfaceC10503oI0) interfaceC0798Mg).setIn1(view, obj != null ? (String) obj : null);
                break;
            case "in2":
                ((InterfaceC10503oI0) interfaceC0798Mg).setIn2(view, obj != null ? (String) obj : null);
                break;
            case "mode":
                ((InterfaceC10503oI0) interfaceC0798Mg).setMode(view, (String) obj);
                break;
            case "width":
                ((InterfaceC10503oI0) interfaceC0798Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }

    /* renamed from: z1 */
    private final void m22354z1(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "height":
                ((InterfaceC10631pI0) interfaceC0798Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC10631pI0) interfaceC0798Mg).setResult(view, obj != null ? (String) obj : null);
                break;
            case "values":
                ((InterfaceC10631pI0) interfaceC0798Mg).setValues(view, (ReadableArray) obj);
                break;
            case "x":
                ((InterfaceC10631pI0) interfaceC0798Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC10631pI0) interfaceC0798Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "in1":
                ((InterfaceC10631pI0) interfaceC0798Mg).setIn1(view, obj != null ? (String) obj : null);
                break;
            case "type":
                ((InterfaceC10631pI0) interfaceC0798Mg).setType(view, (String) obj);
                break;
            case "width":
                ((InterfaceC10631pI0) interfaceC0798Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }

    @Override // p000.AbstractC1259U0, p000.InterfaceC7543Ek1
    /* renamed from: I */
    public void mo2372I(View view, String str, ReadableArray readableArray) {
        InterfaceC0798Mg interfaceC0798Mg;
        Object obj = this.f11615b;
        switch (this.f36857c) {
            case 0:
                str.getClass();
                InterfaceC0798Mg interfaceC0798Mg2 = (InterfaceC0798Mg) obj;
                if (!str.equals("closeDrawer")) {
                    if (str.equals("openDrawer")) {
                        ((InterfaceC6403m4) interfaceC0798Mg2).openDrawer(view);
                        break;
                    }
                } else {
                    ((InterfaceC6403m4) interfaceC0798Mg2).closeDrawer(view);
                    break;
                }
                break;
            case 2:
                str.getClass();
                if (str.equals("setNativeRefreshing")) {
                    ((InterfaceC0257E4) ((InterfaceC0798Mg) obj)).setNativeRefreshing(view, readableArray.getBoolean(0));
                    break;
                }
                break;
            case 3:
                str.getClass();
                if (str.equals("setNativeValue")) {
                    ((InterfaceC0320F4) ((InterfaceC0798Mg) obj)).setNativeValue(view, readableArray.getBoolean(0));
                    break;
                }
                break;
            case 7:
                str.getClass();
                if (str.equals("setNativePage")) {
                    ((ZH0) ((BaseViewManager) ((InterfaceC0798Mg) obj))).setNativePage(view, readableArray.getInt(0));
                    break;
                }
                break;
            case 15:
                str.getClass();
                interfaceC0798Mg = (InterfaceC0798Mg) obj;
                switch (str) {
                    case "cancelSearch":
                        ((InterfaceC9863jI0) ((BaseViewManager) interfaceC0798Mg)).cancelSearch(view);
                        break;
                    case "clearText":
                        ((InterfaceC9863jI0) ((BaseViewManager) interfaceC0798Mg)).clearText(view);
                        break;
                    case "toggleCancelButton":
                        ((InterfaceC9863jI0) ((BaseViewManager) interfaceC0798Mg)).toggleCancelButton(view, readableArray.getBoolean(0));
                        break;
                    case "blur":
                        ((InterfaceC9863jI0) ((BaseViewManager) interfaceC0798Mg)).blur(view);
                        break;
                    case "focus":
                        ((InterfaceC9863jI0) ((BaseViewManager) interfaceC0798Mg)).focus(view);
                        break;
                    case "setText":
                        ((InterfaceC9863jI0) ((BaseViewManager) interfaceC0798Mg)).setText(view, readableArray.getString(0));
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
    @Override // p000.AbstractC1259U0, p000.InterfaceC7543Ek1
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2373T0(android.view.View r27, java.lang.String r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 6970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6340l4.mo2373T0(android.view.View, java.lang.String, java.lang.Object):void");
    }
}
