package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import java.util.ArrayList;
import p000.C10743qA0;
import p000.C11931zU0;
import p000.C1417WW;
import p000.K10;
import p000.S91;

/* renamed from: com.horcrux.svg.g */
/* loaded from: classes.dex */
public class C1993g extends RenderableView {

    /* renamed from: a */
    public ReadableMap f18602a;

    /* renamed from: b */
    public K10 f18603b;

    /* renamed from: c */
    public Bitmap f18604c;

    /* renamed from: d */
    public Canvas f18605d;

    /* renamed from: e */
    public final Paint f18606e;

    public C1993g(S91 s91) {
        super(s91);
        this.f18606e = new Paint(1);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        m11368r(canvas);
        clip(canvas, paint);
        mo11365l(canvas, paint, f);
        renderMarkers(canvas, paint, f);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        ((VirtualView) this).mPath = new Path();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C1999m) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                ((VirtualView) this).mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return ((VirtualView) this).mPath;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        int iReactTagForTouch;
        VirtualView virtualView;
        int iHitTest;
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            Path clipPath = getClipPath();
            if (clipPath != null) {
                if (this.mClipRegionPath != clipPath) {
                    this.mClipRegionPath = clipPath;
                    RectF rectF = new RectF();
                    this.mClipBounds = rectF;
                    clipPath.computeBounds(rectF, true);
                    this.mClipRegion = getRegion(clipPath, this.mClipBounds);
                }
                if (!this.mClipRegion.contains(iRound, iRound2)) {
                    return -1;
                }
            }
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof VirtualView) {
                    if (!(childAt instanceof C1999m) && (iHitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                        return (virtualView.isResponsible() || iHitTest != childAt.getId()) ? iHitTest : getId();
                    }
                } else if ((childAt instanceof SvgView) && (iReactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                    return iReactTagForTouch;
                }
            }
        }
        return -1;
    }

    /* renamed from: l */
    public void mo11365l(Canvas canvas, Paint paint, float f) {
        mo532q();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.f18604c;
            if (bitmap == null) {
                this.f18604c = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f18605d = new Canvas(this.f18604c);
            } else {
                bitmap.recycle();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f18604c = bitmapCreateBitmap;
                this.f18605d.setBitmap(bitmapCreateBitmap);
            }
            this.f18605d.save();
            this.f18605d.setMatrix(canvas.getMatrix());
        } else {
            this.f18605d = canvas;
        }
        this.elements = new ArrayList<>();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C1999m)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!LocalNotification.Importance.NONE.equals(virtualView.mDisplay)) {
                        boolean z = virtualView instanceof RenderableView;
                        if (z) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.f18605d, this.mCTM);
                        virtualView.render(this.f18605d, paint, f);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(this.f18605d, iSaveAndSetupCanvas);
                        if (z) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                        ArrayList<C10743qA0> arrayList = virtualView.elements;
                        if (arrayList != null) {
                            this.elements.addAll(arrayList);
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                }
            }
        }
        if (this.mOpacity != 1.0f) {
            this.f18605d.restore();
            int iSave = canvas.save();
            canvas.setMatrix(null);
            Paint paint2 = this.f18606e;
            paint2.setAlpha((int) (this.mOpacity * 255.0f));
            canvas.drawBitmap(this.f18604c, 0.0f, 0.0f, paint2);
            canvas.restoreToCount(iSave);
        }
        setClientRect(rectF);
        mo531p();
    }

    /* renamed from: m */
    public final void m11366m(Canvas canvas, Paint paint, float f) {
        super.draw(canvas, paint, f);
    }

    /* renamed from: n */
    public Path mo11362n(Canvas canvas, Paint paint, Region.Op op) {
        Path path = new Path();
        Path.Op opValueOf = Path.Op.valueOf(op.name());
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C1999m) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path pathMo11362n = virtualView instanceof C1993g ? ((C1993g) virtualView).mo11362n(canvas, paint, op) : virtualView.getPath(canvas, paint);
                pathMo11362n.transform(matrix);
                path.op(pathMo11362n, opValueOf);
            }
        }
        return path;
    }

    /* renamed from: o */
    public final K10 m11367o() {
        C1993g textRoot = getTextRoot();
        textRoot.getClass();
        return textRoot.f18603b;
    }

    /* renamed from: p */
    public void mo531p() {
        K10 k10M11367o = m11367o();
        ArrayList arrayList = k10M11367o.f5851a;
        arrayList.remove(k10M11367o.f5847L);
        ArrayList arrayList2 = k10M11367o.f5862l;
        arrayList2.remove(k10M11367o.f5847L);
        ArrayList arrayList3 = k10M11367o.f5863m;
        arrayList3.remove(k10M11367o.f5847L);
        ArrayList arrayList4 = k10M11367o.f5864n;
        arrayList4.remove(k10M11367o.f5847L);
        ArrayList arrayList5 = k10M11367o.f5865o;
        arrayList5.remove(k10M11367o.f5847L);
        ArrayList arrayList6 = k10M11367o.f5866p;
        arrayList6.remove(k10M11367o.f5847L);
        int i = k10M11367o.f5847L - 1;
        k10M11367o.f5847L = i;
        int i2 = k10M11367o.f5837B;
        int i3 = k10M11367o.f5838C;
        int i4 = k10M11367o.f5839D;
        int i5 = k10M11367o.f5840E;
        int i6 = k10M11367o.f5841F;
        k10M11367o.f5868r = (C1417WW) arrayList.get(i);
        k10M11367o.f5837B = ((Integer) arrayList2.get(k10M11367o.f5847L)).intValue();
        k10M11367o.f5838C = ((Integer) arrayList3.get(k10M11367o.f5847L)).intValue();
        k10M11367o.f5839D = ((Integer) arrayList4.get(k10M11367o.f5847L)).intValue();
        k10M11367o.f5840E = ((Integer) arrayList5.get(k10M11367o.f5847L)).intValue();
        k10M11367o.f5841F = ((Integer) arrayList6.get(k10M11367o.f5847L)).intValue();
        if (i2 != k10M11367o.f5837B) {
            ArrayList arrayList7 = k10M11367o.f5852b;
            arrayList7.remove(i2);
            k10M11367o.f5873w = (C11931zU0[]) arrayList7.get(k10M11367o.f5837B);
            k10M11367o.f5842G = ((Integer) k10M11367o.f5857g.get(k10M11367o.f5837B)).intValue();
        }
        if (i3 != k10M11367o.f5838C) {
            ArrayList arrayList8 = k10M11367o.f5853c;
            arrayList8.remove(i3);
            k10M11367o.f5874x = (C11931zU0[]) arrayList8.get(k10M11367o.f5838C);
            k10M11367o.f5843H = ((Integer) k10M11367o.f5858h.get(k10M11367o.f5838C)).intValue();
        }
        if (i4 != k10M11367o.f5839D) {
            ArrayList arrayList9 = k10M11367o.f5854d;
            arrayList9.remove(i4);
            k10M11367o.f5875y = (C11931zU0[]) arrayList9.get(k10M11367o.f5839D);
            k10M11367o.f5844I = ((Integer) k10M11367o.f5859i.get(k10M11367o.f5839D)).intValue();
        }
        if (i5 != k10M11367o.f5840E) {
            ArrayList arrayList10 = k10M11367o.f5855e;
            arrayList10.remove(i5);
            k10M11367o.f5876z = (C11931zU0[]) arrayList10.get(k10M11367o.f5840E);
            k10M11367o.f5845J = ((Integer) k10M11367o.f5860j.get(k10M11367o.f5840E)).intValue();
        }
        if (i6 != k10M11367o.f5841F) {
            ArrayList arrayList11 = k10M11367o.f5856f;
            arrayList11.remove(i6);
            k10M11367o.f5836A = (double[]) arrayList11.get(k10M11367o.f5841F);
            k10M11367o.f5846K = ((Integer) k10M11367o.f5861k.get(k10M11367o.f5841F)).intValue();
        }
    }

    /* renamed from: q */
    public void mo532q() {
        K10 k10M11367o = m11367o();
        k10M11367o.m4519f(this, this.f18602a);
        k10M11367o.m4518e();
    }

    /* renamed from: r */
    public final void m11368r(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Matrix matrix2 = this.mTransform;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        this.f18603b = new K10(this.mScale, rectF.width(), rectF.height());
    }

    @Override // com.horcrux.svg.RenderableView
    public void resetProperties() throws IllegalAccessException, IllegalArgumentException {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
