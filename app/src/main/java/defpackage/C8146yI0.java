package defpackage;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: yI0 */
/* loaded from: classes.dex */
public final class C8146yI0 extends U0 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8146yI0(InterfaceC0973Mg interfaceC0973Mg, int i) {
        super(5, interfaceC0973Mg);
        this.c = i;
    }

    private final void A1(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "lengthAdjust":
                ((KI0) interfaceC0973Mg).setLengthAdjust(view, obj != null ? (String) obj : null);
                break;
            case "filter":
                ((KI0) interfaceC0973Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0973Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "alignmentBaseline":
                ((KI0) interfaceC0973Mg).setAlignmentBaseline(view, obj != null ? (String) obj : null);
                break;
            case "verticalAlign":
                ((KI0) interfaceC0973Mg).setVerticalAlign(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((KI0) interfaceC0973Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((KI0) interfaceC0973Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((KI0) interfaceC0973Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((KI0) interfaceC0973Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "rotate":
                ((KI0) interfaceC0973Mg).setRotate(view, new DynamicFromObject(obj));
                break;
            case "stroke":
                ((KI0) interfaceC0973Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((KI0) interfaceC0973Mg).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((KI0) interfaceC0973Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((KI0) interfaceC0973Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((KI0) interfaceC0973Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((KI0) interfaceC0973Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((KI0) interfaceC0973Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((KI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((KI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "dx":
                ((KI0) interfaceC0973Mg).setDx(view, new DynamicFromObject(obj));
                break;
            case "dy":
                ((KI0) interfaceC0973Mg).setDy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((KI0) interfaceC0973Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((KI0) interfaceC0973Mg).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((KI0) interfaceC0973Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((KI0) interfaceC0973Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((KI0) interfaceC0973Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((KI0) interfaceC0973Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((KI0) interfaceC0973Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((KI0) interfaceC0973Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "baselineShift":
                ((KI0) interfaceC0973Mg).setBaselineShift(view, new DynamicFromObject(obj));
                break;
            case "fontSize":
                ((KI0) interfaceC0973Mg).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((KI0) interfaceC0973Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "inlineSize":
                ((KI0) interfaceC0973Mg).setInlineSize(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((KI0) interfaceC0973Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((KI0) interfaceC0973Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "content":
                ((KI0) interfaceC0973Mg).setContent(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinecap":
                ((KI0) interfaceC0973Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "textLength":
                ((KI0) interfaceC0973Mg).setTextLength(view, new DynamicFromObject(obj));
                break;
            case "display":
                ((KI0) interfaceC0973Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((KI0) interfaceC0973Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((KI0) interfaceC0973Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((KI0) interfaceC0973Mg).setStrokeWidth(view, new DynamicFromObject(obj));
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
            case "lengthAdjust":
                ((LI0) interfaceC0973Mg).setLengthAdjust(view, obj != null ? (String) obj : null);
                break;
            case "filter":
                ((LI0) interfaceC0973Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0973Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "alignmentBaseline":
                ((LI0) interfaceC0973Mg).setAlignmentBaseline(view, obj != null ? (String) obj : null);
                break;
            case "verticalAlign":
                ((LI0) interfaceC0973Mg).setVerticalAlign(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((LI0) interfaceC0973Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((LI0) interfaceC0973Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((LI0) interfaceC0973Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((LI0) interfaceC0973Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "rotate":
                ((LI0) interfaceC0973Mg).setRotate(view, new DynamicFromObject(obj));
                break;
            case "stroke":
                ((LI0) interfaceC0973Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((LI0) interfaceC0973Mg).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((LI0) interfaceC0973Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((LI0) interfaceC0973Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((LI0) interfaceC0973Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((LI0) interfaceC0973Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((LI0) interfaceC0973Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((LI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((LI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "dx":
                ((LI0) interfaceC0973Mg).setDx(view, new DynamicFromObject(obj));
                break;
            case "dy":
                ((LI0) interfaceC0973Mg).setDy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((LI0) interfaceC0973Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((LI0) interfaceC0973Mg).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((LI0) interfaceC0973Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((LI0) interfaceC0973Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((LI0) interfaceC0973Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((LI0) interfaceC0973Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((LI0) interfaceC0973Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((LI0) interfaceC0973Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "baselineShift":
                ((LI0) interfaceC0973Mg).setBaselineShift(view, new DynamicFromObject(obj));
                break;
            case "fontSize":
                ((LI0) interfaceC0973Mg).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((LI0) interfaceC0973Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "inlineSize":
                ((LI0) interfaceC0973Mg).setInlineSize(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((LI0) interfaceC0973Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((LI0) interfaceC0973Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((LI0) interfaceC0973Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "textLength":
                ((LI0) interfaceC0973Mg).setTextLength(view, new DynamicFromObject(obj));
                break;
            case "display":
                ((LI0) interfaceC0973Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((LI0) interfaceC0973Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((LI0) interfaceC0973Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((LI0) interfaceC0973Mg).setStrokeWidth(view, new DynamicFromObject(obj));
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
            case "spacing":
                ((MI0) interfaceC0973Mg).setSpacing(view, obj != null ? (String) obj : null);
                break;
            case "startOffset":
                ((MI0) interfaceC0973Mg).setStartOffset(view, new DynamicFromObject(obj));
                break;
            case "lengthAdjust":
                ((MI0) interfaceC0973Mg).setLengthAdjust(view, obj != null ? (String) obj : null);
                break;
            case "filter":
                ((MI0) interfaceC0973Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0973Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "alignmentBaseline":
                ((MI0) interfaceC0973Mg).setAlignmentBaseline(view, obj != null ? (String) obj : null);
                break;
            case "verticalAlign":
                ((MI0) interfaceC0973Mg).setVerticalAlign(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((MI0) interfaceC0973Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "method":
                ((MI0) interfaceC0973Mg).setMethod(view, obj != null ? (String) obj : null);
                break;
            case "propList":
                ((MI0) interfaceC0973Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((MI0) interfaceC0973Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((MI0) interfaceC0973Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "rotate":
                ((MI0) interfaceC0973Mg).setRotate(view, new DynamicFromObject(obj));
                break;
            case "stroke":
                ((MI0) interfaceC0973Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((MI0) interfaceC0973Mg).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((MI0) interfaceC0973Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((MI0) interfaceC0973Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((MI0) interfaceC0973Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((MI0) interfaceC0973Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((MI0) interfaceC0973Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((MI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((MI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "dx":
                ((MI0) interfaceC0973Mg).setDx(view, new DynamicFromObject(obj));
                break;
            case "dy":
                ((MI0) interfaceC0973Mg).setDy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((MI0) interfaceC0973Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((MI0) interfaceC0973Mg).setFont(view, new DynamicFromObject(obj));
                break;
            case "href":
                ((MI0) interfaceC0973Mg).setHref(view, obj != null ? (String) obj : null);
                break;
            case "mask":
                ((MI0) interfaceC0973Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((MI0) interfaceC0973Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "side":
                ((MI0) interfaceC0973Mg).setSide(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((MI0) interfaceC0973Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((MI0) interfaceC0973Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((MI0) interfaceC0973Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((MI0) interfaceC0973Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "baselineShift":
                ((MI0) interfaceC0973Mg).setBaselineShift(view, new DynamicFromObject(obj));
                break;
            case "fontSize":
                ((MI0) interfaceC0973Mg).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((MI0) interfaceC0973Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "inlineSize":
                ((MI0) interfaceC0973Mg).setInlineSize(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((MI0) interfaceC0973Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((MI0) interfaceC0973Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((MI0) interfaceC0973Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "midLine":
                ((MI0) interfaceC0973Mg).setMidLine(view, obj != null ? (String) obj : null);
                break;
            case "textLength":
                ((MI0) interfaceC0973Mg).setTextLength(view, new DynamicFromObject(obj));
                break;
            case "display":
                ((MI0) interfaceC0973Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((MI0) interfaceC0973Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((MI0) interfaceC0973Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((MI0) interfaceC0973Mg).setStrokeWidth(view, new DynamicFromObject(obj));
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
            case "vbHeight":
                ((FI0) interfaceC0973Mg).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "filter":
                ((FI0) interfaceC0973Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0973Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "height":
                ((FI0) interfaceC0973Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((FI0) interfaceC0973Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((FI0) interfaceC0973Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((FI0) interfaceC0973Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((FI0) interfaceC0973Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((FI0) interfaceC0973Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((FI0) interfaceC0973Mg).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((FI0) interfaceC0973Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((FI0) interfaceC0973Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((FI0) interfaceC0973Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "patternUnits":
                ((FI0) interfaceC0973Mg).setPatternUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "patternContentUnits":
                ((FI0) interfaceC0973Mg).setPatternContentUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "fillOpacity":
                ((FI0) interfaceC0973Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((FI0) interfaceC0973Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((FI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((FI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((FI0) interfaceC0973Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((FI0) interfaceC0973Mg).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((FI0) interfaceC0973Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "minX":
                ((FI0) interfaceC0973Mg).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minY":
                ((FI0) interfaceC0973Mg).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "name":
                ((FI0) interfaceC0973Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((FI0) interfaceC0973Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((FI0) interfaceC0973Mg).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((FI0) interfaceC0973Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((FI0) interfaceC0973Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "width":
                ((FI0) interfaceC0973Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            case "markerStart":
                ((FI0) interfaceC0973Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "vbWidth":
                ((FI0) interfaceC0973Mg).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fontSize":
                ((FI0) interfaceC0973Mg).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((FI0) interfaceC0973Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "patternTransform":
                ((FI0) interfaceC0973Mg).setPatternTransform(view, (ReadableArray) obj);
                break;
            case "clipPath":
                ((FI0) interfaceC0973Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((FI0) interfaceC0973Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((FI0) interfaceC0973Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((FI0) interfaceC0973Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((FI0) interfaceC0973Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((FI0) interfaceC0973Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "meetOrSlice":
                ((FI0) interfaceC0973Mg).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeWidth":
                ((FI0) interfaceC0973Mg).setStrokeWidth(view, new DynamicFromObject(obj));
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
                ((HI0) interfaceC0973Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0973Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "height":
                ((HI0) interfaceC0973Mg).setHeight(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((HI0) interfaceC0973Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((HI0) interfaceC0973Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((HI0) interfaceC0973Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((HI0) interfaceC0973Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((HI0) interfaceC0973Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((HI0) interfaceC0973Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((HI0) interfaceC0973Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((HI0) interfaceC0973Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((HI0) interfaceC0973Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((HI0) interfaceC0973Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((HI0) interfaceC0973Mg).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((HI0) interfaceC0973Mg).setY(view, new DynamicFromObject(obj));
                break;
            case "rx":
                ((HI0) interfaceC0973Mg).setRx(view, new DynamicFromObject(obj));
                break;
            case "ry":
                ((HI0) interfaceC0973Mg).setRy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((HI0) interfaceC0973Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((HI0) interfaceC0973Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((HI0) interfaceC0973Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((HI0) interfaceC0973Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((HI0) interfaceC0973Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((HI0) interfaceC0973Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "width":
                ((HI0) interfaceC0973Mg).setWidth(view, new DynamicFromObject(obj));
                break;
            case "markerStart":
                ((HI0) interfaceC0973Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((HI0) interfaceC0973Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((HI0) interfaceC0973Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((HI0) interfaceC0973Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((HI0) interfaceC0973Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((HI0) interfaceC0973Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((HI0) interfaceC0973Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((HI0) interfaceC0973Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((HI0) interfaceC0973Mg).setStrokeWidth(view, new DynamicFromObject(obj));
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
            case "bbHeight":
                ((II0) interfaceC0973Mg).setBbHeight(view, new DynamicFromObject(obj));
                break;
            case "borderRightColor":
                ((II0) interfaceC0973Mg).setBorderRightColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "backfaceVisibility":
                ((II0) interfaceC0973Mg).setBackfaceVisibility(view, obj != null ? (String) obj : null);
                break;
            case "vbHeight":
                ((II0) interfaceC0973Mg).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "borderTopColor":
                ((II0) interfaceC0973Mg).setBorderTopColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderBottomColor":
                ((II0) interfaceC0973Mg).setBorderBottomColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderTopLeftRadius":
                ((II0) interfaceC0973Mg).setBorderTopLeftRadius(view, new DynamicFromObject(obj));
                break;
            case "accessible":
                ((II0) interfaceC0973Mg).setAccessible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "borderTopStartRadius":
                ((II0) interfaceC0973Mg).setBorderTopStartRadius(view, new DynamicFromObject(obj));
                break;
            case "borderBottomStartRadius":
                ((II0) interfaceC0973Mg).setBorderBottomStartRadius(view, new DynamicFromObject(obj));
                break;
            case "hasTVPreferredFocus":
                ((II0) interfaceC0973Mg).setHasTVPreferredFocus(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "nextFocusDown":
                ((II0) interfaceC0973Mg).setNextFocusDown(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "nextFocusLeft":
                ((II0) interfaceC0973Mg).setNextFocusLeft(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "borderTopEndRadius":
                ((II0) interfaceC0973Mg).setBorderTopEndRadius(view, new DynamicFromObject(obj));
                break;
            case "bbWidth":
                ((II0) interfaceC0973Mg).setBbWidth(view, new DynamicFromObject(obj));
                break;
            case "pointerEvents":
                ((II0) interfaceC0973Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "removeClippedSubviews":
                ((II0) interfaceC0973Mg).setRemoveClippedSubviews(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "borderLeftColor":
                ((II0) interfaceC0973Mg).setBorderLeftColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderStartEndRadius":
                ((II0) interfaceC0973Mg).setBorderStartEndRadius(view, new DynamicFromObject(obj));
                break;
            case "borderBottomEndRadius":
                ((II0) interfaceC0973Mg).setBorderBottomEndRadius(view, new DynamicFromObject(obj));
                break;
            case "nativeForegroundAndroid":
                ((II0) interfaceC0973Mg).setNativeForegroundAndroid(view, (ReadableMap) obj);
                break;
            case "borderStartStartRadius":
                ((II0) interfaceC0973Mg).setBorderStartStartRadius(view, new DynamicFromObject(obj));
                break;
            case "minX":
                ((II0) interfaceC0973Mg).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minY":
                ((II0) interfaceC0973Mg).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((II0) interfaceC0973Mg).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((II0) interfaceC0973Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vbWidth":
                ((II0) interfaceC0973Mg).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "borderBlockStartColor":
                ((II0) interfaceC0973Mg).setBorderBlockStartColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderTopRightRadius":
                ((II0) interfaceC0973Mg).setBorderTopRightRadius(view, new DynamicFromObject(obj));
                break;
            case "nextFocusForward":
                ((II0) interfaceC0973Mg).setNextFocusForward(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "borderBottomLeftRadius":
                ((II0) interfaceC0973Mg).setBorderBottomLeftRadius(view, new DynamicFromObject(obj));
                break;
            case "borderBottomRightRadius":
                ((II0) interfaceC0973Mg).setBorderBottomRightRadius(view, new DynamicFromObject(obj));
                break;
            case "nextFocusUp":
                ((II0) interfaceC0973Mg).setNextFocusUp(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "borderBlockColor":
                ((II0) interfaceC0973Mg).setBorderBlockColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderColor":
                ((II0) interfaceC0973Mg).setBorderColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderStyle":
                ((II0) interfaceC0973Mg).setBorderStyle(view, obj != null ? (String) obj : null);
                break;
            case "borderBlockEndColor":
                ((II0) interfaceC0973Mg).setBorderBlockEndColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderEndStartRadius":
                ((II0) interfaceC0973Mg).setBorderEndStartRadius(view, new DynamicFromObject(obj));
                break;
            case "hitSlop":
                ((II0) interfaceC0973Mg).setHitSlop(view, new DynamicFromObject(obj));
                break;
            case "borderEndColor":
                ((II0) interfaceC0973Mg).setBorderEndColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderRadius":
                ((II0) interfaceC0973Mg).setBorderRadius(view, new DynamicFromObject(obj));
                break;
            case "focusable":
                ((II0) interfaceC0973Mg).setFocusable(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "needsOffscreenAlphaCompositing":
                ((II0) interfaceC0973Mg).setNeedsOffscreenAlphaCompositing(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "borderEndEndRadius":
                ((II0) interfaceC0973Mg).setBorderEndEndRadius(view, new DynamicFromObject(obj));
                break;
            case "nativeBackgroundAndroid":
                ((II0) interfaceC0973Mg).setNativeBackgroundAndroid(view, (ReadableMap) obj);
                break;
            case "meetOrSlice":
                ((II0) interfaceC0973Mg).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "nextFocusRight":
                ((II0) interfaceC0973Mg).setNextFocusRight(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "borderStartColor":
                ((II0) interfaceC0973Mg).setBorderStartColor(view, ColorPropConverter.getColor(obj, view.getContext()));
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
            case "vbHeight":
                ((JI0) interfaceC0973Mg).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "filter":
                ((JI0) interfaceC0973Mg).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                interfaceC0973Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((JI0) interfaceC0973Mg).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((JI0) interfaceC0973Mg).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((JI0) interfaceC0973Mg).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((JI0) interfaceC0973Mg).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((JI0) interfaceC0973Mg).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((JI0) interfaceC0973Mg).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((JI0) interfaceC0973Mg).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((JI0) interfaceC0973Mg).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((JI0) interfaceC0973Mg).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((JI0) interfaceC0973Mg).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((JI0) interfaceC0973Mg).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fill":
                ((JI0) interfaceC0973Mg).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((JI0) interfaceC0973Mg).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((JI0) interfaceC0973Mg).setMask(view, obj != null ? (String) obj : null);
                break;
            case "minX":
                ((JI0) interfaceC0973Mg).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minY":
                ((JI0) interfaceC0973Mg).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "name":
                ((JI0) interfaceC0973Mg).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((JI0) interfaceC0973Mg).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((JI0) interfaceC0973Mg).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((JI0) interfaceC0973Mg).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((JI0) interfaceC0973Mg).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((JI0) interfaceC0973Mg).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "vbWidth":
                ((JI0) interfaceC0973Mg).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fontSize":
                ((JI0) interfaceC0973Mg).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((JI0) interfaceC0973Mg).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((JI0) interfaceC0973Mg).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((JI0) interfaceC0973Mg).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((JI0) interfaceC0973Mg).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((JI0) interfaceC0973Mg).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((JI0) interfaceC0973Mg).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((JI0) interfaceC0973Mg).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "meetOrSlice":
                ((JI0) interfaceC0973Mg).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeWidth":
                ((JI0) interfaceC0973Mg).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:1867:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:2128:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:2288:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:2517:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:2799:0x0dec  */
    /* JADX WARN: Removed duplicated region for block: B:3126:0x12c7  */
    /* JADX WARN: Removed duplicated region for block: B:3274:0x14e7  */
    @Override // defpackage.U0, defpackage.InterfaceC0364Ek1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T0(android.view.View r25, java.lang.String r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 7586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8146yI0.T0(android.view.View, java.lang.String, java.lang.Object):void");
    }
}
