package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.view.C1932a;
import java.util.ArrayList;
import p000.AbstractC3929dS;
import p000.AbstractC8117Pl1;
import p000.C10743qA0;
import p000.C11931zU0;
import p000.C8452Vx0;
import p000.GM1;
import p000.InterfaceC6947uP;
import p000.K10;
import p000.OZ1;
import p000.XB0;
import p000.XZ1;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public abstract class VirtualView extends C1932a {
    private static final int CLIP_RULE_EVENODD = 0;
    static final int CLIP_RULE_NONZERO = 1;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private double canvasDiagonal;
    private float canvasHeight;
    private float canvasWidth;
    ArrayList<C10743qA0> elements;
    private double fontSize;
    private K10 glyphContext;
    RectF mBox;
    Matrix mCTM;
    boolean mCTMInvertible;
    private Path mCachedClipPath;
    private RectF mClientRect;
    RectF mClipBounds;
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    int mClipRule;
    final ReactContext mContext;
    String mDisplay;
    RectF mFillBounds;
    Path mFillPath;
    Matrix mInvCTM;
    Matrix mInvMatrix;
    final Matrix mInvTransform;
    boolean mInvertible;
    RectF mMarkerBounds;
    String mMarkerEnd;
    String mMarkerMid;
    Path mMarkerPath;
    Region mMarkerRegion;
    String mMarkerStart;
    String mMask;
    Matrix mMatrix;
    String mName;
    float mOpacity;
    Path mPath;
    XB0 mPointerEvents;
    Region mRegion;
    private boolean mResponsible;
    final float mScale;
    RectF mStrokeBounds;
    Path mStrokePath;
    Region mStrokeRegion;
    private C1993g mTextRoot;
    Matrix mTransform;
    boolean mTransformInvertible;
    private SvgView svgView;

    public VirtualView(ReactContext reactContext) {
        super(reactContext);
        this.mOpacity = 1.0f;
        this.mCTM = new Matrix();
        this.mMatrix = new Matrix();
        this.mTransform = new Matrix();
        this.mInvCTM = new Matrix();
        this.mInvMatrix = new Matrix();
        this.mInvTransform = new Matrix();
        this.mInvertible = true;
        this.mCTMInvertible = true;
        this.mTransformInvertible = true;
        this.fontSize = -1.0d;
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.mContext = reactContext;
        this.mScale = XZ1.m9087c().density;
    }

    private void clearParentCache() {
        VirtualView virtualView = this;
        while (true) {
            ViewParent parent = virtualView.getParent();
            if (!(parent instanceof VirtualView)) {
                return;
            }
            virtualView = (VirtualView) parent;
            if (virtualView.mPath == null) {
                return;
            } else {
                virtualView.clearCache();
            }
        }
    }

    private double fromRelativeFast(C11931zU0 c11931zU0) {
        double fontSizeFromContext;
        switch (AbstractC8117Pl1.f9274a[c11931zU0.f46848b.ordinal()]) {
            case 1:
                fontSizeFromContext = getFontSizeFromContext();
                break;
            case 2:
                fontSizeFromContext = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                fontSizeFromContext = 35.43307d;
                break;
            case 4:
                fontSizeFromContext = 3.543307d;
                break;
            case 5:
                fontSizeFromContext = 90.0d;
                break;
            case 6:
                fontSizeFromContext = 1.25d;
                break;
            case 7:
                fontSizeFromContext = 15.0d;
                break;
            default:
                fontSizeFromContext = 1.0d;
                break;
        }
        return c11931zU0.f46847a * fontSizeFromContext * this.mScale;
    }

    private double getCanvasDiagonal() {
        double d = this.canvasDiagonal;
        if (d != -1.0d) {
            return d;
        }
        double dSqrt = Math.sqrt(Math.pow(getCanvasHeight(), 2.0d) + Math.pow(getCanvasWidth(), 2.0d)) * M_SQRT1_2l;
        this.canvasDiagonal = dSqrt;
        return dSqrt;
    }

    private float getCanvasHeight() {
        float f = this.canvasHeight;
        if (f != -1.0f) {
            return f;
        }
        C1993g textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasHeight = getSvgView().getCanvasBounds().height();
        } else {
            this.canvasHeight = textRoot.f18603b.f5850O;
        }
        return this.canvasHeight;
    }

    private float getCanvasWidth() {
        float f = this.canvasWidth;
        if (f != -1.0f) {
            return f;
        }
        C1993g textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasWidth = getSvgView().getCanvasBounds().width();
        } else {
            this.canvasWidth = textRoot.f18603b.f5849N;
        }
        return this.canvasWidth;
    }

    private double getFontSizeFromContext() {
        double d = this.fontSize;
        if (d != -1.0d) {
            return d;
        }
        C1993g textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.f18603b;
        }
        double d2 = this.glyphContext.f5867q;
        this.fontSize = d2;
        return d2;
    }

    public void clearCache() {
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.fontSize = -1.0d;
        this.mStrokeRegion = null;
        this.mMarkerRegion = null;
        this.mRegion = null;
        this.mPath = null;
    }

    public void clearChildCache() {
        clearCache();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    public void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
    }

    public abstract void draw(Canvas canvas, Paint paint, float f);

    public RectF getClientRect() {
        return this.mClientRect;
    }

    public Path getClipPath() {
        return this.mCachedClipPath;
    }

    public C1993g getParentTextRoot() {
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((VirtualView) parent).getTextRoot();
        }
        return null;
    }

    public abstract Path getPath(Canvas canvas, Paint paint);

    public SvgView getSvgView() {
        SvgView svgView = this.svgView;
        if (svgView != null) {
            return svgView;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof SvgView) {
            this.svgView = (SvgView) parent;
        } else if (parent instanceof VirtualView) {
            this.svgView = ((VirtualView) parent).getSvgView();
        } else {
            AbstractC3929dS.m17672e("ReactNative");
        }
        return this.svgView;
    }

    public C1993g getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualView virtualView = this;
            while (true) {
                if (virtualView == null) {
                    break;
                }
                if (virtualView instanceof C1993g) {
                    C1993g c1993g = (C1993g) virtualView;
                    if (c1993g.f18603b != null) {
                        this.mTextRoot = c1993g;
                        break;
                    }
                }
                ViewParent parent = virtualView.getParent();
                virtualView = !(parent instanceof VirtualView) ? null : (VirtualView) parent;
            }
        }
        return this.mTextRoot;
    }

    public abstract int hitTest(float[] fArr);

    @Override // android.view.View
    public void invalidate() {
        if ((this instanceof RenderableView) && this.mPath == null) {
            return;
        }
        clearCache();
        clearParentCache();
        super.invalidate();
    }

    public boolean isResponsible() {
        return this.mResponsible;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.mClientRect != null) {
            SvgView svgView = getSvgView();
            int[] iArr = new int[2];
            getSvgView().getLocationOnScreen(iArr);
            Rect rect = new Rect();
            boolean z = false;
            rect.left = iArr[0] + ((int) Math.floor(this.mClientRect.left));
            rect.top = iArr[1] + ((int) Math.floor(this.mClientRect.top));
            rect.right = rect.left + ((int) Math.ceil(this.mClientRect.width()));
            rect.bottom = rect.top + ((int) Math.ceil(this.mClientRect.height()));
            Rect rect2 = new Rect();
            if (svgView.getGlobalVisibleRect(rect2) && rect.intersect(rect2)) {
                z = true;
            }
            String canonicalName = getClass().getCanonicalName();
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setClassName(canonicalName);
            accessibilityNodeInfo.setVisibleToUser(z);
        }
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mClientRect == null) {
            return;
        }
        if (!(this instanceof C1993g)) {
            int iFloor = (int) Math.floor(r1.left);
            int iFloor2 = (int) Math.floor(this.mClientRect.top);
            int iCeil = (int) Math.ceil(this.mClientRect.right);
            int iCeil2 = (int) Math.ceil(this.mClientRect.bottom);
            setLeft(iFloor);
            setTop(iFloor2);
            setRight(iCeil);
            setBottom(iCeil2);
        }
        setMeasuredDimension((int) Math.ceil(this.mClientRect.width()), (int) Math.ceil(this.mClientRect.height()));
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.mClientRect != null ? (int) Math.ceil(r0.width()) : View.getDefaultSize(getSuggestedMinimumWidth(), i), this.mClientRect != null ? (int) Math.ceil(r0.height()) : View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    public double relativeOn(C11931zU0 c11931zU0, float f) {
        double d;
        SVGLength$UnitType sVGLength$UnitType = c11931zU0.f46848b;
        SVGLength$UnitType sVGLength$UnitType2 = SVGLength$UnitType.NUMBER;
        double d2 = c11931zU0.f46847a;
        if (sVGLength$UnitType == sVGLength$UnitType2) {
            d = this.mScale;
        } else {
            if (sVGLength$UnitType != SVGLength$UnitType.PERCENTAGE) {
                return fromRelativeFast(c11931zU0);
            }
            d2 /= 100.0d;
            d = f;
        }
        return d2 * d;
    }

    public double relativeOnFraction(C11931zU0 c11931zU0, float f) {
        SVGLength$UnitType sVGLength$UnitType = c11931zU0.f46848b;
        SVGLength$UnitType sVGLength$UnitType2 = SVGLength$UnitType.NUMBER;
        double d = c11931zU0.f46847a;
        if (sVGLength$UnitType != sVGLength$UnitType2) {
            if (sVGLength$UnitType != SVGLength$UnitType.PERCENTAGE) {
                return fromRelativeFast(c11931zU0);
            }
            d /= 100.0d;
        }
        return d * f;
    }

    public double relativeOnHeight(C11931zU0 c11931zU0) {
        return relativeOn(c11931zU0, getCanvasHeight());
    }

    public double relativeOnOther(C11931zU0 c11931zU0) {
        return relativeOn(c11931zU0, (float) getCanvasDiagonal());
    }

    public double relativeOnWidth(C11931zU0 c11931zU0) {
        return relativeOn(c11931zU0, getCanvasWidth());
    }

    public void render(Canvas canvas, Paint paint, float f) {
        draw(canvas, paint, f);
    }

    public void restoreCanvas(Canvas canvas, int i) {
        canvas.restoreToCount(i);
    }

    public int saveAndSetupCanvas(Canvas canvas, Matrix matrix) {
        int iSave = canvas.save();
        this.mCTM.setConcat(this.mMatrix, this.mTransform);
        canvas.concat(this.mCTM);
        this.mCTM.preConcat(matrix);
        this.mCTMInvertible = this.mCTM.invert(this.mInvCTM);
        return iSave;
    }

    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
    }

    public void setClientRect(RectF rectF) {
        RectF rectF2 = this.mClientRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.mClientRect = rectF;
            if (rectF == null) {
                return;
            }
            int iCeil = (int) Math.ceil(rectF.width());
            int iCeil2 = (int) Math.ceil(this.mClientRect.height());
            int iFloor = (int) Math.floor(this.mClientRect.left);
            int iFloor2 = (int) Math.floor(this.mClientRect.top);
            int iCeil3 = (int) Math.ceil(this.mClientRect.right);
            int iCeil4 = (int) Math.ceil(this.mClientRect.bottom);
            setMeasuredDimension(iCeil, iCeil2);
            if (!(this instanceof C1993g)) {
                setLeft(iFloor);
                setTop(iFloor2);
                setRight(iCeil3);
                setBottom(iCeil4);
            }
            InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(this.mContext, getId());
            if (interfaceC6947uPM6091b != null) {
                interfaceC6947uPM6091b.mo11046g(C8452Vx0.m8643a(getId(), iFloor, iFloor2, iCeil, iCeil2));
            }
        }
    }

    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        invalidate();
    }

    public void setClipRule(int i) {
        this.mClipRule = i;
        invalidate();
    }

    public void setDisplay(String str) {
        this.mDisplay = str;
        invalidate();
    }

    public void setMarkerEnd(String str) {
        this.mMarkerEnd = str;
        invalidate();
    }

    public void setMarkerMid(String str) {
        this.mMarkerMid = str;
        invalidate();
    }

    public void setMarkerStart(String str) {
        this.mMarkerStart = str;
        invalidate();
    }

    public void setMask(String str) {
        this.mMask = str;
        invalidate();
    }

    public void setMatrix(Dynamic dynamic) {
        setMatrix((dynamic.isNull() || !dynamic.getType().equals(ReadableType.Array)) ? null : dynamic.asArray());
    }

    public void setName(String str) {
        this.mName = str;
        invalidate();
    }

    public void setOpacity(float f) {
        this.mOpacity = f;
        invalidate();
    }

    public void setPointerEvents(XB0 xb0) {
        this.mPointerEvents = xb0;
    }

    public void setResponsible(boolean z) {
        this.mResponsible = z;
        invalidate();
    }

    public Path getClipPath(Canvas canvas, Paint paint) {
        if (this.mClipPath != null) {
            C1987b c1987b = (C1987b) getSvgView().getDefinedClipPath(this.mClipPath);
            if (c1987b != null) {
                Path path = this.mClipRule == 0 ? c1987b.getPath(canvas, paint) : c1987b.mo11362n(canvas, paint, Region.Op.UNION);
                path.transform(c1987b.mMatrix);
                path.transform(c1987b.mTransform);
                int i = this.mClipRule;
                if (i == 0) {
                    path.setFillType(Path.FillType.EVEN_ODD);
                } else if (i != 1) {
                    AbstractC3929dS.m17683p("ReactNative");
                }
                this.mCachedClipPath = path;
            } else {
                AbstractC3929dS.m17683p("ReactNative");
            }
        }
        return getClipPath();
    }

    public void setMatrix(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = sRawMatrix;
            int iM3053f = GM1.m3053f(readableArray, fArr, this.mScale);
            if (iM3053f == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                    this.mInvMatrix = new Matrix();
                }
                this.mMatrix.setValues(fArr);
                this.mInvertible = this.mMatrix.invert(this.mInvMatrix);
            } else if (iM3053f != -1) {
                AbstractC3929dS.m17683p("ReactNative");
            }
        } else {
            this.mMatrix.reset();
            this.mInvMatrix.reset();
            this.mInvertible = true;
        }
        super.invalidate();
        clearParentCache();
    }
}
