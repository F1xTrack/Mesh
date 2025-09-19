package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.yandex.varioqub.config.model.ConfigValue;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.AbstractC3929dS;
import p000.AbstractC6620pU;
import p000.AbstractC7222ym;
import p000.C10743qA0;
import p000.C11931zU0;
import p000.C4134gj;
import p000.CI0;
import p000.E02;
import p000.EnumC6889tU;
import p000.TB0;
import p000.XB0;

/* loaded from: classes.dex */
public abstract class RenderableView extends VirtualView {
    private static final int CAP_BUTT = 0;
    static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    static final int JOIN_ROUND = 1;
    private static final int VECTOR_EFFECT_DEFAULT = 0;
    private static final int VECTOR_EFFECT_NON_SCALING_STROKE = 1;
    static RenderableView contextElement;
    private static final Pattern regex = Pattern.compile("[0-9.-]+");
    public ReadableArray fill;
    public float fillOpacity;
    public Path.FillType fillRule;
    private ArrayList<String> mAttributeList;
    private int mCurrentColor;
    String mFilter;
    private ArrayList<String> mLastMergedList;
    private ArrayList<Object> mOriginProperties;
    private ArrayList<String> mPropList;
    public ReadableArray stroke;
    public C11931zU0[] strokeDasharray;
    public float strokeDashoffset;
    public Paint.Cap strokeLinecap;
    public Paint.Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public C11931zU0 strokeWidth;
    public int vectorEffect;

