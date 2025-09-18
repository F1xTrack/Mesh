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
import com.huawei.hms.rn.push.constants.LocalNotification;
import defpackage.C6598qA0;
import defpackage.C8372zU0;
import defpackage.K10;
import defpackage.S91;
import defpackage.WW;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.g */
/* loaded from: classes.dex */
public class C2592g extends RenderableView {
    public ReadableMap a;
    public K10 b;
    public Bitmap c;
    public Canvas d;
    public final Paint e;

    public C2592g(S91 s91) {
        super(s91);
        this.e = new Paint(1);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        r(canvas);
        clip(canvas, paint);
        l(canvas, paint, f);
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
            if (!(childAt instanceof C2598m) && (childAt instanceof VirtualView)) {
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
                    if (!(childAt instanceof C2598m) && (iHitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                        return (virtualView.isResponsible() || iHitTest != childAt.getId()) ? iHitTest : getId();
                    }
                } else if ((childAt instanceof SvgView) && (iReactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                    return iReactTagForTouch;
                }
            }
        }
        return -1;
    }

    public void l(Canvas canvas, Paint paint, float f) {
        q();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.c;
            if (bitmap == null) {
                this.c = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.d = new Canvas(this.c);
            } else {
                bitmap.recycle();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.c = bitmapCreateBitmap;
                this.d.setBitmap(bitmapCreateBitmap);
            }
            this.d.save();
            this.d.setMatrix(canvas.getMatrix());
        } else {
            this.d = canvas;
        }
        this.elements = new ArrayList<>();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C2598m)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!LocalNotification.Importance.NONE.equals(virtualView.mDisplay)) {
                        boolean z = virtualView instanceof RenderableView;
                        if (z) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.d, this.mCTM);
                        virtualView.render(this.d, paint, f);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(this.d, iSaveAndSetupCanvas);
                        if (z) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                        ArrayList<C6598qA0> arrayList = virtualView.elements;
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
            this.d.restore();
            int iSave = canvas.save();
            canvas.setMatrix(null);
            Paint paint2 = this.e;
            paint2.setAlpha((int) (this.mOpacity * 255.0f));
            canvas.drawBitmap(this.c, 0.0f, 0.0f, paint2);
            canvas.restoreToCount(iSave);
        }
        setClientRect(rectF);
        p();
    }

    public final void m(Canvas canvas, Paint paint, float f) {
        super.draw(canvas, paint, f);
    }

    public Path n(Canvas canvas, Paint paint, Region.Op op) {
        Path path = new Path();
        Path.Op opValueOf = Path.Op.valueOf(op.name());
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C2598m) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path pathN = virtualView instanceof C2592g ? ((C2592g) virtualView).n(canvas, paint, op) : virtualView.getPath(canvas, paint);
                pathN.transform(matrix);
                path.op(pathN, opValueOf);
            }
        }
        return path;
    }

    public final K10 o() {
        C2592g textRoot = getTextRoot();
        textRoot.getClass();
        return textRoot.b;
    }

    public void p() {
        K10 k10O = o();
        ArrayList arrayList = k10O.a;
        arrayList.remove(k10O.L);
        ArrayList arrayList2 = k10O.l;
        arrayList2.remove(k10O.L);
        ArrayList arrayList3 = k10O.m;
        arrayList3.remove(k10O.L);
        ArrayList arrayList4 = k10O.n;
        arrayList4.remove(k10O.L);
        ArrayList arrayList5 = k10O.o;
        arrayList5.remove(k10O.L);
        ArrayList arrayList6 = k10O.p;
        arrayList6.remove(k10O.L);
        int i = k10O.L - 1;
        k10O.L = i;
        int i2 = k10O.B;
        int i3 = k10O.C;
        int i4 = k10O.D;
        int i5 = k10O.E;
        int i6 = k10O.F;
        k10O.r = (WW) arrayList.get(i);
        k10O.B = ((Integer) arrayList2.get(k10O.L)).intValue();
        k10O.C = ((Integer) arrayList3.get(k10O.L)).intValue();
        k10O.D = ((Integer) arrayList4.get(k10O.L)).intValue();
        k10O.E = ((Integer) arrayList5.get(k10O.L)).intValue();
        k10O.F = ((Integer) arrayList6.get(k10O.L)).intValue();
        if (i2 != k10O.B) {
            ArrayList arrayList7 = k10O.b;
            arrayList7.remove(i2);
            k10O.w = (C8372zU0[]) arrayList7.get(k10O.B);
            k10O.G = ((Integer) k10O.g.get(k10O.B)).intValue();
        }
        if (i3 != k10O.C) {
            ArrayList arrayList8 = k10O.c;
            arrayList8.remove(i3);
            k10O.x = (C8372zU0[]) arrayList8.get(k10O.C);
            k10O.H = ((Integer) k10O.h.get(k10O.C)).intValue();
        }
        if (i4 != k10O.D) {
            ArrayList arrayList9 = k10O.d;
            arrayList9.remove(i4);
            k10O.y = (C8372zU0[]) arrayList9.get(k10O.D);
            k10O.I = ((Integer) k10O.i.get(k10O.D)).intValue();
        }
        if (i5 != k10O.E) {
            ArrayList arrayList10 = k10O.e;
            arrayList10.remove(i5);
            k10O.z = (C8372zU0[]) arrayList10.get(k10O.E);
            k10O.J = ((Integer) k10O.j.get(k10O.E)).intValue();
        }
        if (i6 != k10O.F) {
            ArrayList arrayList11 = k10O.f;
            arrayList11.remove(i6);
            k10O.A = (double[]) arrayList11.get(k10O.F);
            k10O.K = ((Integer) k10O.k.get(k10O.F)).intValue();
        }
    }

    public void q() {
        K10 k10O = o();
        k10O.f(this, this.a);
        k10O.e();
    }

    public final void r(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Matrix matrix2 = this.mTransform;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        this.b = new K10(this.mScale, rectF.width(), rectF.height());
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
