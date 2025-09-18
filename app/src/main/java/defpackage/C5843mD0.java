package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5843mD0 extends FrameLayout {
    public EnumC5270jD0 a;
    public AbstractC4056gw0 b;
    public final ZV0 c;
    public final C4303iD0 d;
    public boolean e;
    public final C0390Et0 f;
    public final AtomicReference g;
    public final C6034nD0 h;
    public InterfaceC6907ro i;
    public final C1574Ty0 j;
    public final ViewOnLayoutChangeListenerC7486uq k;
    public final C1016Mu0 l;

    public C5843mD0(Context context) {
        super(context, null, 0, 0);
        this.a = EnumC5270jD0.PERFORMANCE;
        C4303iD0 c4303iD0 = new C4303iD0();
        c4303iD0.h = EnumC5461kD0.FILL_CENTER;
        this.d = c4303iD0;
        this.e = true;
        this.f = new C0390Et0(EnumC5652lD0.a);
        this.g = new AtomicReference();
        this.h = new C6034nD0(c4303iD0);
        this.j = new C1574Ty0(1, this);
        this.k = new ViewOnLayoutChangeListenerC7486uq(2, this);
        this.l = new C1016Mu0(24, this);
        DV1.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = SG0.a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
        AbstractC6897rk1.m(this, context, iArr, null, typedArrayObtainStyledAttributes, 0, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, c4303iD0.h.a);
            for (EnumC5461kD0 enumC5461kD0 : EnumC5461kD0.values()) {
                if (enumC5461kD0.a == integer) {
                    setScaleType(enumC5461kD0);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (EnumC5270jD0 enumC5270jD0 : EnumC5270jD0.values()) {
                        if (enumC5270jD0.a == integer2) {
                            setImplementationMode(enumC5270jD0);
                            typedArrayObtainStyledAttributes.recycle();
                            new OJ1(context, new C0681Im0(this, 15));
                            if (getBackground() == null) {
                                setBackgroundColor(AbstractC0872Ky.a(getContext(), R.color.black));
                            }
                            ZV0 zv0 = new ZV0(context, null, 0, 0);
                            zv0.setBackgroundColor(-1);
                            zv0.setAlpha(0.0f);
                            zv0.setElevation(Float.MAX_VALUE);
                            this.c = zv0;
                            zv0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean b(Z61 z61, EnumC5270jD0 enumC5270jD0) {
        boolean zEquals = z61.e.o().n().equals("androidx.camera.camera2.legacy");
        boolean z = (AbstractC7578vJ.a.z0(SurfaceViewStretchedQuirk.class) == null && AbstractC7578vJ.a.z0(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT <= 24 || zEquals || z) {
            return true;
        }
        int iOrdinal = enumC5270jD0.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + enumC5270jD0);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private InterfaceC7158t60 getScreenFlashInternal() {
        return this.c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(InterfaceC7158t60 interfaceC7158t60) {
        AbstractC0759Jm0.f("PreviewView");
    }

    public final void a() {
        Rect rect;
        Display display;
        InterfaceC6907ro interfaceC6907ro;
        DV1.a();
        if (this.b != null) {
            if (this.e && (display = getDisplay()) != null && (interfaceC6907ro = this.i) != null) {
                int iP = interfaceC6907ro.p(display.getRotation());
                int rotation = display.getRotation();
                C4303iD0 c4303iD0 = this.d;
                if (c4303iD0.g) {
                    c4303iD0.c = iP;
                    c4303iD0.e = rotation;
                }
            }
            this.b.j();
        }
        C6034nD0 c6034nD0 = this.h;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        c6034nD0.getClass();
        DV1.a();
        synchronized (c6034nD0) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = c6034nD0.c) != null) {
                    c6034nD0.d = c6034nD0.b.a(size, layoutDirection, rect);
                    return;
                }
                c6034nD0.d = null;
            } finally {
            }
        }
    }

    public Bitmap getBitmap() {
        Bitmap bitmapF;
        DV1.a();
        AbstractC4056gw0 abstractC4056gw0 = this.b;
        if (abstractC4056gw0 == null || (bitmapF = abstractC4056gw0.f()) == null) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) abstractC4056gw0.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        C4303iD0 c4303iD0 = (C4303iD0) abstractC4056gw0.d;
        if (!c4303iD0.f()) {
            return bitmapF;
        }
        Matrix matrixD = c4303iD0.d();
        RectF rectFE = c4303iD0.e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapF.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / c4303iD0.a.getWidth(), rectFE.height() / c4303iD0.a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapF, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public AbstractC2008Zn getController() {
        DV1.a();
        return null;
    }

    public EnumC5270jD0 getImplementationMode() {
        DV1.a();
        return this.a;
    }

    public AbstractC1085Nr0 getMeteringPointFactory() {
        DV1.a();
        return this.h;
    }

    public C5605kz0 getOutputTransform() {
        Matrix matrixC;
        C4303iD0 c4303iD0 = this.d;
        DV1.a();
        try {
            matrixC = c4303iD0.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixC = null;
        }
        Rect rect = c4303iD0.b;
        if (matrixC == null || rect == null) {
            AbstractC0759Jm0.f("PreviewView");
            return null;
        }
        RectF rectF = AbstractC7255tc1.a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(AbstractC7255tc1.a, rectF2, Matrix.ScaleToFit.FILL);
        matrixC.preConcat(matrix);
        if (this.b instanceof Q91) {
            matrixC.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            AbstractC0759Jm0.f("PreviewView");
        }
        new Size(rect.width(), rect.height());
        return new C5605kz0();
    }

    public b getPreviewStreamState() {
        return this.f;
    }

    public EnumC5461kD0 getScaleType() {
        DV1.a();
        return this.d.h;
    }

    public InterfaceC7158t60 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        DV1.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        C4303iD0 c4303iD0 = this.d;
        if (!c4303iD0.f()) {
            return null;
        }
        Matrix matrix = new Matrix(c4303iD0.d);
        matrix.postConcat(c4303iD0.c(size, layoutDirection));
        return matrix;
    }

    public InterfaceC2473cD0 getSurfaceProvider() {
        DV1.a();
        return this.l;
    }

    public C6328ol1 getViewPort() {
        DV1.a();
        if (getDisplay() == null) {
            return null;
        }
        getDisplay().getRotation();
        DV1.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new C6328ol1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.j, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.k);
        AbstractC4056gw0 abstractC4056gw0 = this.b;
        if (abstractC4056gw0 != null) {
            abstractC4056gw0.g();
        }
        DV1.a();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.k);
        AbstractC4056gw0 abstractC4056gw0 = this.b;
        if (abstractC4056gw0 != null) {
            abstractC4056gw0.h();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.j);
    }

    public void setController(AbstractC2008Zn abstractC2008Zn) {
        DV1.a();
        DV1.a();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(EnumC5270jD0 enumC5270jD0) {
        DV1.a();
        this.a = enumC5270jD0;
    }

    public void setScaleType(EnumC5461kD0 enumC5461kD0) {
        DV1.a();
        this.d.h = enumC5461kD0;
        a();
        DV1.a();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        DV1.a();
        this.c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