    public RenderableView(ReactContext reactContext) {
        super(reactContext);
        this.vectorEffect = 0;
        this.strokeWidth = new C11931zU0(1.0d);
        this.strokeOpacity = 1.0f;
        this.strokeMiterlimit = 4.0f;
        this.strokeDashoffset = 0.0f;
        this.strokeLinecap = Paint.Cap.BUTT;
        this.strokeLinejoin = Paint.Join.MITER;
        this.mCurrentColor = 0;
        this.fillOpacity = 1.0f;
        this.fillRule = Path.FillType.WINDING;
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    private boolean hasOwnProperty(String str) {
        ArrayList<String> arrayList = this.mAttributeList;
        return arrayList != null && arrayList.contains(str);
    }

    private void setupPaint(Paint paint, float f, ReadableArray readableArray) {
        float f2;
        float f3;
        char c;
        int[] iArr;
        float[] fArr;
        int[] iArr2;
        float[] fArr2;
        double d;
        ReadableArray readableArray2;
        RenderableView renderableView;
        ReadableArray readableArray3;
        int i = 0;
        int i2 = readableArray.getInt(0);
        if (i2 == 0) {
            if (readableArray.size() != 2) {
                paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * f * 255.0d : 255.0f * f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
                return;
            } else {
                paint.setColor(((readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1)) & 16777215) | (Math.round((r1 >>> 24) * f) << 24));
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                paint.setColor((Math.round((r3 >>> 24) * f) << 24) | (getCurrentColor() & 16777215));
                return;
            }
            if (i2 != 3) {
                if (i2 != 4 || (renderableView = contextElement) == null || (readableArray3 = renderableView.stroke) == null) {
                    return;
                }
                setupPaint(paint, f, readableArray3);
                return;
            }
            RenderableView renderableView2 = contextElement;
            if (renderableView2 == null || (readableArray2 = renderableView2.fill) == null) {
                return;
            }
            setupPaint(paint, f, readableArray2);
            return;
        }
        C4134gj definedBrush = getSvgView().getDefinedBrush(readableArray.getString(1));
        if (definedBrush != null) {
            RectF rectF = this.mBox;
            float f4 = this.mScale;
            boolean z = definedBrush.f27956d;
            if (!z) {
                rectF = new RectF(definedBrush.f27959g);
            }
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            if (z) {
                f3 = rectF.left;
                f2 = rectF.top;
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            RectF rectF2 = new RectF(f3, f2, fWidth + f3, fHeight + f2);
            float fWidth2 = rectF2.width();
            float fHeight2 = rectF2.height();
            float f5 = rectF2.left;
            float f6 = rectF2.top;
            float textSize = paint.getTextSize();
            C11931zU0[] c11931zU0Arr = definedBrush.f27954b;
            int i3 = definedBrush.f27953a;
            if (i3 == 3) {
                double d2 = fWidth2;
                double dM18604a = definedBrush.m18604a(c11931zU0Arr[0], d2, f4, textSize);
                double d3 = fHeight2;
                double dM18604a2 = definedBrush.m18604a(c11931zU0Arr[1], d3, f4, textSize);
                double dM18604a3 = definedBrush.m18604a(c11931zU0Arr[2], d2, f4, textSize);
                double dM18604a4 = definedBrush.m18604a(c11931zU0Arr[3], d3, f4, textSize);
                if (dM18604a3 <= 1.0d || dM18604a4 <= 1.0d) {
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) dM18604a3, (int) dM18604a4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                C2000n c2000n = definedBrush.f27960h;
                c2000n.getClass();
                float f7 = c2000n.f18656l;
                float f8 = c2000n.mScale;
                float f9 = c2000n.f18657m;
                RectF rectF3 = new RectF(f7 * f8, f9 * f8, (f7 + c2000n.f18658n) * f8, (f9 + c2000n.f18659o) * f8);
                if (rectF3.width() > 0.0f && rectF3.height() > 0.0f) {
                    RectF rectF4 = new RectF((float) dM18604a, (float) dM18604a2, (float) dM18604a3, (float) dM18604a4);
                    C2000n c2000n2 = definedBrush.f27960h;
                    canvas.concat(E02.m1975b(rectF3, rectF4, c2000n2.f18660p, c2000n2.f18661q));
                }
                if (definedBrush.f27957e) {
                    canvas.scale(fWidth2 / f4, fHeight2 / f4);
                }
                definedBrush.f27960h.draw(canvas, new Paint(), f);
                Matrix matrix = new Matrix();
                Matrix matrix2 = definedBrush.f27958f;
                if (matrix2 != null) {
                    matrix.preConcat(matrix2);
                }
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                return;
            }
            int size = definedBrush.f27955c.size();
            if (size == 0) {
                AbstractC3929dS.m17683p("ReactNative");
                return;
            }
            int i4 = size / 2;
            int[] iArr3 = new int[i4];
            float[] fArr3 = new float[i4];
            ReadableArray readableArray4 = definedBrush.f27955c;
            while (i < i4) {
                int i5 = i * 2;
                fArr3[i] = (float) readableArray4.getDouble(i5);
                iArr3[i] = (readableArray4.getInt(i5 + 1) & 16777215) | (Math.round((r8 >>> 24) * f) << 24);
                i++;
                i3 = i3;
            }
            int i6 = i3;
            if (i4 == 1) {
                c = 0;
                iArr = new int[]{iArr3[0], iArr3[0]};
                fArr = new float[]{fArr3[0], fArr3[0]};
                AbstractC3929dS.m17683p("ReactNative");
            } else {
                c = 0;
                iArr = iArr3;
                fArr = fArr3;
            }
            if (i6 == 1) {
                C11931zU0 c11931zU0 = c11931zU0Arr[c];
                double d4 = fWidth2;
                double d5 = f5;
                double d6 = fHeight2;
                double d7 = f6;
                LinearGradient linearGradient = new LinearGradient((float) (definedBrush.m18604a(c11931zU0, d4, f4, textSize) + d5), (float) (definedBrush.m18604a(c11931zU0Arr[1], d6, f4, textSize) + d7), (float) (definedBrush.m18604a(c11931zU0Arr[2], d4, f4, textSize) + d5), (float) (definedBrush.m18604a(c11931zU0Arr[3], d6, f4, textSize) + d7), iArr, fArr, Shader.TileMode.CLAMP);
                if (definedBrush.f27958f != null) {
                    Matrix matrix3 = new Matrix();
                    matrix3.preConcat(definedBrush.f27958f);
                    linearGradient.setLocalMatrix(matrix3);
                }
                paint.setShader(linearGradient);
                return;
            }
            float[] fArr4 = fArr;
            if (i6 == 2) {
                double d8 = fWidth2;
                double dM18604a5 = definedBrush.m18604a(c11931zU0Arr[2], d8, f4, textSize);
                double d9 = fHeight2;
                double dM18604a6 = definedBrush.m18604a(c11931zU0Arr[3], d9, f4, textSize);
                if (dM18604a5 <= ConfigValue.DOUBLE_DEFAULT_VALUE || dM18604a6 <= ConfigValue.DOUBLE_DEFAULT_VALUE) {
                    float[] fArr5 = {fArr4[0], fArr4[fArr4.length - 1]};
                    iArr2 = new int[]{iArr[iArr.length - 1], iArr[iArr.length - 1]};
                    fArr2 = fArr5;
                    dM18604a6 = d9;
                    d = d8;
                } else {
                    fArr2 = fArr4;
                    iArr2 = iArr;
                    d = dM18604a5;
                }
                double d10 = dM18604a6 / d;
                RadialGradient radialGradient = new RadialGradient((float) (definedBrush.m18604a(c11931zU0Arr[4], d8, f4, textSize) + f5), (float) ((f6 / d10) + definedBrush.m18604a(c11931zU0Arr[5], d9 / d10, f4, textSize)), (float) d, iArr2, fArr2, Shader.TileMode.CLAMP);
                Matrix matrix4 = new Matrix();
                matrix4.preScale(1.0f, (float) d10);
                Matrix matrix5 = definedBrush.f27958f;
                if (matrix5 != null) {
                    matrix4.preConcat(matrix5);
                }
                radialGradient.setLocalMatrix(matrix4);
                paint.setShader(radialGradient);
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.mOpacity;
        boolean z = ((VirtualView) this).mPath == null;
        if (z) {
            Path path = getPath(canvas, paint);
            ((VirtualView) this).mPath = path;
            path.setFillType(this.fillRule);
        }
        boolean z2 = this.vectorEffect == 1;
        Path path2 = ((VirtualView) this).mPath;
        if (z2) {
            path2 = new Path();
            ((VirtualView) this).mPath.transform(this.mCTM, path2);
            canvas.setMatrix(null);
        }
        if (z || path2 != ((VirtualView) this).mPath) {
            RectF rectF = new RectF();
            this.mBox = rectF;
            path2.computeBounds(rectF, true);
        }
        RectF rectF2 = new RectF(this.mBox);
        this.mCTM.mapRect(rectF2);
        setClientRect(rectF2);
        clip(canvas, paint);
        if (setupFillPaint(paint, this.fillOpacity * f2)) {
            if (z) {
                Path path3 = new Path();
                this.mFillPath = path3;
                paint.getFillPath(path2, path3);
            }
            canvas.drawPath(path2, paint);
        }
        if (setupStrokePaint(paint, this.strokeOpacity * f2)) {
            if (z) {
                Path path4 = new Path();
                this.mStrokePath = path4;
                paint.getFillPath(path2, path4);
            }
            canvas.drawPath(path2, paint);
        }
        renderMarkers(canvas, paint, f2);
    }

    public int getCurrentColor() {
        int i = this.mCurrentColor;
        if (i != 0) {
            return i;
        }
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((RenderableView) parent).getCurrentColor();
        }
        if (parent instanceof SvgView) {
            return ((SvgView) parent).mCurrentColor;
        }
        return 0;
    }

    @Override // com.facebook.react.views.view.C1932a, p000.InterfaceC11657xK0
    public Rect getHitSlopRect() {
        if (((VirtualView) this).mPointerEvents == XB0.f13608c) {
            return new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    public abstract Path getPath(Canvas canvas, Paint paint);

    public Region getRegion(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
        return region;
    }

    @Override // com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        Region region2;
        if (((VirtualView) this).mPath == null || !this.mInvertible || !this.mTransformInvertible || ((VirtualView) this).mPointerEvents == XB0.f13607b) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        initBounds();
        Region region3 = this.mRegion;
        if ((region3 != null && region3.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && (region.contains(iRound, iRound2) || ((region2 = this.mMarkerRegion) != null && region2.contains(iRound, iRound2))))) {
            if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                return getId();
            }
            return -1;
        }
        return -1;
    }

    public void initBounds() {
        if (this.mRegion == null && this.mFillPath != null) {
            RectF rectF = new RectF();
            this.mFillBounds = rectF;
            this.mFillPath.computeBounds(rectF, true);
            this.mRegion = getRegion(this.mFillPath, this.mFillBounds);
        }
        if (this.mRegion == null && ((VirtualView) this).mPath != null) {
            RectF rectF2 = new RectF();
            this.mFillBounds = rectF2;
            ((VirtualView) this).mPath.computeBounds(rectF2, true);
            this.mRegion = getRegion(((VirtualView) this).mPath, this.mFillBounds);
        }
        if (this.mStrokeRegion == null && this.mStrokePath != null) {
            RectF rectF3 = new RectF();
            this.mStrokeBounds = rectF3;
            this.mStrokePath.computeBounds(rectF3, true);
            this.mStrokeRegion = getRegion(this.mStrokePath, this.mStrokeBounds);
        }
        if (this.mMarkerRegion == null && this.mMarkerPath != null) {
            RectF rectF4 = new RectF();
            this.mMarkerBounds = rectF4;
            this.mMarkerPath.computeBounds(rectF4, true);
            this.mMarkerRegion = getRegion(this.mMarkerPath, this.mMarkerBounds);
        }
        Path clipPath = getClipPath();
        if (clipPath == null || this.mClipRegionPath == clipPath) {
            return;
        }
        this.mClipRegionPath = clipPath;
        RectF rectF5 = new RectF();
        this.mClipBounds = rectF5;
        clipPath.computeBounds(rectF5, true);
        this.mClipRegion = getRegion(clipPath, this.mClipBounds);
    }

    public void mergeProperties(RenderableView renderableView) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        ArrayList<String> attributeList = renderableView.getAttributeList();
        if (attributeList == null || attributeList.size() == 0) {
            return;
        }
        this.mOriginProperties = new ArrayList<>();
        this.mAttributeList = this.mPropList == null ? new ArrayList<>() : new ArrayList<>(this.mPropList);
        int size = attributeList.size();
        for (int i = 0; i < size; i++) {
            try {
                String str = attributeList.get(i);
                Field field = getClass().getField(str);
                Object obj = field.get(renderableView);
                this.mOriginProperties.add(field.get(this));
                if (!hasOwnProperty(str)) {
                    this.mAttributeList.add(str);
                    field.set(this, obj);
                }
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
        this.mLastMergedList = attributeList;
    }

    @Override // com.horcrux.svg.VirtualView
    public void render(Canvas canvas, Paint paint, float f) {
        RectF rectF;
        RectF rectF2;
        C1991e c1991e;
        int i;
        C1999m c1999m = this.mMask != null ? (C1999m) getSvgView().getDefinedMask(this.mMask) : null;
        C1991e c1991e2 = this.mFilter != null ? (C1991e) getSvgView().getDefinedFilter(this.mFilter) : null;
        if (c1999m == null && c1991e2 == null) {
            draw(canvas, paint, f);
            return;
        }
        if (c1991e2 != null) {
            Paint paint2 = new Paint(2);
            canvas.saveLayer(null, paint2);
            Bitmap currentBitmap = getSvgView().getCurrentBitmap();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            canvas2.setMatrix(canvas.getMatrix());
            draw(canvas2, paint, f);
            initBounds();
            RectF clientRect = getClientRect();
            if ((this instanceof C1995i) && clientRect == null) {
                return;
            }
            HashMap map = c1991e2.f18593a;
            map.clear();
            map.put("SourceGraphic", bitmapCreateBitmap);
            map.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmapCreateBitmap));
            map.put("BackgroundImage", currentBitmap);
            map.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(currentBitmap));
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getConfig());
            Canvas canvas3 = new Canvas(bitmapCreateBitmap2);
            Rect cropRect = c1991e2.f18596d.getCropRect(c1991e2, c1991e2.f18594b, clientRect);
            int i2 = 0;
            int i3 = 0;
            while (i3 < c1991e2.getChildCount()) {
                View childAt = c1991e2.getChildAt(i3);
                if (childAt instanceof AbstractC6620pU) {
                    AbstractC6620pU abstractC6620pU = (AbstractC6620pU) childAt;
                    bitmapCreateBitmap2.eraseColor(i2);
                    FilterRegion filterRegion = abstractC6620pU.f40112b;
                    EnumC6889tU enumC6889tU = c1991e2.f18595c;
                    c1991e = c1991e2;
                    Rect cropRect2 = filterRegion.getCropRect(abstractC6620pU, enumC6889tU, enumC6889tU == EnumC6889tU.USER_SPACE_ON_USE ? new RectF(cropRect) : clientRect);
                    canvas3.drawBitmap(abstractC6620pU.mo4327l(map, bitmapCreateBitmap), cropRect2, cropRect2, (Paint) null);
                    i = 1;
                    Bitmap bitmapCopy = bitmapCreateBitmap2.copy(Bitmap.Config.ARGB_8888, true);
                    String str = abstractC6620pU.f40111a;
                    if (str != null) {
                        map.put(str, bitmapCopy);
                    }
                    bitmapCreateBitmap = bitmapCopy;
                } else {
                    c1991e = c1991e2;
                    i = 1;
                }
                i3 += i;
                c1991e2 = c1991e;
                i2 = 0;
            }
            bitmapCreateBitmap2.eraseColor(i2);
            rectF = null;
            canvas3.drawBitmap(bitmapCreateBitmap, cropRect, cropRect, (Paint) null);
            int iSave = canvas.save();
            canvas.setMatrix(null);
            canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint2);
            canvas.restoreToCount(iSave);
        } else {
            rectF = null;
            canvas.saveLayer(null, new Paint());
            draw(canvas, paint, f);
        }
        if (c1999m != null) {
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.saveLayer(rectF, paint3);
            if (c1999m.f18648k == 1) {
                Paint paint4 = new Paint();
                paint4.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f})));
                canvas.saveLayer(null, paint4);
            } else {
                canvas.saveLayer(null, paint);
            }
            if (c1999m.f18647j == 2) {
                float fRelativeOnWidth = (float) relativeOnWidth(c1999m.f18643f);
                float fRelativeOnHeight = (float) relativeOnHeight(c1999m.f18644g);
                rectF2 = new RectF(fRelativeOnWidth, fRelativeOnHeight, ((float) relativeOnWidth(c1999m.f18645h)) + fRelativeOnWidth, ((float) relativeOnHeight(c1999m.f18646i)) + fRelativeOnHeight);
            } else {
                RectF clientRect2 = getClientRect();
                if ((this instanceof C1995i) && clientRect2 == null) {
                    return;
                }
                this.mInvCTM.mapRect(clientRect2);
                float fRelativeOnFraction = (float) relativeOnFraction(c1999m.f18643f, clientRect2.width());
                float fRelativeOnFraction2 = (float) relativeOnFraction(c1999m.f18644g, clientRect2.height());
                float fRelativeOnFraction3 = (float) relativeOnFraction(c1999m.f18645h, clientRect2.width());
                float fRelativeOnFraction4 = (float) relativeOnFraction(c1999m.f18646i, clientRect2.height());
                float f2 = clientRect2.left + fRelativeOnFraction;
                float f3 = clientRect2.top + fRelativeOnFraction2;
                rectF2 = new RectF(f2, f3, fRelativeOnFraction3 + f2, fRelativeOnFraction4 + f3);
            }
            canvas.clipRect(rectF2);
            c1999m.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.saveLayer(null, paint3);
            canvas.clipRect(rectF2);
            c1999m.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public void renderMarkers(Canvas canvas, Paint paint, float f) {
        char c;
        TB0 tb0;
        TB0 tb0M1140c;
        TB0 tb0M1140c2;
        TB0 tb0M1140c3;
        TB0 tb0M1140c4;
        C1998l c1998l;
        C10743qA0 c10743qA0;
        long j;
        TB0 tb02;
        TB0 tb0M1140c5;
        C1998l c1998l2 = (C1998l) getSvgView().getDefinedMarker(this.mMarkerStart);
        C1998l c1998l3 = (C1998l) getSvgView().getDefinedMarker(this.mMarkerMid);
        C1998l c1998l4 = (C1998l) getSvgView().getDefinedMarker(this.mMarkerEnd);
        ArrayList<C10743qA0> arrayList = this.elements;
        if (arrayList != null) {
            if (c1998l2 == null && c1998l3 == null && c1998l4 == null) {
                return;
            }
            contextElement = this;
            CI0.f1301d = new ArrayList();
            char c2 = 0;
            CI0.f1302e = 0;
            CI0.f1303f = new TB0(ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);
            CI0.f1304g = new TB0(ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);
            Iterator<C10743qA0> it = arrayList.iterator();
            while (it.hasNext()) {
                C10743qA0 next = it.next();
                TB0[] tb0Arr = next.f40655b;
                int i = next.f40654a;
                int iM26247x = AbstractC7222ym.m26247x(i);
                if (iM26247x == 0) {
                    tb0 = tb0Arr[2];
                    TB0 tb0M1140c6 = CI0.m1140c(tb0Arr[c2], CI0.f1303f);
                    TB0 tb0M1140c7 = CI0.m1140c(tb0Arr[2], tb0Arr[1]);
                    if (CI0.m1139b(tb0M1140c6)) {
                        TB0 tb03 = tb0Arr[c2];
                        TB0 tb04 = tb0Arr[1];
                        TB0 tb05 = tb0Arr[2];
                        tb0M1140c3 = CI0.m1140c(tb04, tb03);
                        tb0M1140c4 = CI0.m1140c(tb05, tb04);
                        if (!CI0.m1139b(tb0M1140c3)) {
                            if (CI0.m1139b(tb0M1140c4)) {
                                tb0M1140c4 = tb0M1140c3;
                            }
                            tb0M1140c2 = tb0M1140c3;
                        }
                        tb0M1140c2 = tb0M1140c4;
                    } else if (CI0.m1139b(tb0M1140c7)) {
                        TB0 tb06 = CI0.f1303f;
                        TB0 tb07 = tb0Arr[c2];
                        TB0 tb08 = tb0Arr[1];
                        tb0M1140c3 = CI0.m1140c(tb07, tb06);
                        tb0M1140c4 = CI0.m1140c(tb08, tb07);
                        if (!CI0.m1139b(tb0M1140c3)) {
                            if (CI0.m1139b(tb0M1140c4)) {
                                tb0M1140c4 = tb0M1140c3;
                            }
                            tb0M1140c2 = tb0M1140c3;
                        }
                        tb0M1140c2 = tb0M1140c4;
                    } else {
                        tb0M1140c = tb0M1140c7;
                        tb0M1140c2 = tb0M1140c6;
                    }
                    tb0M1140c = tb0M1140c4;
                } else if (iM26247x != 1) {
                    if (iM26247x == 2 || iM26247x == 3) {
                        tb02 = tb0Arr[c2];
                        tb0M1140c5 = CI0.m1140c(tb02, CI0.f1303f);
                        tb0M1140c = CI0.m1140c(tb02, CI0.f1303f);
                    } else if (iM26247x != 4) {
                        tb0 = null;
                        tb0M1140c = null;
                        tb0M1140c2 = null;
                    } else {
                        tb02 = CI0.f1304g;
                        tb0M1140c5 = CI0.m1140c(tb02, CI0.f1303f);
                        tb0M1140c = CI0.m1140c(tb02, CI0.f1303f);
                    }
                    TB0 tb09 = tb02;
                    tb0M1140c2 = tb0M1140c5;
                    tb0 = tb09;
                } else {
                    tb0 = tb0Arr[1];
                    TB0 tb010 = CI0.f1303f;
                    TB0 tb011 = tb0Arr[c2];
                    tb0M1140c = CI0.m1140c(tb011, tb010);
                    tb0M1140c2 = CI0.m1140c(tb0, tb011);
                    if (CI0.m1139b(tb0M1140c)) {
                        tb0M1140c = tb0M1140c2;
                    } else if (CI0.m1139b(tb0M1140c2)) {
                        tb0M1140c2 = tb0M1140c;
                    } else {
                        tb0M1140c2 = tb0M1140c;
                        tb0M1140c = tb0M1140c2;
                    }
                }
                CI0.f1306i = tb0M1140c2;
                int i2 = CI0.f1302e;
                if (i2 > 0) {
                    c10743qA0 = next;
                    int i3 = i2 == 1 ? 1 : 2;
                    c1998l = c1998l2;
                    CI0.f1301d.add(new CI0(i3, CI0.f1303f, CI0.m1138a(i3)));
                } else {
                    c1998l = c1998l2;
                    c10743qA0 = next;
                }
                CI0.f1305h = tb0M1140c;
                CI0.f1303f = tb0;
                if (i == 3) {
                    CI0.f1304g = c10743qA0.f40655b[0];
                } else {
                    if (i == 5) {
                        j = 0;
                        CI0.f1304g = new TB0(ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);
                    }
                    CI0.f1302e++;
                    c1998l2 = c1998l;
                    c2 = 0;
                }
                j = 0;
                CI0.f1302e++;
                c1998l2 = c1998l;
                c2 = 0;
            }
            C1998l c1998l5 = c1998l2;
            CI0.f1301d.add(new CI0(3, CI0.f1303f, CI0.m1138a(3)));
            ArrayList arrayList2 = CI0.f1301d;
            C11931zU0 c11931zU0 = this.strokeWidth;
            float fRelativeOnOther = (float) (c11931zU0 != null ? relativeOnOther(c11931zU0) : 1.0d);
            this.mMarkerPath = new Path();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                CI0 ci0 = (CI0) it2.next();
                int iM26247x2 = AbstractC7222ym.m26247x(ci0.f1307a);
                C1998l c1998l6 = iM26247x2 != 0 ? iM26247x2 != 1 ? iM26247x2 != 2 ? null : c1998l4 : c1998l3 : c1998l5;
                if (c1998l6 != null) {
                    int iSaveAndSetupCanvas = c1998l6.saveAndSetupCanvas(canvas, c1998l6.mCTM);
                    Matrix matrix = c1998l6.f18642r;
                    matrix.reset();
                    TB0 tb012 = ci0.f1308b;
                    matrix.setTranslate((float) tb012.f11194a, (float) tb012.f11195b);
                    double d = "auto".equals(c1998l6.f18635k) ? -1.0d : Double.parseDouble(c1998l6.f18635k);
                    matrix.preRotate(((float) (d == -1.0d ? ci0.f1309c : d)) + 180.0f);
                    if ("strokeWidth".equals(c1998l6.f18634j)) {
                        float f2 = fRelativeOnOther / c1998l6.mScale;
                        matrix.preScale(f2, f2);
                    }
                    Iterator it3 = it2;
                    C1998l c1998l7 = c1998l3;
                    RectF rectF = new RectF(0.0f, 0.0f, (float) (c1998l6.relativeOnWidth(c1998l6.f18632h) / c1998l6.mScale), (float) (c1998l6.relativeOnHeight(c1998l6.f18633i) / c1998l6.mScale));
                    if (c1998l6.f18640p != null) {
                        float f3 = c1998l6.f18636l;
                        float f4 = c1998l6.mScale;
                        float f5 = c1998l6.f18637m;
                        float[] fArr = new float[9];
                        E02.m1975b(new RectF(f3 * f4, f5 * f4, (f3 + c1998l6.f18638n) * f4, (f5 + c1998l6.f18639o) * f4), rectF, c1998l6.f18640p, c1998l6.f18641q).getValues(fArr);
                        c = 4;
                        matrix.preScale(fArr[0], fArr[4]);
                    } else {
                        c = 4;
                    }
                    matrix.preTranslate((float) (-c1998l6.relativeOnWidth(c1998l6.f18630f)), (float) (-c1998l6.relativeOnHeight(c1998l6.f18631g)));
                    canvas.concat(matrix);
                    c1998l6.mo11365l(canvas, paint, f);
                    c1998l6.restoreCanvas(canvas, iSaveAndSetupCanvas);
                    this.mMarkerPath.addPath(c1998l6.getPath(canvas, paint), matrix);
                    c1998l3 = c1998l7;
                    it2 = it3;
                }
            }
            contextElement = null;
        }
    }

    public void resetProperties() throws IllegalAccessException, IllegalArgumentException {
        ArrayList<String> arrayList = this.mLastMergedList;
        if (arrayList == null || this.mOriginProperties == null) {
            return;
        }
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
            }
            this.mLastMergedList = null;
            this.mOriginProperties = null;
            this.mAttributeList = this.mPropList;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public void setCurrentColor(Integer num) {
        this.mCurrentColor = num != null ? num.intValue() : 0;
        invalidate();
        clearChildCache();
    }

    public void setFill(Dynamic dynamic) throws NumberFormatException {
        int i = 0;
        if (dynamic == null || dynamic.isNull()) {
            this.fill = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        if (type.equals(ReadableType.Map)) {
            setFill(dynamic.asMap());
            return;
        }
        if (type.equals(ReadableType.Number)) {
            this.fill = JavaOnlyArray.m10961of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.fill = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double d = Double.parseDouble(matcher.group());
                int i2 = i + 1;
                if (i < 3) {
                    d /= 255.0d;
                }
                javaOnlyArray.pushDouble(d);
                i = i2;
            }
            this.fill = javaOnlyArray;
        }
        invalidate();
    }

    public void setFillOpacity(float f) {
        this.fillOpacity = f;
        invalidate();
    }

    public void setFillRule(int i) {
        if (i == 0) {
            this.fillRule = Path.FillType.EVEN_ODD;
        } else if (i != 1) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "fillRule ", " unrecognized"));
        }
        invalidate();
    }

    public void setFilter(String str) {
        this.mFilter = str;
        invalidate();
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        VirtualViewManager.setRenderableView(i, this);
    }

    public void setPropList(ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i = 0; i < readableArray.size(); i++) {
                this.mPropList.add(readableArray.getString(i));
            }
        }
        invalidate();
    }

    public void setStroke(Dynamic dynamic) throws NumberFormatException {
        int i = 0;
        if (dynamic == null || dynamic.isNull()) {
            this.stroke = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            setStroke(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        if (type.equals(ReadableType.Number)) {
            this.stroke = JavaOnlyArray.m10961of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.stroke = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double d = Double.parseDouble(matcher.group());
                int i2 = i + 1;
                if (i < 3) {
                    d /= 255.0d;
                }
                javaOnlyArray.pushDouble(d);
                i = i2;
            }
            this.stroke = javaOnlyArray;
        }
        invalidate();
    }

    public void setStrokeDasharray(Dynamic dynamic) {
        ArrayList arrayListM26442a = C11931zU0.m26442a(dynamic);
        if (arrayListM26442a != null) {
            this.strokeDasharray = (C11931zU0[]) arrayListM26442a.toArray(new C11931zU0[0]);
        } else {
            this.strokeDasharray = null;
        }
        invalidate();
    }

    public void setStrokeDashoffset(float f) {
        this.strokeDashoffset = f * this.mScale;
        invalidate();
    }

    public void setStrokeLinecap(int i) {
        if (i == 0) {
            this.strokeLinecap = Paint.Cap.BUTT;
        } else if (i == 1) {
            this.strokeLinecap = Paint.Cap.ROUND;
        } else {
            if (i != 2) {
                throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "strokeLinecap ", " unrecognized"));
            }
            this.strokeLinecap = Paint.Cap.SQUARE;
        }
        invalidate();
    }

    public void setStrokeLinejoin(int i) {
        if (i == 0) {
            this.strokeLinejoin = Paint.Join.MITER;
        } else if (i == 1) {
            this.strokeLinejoin = Paint.Join.ROUND;
        } else {
            if (i != 2) {
                throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "strokeLinejoin ", " unrecognized"));
            }
            this.strokeLinejoin = Paint.Join.BEVEL;
        }
        invalidate();
    }

    public void setStrokeMiterlimit(float f) {
        this.strokeMiterlimit = f;
        invalidate();
    }

    public void setStrokeOpacity(float f) {
        this.strokeOpacity = f;
        invalidate();
    }

    public void setStrokeWidth(Dynamic dynamic) {
        this.strokeWidth = dynamic.isNull() ? new C11931zU0(1.0d) : C11931zU0.m26443b(dynamic);
        invalidate();
    }

    public void setVectorEffect(int i) {
        this.vectorEffect = i;
        invalidate();
    }

    public boolean setupFillPaint(Paint paint, float f) {
        ReadableArray readableArray = this.fill;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f, this.fill);
        return true;
    }

    public boolean setupStrokePaint(Paint paint, float f) {
        ReadableArray readableArray;
        paint.reset();
        double dRelativeOnOther = relativeOnOther(this.strokeWidth);
        if (dRelativeOnOther == ConfigValue.DOUBLE_DEFAULT_VALUE || (readableArray = this.stroke) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.strokeLinecap);
        paint.setStrokeJoin(this.strokeLinejoin);
        paint.setStrokeMiter(this.strokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) dRelativeOnOther);
        setupPaint(paint, f, this.stroke);
        C11931zU0[] c11931zU0Arr = this.strokeDasharray;
        if (c11931zU0Arr == null) {
            return true;
        }
        int length = c11931zU0Arr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) relativeOnOther(this.strokeDasharray[i]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.strokeDashoffset));
        return true;
    }

    public void setFill(ReadableMap readableMap) {
        if (readableMap == null) {
            this.fill = null;
            invalidate();
            return;
        }
        int i = readableMap.getInt("type");
        if (i == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.fill = JavaOnlyArray.m10961of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.fill = JavaOnlyArray.m10961of(0, readableMap.getMap("payload"));
            }
        } else if (i == 1) {
            this.fill = JavaOnlyArray.m10961of(1, readableMap.getString("brushRef"));
        } else {
            this.fill = JavaOnlyArray.m10961of(Integer.valueOf(i));
        }
        invalidate();
    }

    public void setStroke(ReadableMap readableMap) {
        if (readableMap == null) {
            this.stroke = null;
            invalidate();
            return;
        }
        int i = readableMap.getInt("type");
        if (i == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.stroke = JavaOnlyArray.m10961of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.stroke = JavaOnlyArray.m10961of(0, readableMap.getMap("payload"));
            }
        } else if (i == 1) {
            this.stroke = JavaOnlyArray.m10961of(1, readableMap.getString("brushRef"));
        } else {
            this.stroke = JavaOnlyArray.m10961of(Integer.valueOf(i));
        }
        invalidate();
    }
}
